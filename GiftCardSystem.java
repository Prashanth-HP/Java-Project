public class GiftCardSystem {
///////////////
    static class Customer {
        private String name;
        private String email;

        public Customer(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() { return name; }
        public String getEmail() { return email; }

        @Override
        public String toString() {
            return "Customer Name: " + name + ", Email: " + email;
        }
    }
/////////////////
    static class GiftCard {
        private String cardId;
        private double balance;
        private Customer owner;

        public GiftCard(String cardId, double balance, Customer owner) {
            this.cardId = cardId;
            this.balance = balance;
            this.owner = owner;
        }

        public String getCardId() { return cardId; }
        public double getBalance() { return balance; }
        public Customer getOwner() { return owner; }

        public void addBalance(double amount) {
            balance += amount;
            System.out.println("₹" + amount + " added. New Balance: ₹" + balance);
        }

        public void useCard(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient balance!");
            } else {
                balance -= amount;
                System.out.println("Used ₹" + amount + ". Remaining Balance: ₹" + balance);
            }
        }

        @Override
        public String toString() {
            return "Card ID: " + cardId + ", Balance: ₹" + balance +
                   ", Owner: " + owner.getName();
        }
    }
////////////////////
    public static void main(String[] args) {

        // Sample Customer
        Customer c1 = new Customer("Hari", "hari@gmail.com");

        // Sample Gift Card
        GiftCard card1 = new GiftCard("GC101", 1000.0, c1);

        System.out.println("=== Gift Card Details ===");
        System.out.println(card1);

        System.out.println("\n--- Adding Money ---");
        card1.addBalance(500);

        System.out.println("\n--- Using Gift Card ---");
        card1.useCard(700);

        System.out.println("\n--- Final Card Info ---");
        System.out.println(card1);
    }
}
