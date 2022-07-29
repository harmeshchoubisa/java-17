package com.learn.lambda;

import java.util.ArrayList;

public class SampleLambda {

    public static void main(String[] args) {

        var employees = new ArrayList<Employee>();
        employees.add(new Employee("Tom", false, true));
        employees.add(new Employee("Dick", false, false));
        employees.add(new Employee("Harry", true, false));
        employees.add(new Employee("John", true, true));

        // Traditional search before lambda that enforce to create multiple classes all implementations
        getEmployee(employees, new CheckEmployeeWorksImpl());

        // Deferred execution by the means of lambda
        getEmployee(employees, Employee::isWorking);
    }

    private static void getEmployee(ArrayList<Employee> employees, CheckEmployee checkEmployee) {
        for(Employee employee: employees) {

            if(checkEmployee.test(employee))
                System.out.println(employee + " ");
        }
    }
}
