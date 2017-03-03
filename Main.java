
public class Main {

    public static void main(String[] args) {
     Document invPayment = getFactory(DocType.OFFICE_DOC);
        assert invPayment != null;
        invPayment.send();

    }


    public static Document getFactory(DocType docType) {
        switch (docType) {
            case OFFICE_DOC:
                return new InvPayment();
            case INV_PAYMENT:
                return new OfficeDoc();
        }
        return null;
    }
}
