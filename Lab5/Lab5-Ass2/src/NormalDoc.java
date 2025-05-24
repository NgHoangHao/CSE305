public class NormalDoc implements Document {
    private String extension;
    private String encryption;

    @Override
    public void setExtension() {
        this.extension = ".zip";
    }

    @Override
    public void setEncryption() {
        this.encryption = "AES";
    }

    @Override
    public Document buildDoc() {
        return this;
    }

    @Override
    public String toString() {
        return "NormalDoc{" +
                "extension='" + extension + '\'' +
                ", encryption='" + encryption + '\'' +
                '}';
    }
}
