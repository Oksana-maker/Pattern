package org.mashurova;

import java.util.ArrayList;
import java.util.List;

public class ListBuilder<T> {
    private List<T> list;

    public ListBuilder() {
        this.list = new ArrayList<>();
    }

    public ListBuilder<T> add(T t) {
        list.add(t);
        return this;
    }

    public List<T> build() {
        return list;
    }
}
