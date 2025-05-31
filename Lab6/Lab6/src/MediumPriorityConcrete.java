public class MediumPriorityConcrete extends RequestProduct {

    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setExpire() {
        this.expireDay = "30/06/2024";
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void processRequest() {
      System.out.println("Request accept, estimated completion date is 30/06/2025");
    }
}
