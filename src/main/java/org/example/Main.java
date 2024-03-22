package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        String[] devNames = {"name1", "name2", "name3"};
        String[] hltNames = {"name1", "name2", "name3"};
        Company company = new Company(1, "Company", 123456, devNames);
        Employee employee = new Employee(1, "Name Surname", "namesurname@test.com", "123456789", hltNames);
        Healthplan healthPlan = new Healthplan(1, "name1", Plan.BASIC);
        System.out.println(company);
        System.out.println(employee);
        System.out.println(healthPlan);
    }
}