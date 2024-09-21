public class Atividade {
    private  static int numeroAtividade=1;
    private final double valor = 20;
    private double Nota;

    Atividade(int numero,double nota){
        numeroAtividade++;
        this.Nota=nota;
    }
    public double getNota() {
        return Nota;
    }

    public void setNota(double nota) {
        this.Nota = nota;
    }


}
