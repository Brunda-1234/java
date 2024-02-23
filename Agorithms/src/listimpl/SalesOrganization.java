package listimpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SalesExecutive {
    String employeeId;
    int sales;
    int subordinates;

    public SalesExecutive(String employeeId, int sales, int subordinates) {
        this.employeeId = employeeId;
        this.sales = sales;
        this.subordinates = subordinates;
    }
}

public class SalesOrganization {

    public static void main(String[] args) {
        List<SalesExecutive> salesExecutives = new ArrayList<>();

        // Populate the salesExecutives list with your data
        salesExecutives.add(new SalesExecutive("SE1", 5, 5));
        salesExecutives.add(new SalesExecutive("SE2", 6, 4));
        salesExecutives.add(new SalesExecutive("SE3", 8, 5));
        // Add more executives as needed


        List<String> result = lineWithHighestSales(salesExecutives);
        System.out.println(result);

//        // Print the result
//        for (String line : result) {
//            System.out.println(line);
//        }
    }



    public static List<String> lineWithHighestSales(List<SalesExecutive> salesExecutives) {
        Map<String, Integer> totalSalesMap = new HashMap<>();

        // Calculate total sales for each line
        for (SalesExecutive executive : salesExecutives) {
            totalSalesMap.put(executive.employeeId, totalSalesMap.getOrDefault(executive.employeeId, 0) + executive.sales);
        }

        // Find the line with the highest total sales
        String highestSalesLine = "";
        int highestTotalSales = 0;
        for (Map.Entry<String, Integer> entry : totalSalesMap.entrySet()) {
            if (entry.getValue() > highestTotalSales) {
                highestTotalSales = entry.getValue();
                highestSalesLine = entry.getKey();
            }
        }

        // Calculate individual bonus distribution for the highest sales line
//        List<List<String>> result = new ArrayList<List<String>>();
        List<String> bonusDistribution = new ArrayList<>();
        for (SalesExecutive executive : salesExecutives) {
        	System.out.println(executive);
//            if (executive.employeeId.equals(highestSalesLine)) {
                int budgetEfficiencyBonus = (int) (0.25 * 3000000 * (double) executive.subordinates / 15);
                int salesEfficiencyBonus = (int) (0.75 * 3000000 * (double) executive.sales / highestTotalSales);
                int totalBonus = budgetEfficiencyBonus + salesEfficiencyBonus;

                bonusDistribution.add("Employee ID: " + executive.employeeId);
                bonusDistribution.add("Bonus: " + totalBonus);
//                result.add(bonusDistribution);
//            }
        }

        return bonusDistribution;
    }

}
