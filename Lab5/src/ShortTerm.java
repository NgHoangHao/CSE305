public class ShortTerm implements Contract {
    private String contractID;
    private long rentAmount;
    private String tenantID;
    private String propertyID;

    public ShortTerm() {
    }

    public void BuildContractID() {
        this.contractID = "777";
    }

    public void BuildPropertyID() {
        this.propertyID = "888";
    }

    public void BuildTenantID() {
        this.tenantID = "999";
    }

    public void BuildRentAmount() {
        this.rentAmount = 10;
    }

    public Contract SignContract(){
        return this;
    }

    @Override
    public String toString() {
        return "ShortTerm [contractID=" + contractID + ", rentAmount=" + rentAmount + ", tenantID=" + tenantID
                + ", propertyID=" + propertyID + "]";
    }
}

