package com.thoughtworks.training.SpringApp;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface Processer {
    List<Integer> process(List<Integer> list);
}
