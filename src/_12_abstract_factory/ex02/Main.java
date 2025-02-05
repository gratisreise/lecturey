package _12_abstract_factory.ex02;

public class Main {

    public static void main(String[] args) {
        DatabaseClient mysqlClient
            = new DatabaseClient(new MySQLFactory());
        mysqlClient.performDatabaseOperations();

        System.out.println("\nSwitching to PostgreSQL...\n");

        DatabaseClient postgresClient
            = new DatabaseClient(new PostgreSQLFactory());
        postgresClient.performDatabaseOperations();

    }

}
