public class EmployeeDemo {
    public static void main(String[] args){
        Employee e1,e2;
        e1 = new Employee();
        e2 = new Employee();
        e1.name = "Robert Smith";
        e1.address = "123 Main";
        e1.number = 101;
        e1.NSSFNO = 11223344;
        e1.salary = 1000.00;
        System.out.println(e1.computePay());
        e1.mailCheck();
        e2.name = "Dinar Nato";
        e2.address = "156 Main";
        e2.number = 105;
        e2.NSSFNO = 99786534;
        e2.salary = 3000.00;
        System.out.println(e2.computePay());
        e2.mailCheck();

    }
}
