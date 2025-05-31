public abstract class RequestProduct {
    String priority;
    String expireDay;
    String status;

    public abstract void setPriority();

    public abstract void setExpire();

    public abstract void setStatus();

    public abstract void processRequest();
}
