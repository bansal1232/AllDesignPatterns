package SingleRespPrinciple;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmployeeWrong {
    private String firstName;
    private String lastName;
    private Double monthlyIncome;
    private Integer noHoursPerWeek;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public Integer getNoHoursPerWeek() {
        return noHoursPerWeek;
    }

    public void setNoHoursPerWeek(Integer noHoursPerWeek) {
        this.noHoursPerWeek = noHoursPerWeek;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthlyIncome=" + monthlyIncome +
                ", noHoursPerWeek=" + noHoursPerWeek +
                '}';
    }

    public void save() {
        try {
            EmployeeWrong employee = this;
            StringBuilder sb = new StringBuilder();
            sb.append("### EMPLOYEE RECORD ###");
            sb.append(System.lineSeparator());

            sb.append("Name: ");
            sb.append(employee.firstName + " " + employee.lastName);
            sb.append(System.lineSeparator());

            sb.append("Monthly wage: ");
            sb.append(employee.monthlyIncome);
            sb.append(System.lineSeparator());

            Path path = Paths.get(employee.getFullName().replace(" ", "_") + ".rec");
            Files.write(path, sb.toString().getBytes());
            System.out.println("Saved employee " + employee.toString());
        } catch (IOException e) {
            System.out.println("Error: Could not save employee. " + e);
        }
    }
}
