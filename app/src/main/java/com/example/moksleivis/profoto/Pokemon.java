package com.example.moksleivis.profoto;

public class Pokemon {
    private String name;
    private double weight;
    private String cp;
    private String abilities;
    private String type;

    public Pokemon(String name, double weight, String cp,String abilities, String type){
        this.name = name;
        this.weight = weight;
        this.cp = cp;
        this.abilities = abilities;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCp() {
        return cp;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override

    public String toString(){
        return  "Pokemon{" +
                "name='" + name + '\'' +
                ", weight='" +String.valueOf(weight) +
                ", cp='" + cp + '\'' +
                ", abilities='" + abilities + '\'' +
                ", type='" + type +'\'' +
                '}';
    }
}
