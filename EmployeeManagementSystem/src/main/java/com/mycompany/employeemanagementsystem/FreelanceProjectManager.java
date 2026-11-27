/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

import java.time.LocalDate;

/**
 *
 * @author ACER
 */
public class FreelanceProjectManager  extends Freelancer {
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
        System.out.println("Freelance PM " + name + " Pemberian tugas Proyek'" + managedProject + " ke " + emp.getName());
    }

    public void submitProgressionReport() {
        System.out.println("Mensubmit Laporan Perkembangan Proyek untuk Klien: " + clientName);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Proyek yang dikerjakan: " + managedProject);
        System.out.println("Nama Klien: " + clientName);
        System.out.println("Status Kontrak: " + checkContractStatus());
    }

    @Override
    public void performDailyTask() {
        System.out.println(name + " Sedang mengkoordinasikan proyek " + managedProject + "untuk klien" + clientName);
    }
}