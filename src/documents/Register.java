package documents;

import java.util.Arrays;

public class Register {
    private int currentPosition = -1;
    private Document[] docsArray = new Document[10];

    public void saveToRegister(Document d) {
        if (currentPosition < docsArray.length - 1) {
            docsArray[++currentPosition] = d;
        } else {
            System.out.println("Register array is full.");
        }
    }

    public void aboutDoc(Printable p) {
        p.printInfo();
    }

    public void aboutAllDocs() {
        Arrays.stream(docsArray).filter(d -> d != null).forEach(d -> aboutDoc(d));
    }

}