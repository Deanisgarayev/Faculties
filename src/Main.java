public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", "благородный, честный, храбрый", 10,
                         10, 10),
                new Gryffindor("Гермиона Грейнджер","благородный, честный, храбрый",8,
                         13, 9),
                new Gryffindor("Рон Уизли","благородный, честный, храбрый", 9,
                        7, 11),
        };
        Hufflepuf[] hufflepufs = {
                new Hufflepuf("Захария Смит", "трудолюбивы, верны, честны", 8,
                         9, 12),
                new Hufflepuf("Седрик Диггори","трудолюбивы, верны, честны",9,
                         8, 13),
                new Hufflepuf("Джастин Финч-Флетчли","трудолюбивы, верны, честны", 10,
                        11, 9),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", "умны, мудры, остроумны и полны творчества", 13,
                         12, 7),
                new Ravenclaw("Падма Патил","умны, мудры, остроумны и полны творчества",8,
                         13, 9),
                new Ravenclaw("Маркус Белби","умны, мудры, остроумны и полны творчества", 9,
                        8, 11),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", "хитрость, решительность, амбициозность, находчивость и жажда власти", 10,
                         10, 7),
                new Slytherin("Грэхэм Монтегю","хитрость, решительность, амбициозность, находчивость и жажда власти",12,
                         9, 9),
                new Slytherin("Грегори Гойл","хитрость, решительность, амбициозность, находчивость и жажда власти", 11,
                        9, 8),
        };
        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.space();
        printService.print(hufflepufs);
        printService.space();
        printService.print(ravenclaws);
        printService.space();
        printService.print(slytherins);

    }
}