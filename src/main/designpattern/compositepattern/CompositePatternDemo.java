package main.designpattern.compositepattern;

/**
 * @author bx
 * @date 8/7/2019 9:33 AM
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CTO = new Employee("baymax", "CTO", 200000);
        Employee headSales = new Employee("Robert", "head sales", 2000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee clerk1 = new Employee("laura", "Marketing", 1000);
        Employee clerk2 = new Employee("Bob", "Marketing", 1000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 1000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 1000);

        CTO.add(headSales);
        CTO.add(headSales);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CTO);
        for (Employee employee : CTO.getSubordinates()) {
            System.out.println(employee);
            for (Employee employee1 : employee.getSubordinates()) {
                System.out.println(employee1);
            }
        }
    }

}
