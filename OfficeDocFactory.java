
public class OfficeDocFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new OfficeDoc();
    }
}
