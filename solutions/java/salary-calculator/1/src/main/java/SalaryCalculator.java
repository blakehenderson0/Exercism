public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped <= 4 ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        double multiplier = bonusMultiplier(productsSold);
        return productsSold*multiplier;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000 * salaryMultiplier(daysSkipped);
        baseSalary += bonusForProductsSold(productsSold);
        return baseSalary > 2000 ? 2000 : baseSalary;
    }
}
