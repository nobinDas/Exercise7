public class Type2 implements Visitable{
    String name;

    public Type2(String msg) {
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
