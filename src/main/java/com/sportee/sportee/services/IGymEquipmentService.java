package com.sportee.sportee.services;

import com.sportee.sportee.data.DTO.GymClassDTO;

import java.util.List;

public interface IGymEquipmentService {

    List<GymClassDTO> getAllGymEquipments();

     void saveEquipmentData();



}
