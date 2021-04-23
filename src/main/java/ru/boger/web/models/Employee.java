package ru.boger.web.models;

import ru.boger.web.validations.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 25, message = "The length of the name must be between 2 and 25 characters")
    private String name;
    @NotBlank(message = "Must be not null")
    private String surname;
    private String department;
    private String carBrand;
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{2}", message = "Please use pattern: XXX-XXX-XX")
    private String phoneNumber;
    @CheckEmail
    private String email;
    @Min(value = 200)
    @Max(value = 400)
    private int salary;
    private Map<String, String> departments;
    private Map<String, String> carBrands;
    private String[] languages;

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public Employee() {
        this.departments = new HashMap<>();
        departments.put("IT", "IT");
        departments.put("HR", "HR");
        departments.put("Sales", "Sales");

        this.carBrands = new HashMap<>();
        carBrands.put("Audi", "Audi");
        carBrands.put("BMV", "BMV");
        carBrands.put("Mazda", "Mazda");
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
