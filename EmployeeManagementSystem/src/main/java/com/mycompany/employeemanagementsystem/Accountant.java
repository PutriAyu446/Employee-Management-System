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

    public Accountant(String emp_id, String name, String department, double salary, String accountingPeriod, double budgetLimit) {
        super(emp_id, name, department, salary);
        this.accountingPeriod = accountingPeriod;
        this.budgetLimit = budgetLimit;
    }
    
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
    }
}
    public void generateFinancialReport(List<Employee> daftarKaryawan) {
        System.out.println("==========================================");
        System.out.println("LAPORAN KEUANGAN & PAYROLL (" + accountingPeriod + ")");
        System.out.println("Batas Anggaran: Rp " + String.format("%,.2f", budgetLimit));
        System.out.println("==========================================");

        double totalPengeluaranGaji = 0;

        // Loop untuk mengeprint setiap karyawan yang ada
        for (Employee emp : daftarKaryawan) {
            emp.displayInfo(); // Memanggil displayInfo masing-masing
            double totalBayar = calculatePayroll(emp);
            System.out.println("Total Dibayar: Rp " + String.format("%,.2f", totalBayar));
            System.out.println("------------------------------------------");
            
            totalPengeluaranGaji += totalBayar;
        }

        System.out.println("Total Pengeluaran Gaji : Rp " + String.format("%,.2f", totalPengeluaranGaji));
        
        // Mengecek apakah pengeluaran gaji masih aman dari budgetLimit
        if (totalPengeluaranGaji <= budgetLimit) {
            System.out.println("Status Anggaran        : AMAN (Di bawah limit)");
        } else {
            System.out.println("Status Anggaran        : OVERBUDGET (Melebihi limit!)");
        }
    }

    @Override
    public void displayInfo() {
        // Menampilkan informasi detail akuntan
        System.out.println("Nama Akuntan: " + getName());
        System.out.println("Periode Akuntan: " + accountingPeriod);
    }

    @Override
    public void performDailyTask() {
        // Tugas harian seorang akuntan
        System.out.println("Akuntan sedang memverifikasi catatan keuangan dan buku besar.");
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
