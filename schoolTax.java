public class schoolTax implements Visitor{

    @Override
    public void visit(Type1 type1) {
        System.out.println("School taxes for " + type1.getName() + " are: " + type1.getSchTax());
    }

    @Override
    public void visit(Type2 type2) {
        System.out.println("School taxes for " + type2.getName() + " are: " + type2.getSchTax());
    }

    @Override
    public void visit(Type3 type3) {
        System.out.println("School taxes for " + type3.getName() + " are: " + type3.getSchTax());
    }
}
