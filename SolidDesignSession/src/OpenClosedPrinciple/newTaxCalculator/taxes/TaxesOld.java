package OpenClosedPrinciple.newTaxCalculator.taxes;


import OpenClosedPrinciple.newTaxCalculator.employees.Employee;

class taxCalculator {
    private static final int INCOME_TAX_PERCENTAGE = 20;
    private static final int PROFESSIONAL_TAX_PERCENTAGE = 3;

    public static double calculate(Employee employee) {
        return (employee.getMonthlyIncome() * (PROFESSIONAL_TAX_PERCENTAGE / 100.0) +
                employee.getMonthlyIncome() * (INCOME_TAX_PERCENTAGE / 100.0));
    }

}