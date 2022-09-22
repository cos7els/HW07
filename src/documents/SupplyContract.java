package documents;

public class SupplyContract extends Document {
    private String typeOfProducts;
    private int amount;

    public SupplyContract() {
        super();
        this.typeOfProducts = "unknown";
        this.amount = 0;
    }

    public SupplyContract(String typeOfProducts, int amount) {
        super();
        this.typeOfProducts = typeOfProducts;
        this.amount = amount;
    }

    public SupplyContract(int numberOfDocument, String dateOfDocument, String typeOfProducts, int amount) {
        super(numberOfDocument, dateOfDocument);
        this.typeOfProducts = typeOfProducts;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Type of document: supply contract, number of document = " + this.numberOfDocument +
                ", date of document = " + dateOfDocument + ", type of products = " + this.typeOfProducts +
                ", amount = " + this.amount + " pcs.";
    }

}