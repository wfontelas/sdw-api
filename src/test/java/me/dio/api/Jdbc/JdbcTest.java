package me.dio.api.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://junction.proxy.rlwy.net:54538/railway";
        String user = "postgres";
        String password = "lilsSsSrXGMIsQytcTAalLUwJAFSyMUG";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso.");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Falha na conexão: " + e.getMessage());
            e.printStackTrace(); // Adicione isto para obter mais detalhes sobre a exceção
        }
    }
}
