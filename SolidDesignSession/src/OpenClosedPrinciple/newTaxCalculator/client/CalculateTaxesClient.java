package OpenClosedPrinciple.newTaxCalculator.client;


import OpenClosedPrinciple.newTaxCalculator.persistence.EmployeeRepository;
import OpenClosedPrinciple.newTaxCalculator.taxes.TaxCalculatorFactory;
import OpenClosedPrinciple.newTaxCalculator.employees.Employee;

import java.util.List;

/**
 * @author Shubham Bansal
 */
public class CalculateTaxesClient {
    public static void main(String[] args) {
       
        EmployeeRepository repository = new EmployeeRepository();

        // Grab OpenClosedPrinciple.newTaxCalculator.employees
        List<Employee> employees = repository.findAll();


        double totalTaxes = 0;
        for (Employee employee: employees){

            // compute individual tax
            double tax = TaxCalculatorFactory.getTaxInstance(employee).calculate(employee);
            // String formattedTax = currencyFormatter.format(tax);
            // add to company total taxes
            totalTaxes += tax;
        }
        System.out.println(totalTaxes);
    }
}
