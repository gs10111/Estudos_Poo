package ProblemaPartidaVolei;

import java.util.List;

public class PartidaVolei {
    private String placar;
    private Set setAtual = new Set();
    private  List<Set> sets;
    private int SetsGanhosequipe1;
    private int SetsGanhosequipe2;


public void MarcarPonto( String equipe, int pontoEfetuado){
    setAtual.RegistrarPonto(equipe,pontoEfetuado);
}
public boolean validarSet(){
        return Math.abs(setAtual.getPontosEquipe1()- setAtual.getPontosEquipe2() ) == 2  ? true : false;
    }
    public void FecharSet(){
        if(setAtual.getPontosEquipe1() > setAtual.getPontosEquipe2() && validarSet()){
            this.SetsGanhosequipe1++;
        }if(setAtual.getPontosEquipe2() > setAtual.getPontosEquipe1() && validarSet()){
            this.SetsGanhosequipe2++;
        }
        setAtual.finalizarSet();
        sets.add(setAtual);
    }

    private void IniciarSet(){
    this.setAtual= new Set();
    }
}
