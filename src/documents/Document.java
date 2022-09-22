package documents;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Document implements Printable {
    protected int numberOfDocument;
    protected LocalDate dateOfDocument;
    private static int globalNumber= 10000;

    public Document() {
        this.dateOfDocument = LocalDate.now();
        this.numberOfDocument = setNumber();
    }

    public Document(int numberOfDocument, String dateOfDocument) {
        this.numberOfDocument = numberOfDocument;
        this.dateOfDocument = LocalDate.parse(dateOfDocument, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    @Override
    public void printInfo() {
        System.out.println(this.toString());
    }

    private int setNumber() {
        return globalNumber++;
    }

}
