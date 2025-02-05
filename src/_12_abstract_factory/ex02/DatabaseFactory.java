package _12_abstract_factory.ex02;

interface DatabaseFactory {
    Connection createConnection();
    Command createCommand();
    ResultSet createResultSet();
}