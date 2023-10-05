package model;

public class Hufflepuf extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int diligence;

    public Hufflepuf(String name, int conjurePoint, int transgressDistance, int hardworking, int loyalty, int diligence) {
        super(name, conjurePoint, transgressDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.diligence = diligence;

    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    @Override
    public String toString() {
        return "model.Hufflepuf " + super.toString() +
                " hardworking " + hardworking +
                " loyalty " + loyalty +
                " diligence " + diligence;
    }
}
