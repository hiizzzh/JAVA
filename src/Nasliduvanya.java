class Document {
    protected String number;
    protected String date;
    protected String recipient;
    protected double amount;

    public Document(String number, String date, String recipient, double amount) {
        this.number = number;
        this.date = date;
        this.recipient = recipient;
        this.amount = amount;
    }

    public void displayInfo() {
        System.out.println("Number: " + number);
        System.out.println("Date: " + date);
        System.out.println("Recipient: " + recipient);
        System.out.println("Amount: " + amount);
    }
}

// Похідні класи Receipt, Invoice та Check
class Receipt extends Document {
    private final String payerInfo;
    private final String receiverSignature;

    public Receipt(String number, String date, String recipient, double amount, String payerInfo, String receiverSignature) {
        super(number, date, recipient, amount);
        this.payerInfo = payerInfo;
        this.receiverSignature = receiverSignature;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payer Info: " + payerInfo);
        System.out.println("Receiver Signature: " + receiverSignature);
    }
}

class Invoice extends Document {
    private final String sender;
    private  final String[] items;

    public Invoice(String number, String date, String recipient, double amount, String sender, String[] items) {
        super(number, date, recipient, amount);
        this.sender = sender;
        this.items = items;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sender: " + sender);
        System.out.println("Items:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}

class Check extends Document {
    private final String[] items;
    private final int[] quantities;
    private final double[] prices;

    public Check(String number, String date, String recipient, double amount, String[] items, int[] quantities, double[] prices) {
        super(number, date, recipient, amount);
        this.items = items;
        this.quantities = quantities;
        this.prices = prices;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Items:");
        for (int i = 0; i < items.length; i++) {
            System.out.println("- " + items[i] + " (Quantity: " + quantities[i] + ", Price: " + prices[i] + ")");
        }
    }
}

// Демонстраційний клас
public class Nasliduvanya  {
    public  static void main(String[] args) {
        Receipt receipt = new Receipt("R12345", "2023-10-10", "John Doe", 500, "XYZ Company", "Signature");
        Invoice invoice = new Invoice("I67890", "2023-10-10", "Jane Smith", 1200, "ABC Inc.", new String[]{"Item A", "Item B"});
        Check check = new Check("C54321", "2023-10-10", "Alice Johnson", 800, new String[]{"Item X", "Item Y"}, new int[]{2, 3}, new double[]{150, 200});

        receipt.displayInfo();
        System.out.println();
        invoice.displayInfo();
        System.out.println();
        check.displayInfo();
    }
}