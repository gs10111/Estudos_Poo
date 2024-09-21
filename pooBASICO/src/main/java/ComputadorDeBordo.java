
import java.util.*;

public class ComputadorDeBordo {

    private double ConsumoMedio = 11.4;
    private double LitrosCombustivelConsumido;
    private double TotalQuilometrosRodados;



    private double GastoTotal;
    private List<Viagem> viagens = new ArrayList<>();


    ComputadorDeBordo(){
        this.LitrosCombustivelConsumido = 0;
        this.TotalQuilometrosRodados = 0;
        this.GastoTotal = 0;
    }


    public void RegistarViagem(double kilometros) {
        Viagem primeiraViagem = new Viagem(kilometros);
        viagens.add(primeiraViagem);
        this.TotalQuilometrosRodados += primeiraViagem.getKilometrosTotataisDaViagem();

    }

    public double EstimarGastos(double ValorCombustivel) {
        return this.GastoTotal= TotalQuilometrosRodados * ValorCombustivel;
    }

    public double CalcularCombustivelConsumido(){
     return this.LitrosCombustivelConsumido = TotalQuilometrosRodados* ConsumoMedio;
    }

    @Override
    public String toString() {
        return String.format("O carro já consumiu %.2f litros de combustível\n" +
                        "Percorreu %.2f quilômetros\n" +
                        "O gasto estimado é de %.2f R$",
                LitrosCombustivelConsumido, TotalQuilometrosRodados, GastoTotal);
    }

    public double getLitrosCombustivelConsumido() {
        return LitrosCombustivelConsumido;
    }

    public void setLitrosCombustivelConsumido(double litrosCombustivelConsumido) {
        LitrosCombustivelConsumido = litrosCombustivelConsumido;
    }
    public List<Viagem> getViagens() {
        return viagens;
    }

    public void setViagens(List<Viagem> viagens) {
        this.viagens = viagens;
    }

    public double getGastoTotal() {
        return GastoTotal;
    }

    public void setGastoTotal(double gastoTotal) {
        GastoTotal = gastoTotal;
    }

    public double getTotalQuilometrosRodados() {
        return TotalQuilometrosRodados;
    }

    public void setTotalQuilometrosRodados(double totalQuilometrosRodados) {
        TotalQuilometrosRodados = totalQuilometrosRodados;
    }

    public double getConsumoMedio() {
        return ConsumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        ConsumoMedio = consumoMedio;
    }


}
