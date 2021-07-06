public class AccountClient {
    public static void main(String args[]) {
        Account first = new Account(1, "Dipesh", 2300);
        System.out.println(first);
        try {
            first.deposit(-500);
            System.out.println(first.getBalance());

        } catch (AccountException e) {
            System.err.print(e.getMessage());
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
        // first.deposit(-500);
        // System.out.println(first.getBalance());
    }
}