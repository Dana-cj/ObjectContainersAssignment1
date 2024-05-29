package org.exampledana;

public class Country {
    private String name;
    private String capital;
    private int population;

    public Country(String name, String capital, int population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "country: {" + name +
                ", capital: " + capital  +
                ", population: " + population+"}";
    }
}
