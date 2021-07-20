package OpenClosedPrinciple.newTaxCalculator.taxes;


import OpenClosedPrinciple.newTaxCalculator.employees.Employee;
import OpenClosedPrinciple.newTaxCalculator.employees.FullTimeEmployee;
import OpenClosedPrinciple.newTaxCalculator.employees.PartTimeEmployee;

public class TaxCalculatorFactory {

    public static TaxCalculator getTaxInstance(Employee employee) {

        if (employee instanceof FullTimeEmployee) {
            return new TaxCalculateFTE();
        } else if (employee instanceof PartTimeEmployee) {
            return new TaxCalculatePTE();
        }
        return new TaxCalculateIntern();
    }


}
