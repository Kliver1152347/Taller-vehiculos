
class Vehiculo {
    private String modelo;
    private int year;
    private String placa;
    private double tarifaPorDia;
    private boolean disponible;

    // Constructor
    public Vehiculo(String modelo, int year, String placa, double tarifaPorDia, boolean disponible) {
        this.modelo = modelo;
        this.year = year;
        this.placa = placa;
        this.tarifaPorDia = tarifaPorDia;
        this.disponible = disponible;
    }

    // Getters y Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getTarifaPorDia() {
        return tarifaPorDia;
    }

    public void setTarifaPorDia(double tarifaPorDia) {
        this.tarifaPorDia = tarifaPorDia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
