public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        Document normal = client.newDocument(new NormalDoc());
        System.out.println(normal);

        Document confidential = client.newDocument(new ConfidentialDoc());
        System.out.println(confidential);
    }
}
