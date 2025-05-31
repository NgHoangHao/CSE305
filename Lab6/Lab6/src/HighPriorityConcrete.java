public class HighPriorityConcrete extends RequestProduct {

    @Override
    public void setPriority() {
        this.priority = "Emergency";
    }

    @Override
    public void setExpire() {
        this.expireDay = "31/05/2024";
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }
}
