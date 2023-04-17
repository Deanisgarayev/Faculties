public class PrintService {
    public void space() {
        System.out.println(" ");
    }
    public  void print (Gryffindor[] gryffindors) {
        System.out.println("Гриффиндоры");
        for (Gryffindor gryffindor : gryffindors) {
            System.out.println(gryffindor);
        }
    }    public  void print (Hufflepuf[] hufflepufs) {
        System.out.println("Пуффендуйры");
        for (Hufflepuf hufflepuf : hufflepufs) {
            System.out.println(hufflepuf);
        }
    }    public  void print (Ravenclaw[] ravenclaws) {
        System.out.println("Когтевранры");
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println(ravenclaw);
        }
    }    public  void print (Slytherin[] slytherins) {
        System.out.println("Слизеринры");
        for (Slytherin slytherin : slytherins) {
            System.out.println(slytherin);
        }
    }
}
