public class Main {
    public static void main(String[] args) {

        Gryffindor[] gryffindors = new Gryffindor[3];
        gryffindors[0] = new Gryffindor("Гарри Поттер", 10, 11, 14, 15, 12);
        gryffindors[1] = new Gryffindor("Гермиона Грейнджер", 8, 7, 9, 11, 13);
        gryffindors[2] = new Gryffindor("Рон Уизли", 6, 9, 11, 12, 11);

        for (int i = 0; i < gryffindors.length; i++) {
            System.out.println(gryffindors[i]);
        }
        System.out.println("------------------------------------------------------------------------------------------");

        Puffendyi[] puffendyis = new Puffendyi[3];
        puffendyis[0]=new Puffendyi("Захария Смит",11,15,13,11,16);
        puffendyis[1]=new Puffendyi("Седрик Диггори",8,9,6,7,11);
        puffendyis[2]=new Puffendyi("Джастин Финч-Флетчли",11,14,6,7,5);

        for (int i = 0; i < puffendyis.length; i++) {
            System.out.println(puffendyis[i]);
        }
        System.out.println("------------------------------------------------------------------------------------------");

        Kogtevran[] kogtevrans = new Kogtevran[3];
        kogtevrans[0]=new Kogtevran("Чжоу Чанг",8,11,15,13,11);
        kogtevrans[1]=new Kogtevran("Падма Патил",11,15,16,14,10);
        kogtevrans[2]=new Kogtevran("Маркус Белби",9,5,11,14,11);

        for (int i = 0; i < kogtevrans.length; i++) {
            System.out.println(kogtevrans[i]);
        }
        System.out.println("------------------------------------------------------------------------------------------");

        Slytherin[] slytherins=new Slytherin[3];
        slytherins[0]=new Slytherin("Драко Малфой",13,15,11,6,7,21,15);
        slytherins[1]=new Slytherin("Грэхэм Монтегю",11,8,9,10,11,8,12);
        slytherins[2]=new Slytherin("Грегори Гойл",11,12,15,7,5,8,9);

        for (int i = 0; i < slytherins.length; i++) {
            System.out.println(slytherins[i]);
        }
        System.out.println("------------------------------------------------------------------------------------------");





    }

}