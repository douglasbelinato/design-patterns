package br.com.patterns.creational.singleton.approach01;

public class Connection {

    private boolean available = true;

    public void query(String sql) {
        System.out.println("Executing SQL: " + sql);
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
