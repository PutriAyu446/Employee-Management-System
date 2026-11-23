/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author ACER
 */
import java.time.LocalDateTime;

public abstract class Employee {

    protected String emp_id;
    protected String name;
    protected String department;
    protected double salary;

    public Employee(String emp_id, String name, String department, double salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void clockIn() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Karyawan " + name + " masuk ke kantor pada "
                + now.getDayOfWeek() + ", " + now.getDayOfMonth() + " "
                + now.getMonth() + " " + now.getYear() + ", jam "
                + now.getHour() + ":" + now.getMinute());
    }

    public void clockOut() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Karyawan " + name + " pulang pada "
                + now.getDayOfWeek() + ", " + now.getDayOfMonth() + " "
                + now.getMonth() + " " + now.getYear() + ", jam "
                + now.getHour() + ":" + now.getMinute());
    }

    public void displayInfo() {
        System.out.println("ID         : " + emp_id);
        System.out.println("Nama       : " + name);
        System.out.println("Departemen : " + department);
        System.out.println("Gaji       : " + salary);
    }

    public abstract void performDailyTask();

    public String getName() {
        return name;
    }
}
