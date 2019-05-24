package unifacef;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AlunoDAOImpl implements AlunoDAO{

    @Override
    public boolean insere(Aluno aluno) {
        Connection conexao = BancoDados.conecta();
        if (conexao == null){
            return false;
        }
        else{
            System.out.println("Conectou com sucesso");
            String sql = "insert into aluno (nome, sexo, estado) values(?, ?, ?)";
            try{
                //cria canal de comunicação para executar SQL
                PreparedStatement canal = conexao.prepareStatement(sql);
                //coloca os valos dos ?
                canal.setString(1, aluno.getNome());
                canal.setString(2, aluno.getSexo());
                canal.setString(3, aluno.getEstado());
                //exeuta o comando no banco
                canal.execute();
                return true;
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
                return false;
            }
        }
    }

    @Override
    public boolean remove(Aluno aluno) {
        Connection conexao = BancoDados.conecta();
        if (conexao == null){
            return false;
        }
        else{
            String sql = "delete from aluno where codigo = ?";
            try{
                //cria canal de comunicação para executar SQL
                PreparedStatement canal = conexao.prepareStatement(sql);
                //coloca os valos dos ?
                canal.setInt(1, aluno.getCodigo());              
                //exeuta o comando no banco
                canal.execute();
                return true;
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
                return false;
            }
        }
    }

    @Override
    public boolean atualiza(Aluno aluno) {
        Connection conexao = BancoDados.conecta();
        if (conexao == null){
            return false;
        }
        else{
            String sql = "update aluno set nome = ?, sexo = ?, estado = ? where codigo = ?";
            try{
                //cria canal de comunicação para executar SQL
                PreparedStatement canal = conexao.prepareStatement(sql);
                //coloca os valos dos ?
                canal.setString(1, aluno.getNome());
                canal.setString(2, aluno.getSexo());
                canal.setString(3, aluno.getEstado());
                canal.setInt(4, aluno.getCodigo());
                //exeuta o comando no banco
                canal.execute();
                return true;
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
                return false;
            }
        }
    }

    @Override
    public ArrayList<Aluno> consulta() {
        Connection conexao = BancoDados.conecta();
        if (conexao == null){
            return null;
        }
        else{
            String sql = "select *from aluno";
            try{
                //cria canal de comunicação para executar SQL
                Statement canal = conexao.createStatement();
                //coloca os valos dos ?
                ResultSet ponteiro = canal.executeQuery(sql);
                ArrayList<Aluno> alunos = new ArrayList();
                while(ponteiro.next()){
                    Aluno aluno = new Aluno();
                    aluno.setCodigo(ponteiro.getInt("codigo"));
                    aluno.setNome(ponteiro.getString("nome"));
                    aluno.setSexo(ponteiro.getString("sexo"));
                    aluno.setEstado(ponteiro.getString("estado"));
                    alunos.add(aluno);
                }
                
                return alunos;
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
                return null;
            }
        }
    }
    
}
