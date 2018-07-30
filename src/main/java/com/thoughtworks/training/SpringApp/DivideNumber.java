package com.thoughtworks.training.SpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Profile("divide")
@Component
public class DivideNumber implements Processer{

    private int number;
    @Autowired
    DivideNumber(@Value("${processer.divide}") int number){
        this.number=number;
    }

    @Override
    public List<Integer> process(List<Integer> list) {
        return list.stream().map(item->item/number).collect(Collectors.toList());
    }
}
