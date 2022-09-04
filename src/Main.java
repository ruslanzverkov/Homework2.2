public class Main {
    public static void main(String[] args) {

        Gryffindor[] gryffindors = new Gryffindor[3];
        gryffindors[0] = new Gryffindor("Гарри Поттер", 10, 11, 14, 15, 12);
        gryffindors[1] = new Gryffindor("Гермиона Грейнджер", 8, 7, 9, 11, 13);
        gryffindors[2] = new Gryffindor("Рон Уизли", 6, 9, 11, 12, 11);

        for (int i = 0; i < gryffindors.length; i++) {
            System.out.println(gryffindors[i]);
        }
        //1й вариант
        for (int i = 0; i < gryffindors.length-1; i++) {
            if (gryffindors[i].abilitiesGryffindor()>gryffindors[i+1].abilitiesGryffindor());
            System.out.println(gryffindors[i].getFullName()+" лучший грифендорц чем "+gryffindors[i+1].getFullName());
        }
        //2й вариант
        gryffindors[0].abilityStudent(gryffindors[0],gryffindors[1]);

        System.out.println("------------------------------------------------------------------------------------------");

        Puffendyi[] puffendyis = new Puffendyi[3];
        puffendyis[0]=new Puffendyi("Захария Смит",11,15,13,11,16);
        puffendyis[1]=new Puffendyi("Седрик Диггори",8,9,6,7,11);
        puffendyis[2]=new Puffendyi("Джастин Финч-Флетчли",11,14,6,7,5);

        for (int i = 0; i < puffendyis.length; i++) {
            System.out.println(puffendyis[i]);
        }
        //1й вариант
        for (int i = 0; i < puffendyis.length-1; i++) {
            if (puffendyis[i].abilitiesPuffendyi()>puffendyis[i+1].abilitiesPuffendyi());
            System.out.println(puffendyis[i].getFullName()+" лучший пуфендуец чем "+puffendyis[i+1].getFullName());
        }
        //2й вариант и т.д.
        puffendyis[0].abilityPuffendyi(puffendyis[0],puffendyis[1]);

        System.out.println("------------------------------------------------------------------------------------------");

        Kogtevran[] kogtevrans = new Kogtevran[3];
        kogtevrans[0]=new Kogtevran("Чжоу Чанг",8,11,15,13,11);
        kogtevrans[1]=new Kogtevran("Падма Патил",11,15,16,14,10);
        kogtevrans[2]=new Kogtevran("Маркус Белби",9,5,11,14,11);

        for (int i = 0; i < kogtevrans.length; i++) {
            System.out.println(kogtevrans[i]);
        }

        for (int i = 0; i < kogtevrans.length-1; i++) {
            if (kogtevrans[i].abilitiesKogtevran()>kogtevrans[i+1].abilitiesKogtevran());
            System.out.println(kogtevrans[i].getFullName()+" лучший когтевранец чем "+kogtevrans[i+1].getFullName());
        }

        kogtevrans[0].abilityKogtevran(kogtevrans[1],kogtevrans[2]);

        System.out.println("------------------------------------------------------------------------------------------");

        Slytherin[] slytherins=new Slytherin[3];
        slytherins[0]=new Slytherin("Драко Малфой",13,15,11,6,7,21,15);
        slytherins[1]=new Slytherin("Грэхэм Монтегю",11,8,9,10,11,8,12);
        slytherins[2]=new Slytherin("Грегори Гойл",11,12,15,7,5,8,9);

        for (int i = 0; i < slytherins.length; i++) {
            System.out.println(slytherins[i]);
        }
        for (int i = 0; i < slytherins.length-1; i++) {
            if (slytherins[i].abilitiesSlytherin()>slytherins[i+1].abilitiesSlytherin());
            System.out.println(slytherins[i].getFullName()+" лучший слизеринец чем "+slytherins[i+1].getFullName());
        }
        slytherins[0].abilityStudent(slytherins[1],slytherins[0]);

        System.out.println("------------------------------------------------------------------------------------------");

        slytherins[0].abilityStudent(slytherins[0],gryffindors[1]);


    }

}