public class Type3 implements Visitable{
    String name;

    public Type3(String msg) {
        name = msg;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getName(){
        return name;
    }
}
