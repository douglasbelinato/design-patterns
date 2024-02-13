package br.com.patterns.creational.singleton.approach01;

import java.util.ArrayList;
import java.util.List;

public final class ConnectionPool {

    private static final int DEFAULT_POOL_SIZE = 2;
    private static final ConnectionPool CONNECTION_POOL = new ConnectionPool();

    private final List<Connection> connections = new ArrayList<>();

    private ConnectionPool() {
        System.out.println("=== Creating connection pool ===");
        for (int i = 0; i < DEFAULT_POOL_SIZE; i++) {
            connections.add(new Connection());
        }
    }

    public static ConnectionPool getInstance() {
        return CONNECTION_POOL;
    }

    public Connection getConnection() {
        Connection connection = null;
        var connectionOpt = connections.stream().filter(Connection::isAvailable)
                .findFirst();

        if (connectionOpt.isPresent()) {
            System.out.println("=> Connection available");
            connection = connectionOpt.get();
            connection.setAvailable(false);
        } else {
            System.out.println("=> No connections available");
        }

        return connection;
    }

    public void leaveConnection(Connection connection) {
        connection.setAvailable(true);
    }

}
