public class Hogwarts {
    private String fullName;
    private int powerOfMagic;
    private int distanceTransgression;

    public Hogwarts(String fullName, int powerOfMagic, int distanceTransgression) {
        this.fullName = fullName;
        this.powerOfMagic = powerOfMagic;
        this.distanceTransgression = distanceTransgression;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        if (powerOfMagic < 0 || powerOfMagic > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        if (distanceTransgression < 0 || distanceTransgression > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.distanceTransgression = distanceTransgression;
    }

    @Override
    public String toString() {
        return
                "fullName='" + fullName + '\'' +"-"+
                " powerOfMagic=" + powerOfMagic +
                ", distanceTransgression=" + distanceTransgression +",";
    }

    public int abilitiesHoqwarts(){
        int abilities;
        abilities=getDistanceTransgression()+getPowerOfMagic();
        return abilities;
    }

    public  void abilityStudent(Hogwarts a,Hogwarts b) {
        int aA=a.getDistanceTransgression()+a.powerOfMagic;
        int bB=b.getDistanceTransgression()+b.powerOfMagic;
        if (aA > bB) {
            System.out.println(a.getFullName()+" обладает большей мощностью "+b.getFullName());
        }else {
            System.out.println(b.getFullName()+" обладает большей мощносстью "+a.getFullName());
        }
    }
}
