package documents;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeContract extends Document {
    private LocalDate endOfContract;
    private String nameEmployee;

    public EmployeeContract() {
        super();
        this.endOfContract = LocalDate.now();
        this.nameEmployee = "None None";
    }

    public EmployeeContract(String endOfContract, String nameEmployee) {
        super();
        this.endOfContract = LocalDate.parse(endOfContract, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.nameEmployee = nameEmployee;
    }

    public EmployeeContract(int numberOfDocument, String dateOfDocument, String endOfContract, String nameEmployee) {
        super(numberOfDocument, dateOfDocument);
        this.endOfContract = LocalDate.parse(endOfContract, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.nameEmployee = nameEmployee;
    }

    @Override
    public String toString() {
        return "Type of document: employee contract, number of document = " + this.numberOfDocument +
                ", date of document = " + dateOfDocument + ", end of contract = " + this.endOfContract +
                ", name of employee = " + this.nameEmployee;
    }

}