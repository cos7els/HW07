package documents;

public class Main {
    public static void main(String[] args) {
        Register reg = new Register();
        reg.saveToRegister(new SupplyContract());
        reg.saveToRegister(new SupplyContract(  14356, "01.09.2022", "Flowers", 500));
        reg.saveToRegister(new EmployeeContract());
        reg.saveToRegister(new EmployeeContract(89321, "10.08.2010", "10.08.2025", "Aleksandr Mazur"));
        reg.saveToRegister(new Invoice());
        reg.saveToRegister(new Invoice(57998, "10.11.1989", 150000, "R2D2"));
        reg.aboutAllDocs();
    }
}
