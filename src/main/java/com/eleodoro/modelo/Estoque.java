package com.eleodoro.modelo;

public class Estoque {

    private int capacidade;

    public Estoque() {
    }

    public Estoque(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Estoque [capacidade=" + capacidade + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + capacidade;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Estoque other = (Estoque) obj;
        if (capacidade != other.capacidade)
            return false;
        return true;
    }

    public void setId(int i) {
    }

    public boolean excluir(Estoque estoque) {
        return false;
    }

    
    
}
