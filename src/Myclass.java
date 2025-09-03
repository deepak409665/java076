public class Myclass implements Printable {
    public void print(){
        System.out.println("Print method is implemented");
    }
public void show(){
    System.out.println("Show method is implemented");
}

    public static class Bank {
        private int balance=10000;
        public void withdrawl(int amount){
            if(amount>balance){
                throw new InsufficientBalanceException("cannot withdraw amount greater than balance");
            }else{
               balance = balance- amount;
                System.out.println("Withdrawl sucessful,Remaining Balance "+balance);

            }
        }
    }
}
