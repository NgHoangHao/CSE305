import java.util.List;

class FinancialReport {
    private String reportTitle;
    private List<Property> properties;
    private double totalRent;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        totalRent = 0;
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");
        for (Property property : properties) {
            System.out.println(property);
            totalRent += property.getRentAmount();
            if (property.getRentAmount() > 2000) {
                System.out.println("This is a premium property.");
            } else {
                System.out.println("This is a standard property.");
            }
            double yearlyRent = property.getRentAmount() * 12;
            System.out.println("Yearly Rent: $" + yearlyRent);
            System.out.println("--------------------");
        }
        System.out.println("Total Rent Amount: $" + totalRent);
    }
}

