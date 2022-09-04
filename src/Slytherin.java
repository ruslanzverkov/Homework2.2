public class Slytherin extends Hogwarts{
    public int trick;
    public int determination;
    public int ambition;
    public int resourcefulness;
    public int lustForPower;

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public Slytherin(String fullName, int powerOfMagic, int distanceTransgression, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, powerOfMagic, distanceTransgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;


    }

    @Override
    public String toString() {
        return "Slytherin:" +super.toString()+
                "trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                "; " ;
    }
}
