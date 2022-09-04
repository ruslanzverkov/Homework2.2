public class Puffendyi extends Hogwarts{
    public int industriousness;
    public int loyalty;
    public int honesty;

    public Puffendyi(String fullName, int powerOfMagic, int distanceTransgression, int industriousness, int loyalty, int honesty) {
        super(fullName, powerOfMagic, distanceTransgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        if (industriousness < 0 || industriousness > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty < 0 || loyalty > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (honesty < 0 || honesty > 100) {
            throw new RuntimeException("Введено неверное значение");
        }
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Puffendyi:" +super.toString()+
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ";"  ;
    }
    public int abilitiesPuffendyi(){
        int abilities;
        abilities=getHonesty()+getIndustriousness()+getLoyalty();
        return abilities;
    }

    public  void abilityPuffendyi(Puffendyi a,Puffendyi b) {
        int aA=a.getHonesty()+a.getLoyalty()+a.getIndustriousness();
        int bB=b.getHonesty()+b.getLoyalty()+b.getIndustriousness();
        if (aA > bB) {
            System.out.println(a.getFullName()+" больший пуфендуец "+b.getFullName());
        }else {
            System.out.println(b.getFullName()+" больший пуфендуец "+a.getFullName());

        }
    }

}
