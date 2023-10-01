
package com.springapp;
import com.springapp.Medicine;
import com.springapp.Medicineservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/medicines")
public class Medicinecontroller {
    private final MedicineService medicineService;
    @Autowired
    public MedicineController(MedicineService medicineService){
        this.medicineService=medicineService;
    }
    @PostMapping
    public boolean addMedicine(@RequestBody Medicine medicine){
        return medicineService.addMedicine(medicine);
    }
    @PutMapping("/{mediineId}")
    public Medicine updateMedicine(@PathVariable int medicineId,@RequestBody Medicine updatedMedicine)
}
