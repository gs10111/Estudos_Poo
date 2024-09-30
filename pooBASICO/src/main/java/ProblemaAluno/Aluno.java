package ProblemaAluno;

public class Aluno {

    private String nome;
    private String matricula;
    private Atividade[] atividadesFeitas= {};
    private double somaDasNotas;


    public Aluno(String nome, String matricula){
        this.nome= nome;
        this.matricula= matricula;
        this.somaDasNotas= somaDasNotas;
    }

    public void fazerAtividade(double nota){
        for(int i = 0; i <= atividadesFeitas.length; i++){
            Atividade atv = new Atividade( 1,nota);
            atividadesFeitas[i]=atv;

        }
    }

    public double somarNotas(){
        for(Atividade atividades : atividadesFeitas){
            somaDasNotas+=atividades.getNota();
            return somaDasNotas;

        }
        return somaDasNotas;
    }
    public boolean podeAprovar(){
        return (somaDasNotas>=60 && atividadesFeitas.length>=5);
    }



}
