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
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
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
}
