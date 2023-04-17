public class Hogwarts {
    private String name;
    private String characteristic;
    private int firstScore;

    private int secondScore;
    private int thirdScore;

    public Hogwarts(String name, String characteristic, int firstScore, int secondScore, int thirdScore) {
        this.name = name;
        this.characteristic = characteristic;
        this.firstScore = firstScore;
        this.secondScore = secondScore;
        this.thirdScore = thirdScore;
    }

    public int getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(int firstScore) {
        this.firstScore = firstScore;
    }

    public int getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(int secondScore) {
        this.secondScore = secondScore;
    }

    public int getThirdScore() {
        return thirdScore;
    }

    public void setThirdScore(int thirdScore) {
        this.thirdScore = thirdScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }


    public String getName() {
        return name;
    }

    public String getCharacteristic() {
        return characteristic;
    }


    @Override
    public String toString() {
        return  name + "; присущий качества " + characteristic +  "; баллы: благородство " + firstScore + " честь " +
                 secondScore + " храбрость " +  thirdScore;
    }
}
