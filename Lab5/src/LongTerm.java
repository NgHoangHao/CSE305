public class LongTerm implements Contract {
    private String contractID;
    private long rentAmount;
    private String tenantID;
    private String propertyID;

    public LongTerm() {
    }

    public String getContractID() {
        return contractID;
    }

    public long getRentAmount() {
        return rentAmount;
    }

    public String getTenantID() {
        return tenantID;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public void setRentAmount(long rentAmount) {
        this.rentAmount = rentAmount;
    }

    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public void BuildContractID() {
        this.contractID = "444";
    }

    public void BuildPropertyID() {
        this.propertyID = "555";
    }

    public void BuildTenantID() {
        this.tenantID = "666";
    }

    public void BuildRentAmount() {
        this.rentAmount = 7;
    }

    public Contract SignContract() {
        return this;
    }

    @Override
    public String toString() {
        return "LongTerm [contractID=" + contractID + ", rentAmount=" + rentAmount + ", tenantID=" + tenantID
                + ", propertyID=" + propertyID + "]";
    }
}
