package consultoria;

public class Pessoa {

private String nome;
private String estadoCivil;

    public Pessoa() {
    }

    public Pessoa(String nome, String estadoCivil) {
        this.nome = nome;
        this.estadoCivil = estadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    


}
