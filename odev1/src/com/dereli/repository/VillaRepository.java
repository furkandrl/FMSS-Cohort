package com.dereli.repository;

import com.dereli.house.Villa;

import java.util.ArrayList;
import java.util.List;

public class VillaRepository {
    private static List<Villa> villaList = new ArrayList<>();

    public List<Villa> getVillaList() {
        return villaList;
    }

    public void save(Villa villa){villaList.add(villa);}
}
