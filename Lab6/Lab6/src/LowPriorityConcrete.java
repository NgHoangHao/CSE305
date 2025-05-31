public class LowPriorityConcrete extends RequestProduct {

    @Override
    public void setPriority() {
        this.priority = "Ignore";
    }

    @Override
    public void setExpire() {
        this.expireDay = "31/05/2024";
    }

    @Override
    public void setStatus() {
        this.status = "Done";
    }

    @Override
    public void processRequest() {
      System.out.println("Request denie");
    }
}
