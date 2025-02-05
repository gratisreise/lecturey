package _12_abstract_factory.ex02;

class PostgreSQLConnection implements Connection {
    public void open() {
        System.out.println("Opening PostgreSQL connection");
    }
    public void close() {
        System.out.println("Closing PostgreSQL connection");
    }
}