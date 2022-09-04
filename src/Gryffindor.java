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
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
