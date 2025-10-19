package com.api.parking_control.mappers;

import com.api.parking_control.dtos.ParkingSpotDto;
import com.api.parking_control.models.ParkingSpotModel;
import java.time.LocalDateTime;

public class ParkingSpotMapper {

    private ParkingSpotMapper (){
    }

    public static ParkingSpotModel toEntity(ParkingSpotDto parkingSpotDto){
        ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
        parkingSpotModel.setParkingSpotNumber(parkingSpotDto.getParkingSpotNumber());
        parkingSpotModel.setLicensePlateCar(parkingSpotDto.getLicensePlateCar());
        parkingSpotModel.setBrandCar(parkingSpotDto.getBrandCar());
        parkingSpotModel.setModelCar(parkingSpotDto.getModelCar());
        parkingSpotModel.setColorCar(parkingSpotDto.getColorCar());
        parkingSpotModel.setResponsibleName(parkingSpotDto.getResponsibleName());
        parkingSpotModel.setApartment(parkingSpotDto.getApartment());
        parkingSpotModel.setBlock(parkingSpotDto.getBlock());
        parkingSpotModel.setRegistrationDate(LocalDateTime.now());
        return parkingSpotModel;
    }

    public  static  ParkingSpotDto toDto(ParkingSpotModel parkingSpotModel) {
        ParkingSpotDto parkingSpotDto = new ParkingSpotDto();
        parkingSpotDto.setParkingSpotNumber(parkingSpotModel.getParkingSpotNumber());
        parkingSpotDto.setLicensePlateCar(parkingSpotModel.getLicensePlateCar());
        parkingSpotDto.setBrandCar(parkingSpotModel.getBrandCar());
        parkingSpotDto.setModelCar(parkingSpotModel.getModelCar());
        parkingSpotDto.setColorCar(parkingSpotModel.getColorCar());
        parkingSpotDto.setResponsibleName(parkingSpotModel.getResponsibleName());
        parkingSpotDto.setApartment(parkingSpotModel.getApartment());
        parkingSpotDto.setBlock(parkingSpotModel.getBlock());
        return  parkingSpotDto;
    }

    public static void updateModelFromDto(ParkingSpotDto dto, ParkingSpotModel model) {
        model.setParkingSpotNumber(dto.getParkingSpotNumber());
        model.setLicensePlateCar(dto.getLicensePlateCar());
        model.setBrandCar(dto.getBrandCar());
        model.setModelCar(dto.getModelCar());
        model.setColorCar(dto.getColorCar());
        model.setResponsibleName(dto.getResponsibleName());
        model.setApartment(dto.getApartment());
        model.setBlock(dto.getBlock());
    }

}
