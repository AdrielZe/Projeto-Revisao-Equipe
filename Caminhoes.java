public class Caminhoes {  //classe caminhoes que objetifica o projeto
    private String modelo; //modelo
    private double capacidade; // Em toneladas
    private double custoKm; // Custo por quilômetro rodado

    public Caminhao(String modelo, double capacidadeCarga, double custoPorKm) { //construtor
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
        this.custoPorKm = custoPorKm;
    }

    public String getModelo() { //gete
        return modelo;
    }

    public double getCapacidadeCarga() {
        return capacidade;
    }

    public double getCustoPorKm() {
        return custoKm;
    }

    // Outros métodos
}
