package vnomina;

import java.io.Serializable;

/**
 *
 * @author cahoperro
 */
public class Datos implements Serializable{
    private int antiguedad;
    private Double porcentaje,salarioBase,transporte,vestuario,peligro;
    private Double trienio,quinquenio,horaNocturna,horaFestiva;
    private Double horaExtra,horaArma,nochebuena,kilometraje,radio,radioBasica;

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getTransporte() {
        return transporte;
    }

    public void setTransporte(Double transporte) {
        this.transporte = transporte;
    }

    public Double getVestuario() {
        return vestuario;
    }

    public void setVestuario(Double vestuario) {
        this.vestuario = vestuario;
    }

    public Double getPeligro() {
        return peligro;
    }

    public void setPeligro(Double peligro) {
        this.peligro = peligro;
    }

    public Double getTrienio() {
        return trienio;
    }

    public void setTrienio(Double trienio) {
        this.trienio = trienio;
    }

    public Double getQuinquenio() {
        return quinquenio;
    }

    public void setQuinquenio(Double quinquenio) {
        this.quinquenio = quinquenio;
    }

    public Double getHoraNocturna() {
        return horaNocturna;
    }

    public void setHoraNocturna(Double horaNocturna) {
        this.horaNocturna = horaNocturna;
    }

    public Double getHoraFestiva() {
        return horaFestiva;
    }

    public void setHoraFestiva(Double horaFestiva) {
        this.horaFestiva = horaFestiva;
    }

    public Double getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(Double horaExtra) {
        this.horaExtra = horaExtra;
    }

    public Double getHoraArma() {
        return horaArma;
    }

    public void setHoraArma(Double horaArma) {
        this.horaArma = horaArma;
    }

    public Double getNochebuena() {
        return nochebuena;
    }

    public void setNochebuena(Double nochebuena) {
        this.nochebuena = nochebuena;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getRadioBasica() {
        return radioBasica;
    }

    public void setRadioBasica(Double radioBasica) {
        this.radioBasica = radioBasica;
    }
    
}
