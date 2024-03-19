package com.jj.generic.hw;

import java.sql.ClientInfoStatus;
import java.util.*;

/**
 * @author: xj
 * @description:
 * @dateTime: 2024/3/19 19:17
 **/
public class HomeWork01 {
}

class DAO<T> {
    private  HashMap<String, T> m;

    public void save(String id, T entity) {
        m.put(id, entity);
    }

    public T get(String id) {
        return m.get(id);
    }

    public void update(String id, T entity) {
        m.put(id,entity);
    }
    public List<T> list(){
        List<T> ts = new ArrayList<>();
        Set<Map.Entry<String, T>> entries = m.entrySet();
        for (Map.Entry<String, T> entry : entries) {
            ts.add(entry.getValue());
        }
        return ts;
    }
}
