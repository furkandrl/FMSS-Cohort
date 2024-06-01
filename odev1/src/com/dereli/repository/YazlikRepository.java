package com.dereli.repository;

import com.dereli.house.Yazlik;

import java.util.ArrayList;
import java.util.List;

public class YazlikRepository {
    private static List<Yazlik> yazlikList = new ArrayList<>();

    public List<Yazlik> getYazlikList() {
        return yazlikList;
    }

    public void save(Yazlik yazlik){yazlikList.add(yazlik);}
}
