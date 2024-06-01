package com.dereli.repository;

import com.dereli.house.Ev;

import java.util.ArrayList;
import java.util.List;

public class EvRepository {
    private static List<Ev> evList = new ArrayList<>();

    public List<Ev> getEvList() {
        return evList;
    }

    public void save(Ev ev){evList.add(ev);}
}
