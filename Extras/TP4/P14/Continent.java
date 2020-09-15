package ar.itba.edu.TP4.P14;

public enum Continent {
    AFRICA("Africa", 1100, 30),
    AMERICA("America",990, 42),
    ASIA("Asia",4400,43),
    EUROPE("Europe",730,10),
    OCEANIA("Oceania",39,9);

    private String Name;
    private int population;
    private int area;

    Continent(String name, int population, int area) {
        Name = name;
        this.population = population;
        this.area = area;
    }
    public double getPopulationRatio(){
        return (double)population / area;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return Name;
    }
}