public class Viagem {
    private double kilometrosTotataisDaViagem;


    public double getKilometrosTotataisDaViagem() {
        return kilometrosTotataisDaViagem;
    }

    public void setKilometrosTotataisDaViagem(double kilometrosTotataisDaViagem) {

        this.kilometrosTotataisDaViagem = kilometrosTotataisDaViagem;
    }


    public Viagem(double kilometrosTotataisDaViagem) {
        this.kilometrosTotataisDaViagem = ValidarViagem(kilometrosTotataisDaViagem) ? kilometrosTotataisDaViagem : 0;
    }
    private boolean ValidarViagem(double kilometrosTotataisDaViagem) {
        return kilometrosTotataisDaViagem > 0;
    }
}

