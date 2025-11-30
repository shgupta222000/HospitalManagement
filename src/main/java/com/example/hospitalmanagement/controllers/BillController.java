package com.example.hospitalmanagement.controllers;

import com.example.hospitalmanagement.models.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @GetMapping
    public List<Bill> getAllBills() {
        System.out.println("fetching all bills");
        return null;
    }
    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        System.out.println("creating a bill");
        return bill;
    }
    @GetMapping("/{id}")
    public Bill getBillById(@RequestBody long id) {
        System.out.println("fetching bill by id: " + id);
        return null;
    }
    @DeleteMapping("/{id}")
    public void deleteBillById(@RequestBody long id) {
        System.out.println("deleting bill by id: " + id);
    }
    @PutMapping
    public Bill updateBill(@RequestBody Bill bill) {
        System.out.println("updating bill by id: " + bill.getId());
        return bill;
    }

}
