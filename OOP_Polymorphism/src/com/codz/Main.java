package com.codz;

class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Alians attempt to take over the earth";
    }

}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maxe Runner");
    }

    @Override
    public String plot(){
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot(){
        return "Imperial forces try to take over the universe";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable Movie");
    }
}

public class Main{
    public static void main(String[] args){

    }
}
