public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int desireForPower;

    public Slytherin(String name, int conjurePoint, int transgressDistance, int cunning, int determination,
                     int ambition, int resourcefulness, int desireForPower) {
        super(name, conjurePoint, transgressDistance);
            this.cunning = cunning;
            this.determination = determination;
            this.ambition = ambition;
            this.resourcefulness = resourcefulness;
            this.desireForPower = desireForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getDesireForPower() {
        return desireForPower;
    }

    public void setDesireForPower(int desireForPower) {
        this.desireForPower = desireForPower;
    }

    @Override
    public String toString() {
        return "Slytherin " + super.toString() +
                " cunning " + cunning +
                " determination " + determination +
                " ambition " + ambition +
                " resourcefulness " + resourcefulness +
                " desireForPower " + desireForPower;
    }
}
