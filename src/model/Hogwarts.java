package model;

public class Hogwarts {
    private String name;
    private int conjurePoint;
    private int transgressDistance;


    public Hogwarts(String name, int conjurePoint, int transgressDistance) {
        this.name = name;
        this.conjurePoint = conjurePoint;
        this.transgressDistance = transgressDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConjurePoint() {
        return conjurePoint;
    }

    public void setConjurePoint(int conjurePoint) {
        this.conjurePoint = conjurePoint;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }

    @Override
    public String toString() {
        return "name " + name + "; conjurePoint " + conjurePoint + " transgressDistance " + transgressDistance;
    }
}
