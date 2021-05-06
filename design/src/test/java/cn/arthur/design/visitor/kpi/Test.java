package cn.arthur.design.visitor.kpi;

/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();
        System.out.println("==========CEO看报表===============");
        report.showReport(new CEOVistitor());
        System.out.println("==========CTO看报表===============");
        report.showReport(new CTOVistitor());
    }
}
