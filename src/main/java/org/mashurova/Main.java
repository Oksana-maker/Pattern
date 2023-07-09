package org.mashurova;

import java.util.List;

public class Main {
  
    public static void main(String[] args) {

        List list = new ListBuilder()
                .add(1)
                .add(2)
                .add(3)
                .build();
        System.out.println(list);
    }
}