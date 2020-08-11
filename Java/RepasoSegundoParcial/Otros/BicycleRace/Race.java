package ar.itba.edu.POO.RepasoSegundoParcial.Otros.BicycleRace;

import java.util.HashMap;
import java.util.Map;

public class Race {
    protected Map<String,Participant> participants = new HashMap<>();

    public void addParticipant(String name, int age){
        if (participants.containsKey(name))
            throw new IllegalArgumentException("Duplicated Participant");
        participants.put(name, new Participant(name, age));
    }
    public void registerStartTime(String participant, int time){
        getParticipant(participant).start(time);
    }
    public void registerEndTime(String participant, int time){
        getParticipant(participant).end(time);
    }
    public double getTotalTime(String participant){
        return getParticipant(participant).getTotalTime();
    }
    protected Participant getParticipant(String name){
        Participant participant = participants.get(name);
        if (participant==null)
            throw new IllegalArgumentException("Invalid participant name");
        return participant;
    }
    public void printParticipants(){
        printParticipants(participants.values());
    }
    public void printParticipants(Iterable<Participant> part){
        for (Participant p :part){
            System.out.println(p.getName()+" "+(p.hasTime()?p.getTotalTime():"----"));
        }
    }
}
