package com.dereli.service;

import com.dereli.house.Ev;
import com.dereli.house.Villa;
import com.dereli.house.Yazlik;
import com.dereli.repository.EvRepository;
import com.dereli.repository.VillaRepository;
import com.dereli.repository.YazlikRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    private final EvRepository evRepository;
    private final YazlikRepository yazlikRepository;
    private final VillaRepository villaRepository;

    public HouseService(EvRepository evRepository, YazlikRepository yazlikRepository, VillaRepository villaRepository) {
        this.evRepository = evRepository;
        this.yazlikRepository = yazlikRepository;
        this.villaRepository = villaRepository;
    }

    public double getSumOfPrices(){
       return  evRepository.getEvList().stream().mapToDouble(Ev::getPrice).sum()
               + yazlikRepository.getYazlikList().stream().mapToDouble(Yazlik::getPrice).sum()
               + villaRepository.getVillaList().stream().mapToDouble(Villa::getPrice).sum();
    }

    public double getSumOfPricesOfVilla(){
        return villaRepository.getVillaList().stream().mapToDouble(Villa::getPrice).sum();
    }
    public double getSumOfPricesOfEv(){
        return evRepository.getEvList().stream().mapToDouble(Ev::getPrice).sum();
    }

    public double getSumOfPricesOfYazlik(){
        return yazlikRepository.getYazlikList().stream().mapToDouble(Yazlik::getPrice).sum();
    }

    public double getAverageAreaOfEv(){
        return evRepository.getEvList().stream().mapToDouble(Ev::getArea).average().getAsDouble();
    }

    public double getAverageAreaOfVilla(){
        return villaRepository.getVillaList().stream().mapToDouble(Villa::getArea).average().getAsDouble();
    }

    public double getAverageAreaOfYazlik(){
        return yazlikRepository.getYazlikList().stream().mapToDouble(Yazlik::getArea).average().getAsDouble();
    }

    public double getAverageAreaOfAll(){
        return evRepository.getEvList().stream().mapToDouble(Ev::getArea).average().getAsDouble()
                + yazlikRepository.getYazlikList().stream().mapToDouble(Yazlik::getArea).average().getAsDouble()
                + villaRepository.getVillaList().stream().mapToDouble(Villa::getArea).average().getAsDouble();
    }

    public List<String> getHouseNameByRoomCount(int roomCount, int livingRoomCount){
        List<String> filteredNamesEv = evRepository.getEvList().stream()
                .filter(obj -> obj.getRoom() == roomCount && obj.getLivingRoom() == livingRoomCount)
                .map(Ev::getName)
                .collect(Collectors.toList());

        List<String> filteredNamesYazlik = yazlikRepository.getYazlikList().stream()
                .filter(obj -> obj.getRoom() == roomCount && obj.getLivingRoom() == livingRoomCount)
                .map(Yazlik::getName)
                .collect(Collectors.toList());

        List<String> filteredNamesVilla = villaRepository.getVillaList().stream()
                .filter(obj -> obj.getRoom() == roomCount && obj.getLivingRoom() == livingRoomCount)
                .map(Villa::getName)
                .collect(Collectors.toList());

        List<String> resultList = new ArrayList<>();
        resultList.addAll(filteredNamesEv);
        resultList.addAll(filteredNamesYazlik);
        resultList.addAll(filteredNamesVilla);
        return resultList;

    }
}
