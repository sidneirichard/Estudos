public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public Professor(String nome, float salario) {
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(float aumento){
        this.salario += aumento;
        System.out.println("Prof. " + nome + " recebeu um aumento de " + aumento);
        System.out.println("Novo salário " + salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
