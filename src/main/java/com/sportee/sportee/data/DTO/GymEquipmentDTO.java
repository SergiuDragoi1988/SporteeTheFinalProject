package com.sportee.sportee.data.DTO;

import com.sportee.sportee.data.DAO.GymEquipment;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class GymEquipmentDTO {

    private int id;
    private String name;
    private String muscleGroup;
    private String brand;
    private int price;
    private Date maintenanceDate;

    public GymEquipmentDTO(GymEquipment gymEquipament) {
        this.id = gymEquipament.getId();
        this.name = gymEquipament.getName();
        this.muscleGroup = gymEquipament.getGroupMuscles();
        this.brand = gymEquipament.getBrand();
        this.price = gymEquipament.getPrice();
        this.maintenanceDate = gymEquipament.getMaintenanceDate();
    }

    public GymEquipmentDTO() {
    }
}
