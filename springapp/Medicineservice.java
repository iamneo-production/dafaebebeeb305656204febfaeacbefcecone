package springapp;
import springapp.Medicine;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class Medicineservice {
    private final List<Medicine> medicines=new ArrayList<>();
    private int nextMedicineId=1;
    public boolean addMedicine(Medicine medicine){
        medicine.setMedicineId(nextMedicineId++);
        return medicines.add(medicine);
    }
    public Medicine updateMedicine(int medicineId,Medicine updatedMedicine){
        for(Medicine medicine:medicines){
            if(medicine.getMedicineId()==medicineId){
                medicine.setMedicineName(updatedMedicine.getMedicineName());
                medicine.setPrice(updatedMedicine.getPrice());
                medicine.set
            }
        }
    }
}
