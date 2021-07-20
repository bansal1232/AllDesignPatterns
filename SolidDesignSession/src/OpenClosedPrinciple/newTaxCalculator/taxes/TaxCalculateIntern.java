package OpenClosedPrinciple.newTaxCalculator.taxes;


import OpenClosedPrinciple.newTaxCalculator.employees.Employee;

public class TaxCalculateIntern implements TaxCalculator {
    private final static int INCOME_TAX_PERCENTAGE = 15;

    @Override
    public double calculate(Employee employee){
        return employee.getMonthlyIncome() * 12 >= 300000 ? (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100d : 0;
    }
}
