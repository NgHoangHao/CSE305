public class Client {
    public Document newDocument(Document docBuilder) {
        docBuilder.setExtension();
        docBuilder.setEncryption();
        return docBuilder.buildDoc();
    }
}