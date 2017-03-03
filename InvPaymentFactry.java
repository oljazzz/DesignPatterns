
public class InvPaymentFactry implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new InvPayment();
    }
}
