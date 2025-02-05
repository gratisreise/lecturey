package _12_abstract_factory.ex02;

class MySQLFactory implements DatabaseFactory {
    public Connection createConnection() {
        return new MySQLConnection();
    }
    public Command createCommand() {
        return new MySQLCommand();
    }
    public ResultSet createResultSet() {
        return new MySQLResultSet();
    }
}