package domain.Visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
