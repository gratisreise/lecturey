package _12_abstract_factory.ex02;

class MySQLConnection implements Connection {
    public void open() {
        System.out.println("Opening MySQL connection");
    }
    public void close() {
        System.out.println("Closing MySQL connection");
    }
}