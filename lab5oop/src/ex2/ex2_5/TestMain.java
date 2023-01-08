package ex2.ex2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "Abe", 'm');
        System.out.println(customer.getID());
        System.out.println(customer.getName());
        System.out.println(customer.getGender());

        Account account = new Account(101, customer, 100.0);
        System.out.println(account);
        account.deposit(200.0);
        System.out.println(account);
        account.withdraw(100.0);
        System.out.println(account);
        account.withdraw(1000.0);
    }
}
