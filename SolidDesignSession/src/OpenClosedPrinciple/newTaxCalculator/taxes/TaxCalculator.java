package OpenClosedPrinciple.newTaxCalculator.taxes;


import OpenClosedPrinciple.newTaxCalculator.employees.Employee;

public interface TaxCalculator {
    double calculate(Employee employee);
}