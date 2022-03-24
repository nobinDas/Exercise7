public interface Visitable {
    void accept(Visitor v);
    abstract void computeAllTaxes();
}
