package com.mycompany.employeemanagementsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Freelancer extends Employee {
    protected int contractDuration;
    protected LocalDate contractEndDate;

    public Freelancer(String emp_id, String name, String department, double salary,
                      int contractDuration, LocalDate contractEndDate) {
        super(emp_id, name, department, salary);
        this.contractDuration = contractDuration;
        this.contractEndDate = contractEndDate;
    }

    @Override
    public void performDailyTask() {
        System.out.println(this.name + " (Freelancer - " + this.department + ") sedang mengerjakan tugas sesuai kesepakatan kontrak proyek.");
    }

    public double calculateContractPayment() {
        double bulanDurasi = this.contractDuration / 30.0;
        int roundedBulanDurasi = (int) Math.ceil(bulanDurasi);
        return this.salary * roundedBulanDurasi;
    }

    public String checkContractStatus() {
        if (LocalDate.now().isAfter(this.contractEndDate)) {
            return "Kontrak telah berakhir";
        } else {
            Locale indo = Locale.forLanguageTag("id-ID");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String hari = this.contractEndDate.getDayOfWeek().getDisplayName(TextStyle.FULL, indo);
            String tanggal = this.contractEndDate.format(formatter);
            return "Kontrak aktif hingga " + hari + ", " + tanggal;
        }
    }
}