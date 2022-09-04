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
        if (trick < 0 || trick > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (determination < 0 || determination > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (ambition < 0 || ambition > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        if (lustForPower < 0 || lustForPower > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
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
    public int abilitiesSlytherin(){
        int abilities;
        abilities=getAmbition()+getDetermination()+getTrick()+getResourcefulness()+getLustForPower();
        return abilities;
    }

    public  void abilitySlytherin(Slytherin a,Slytherin b) {
        int aA=a.getAmbition()+a.getTrick()+a.getDetermination()+a.getResourcefulness()+a.getLustForPower();
        int bB=b.getAmbition()+b.getTrick()+b.getDetermination()+a.getResourcefulness()+b.getLustForPower();
        if (aA > bB) {
            System.out.println(a.getFullName()+" больший слизеринец"+b.getFullName());
        }else {
            System.out.println(b.getFullName()+" больший слизеринец " +a.getFullName());

        }
    }

}
