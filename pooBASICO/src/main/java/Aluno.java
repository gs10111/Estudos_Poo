public class Aluno {

    //Um aluno de uma disciplina precisa ter armazenado seu nome, sua matrícula e as notas de suas 5 atividades
    //avaliativas, cada uma valendo 20 pontos. O aluno será aprovado se obtiver 60 ou mais pontos na soma das notas.
    //Modele e implemente uma classe Aluno que permita resolver adequadamente este problem
    private String nome;
    private String matricula;
    private Atividade[] atividadesFeitas= {};
    private double somaDasNotas;


    Aluno(String nome,String matricula){
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
