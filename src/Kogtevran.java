public class Kogtevran extends Hogwarts {
    public int intellect;
    public int wisdom;
    public int creativity;

    public Kogtevran(String fullName, int powerOfMagic, int distanceTransgression, int intellect, int wisdom, int creativity) {
        super(fullName, powerOfMagic, distanceTransgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        if (intellect < 0 || intellect > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if (wisdom < 0 || wisdom > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (creativity < 0 || creativity > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Kogtevran:" +super.toString()+
                "intellect=" + intellect +
                ", wisdom=" + wisdom +
                ", creativity=" + creativity +
                "; "  ;
    }
    public int abilitiesKogtevran(){
        int abilities;
        abilities=getCreativity()+getIntellect()+getWisdom();
        return abilities;
    }

    public  void abilityKogtevran(Kogtevran a,Kogtevran b) {
        int aA=a.getIntellect()+a.getWisdom()+a.getCreativity();
        int bB=b.getIntellect()+b.getWisdom()+b.getCreativity();
        if (aA > bB) {
            System.out.println(a.getFullName()+" больший когтевранец "+b.getFullName());
        }else {
            System.out.println(b.getFullName()+" больший когтевранец "+a.getFullName());

        }
    }
}
