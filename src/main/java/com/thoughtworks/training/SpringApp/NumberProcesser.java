package com.thoughtworks.training.SpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NumberProcesser implements Processer{

    private List<Processer> processers;
    @Autowired
    NumberProcesser(List<Processer> processers){
        this.processers=processers;
    }
    @Override
    public List<Integer> process(List<Integer> list) {
        for(Processer processer:processers){
            list = processer.process(list);
        }
        return list;
    }
}
