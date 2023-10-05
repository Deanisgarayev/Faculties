import model.*;

public class PrintService {
    public void space() {
        System.out.println(" ");
    }

//    prints all gryffindors
    public void print(Gryffindor[] gryffindors) {
        System.out.println("Gryffindors");
        for (Gryffindor gryffindor : gryffindors) {
            System.out.println(gryffindor);
        }
    }
//    prints all hufflepufs
    public void print(Hufflepuf[] hufflepufs) {
        System.out.println("Hufflepufs");
        for (Hufflepuf hufflepuf : hufflepufs) {
            System.out.println(hufflepuf);
        }
    }
//    prints all ravenclaws
    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Ravenclaws");
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println(ravenclaw);
        }
    }
//    prints all slytherins
    public void print(Slytherin[] slytherins) {
        System.out.println("Slytherins");
        for (Slytherin slytherin : slytherins) {
            System.out.println(slytherin);
        }
    }

//    compares two any gryffindors by points
    public void CompareGryffindors(Gryffindor first, Gryffindor second) {
        var firstPoint = first.getBravery() + first.getHonor() + first.getNobility();
        var secondPoint = second.getBravery() + second.getHonor() + second.getBravery();
        if (firstPoint > secondPoint) {
            System.out.println(first.getName() + " better than " + second.getName());
        } else if (firstPoint < secondPoint) {
            System.out.println(second.getName() + " better than " + first.getName());
        } else {
            System.out.println(first.getName() + " & " + second.getName() + " are equals");
        }
    }

//    compares two any hufflepufs by points
    public void CompareHufflepufs(Hufflepuf first, Hufflepuf second) {
        var firstPoint = first.getHardworking() + first.getLoyalty() + first.getDiligence();
        var secondPoint = second.getHardworking() + second.getLoyalty() + second.getDiligence();
        if (firstPoint > secondPoint) {
            System.out.println(first.getName() + " better than " + second.getName());
        } else if (firstPoint < secondPoint) {
            System.out.println(second.getName() + " better than " + first.getName());
        } else {
            System.out.println(first.getName() + " & " + second.getName() + " are equals");
        }
    }

//    compares two any ravenclaws by points
    public void CompareRavenclaws(Ravenclaw first, Ravenclaw second) {
        var firstPoint = first.getSmartness() + first.getWisdom() + first.getWit() + first.getCreativity();
        var secondPoint = second.getSmartness() + second.getWisdom() + second.getWit() + first.getCreativity();
        if (firstPoint > secondPoint) {
            System.out.println(first.getName() + " better than " + second.getName());
        } else if (firstPoint < secondPoint) {
            System.out.println(second.getName() + " better than " + first.getName());
        } else {
            System.out.println(first.getName() + " & " + second.getName() + " are equals");
        }
    }

//    compares two any slytherins by points
    public void CompareSlytherins(Slytherin first, Slytherin second) {
        var firstPoint = first.getCunning() + first.getDetermination() + first.getAmbition() +
                first.getResourcefulness() + second.getDesireForPower();
        var secondPoint = second.getCunning() + second.getDetermination() + second.getAmbition() +
                first.getResourcefulness() + first.getDesireForPower();
        if (firstPoint > secondPoint) {
            System.out.println(first.getName() + " better than " + second.getName());
        } else if (firstPoint < secondPoint) {
            System.out.println(second.getName() + " better than " + first.getName());
        } else {
            System.out.println(first.getName() + " & " + second.getName() + " are equals");
        }
    }

//    compares two any students by points
    public void compareAnyStudents(Hogwarts first, Hogwarts second) {
        var firstPoint = first.getConjurePoint() + first.getTransgressDistance();
        var secondPoint = second.getConjurePoint() + second.getTransgressDistance();
        if (firstPoint > secondPoint) {
            System.out.println(first.getName() + " better than " + second.getName());
        } else if (firstPoint < secondPoint) {
            System.out.println(second.getName() + " better than " + first.getName());
        } else {
            System.out.println(first.getName() + " & " + second.getName() + " are equals");

        }
    }
}

