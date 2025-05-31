public class Main {
    public static void main(String[] args) {
        RequestCreator b = new MidPriorityConcreteCreator();
        b.createRequest().processRequest();
    }
}
