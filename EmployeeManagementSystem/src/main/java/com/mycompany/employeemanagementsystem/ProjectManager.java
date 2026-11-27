/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author ACER
 */
public class ProjectManager extends Employee implements PaidLeavable {
 protected String managedProject;
    protected LocalDate projectDeadline;
    protected int leaveQuota;

    public ProjectManager(String id, String name, String department, double salary,
                          String managedProject, LocalDate projectDeadline, int leaveQuota) {
        super(id, name, department, salary);
        this.managedProject = managedProject;
        this.projectDeadline = projectDeadline;
        this.leaveQuota = leaveQuota;
    }

    public void assignProject(Employee emp) {
        System.out.println("Pemberian tugas Proyek : " + managedProject + "ke" + emp.getName());
    }

    public void submitProgressionReport() {
        System.out.println("Mensubmit Laporan Perkembangan untuk Proyek :" + managedProject);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Proyek Terselesaikan: " + managedProject);
        System.out.println("Deadline Proyek: " + projectDeadline);
        System.out.println("Quota keluar : " + leaveQuota);
    }

    @Override
    public void performDailyTask() {
        System.out.println(name + " Sedang me-manage timeline proyek dan koordinasi antar tim.");
    }

    public String applyLeave() {
        if (this.leaveQuota > 1) {
            this.leaveQuota = this.leaveQuota - 1;
            return ("Usulan cuti berbayar " + this.nama + " disetujui")
        } else {
            return ("Kuota cuti berbayar " + this.nama + " tidak mencukupi")
        }
    }
}
