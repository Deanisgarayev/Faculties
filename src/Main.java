public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter", 20, 20,
                         10, 10, 10),
                new Gryffindor("Hermione Granger",20,18,
                         13, 9,10),
                new Gryffindor("Ron Weasley",17, 19,
                        7, 11 ,9),
        };
        Hufflepuf[] hufflepufs = {
                new Hufflepuf("Zachariah Smith", 18, 18,
                         9, 12, 10),
                new Hufflepuf("Cedric Diggory",16,18,
                         8, 13, 10),
                new Hufflepuf("Justin Finch-Fletchley",19, 17,
                        11, 9, 11),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zhou Chang", 19, 14,
                         7, 7, 7, 7),
                new Ravenclaw("Padma Patil",19,18,
                         7,6, 5, 7),
                new Ravenclaw("Marcus Belby",20, 16,
                        8, 4, 7, 5),
        };
        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", 20, 20,
                         5, 5, 5, 5, 5),
                new Slytherin("Graham Montague",16,16,
                         4, 3, 5, 4 ,4 ),
                new Slytherin("Gregory Goyle",17, 18,
                        3, 5, 2, 4, 5),
        };
        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.space();
        printService.print(hufflepufs);
        printService.space();
        printService.print(ravenclaws);
        printService.space();
        printService.print(slytherins);
        PrintService gryffindorStudents = new PrintService();
        gryffindorStudents.CompareGryffindors(gryffindors[0], gryffindors[1]);
        PrintService hufflepufStudents = new PrintService();
        hufflepufStudents.CompareHufflepufs(hufflepufs[0], hufflepufs[2]);
        PrintService ravenclawStudents = new PrintService();
        ravenclawStudents.CompareRavenclaws(ravenclaws[2], ravenclaws[1]);
        PrintService slytherinStudents = new PrintService();
        slytherinStudents.CompareSlytherins(slytherins[1], slytherins[2]);
        PrintService allStudents = new PrintService();
        allStudents.compareAnyStudents(gryffindors[0], slytherins[0]);
    }
}