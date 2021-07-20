package OpenClosedPrinciple.newTaxCalculator.taxes;


import OpenClosedPrinciple.newTaxCalculator.employees.Employee;

public class TaxCalculatePTE implements TaxCalculator {
    private final static int INCOME_TAX_PERCENTAGE = 20;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 3;
    private final static int EDUCATION_CESS = 1;
    
    @Override
    public double calculate(Employee employee){
        return 
                (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100d +
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100d +
                (employee.getMonthlyIncome() * EDUCATION_CESS) / 100d;
    }
}
