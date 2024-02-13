package br.com.patterns.creational.singleton.approach01;

import lombok.Data;

@Data
public class Connection {

    private boolean available = true;

    public void query(String sql) {
        System.out.println("Executing SQL: " + sql);
    }


}
