package com.mzee.Controller;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StaffService {
    private final Map<Long, Staff> staffStorage = new HashMap<>();
    private Long currentId = 1L;

    // Create Staff
       public Staff createStaff(Staff staff) {
           staff.setId(currentId++);
           staffStorage.put(staff.getId(), staff);
           return staff;
       }

       // Get All Staff
       public List<Staff> getAllStaff() {
           return new ArrayList<>(staffStorage.values());
       }

       // Get Specific Staff by ID
       public Optional<Staff> getStaffById(Long id) {
           return Optional.ofNullable(staffStorage.get(id));
       }

       // Update Staff
       public Staff updateStaff(Long id, Staff updatedStaff) {
           if (staffStorage.containsKey(id)) {
               updatedStaff.setId(id);
               staffStorage.put(id, updatedStaff);
               return updatedStaff;
           }
           throw new NoSuchElementException("Ma jiro shaqaale leh ID-gan!");
       }

       // Delete Staff
       public void deleteStaff(Long id) {
           if (!staffStorage.containsKey(id)) {
               throw new NoSuchElementException("Ma jiro shaqaale leh ID-gan!");
           }
           staffStorage.remove(id);
       }
}

