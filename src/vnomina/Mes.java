package vnomina;

import java.io.Serializable;

/**
 *
 * @author cahoperro
 */
public class Mes implements Serializable {

    Dias[] dia;
    private int n;
    private double horasMes,horasNocturnas,horasFestivas,horasRadio,HorasRadioB;
    private double horasArma,horasVacaciones,totalRadio,totalRadioB, extras;
    private double totalFestivos,totalNocturnidad,prorrata,totalDevengado;
    private double irpf,totalDeducir,liquido,fp,cComunes,desempleo,antiguedad;
    private double tAportaciones, tIrpf;
    boolean porrateo,nochebuena, nochevieja,jefeEquipo,trienios;
    
    public Mes(int i, boolean bis) {
        if (i == 3 || i == 5 || i == 8 || i == 10) {
            n = 30;
        } else if (i == 1) {
            if (bis == false) {
                n = 28;
            } else {
                n = 29;
            }
        } else {
            n = 31;
        }
        dia = new Dias[n];
        for (int j = 0; j < n; j++) {
            dia[j] = new Dias();
        }
    }
    
    public void calculoMes(){
        
    }

    public double getExtras() {
        return extras;
    }

    public void setExtras(double extras) {
        this.extras = extras;
    }
    
    public double gettIrpf() {
        return tIrpf;
    }

    public void settIrpf(double tIrpf) {
        this.tIrpf = tIrpf;
    }
    
    public boolean isNochebuena() {
        return nochebuena;
    }

    public void setNochebuena(boolean nochebuena) {
        this.nochebuena = nochebuena;
    }

    public boolean isNochevieja() {
        return nochevieja;
    }

    public void setNochevieja(boolean nochevieja) {
        this.nochevieja = nochevieja;
    }

    public boolean isTrienios() {
        return trienios;
    }

    public void setTrienios(boolean trienios) {
        this.trienios = trienios;
    }

    public double getFp() {
        return fp;
    }

    public void setFp(double fp) {
        this.fp = fp;
    }

    public double getcComunes() {
        return cComunes;
    }

    public void setcComunes(double cComunes) {
        this.cComunes = cComunes;
    }

    public double getDesempleo() {
        return desempleo;
    }

    public void setDesempleo(double desempleo) {
        this.desempleo = desempleo;
    }

    public double getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double gettAportaciones() {
        return tAportaciones;
    }

    public void settAportaciones(double tAportaciones) {
        this.tAportaciones = tAportaciones;
    }

    public boolean isPorrateo() {
        return porrateo;
    }

    public void setPorrateo(boolean porrateo) {
        this.porrateo = porrateo;
    }

    public boolean isJefeEquipo() {
        return jefeEquipo;
    }

    public void setJefeEquipo(boolean jefeEquipo) {
        this.jefeEquipo = jefeEquipo;
    }
    
    public double getHorasVacaciones() {
        return horasVacaciones;
    }

    public void setHorasVacaciones(double horasVacaciones) {
        this.horasVacaciones = horasVacaciones;
    }

    public double getHorasArma() {
        return horasArma;
    }

    public void setHorasArma(double horasArma) {
        this.horasArma = horasArma;
    }

    public double getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(double horasMes) {
        this.horasMes = horasMes;
    }

    public double getHorasNocturnas() {
        return horasNocturnas;
    }

    public void setHorasNocturnas(double horasNocturnas) {
        this.horasNocturnas = horasNocturnas;
    }

    public double getHorasFestivas() {
        return horasFestivas;
    }

    public void setHorasFestivas(double horasFestivas) {
        this.horasFestivas = horasFestivas;
    }

    public double getHorasRadio() {
        return horasRadio;
    }

    public void setHorasRadio(double horasRadio) {
        this.horasRadio = horasRadio;
    }

    public double getHorasRadioB() {
        return HorasRadioB;
    }

    public void setHorasRadioB(double HorasRadioB) {
        this.HorasRadioB = HorasRadioB;
    }

    public double getTotalRadio() {
        return totalRadio;
    }

    public void setTotalRadio(double totalRadio) {
        this.totalRadio = totalRadio;
    }

    public double getTotalRadioB() {
        return totalRadioB;
    }

    public void setTotalRadioB(double totalRadioB) {
        this.totalRadioB = totalRadioB;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public double getTotalFestivos() {
        return totalFestivos;
    }

    public void setTotalFestivos(double totalFestivos) {
        this.totalFestivos = totalFestivos;
    }

    public double getTotalNocturnidad() {
        return totalNocturnidad;
    }

    public void setTotalNocturnidad(double totalNocturnidad) {
        this.totalNocturnidad = totalNocturnidad;
    }

    public double getProrrata() {
        return prorrata;
    }

    public void setProrrata(double prorrata) {
        this.prorrata = prorrata;
    }

    public double getTotalDevengado() {
        return totalDevengado;
    }

    public void setTotalDevengado(double totalDevengado) {
        this.totalDevengado = totalDevengado;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public double getTotalDeducir() {
        return totalDeducir;
    }

    public void setTotalDeducir(double totalDeducir) {
        this.totalDeducir = totalDeducir;
    }

    public double getLiquido() {
        return liquido;
    }

    public void setLiquido(double liquido) {
        this.liquido = liquido;
    }
    
}
