package com.example.hospitalmanagement.services;

import com.example.hospitalmanagement.models.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    public List<Bill> getAllBills() {
        System.out.println("Into Service: fetching all bills");
        return null;
    }
    public Bill createBill(Bill bill) {
        System.out.println("Into Service: creating a bill");
        return bill;
    }
    public Bill getBillById(long id) {
        System.out.println("Into Service: fetching bill by id: " + id);
        return null;
    }
    public void deleteBillById(long id) {
        System.out.println("Into Service: deleting bill by id: " + id);
    }
    public Bill updateBill(Bill bill) {
        System.out.println("Into Service: updating bill by id: " + bill.getId());
        return bill;
    }
}
