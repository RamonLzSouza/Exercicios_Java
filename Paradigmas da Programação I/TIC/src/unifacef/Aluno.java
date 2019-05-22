package unifacef;

public class Aluno {
    private int codigo;
    private String nome;
    private String sexo;
    private String estado;
    
    public Aluno() {
    }


    public Aluno(int codigo, String nome, String sexo, String estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.estado = estado;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
