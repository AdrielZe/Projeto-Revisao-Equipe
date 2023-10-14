public class Caminhoes {  //classe caminhoes que objetifica o projeto
    private String modelo; //modelo
    private double capacidade; // Em toneladas
    private double custoKm; // Custo por quilômetro rodado

    public Caminhoes(String model, double capacidade, double custo) { //construtor
        this.modelo = model;
        this.capacidade = capacidade;
        this.custoKm = custo;
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
