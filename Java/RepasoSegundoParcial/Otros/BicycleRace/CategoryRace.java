package ar.itba.edu.POO.RepasoSegundoParcial.Otros.BicycleRace;

import java.util.*;

public class CategoryRace extends Race{

    private Map<String, AgePair> categoryMap = new HashMap<>();
    public void addCategory(String name, int min, int max){
        categoryMap.putIfAbsent(name, new AgePair(min, max));
    }


    public void printGeneralRanking() {
         Set<Participant> racersTree = new TreeSet<>(Comparator.comparingInt(Participant::getTotalTime)
                 .thenComparing(Participant::getName));
         for (String name: participants.keySet()){
             if (participants.get(name).hasTime()){
                 racersTree.add(participants.get(name));
             }
         }
         printParticipants(racersTree);
        }

    public void printCategoryRanking(String category) {
        if (!categoryMap.containsKey(category))
            throw new IllegalArgumentException("The category does not exist");
        Set<Participant> racersTree = new TreeSet<>(Comparator.comparingInt(Participant::getTotalTime)
                .thenComparing(Participant::getName));
        for (String name: participants.keySet()){
            Participant racer = participants.get(name);
            if (racer.hasTime() && categoryMap.get(category).fitsAge(racer)){
                racersTree.add(participants.get(name));
            }
        }
        printParticipants(racersTree);
    }
}
