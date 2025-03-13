package es.cie.ordenador.negocio;

public class Ordenador {
    private int numero;
    private String marca;
    private String modelo;
    private int precio;
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Ordenador() {
    }
    public Ordenador(int numero, String marca, String modelo, int precio) {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public Ordenador(int numero) {
        this.numero = numero;
    }

    

}
