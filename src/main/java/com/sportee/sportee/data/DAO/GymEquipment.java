package com.sportee.sportee.data.DAO;

import com.sportee.sportee.data.DTO.GymEquipmentDTO;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@NoArgsConstructor
public class GymEquipment {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Id
    private int id;
    private String name;
    private String groupMuscles;
    private String brand;
    private int price;
    private Date maintenanceDate;

    @Builder
    public GymEquipment(GymEquipmentDTO gymEquipmentDTO) {
        this.name = gymEquipmentDTO.getName();
        this.groupMuscles =gymEquipmentDTO.getMuscleGroup();
        this.brand = gymEquipmentDTO.getBrand();
        this.price = gymEquipmentDTO.getPrice();
        this.maintenanceDate = gymEquipmentDTO.getMaintenanceDate();
    }


    //            try {
//            Scanner sc = new Scanner(new File
//                    ("/Users/sergiudragoi/Downloads/Sportee-master FINAL/GymEquipment"));
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }
//            String[] values = line.split(",|/n");
//            this.name = values[0];
//            this.groupMuscles = values[1];
//            this.brand = values[2];
//            this.price = Integer.parseInt(values[3]);
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
//            this.maintenanceDate = simpleDateFormat.parse( values[4]);
//        }
}




