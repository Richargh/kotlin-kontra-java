package de.richargh.ktkonja.sharedj.hidden.nullcheck;

public class Enterprise {
    public Employee train(String name){
        return new Employee(
                EmployeeId.random(),
                name,
                null
        );
    }
}
