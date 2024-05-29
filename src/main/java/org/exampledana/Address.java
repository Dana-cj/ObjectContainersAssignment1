package org.exampledana;

public class Address {
    protected Country country;
    private String city;
    private String place;

    public Address(Country country, String city, String place) {
        this.country = country;
        this.city = city;
        this.place = place;
    }

    public Address(String city, String place){
        this(new Country("Romania", "Bucharest", 19000000), city, place);
    }

    @Override
    public String toString() {
        return "Address: " + country +
                ", city: " + city +
                ", place: " + place;
    }
}
