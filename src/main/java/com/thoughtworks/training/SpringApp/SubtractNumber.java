package com.thoughtworks.training.SpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Profile("subtract")
@Component
public class SubtractNumber implements Processer{
    private int number;
    @Autowired
    SubtractNumber(@Value("${processer.subtract}") int number){
        this.number=number;
    }
    @Override
    public List<Integer> process(List<Integer> list) {
        return list.stream().map(item->item-number).collect(Collectors.toList());
    }
}
