public class Ravenclaw extends Hogwarts {
    private int smartness;
    private int wisdom;
    private int wit;
    private int creativity;
    public Ravenclaw(String name, int conjurePoint, int transgressDistance, int smartness, int wisdom, int wit,
                     int creativity) {
        super(name, conjurePoint, transgressDistance);
            this.smartness = smartness;
            this.wisdom = wisdom;
            this.wit = wit;
            this.creativity = creativity;
        }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw " + super.toString() + " smartness " + smartness +
                " wisdom " + wisdom +
                " wit " + wit +
                " creativity " + creativity;
    }
}

