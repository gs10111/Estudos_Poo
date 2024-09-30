package ProblemaPartidaVolei;

public class Set {
    private int pontosEquipe1;
    private int pontosEquipe2;
    private boolean ativo;

    public Set() {
        this.pontosEquipe1 = 0;
        this.pontosEquipe2 = 0;
        this.ativo = true;
    }

    public void RegistrarPonto(String equipe, int pontoEfetuado) {
        String equipe1 =  "equipe1";
        String equipe2 =  "equipe2";
        if(equipe.equals(equipe1)){
            pontosEquipe1 +=pontoEfetuado;
        }if(equipe.equals(equipe2)){
            pontosEquipe2 +=pontoEfetuado;
        }
    }


    public int getPontosEquipe1() {
        return pontosEquipe1;
    }

    public int getPontosEquipe2() {
        return pontosEquipe2;
    }


    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void finalizarSet() {
        this.ativo = false;
    }
}
