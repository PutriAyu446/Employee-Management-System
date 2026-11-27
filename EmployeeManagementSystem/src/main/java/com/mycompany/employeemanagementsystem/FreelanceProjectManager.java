/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author ACER
 */
public class FreelanceProjectManager extends Freelancer {
    protected String managedProject;
    protected String clientName;

    public FreelanceProjectManager(String id, String name, String department, double salary,
                                   int contractDuration, LocalDate contractEndDate,
                                   String managedProject, String clientName) {
        super(id, name, department, salary, contractDuration, contractEndDate);
        this.managedProject = managedProject;
        this.clientName = clientName;
    }

    public void assignProject(Employee emp) {
        System.out.println("Freelance PM " + name + " assigning project '" + managedProject + "' to " + emp.getName());
    }

    public void submitProgressionReport() {
        System.out.println("Submitting progression report for client: " + clientName);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Managed Project: " + managedProject);
        System.out.println("Client Name: " + clientName);
        System.out.println("Contract Status: " + checkContractStatus());
    }

    @Override
    public void performDailyTask() {
        System.out.println(name + " is coordinating project '" + managedProject + "' for client " + clientName);
    }
}
