class Account {

    public double balance;
    public String accountType;

    public Account() {
        balance = 0.0;
        accountType = "Savings";
    }

    public Account(double initialBalance, String type) {
        balance = initialBalance;
        accountType = type;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void display() {
        System.out.println("Account Type: " + accountType + " | Balance: " + balance);
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.deposit(500.0);
        a1.display();

        Account a2 = new Account(1000.0, "Checking");
        a2.withdraw(250.0);
        a2.display();
    }
}