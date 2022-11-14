package vnomina;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author cahoperro
 */
public class Dias implements Serializable {

    private boolean arma, festivo, radioscopia, radio, radioB;
    private String servicio1, servicio2, entrada1, entrada2;
    private String festividad, salida1, salida2, claveServicio;
    private double tempHoras, tempNocturnas, tempFestivas, tempRadio, tempRadioB;
    private double tempHoras1, tempHoras2, tempNoct1, tempNoct2, tempFest1, tempFest2;
    private int diaSemana;
    private int HEntrada1, MEntrada1, HSalida1, MSalida1;
    private int HEntrada2, MEntrada2, HSalida2, MSalida2;
    private GregorianCalendar gcEnt, gcSal;
    private Objeto Ob;

    public void calHoras(Objeto Obj) {
        Ob = Obj;
        String[] ste;
        String[] sts;

        if (entrada1 != null && salida1 != null && !entrada1.isEmpty() && !salida1.isEmpty()) {
            ste = entrada1.split(":");
            sts = salida1.split(":");
            HEntrada1 = Integer.parseInt(ste[0]);
            MEntrada1 = Integer.parseInt(ste[1]);
            HSalida1 = Integer.parseInt(sts[0]);
            MSalida1 = Integer.parseInt(sts[1]);
            tempHoras1 = calculo(HEntrada1, MEntrada1, HSalida1, MSalida1);
            tempNoct1 = calNocturnas(HEntrada1, MEntrada1, tempHoras1);
            tempFest1 = calFestivas(HEntrada1, MEntrada1, tempHoras1);
        } else {
            tempHoras1 = 0;
            tempNoct1 = 0;
            tempFest1 = 0;
        }


        if (entrada2 != null && salida2 != null && !entrada2.isEmpty() && !salida2.isEmpty()) {
            ste = entrada2.split(":");
            sts = salida2.split(":");
            HEntrada2 = Integer.parseInt(ste[0]);
            MEntrada2 = Integer.parseInt(ste[1]);
            HSalida2 = Integer.parseInt(sts[0]);
            MSalida2 = Integer.parseInt(sts[1]);
            tempHoras2 = calculo(HEntrada2, MEntrada2, HSalida2, MSalida2);
            tempNoct2 = calNocturnas(HEntrada2, MEntrada2, tempHoras2);
            tempFest2 = calFestivas(HEntrada2, MEntrada2, tempHoras2);

        } else {
            tempHoras2 = 0;
            tempNoct2 = 0;
            tempFest2 = 0;
        }
        tempHoras = tempHoras1 + tempHoras2;
        tempNocturnas = tempNoct1 + tempNoct2;
        tempFestivas = tempFest1 + tempFest2;


        if (radioscopia) {
            if (radio) {
                tempRadio = tempHoras;
                tempRadioB = 0;
            } else if (radioB) {
                tempRadioB = tempHoras;
                tempRadio = 0;
            }
        } else {
            tempRadio = 0;
            tempRadioB = 0;
        }
    }

    private double calculo(int h1, int m1, int h2, int m2) {
        gcEnt = new GregorianCalendar(2013, 7, 12, h1, m1);
        gcSal = new GregorianCalendar(2013, 7, 12, h2, m2);
        double uno = gcEnt.getTimeInMillis();
        double dos = gcSal.getTimeInMillis();
        double res = (dos - uno) / 3600000;
        if (res < 0) {
            res = res + 24;
        }
        return res;
    }

    private double calNocturnas(int h1, int m1, double h) {
        int horaEnt = h1;
        double minutoEnt = m1;
        double nocturnas;
        double horas = h;
        double ent = horaEnt + (minutoEnt / 60);

        if (ent <= 6) {
            nocturnas = (6 - ent);
            if (nocturnas > horas) {
                nocturnas = horas;
            }
        } else if (ent > 22) {
            nocturnas = horas;
        } else {
            nocturnas = horas - (Math.abs(22 - ent));

        }

        if (nocturnas > 8) {
            nocturnas = 8;
        } else if (nocturnas < 0) {
            nocturnas = 0;
        }
        return nocturnas;
    }

    private double calFestivas(int h1, int m1, double h) {
        double ent = (double)h1 + ((double)m1 / 60);
        double horas = h;
        boolean hoy, manana;
        double fest;
        hoy = festivo;
        if (Ob.mesActual == 11 && Ob.diaActual == 30) {
            manana = true;
        } else {
            if (Ob.diaActual == Ob.mes[Ob.mesActual].getN() - 1) {
                manana = Ob.mes[Ob.mesActual + 1].dia[0].isFestivo();
            } else {
                manana = Ob.mes[Ob.mesActual].dia[Ob.diaActual + 1].isFestivo();
            }
        }
        
        if (hoy && manana){
          fest = horas;  
        }else if (hoy && !manana){
            if (ent >=0 && ent < 5){
                fest = 0;
            }else{
                fest = 24 -ent;
            }
        }else if (!hoy && manana){
            if (ent >=0 && ent < 5){
                fest = horas;
            }else{
                fest = horas - (24 -ent);
            }
        }else{
            fest = 0;
        }
        if (fest < 0) fest = 0;
        if (fest > horas) fest = horas;
        
        return fest;
    }

    public String getFestividad() {
        return festividad;
    }

    public void setFestividad(String festividad) {
        this.festividad = festividad;
    }

    public double getTempRadio() {
        return tempRadio;
    }

    public double getTempRadioB() {
        return tempRadioB;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public boolean isRadioscopia() {
        return radioscopia;
    }

    public void setRadioscopia(boolean radioscopia) {
        this.radioscopia = radioscopia;
    }

    public boolean isRadioB() {
        return radioB;
    }

    public void setRadioB(boolean radioB) {
        this.radioB = radioB;
    }

    public double getTempHoras() {
        return tempHoras;
    }

    public void setTempHoras(double tempHoras) {
        this.tempHoras = tempHoras;
    }

    public double getTempNocturnas() {
        return tempNocturnas;
    }

    public void setTempNocturnas(double tempNocturnas) {
        this.tempNocturnas = tempNocturnas;
    }

    public double getTempFestivas() {
        return tempFestivas;
    }

    public void setTempFestivas(double tempFestivas) {
        this.tempFestivas = tempFestivas;
    }

    public boolean isArma() {
        return arma;
    }

    public void setArma(boolean arma) {
        this.arma = arma;
    }

    public boolean isFestivo() {
        return festivo;
    }

    public void setFestivo(boolean festivo) {
        this.festivo = festivo;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public String getServicio1() {
        return servicio1;
    }

    public void setServicio1(String servicio1) {
        this.servicio1 = servicio1;
    }

    public String getServicio2() {
        return servicio2;
    }

    public void setServicio2(String servicio2) {
        this.servicio2 = servicio2;
    }

    public String getEntrada1() {
        return entrada1;
    }

    public void setEntrada1(String entrada1) {
        this.entrada1 = entrada1;
    }

    public String getEntrada2() {
        return entrada2;
    }

    public void setEntrada2(String entrada2) {
        this.entrada2 = entrada2;
    }

    public String getSalida1() {
        return salida1;
    }

    public void setSalida1(String salida1) {
        this.salida1 = salida1;
    }

    public String getSalida2() {
        return salida2;
    }

    public void setSalida2(String salida2) {
        this.salida2 = salida2;
    }

    public String getClaveServicio() {
        return claveServicio;
    }

    public void setClaveServicio(String claveServicio) {
        this.claveServicio = claveServicio;
    }
}
