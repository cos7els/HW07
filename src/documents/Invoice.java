package documents;

public class Invoice extends Document {
    private int sumForMonth;
    private String departmentCode;

    public Invoice() {
        super();
        this.sumForMonth = 0;
        this.departmentCode = "xxxyyyzzz";
    }

    public Invoice(int sumOfMonth, String departmentCode) {
        super();
        this.sumForMonth = sumOfMonth;
        this.departmentCode = departmentCode;
    }

    public Invoice(int numberOfDocument, String dateOfDocument, int sumOfMonth, String departmentCode) {
        super(numberOfDocument, dateOfDocument);
        this.sumForMonth = sumOfMonth;
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Type of document: invoice, number of document = " + this.numberOfDocument +
                ", date of document = " + dateOfDocument + ", sum for month = " + this.sumForMonth +
                ", department code = " + this.departmentCode;
    }

}