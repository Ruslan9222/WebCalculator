package by.ruslan.radevich.webcalculator.service;

public class JdbcUserStorage extends MySqlConnection  {
        private static final String INSERT_QUERY = "INSERT INTO operations (NUM1, NUM2, TYPE, RESULT, AUTHOR) values (?, ?, ?, ?, ?)";
        private static final String FIND_BY_ID_QUERY = "SELECT * from operations where AUTHOR = ?";


}
