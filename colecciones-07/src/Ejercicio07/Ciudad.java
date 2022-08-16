package Ejercicio07;

public class Ciudad {

    private Integer codigoPostal;
    private String ciudad;

    public Ciudad() {
    }

    public Ciudad(Integer codigoPostal, String ciudad) {
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }
}
