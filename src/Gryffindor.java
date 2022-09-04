import java.util.Objects;

public class Gryffindor extends Hogwarts{
    public int nobility;
    public int honor;
    public int bravery;

    public Gryffindor(String fullName, int powerOfMagic, int distanceTransgression, int nobility, int honor, int bravery) {
        super(fullName, powerOfMagic, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility < 0 || nobility > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (honor < 0 || honor > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (bravery < 0 || bravery > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor:" +super.toString()+
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery+";" ;
    }


    public int abilitiesGryffindor(){
        int abilities;
        abilities=getBravery()+getHonor()+getNobility();
        return abilities;
    }

}
