package cn.arthur.design.visitor.kpi;

/**
 * Created by arthur.
 */
public interface IVisitor {

    void visit(Engineer engineer);

    void visit(Manager manager);

}
