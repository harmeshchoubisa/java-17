package com.learn.lambda;

public class CheckEmployeeWorksImpl implements CheckEmployee{
    @Override
    public boolean test(Employee employee) {
        return employee.isWorking();
    }
}
