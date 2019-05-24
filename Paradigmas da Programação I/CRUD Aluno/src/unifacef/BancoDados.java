package unifacef;
import java.sql.*;

public class BancoDados {
    public static Connection conecta(){
        Connection conexao;
        String url = "jdbc:postgresql://localhost:5433/academico";
        String user = "postgres";
        String senha= "1507";
        try{
            conexao = DriverManager.getConnection(url, user, senha);
            return conexao;
        }
    
        catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }        
}    


