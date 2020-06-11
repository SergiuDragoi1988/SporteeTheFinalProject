package com.sportee.sportee.services;

import com.sportee.sportee.data.DAO.GymEquipment;
import com.sportee.sportee.data.DTO.GymClassDTO;
import com.sportee.sportee.data.repositories.GymEquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class GymEquipmentService  implements IGymEquipmentService{

    private GymEquipmentRepository gymEquipmentRepository;

    @Autowired
    private GymEquipmentService(GymEquipmentRepository gymEquipmentRepository){
        this.gymEquipmentRepository = gymEquipmentRepository;
    };

    @Override
    public List<GymClassDTO> getAllGymEquipments() {
        return null;
    }

    String line = " ";
    @Override
    public void saveEquipmentData() {
        try {
          BufferedReader  sc = new BufferedReader(new FileReader("GymEquipment"));
           while ((line = sc.readLine())!=null){
            String[] values = line.split(",|/n");
            GymEquipment ge = new GymEquipment();
            ge.setName( values[0]);
            ge.setGroupMuscles( values[1]);
            ge.setBrand(values[2]);
            ge.setPrice( Integer.parseInt(values[3]));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            ge.setMaintenanceDate(simpleDateFormat.parse( values[4]));
            gymEquipmentRepository.save(ge);
       }

       } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
