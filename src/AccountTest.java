public class AccountTest {
    public static void main(String[] args) {
        Account account=new Account();
        account.balance=50;
        account.balance=account.balance-25;
        System.out.println(account.balance);
        account.setBalance(-50);
        System.out.println(account.getBalance());
        account.setName("Hannan");
        System.out.println(account.getName());
    }
}
