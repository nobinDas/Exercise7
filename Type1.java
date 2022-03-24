public class Type1 implements Visitable{
    String name;

    public Type1(String msg) {
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
