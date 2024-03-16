public class Account {
    // Definisikan atribut balance tipe double, dan sifat protected
    protected double balance;

    // Definisikan konstruktor Account dengan parameter balance
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Definisikan metode getBalance untuk mendapatkan nilai balance
    public double getBalance() {
        return this.balance;
    }

    // Definisikan metode deposit untuk menambah nilai balance
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Definisikan metode withdraw untuk mengambil nilai balance
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
    }
}

public class SavingAccount extends Account {
    // Define the private interestRate attribute
    private double interestRate;

    // Define the SavingAccount constructor with balance and interest_rate parameters
    public SavingAccount(double balance, double interest_rate) {
        // Call the parent constructor with the balance parameter
        super(balance);

        // Set the interestRate attribute with the interest_rate parameter
        this.interestRate = interest_rate;
    }

    // Define the calculateInterest method
    public double calculateInterest() {
        return this.balance * this.interestRate;
    }
}
