public class municipalTax implements Visitor{
    @Override
    public void visit(Type1 type1) {
        System.out.println("Computing municipal taxes for a Type 1 building named: " + type1.getName());
    }

    @Override
    public void visit(Type2 type2) {
        System.out.println("Computing municipal taxes for a Type 1 building named: " + type2.getName());
    }

    @Override
    public void visit(Type3 type3) {
        System.out.println("Computing municipal taxes for a Type 1 building named: " + type3.getName());
    }
}
