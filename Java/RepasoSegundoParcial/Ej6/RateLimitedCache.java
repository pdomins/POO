package ar.itba.edu.POO.RepasoSegundoParcial.Ej6;

import java.util.*;

public class RateLimitedCache<T, E> extends BaseCache<T,E> {
    private Map<String, QuotaType> personalMap = new HashMap<>();
    Map<String, Map<String, AccessPair>> myMap = new HashMap<>();

    public void register(String name,QuotaType quota){
        personalMap.putIfAbsent(name, quota);
    }

    public void put(String user, String date,T key, E value){
        if(!personalMap.containsKey(user))
            throw new NoSuchElementException();
        myMap.putIfAbsent(date, new HashMap<>());
        myMap.get(date).putIfAbsent(user,new AccessPair(personalMap.get(user).getWrites(), personalMap.get(user).getReads()));
        ////////////////////////////////////////////////////////
        if (myMap.get(date).get(user).getPut() == 0){
            throw new RateLimitedException();
        }
        super.put(user,date,key,value);
        myMap.get(date).get(user).reducePut();
    }

    @Override
    public E get(String user, String date, T key) {
        if(!myMap.get(date).containsKey(user))
            throw new NoSuchElementException();
        if (myMap.get(date).get(user).getGet() == 0){
            throw new RateLimitedException();
        }
            myMap.get(date).get(user).reduceGet();
            return super.get(user,date,key);
    }
}
