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
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
