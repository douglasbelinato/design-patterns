package br.com.patterns.creational.singleton.approach01;

public class ConnectionPoolClient {

    public static void main(String[] args) {
        executeQuery("SELECT * FROM A");
        executeQuery("SELECT * FROM B");
        executeQuery("SELECT * FROM C");
    }

    private static void executeQuery(String query) {
        var connectionPool = ConnectionPool.getInstance();
        var connection = connectionPool.getConnection();

        System.out.println("connectionPool instance: " + connectionPool);

        if (connection != null) {
            connection.query(query);
            connectionPool.leaveConnection(connection);
        }
    }
}
