package unifacef;

import java.util.ArrayList;

public interface AlunoDAO {
    
    public boolean insere(Aluno aluno);
    
    public boolean remove(Aluno aluno);
    
    public boolean atualiza(Aluno aluno);
    
    public ArrayList<Aluno> consulta();
    
}
