public class Type3 implements Visitable{
    String name;
    int value = 50000;
    double muniTax;
    double schTax;

    public Type3(String msg) {
        name = msg;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public void computeAllTaxes() {
        muniTax = value*0.08;
        schTax = value*0.009;
    }
    public double getMuniTax(){
        return muniTax;
    }
    public double getSchTax(){
        return schTax;
    }

    public String getName(){
        return name;
    }
}
