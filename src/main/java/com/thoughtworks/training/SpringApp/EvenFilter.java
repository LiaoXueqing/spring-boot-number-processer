package com.thoughtworks.training.SpringApp;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Profile("even")
@Component
public class EvenFilter implements Processer{
    @Override
    public List<Integer> process(List<Integer> list) {
        return list.stream().filter(item->item%2==0).collect(Collectors.toList());
    }
}
