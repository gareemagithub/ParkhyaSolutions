package IMP;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MonthlyData {
    private String yearMonth;
    private double totalAmount;

    public MonthlyData(String yearMonth, double totalAmount) {
        this.yearMonth = yearMonth;
        this.totalAmount = totalAmount;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void addAmount(double amount) {
        this.totalAmount += amount;
    }

    @Override
    public String toString() {
        return "Month: " + yearMonth + ", Total Amount: " + totalAmount;
    }
}

public class MonthlyAggregation {
     public static void main(String[] args) throws ParseException{
        // Example list of daily data (Date, Amount)
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"2025-01-01", "100"});
        data.add(new String[]{"2025-01-05", "150"});
        data.add(new String[]{"2025-02-10", "200"});
        data.add(new String[]{"2025-01-15", "50"});
        data.add(new String[]{"2025-02-20", "300"});

        // Date format to parse the date strings
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // A map to hold the aggregation by Year-Month
        Map<String, MonthlyData> monthlyMap = new HashMap<>();

        // Process each record
        for (String[] record : data) {
            String dateStr = record[0];
            double amount = Double.parseDouble(record[1]);

            // Parse the date
            Date date = sdf.parse(dateStr);
            // Extract Year-Month (e.g., 2025-01)
            String yearMonth = new SimpleDateFormat("yyyy-MM").format(date);

            // If the yearMonth is already in the map, update the total amount, otherwise create a new entry
            if (monthlyMap.containsKey(yearMonth)) {
                monthlyMap.get(yearMonth).addAmount(amount);
            } else {
                monthlyMap.put(yearMonth, new MonthlyData(yearMonth, amount));
            }
        }

        // Output the results
        System.out.println("Monthly Aggregated Data:");
        for (MonthlyData monthlyData : monthlyMap.values()) {
            System.out.println(monthlyData);
        }
    }
}
