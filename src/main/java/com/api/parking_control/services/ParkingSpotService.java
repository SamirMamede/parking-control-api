package com.api.parking_control.services;

import com.api.parking_control.exceptions.BusinessException;
import com.api.parking_control.models.ParkingSpotModel;
import com.api.parking_control.repositories.ParkingSpotRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository){
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

    public Page<ParkingSpotModel> findAll(Pageable pageable) {
        return parkingSpotRepository.findAll(pageable);
    }

    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSpotRepository.findById(id);
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel){
        parkingSpotRepository.delete(parkingSpotModel);
    }

    public void validateParkingSpotCreate(ParkingSpotModel parkingSpotModel) {
        if(existsByLicensePlateCar(parkingSpotModel.getLicensePlateCar())){
            throw new BusinessException("Conflict: License Plate Car is already in use!");
        }
        if(existsByParkingSpotNumber(parkingSpotModel.getParkingSpotNumber())){
            throw new BusinessException("Conflict: Parking Spot is already in use!");
        }
        if(existsByApartmentAndBlock(parkingSpotModel.getApartment(), parkingSpotModel.getBlock())){
            throw new BusinessException("Conflict: Parking Spot is already for this apartment/block!");
        }
    }
}
