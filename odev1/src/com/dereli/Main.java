package com.dereli;

import com.dereli.house.Ev;
import com.dereli.house.Villa;
import com.dereli.house.Yazlik;
import com.dereli.repository.EvRepository;
import com.dereli.repository.VillaRepository;
import com.dereli.repository.YazlikRepository;
import com.dereli.service.HouseService;

public class Main {

    public static void main(String[] args) {
        VillaRepository villaRepository = new VillaRepository();
        YazlikRepository yazlikRepository = new YazlikRepository();
        EvRepository evRepository = new EvRepository();
        HouseService houseService = new HouseService(evRepository, yazlikRepository, villaRepository);

        Ev ev1 = new Ev("ev1",1200, 50, 2,1);
        Ev ev2 = new Ev("ev2",4200, 80,1,1);
        Ev ev3 = new Ev("ev3",6200, 150,3,1);
        evRepository.save(ev1);
        evRepository.save(ev2);
        evRepository.save(ev3);

        Yazlik yazlik1 = new Yazlik("yazlik1",5000,120,3,1);
        Yazlik yazlik2 = new Yazlik("yazlik2",3000,90,2,1);
        Yazlik yazlik3 = new Yazlik("yazlik3",4000, 85,2,1);
        yazlikRepository.save(yazlik1);
        yazlikRepository.save(yazlik2);
        yazlikRepository.save(yazlik3);

        Villa villa1 = new Villa("villa1",1200, 240,3,2);
        Villa villa2 = new Villa("villa2",1500, 320,4,2);
        Villa villa3 = new Villa("villa3",1700, 400,5,2);
        villaRepository.save(villa1);
        villaRepository.save(villa2);
        villaRepository.save(villa3);

        System.out.println("Evlerin toplam fiyati: ");
        System.out.println(houseService.getSumOfPricesOfEv());

        System.out.println("\nVillalarin toplam fiyati: ");
        System.out.println(houseService.getSumOfPricesOfVilla());

        System.out.println("\nYazliklarin toplam fiyati: ");
        System.out.println(houseService.getSumOfPricesOfYazlik());

        System.out.println("\nTum tipteki evlerin toplam fiyati: ");
        System.out.println(houseService.getSumOfPrices());

        System.out.println("\nEvlerin ortalama metrekaresi: ");
        System.out.println(houseService.getAverageAreaOfEv());

        System.out.println("\nVillalarin ortalama metrekaresi: ");
        System.out.println(houseService.getAverageAreaOfVilla());

        System.out.println("\nYazliklarin ortalama metrekaresi: ");
        System.out.println(houseService.getAverageAreaOfYazlik());

        System.out.println("\nTum tipteki evlerin ortalama metrekaresi: ");
        System.out.println(houseService.getAverageAreaOfAll());

        System.out.println("\nOda ve salon sayisina gore filterleme (ornek 2 oda 1 salon):");
        System.out.println(houseService.getHouseNameByRoomCount(2,1));





    }
}
