public class InheritanceExercise {
    public class BankAccount{
        private double balance;
        public BankAccount(double b){
            balance = b;
        }
        public double withdraw(double amount){
            balance -= amount;
            return amount;
        }
        public void deposit(double amount){
            balance += amount;
        }
    }
    // Continued
    public class SavingsAccount extends BankAccount{
        private double balance;
        public SavingsAccount(double b){
            super(b);
            balance = b;
        }
        public double withdraw(double amount){
            if(balance-amount>=100){
                balance -= amount;
                return amount;
            }else{
                return 0;
            }
        }
    }
}
