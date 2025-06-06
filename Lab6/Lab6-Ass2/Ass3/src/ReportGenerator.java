import java.util.List;

public class ReportGenerator {
    public static void main(String[] args) {
        Property property1 = new Property("Apartment A", 1500.0, new OwnerInfo("John Doe", "City Center"));
        Property property2 = new Property("House B", 2000.0, new OwnerInfo("Jane Smith", "Suburb"));
        Property property3 = new Property("Condo C", 1800.0, new OwnerInfo("Bob Johnson", "Downtown"));
        FinancialReport financialReport = new FinancialReport("Monthly Rent Summary",
                List.of(property1, property2, property3));
        financialReport.generateReport();
    }
}