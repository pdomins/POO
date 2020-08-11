package ar.itba.edu.POO.RepasoSegundoParcial.Otros.BicycleRace;

public class Participant {
    private String name;
    private int age;
    private int startTime;
    private int endTime;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void start(int startTime) {
        this.startTime = startTime;
    }

    public void end(int endTime) {
        this.endTime = endTime;
    }
    public boolean hasTime(){
        return startTime!= 0 && endTime!=0 ;
    }
    public int getTotalTime(){
        return endTime-startTime;
    }
}
