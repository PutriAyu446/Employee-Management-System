/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author ACER
 */
public class Accountant extends Employee implements PaidLeavable {
    //salary di employee itu perbulan atau per apa
    protected String accountingPeriod;
    protected double budgetLimit;
    protected int leaveQuota;;
    
    public double calculatePayroll(Employee emp) {
    if (emp instanceof Freelancer) {
        // Lakukan Type Casting agar bisa mengakses method khusus Freelancer
        Freelancer freelancer = (Freelancer) emp;
        return freelancer.calculateContractPayment();[cite: 1]
    } else {
        return emp.getSalary(); 
        //gaji akuntan, dev, sama pm beda kan
    }
}
    public void generateFinancialReport() {
        //ini sama tampilin semua gaji karyawan kah?
        System.out.println("Laporan keuangan dicetak untuk periode: " + accountingPeriod);
    }

    @Override
    public void displayInfo() {
        // Menampilkan informasi detail akuntan
        System.out.println("Accountant Name: " + getName());
        System.out.println("Accounting Period: " + accountingPeriod);
    }

    @Override
    public void performDailyTask() {
        // Tugas harian seorang akuntan
        System.out.println("Accountant is verifying financial records and ledger.");
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
