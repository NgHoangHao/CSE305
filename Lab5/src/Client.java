public class Client {
    public Contract requestCreateRentalContract(Contract contractBuilder) {
        contractBuilder.BuildContractID();
        contractBuilder.BuildPropertyID();
        contractBuilder.BuildTenantID();
        contractBuilder.BuildRentAmount();
        return contractBuilder.SignContract();
    }
}
