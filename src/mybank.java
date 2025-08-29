public class mybank {
    public static void main(String[] args) {
        Bank b = new Bank();
        try {

            b.withdrawl(1200);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }


    }
}
