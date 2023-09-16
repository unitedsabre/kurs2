package ru.biryuchev.MyFirstTestAppStringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Controller {
    private List<String> arrayList = new ArrayList<>();
    private Map<String, String> hashMap = new HashMap<>();

    @GetMapping("/update-array/{s}")
    public String updateArrayList(@PathVariable("s") String s) {
        if (arrayList.isEmpty()) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(s);
        return "Value added to ArrayList: " + s;
    }

    @GetMapping("/show-array")
    public List<String> showArrayList() {
        return arrayList;
    }

    @GetMapping("/update-map/{s}")
    public String updateHashMap(@PathVariable("s") String s) {
        if (hashMap.isEmpty()) {
            hashMap = new HashMap<>();
        }
        hashMap.put(s, s);
        return "Value added to HashMap: " + s;
    }

    @GetMapping("/show-map")
    public Map<String, String> showHashMap() {
        return hashMap;
    }

    @GetMapping("/show-all-length")
    public String showAllLength() {
        int arrayListLength = arrayList.size();
        int hashMapLength = hashMap.size();
        return "Number of elements in ArrayList: " + arrayListLength +
                ", number of elements in HashMap: " + hashMapLength;
    }
}
