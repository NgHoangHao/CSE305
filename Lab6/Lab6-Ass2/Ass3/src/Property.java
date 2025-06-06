class Property {
    private String name;
    private double rentAmount;
    private OwnerInfo ownerInfo;

    public Property(String name, double rentAmount, OwnerInfo ownerInfo) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.ownerInfo = ownerInfo;
    }

    public String getName() {
        return name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public OwnerInfo getOwnerInfo() {
        return ownerInfo;
    }

    @Override
    public String toString() {
        return "Property: " + name + "\n" +
                "Rent Amount: $" + rentAmount + "\n" +
                ownerInfo.toString();
    }
}