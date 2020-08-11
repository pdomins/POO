package ar.itba.edu.POO.PrimerParcial.TP4.P14;

public enum Continent {

    AFRICA("Africa",1100,30),
    AMERICA("America",990,42),
    ASIA("Asia",4400,43),
    EUROPE("Europe",730,10),
    OCEANIA("Oceania",39,9);

    private String name;
    private int population;
    private int area;

    Continent(String name, int population, int area){
        this.name = name;
        this.population= population;
        this.area= area;
    }
    public double getPopulationRatio(){
        return (double) population/area;
    }
    @Override
    public String toString(){
        return name;
    }
}