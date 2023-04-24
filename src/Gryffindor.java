public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int conjurePoint, int transgressDistance, int nobility, int honor, int bravery) {
        super(name, conjurePoint, transgressDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;

    }

    public String toString() {
        return "Gryffindor " + super.toString() + " nobility " + nobility + " honor " + honor +
                " bravery " + bravery;
    }
}

