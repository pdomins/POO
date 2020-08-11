package ar.itba.edu.POO.RepasoSegundoParcial.Otros.BicycleRace;

public class RankingRaceTest {
    public static void main(String[] args){
        CategoryRace race = new CategoryRace();
        race.addCategory("Categoria1",20,40);
        race.addCategory("Categoria2",30,50);
        race.addParticipant("Persona A",25);
        race.addParticipant("Persona B",32);
        race.addParticipant("Persona C",33);
        race.addParticipant("Persona D",45);
        race.addParticipant("Persona E",65);
        race.addParticipant("Persona F",41);
        race.registerStartTime("Persona A",1000);
        race.registerStartTime("Persona B",1110);
        race.registerStartTime("Persona C",1050);
        race.registerStartTime("Persona D",1200);
        race.registerStartTime("Persona E",1000);
        race.registerStartTime("Persona F",1300);
        race.registerEndTime("Persona A",2000);
        race.registerEndTime("Persona B",2600);
        race.registerEndTime("Persona C",2240);
        race.registerEndTime("Persona D",3100);
        race.registerEndTime("Persona E",2100);
        System.out.println("Participantes");
        race.printParticipants();
        System.out.println("Ranking Completo");
        race.printGeneralRanking();
        System.out.println("Categoria 1");
        race.printCategoryRanking("Categoria1");
        System.out.println("Categoria 2");
        race.printCategoryRanking("Categoria2");



    }
}
