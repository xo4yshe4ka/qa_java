package com.example;

import java.util.*;

public class AlexLion extends Lion {

    public AlexLion(String sex, Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return Arrays.asList("Marty", "Gloria", "Melman");
    }

    public String getPlaceOfLiving() {
        return "New York zoo";
    }
}
