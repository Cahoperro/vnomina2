package vnomina;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 *
 * @author cahoperro
 */
public class Objeto implements Serializable {

    Mes[] mes;
    Datos datos;
    boolean guardado = false;
    HashMap<String, Dias> claves;
    int mesActual;
    int diaActual;
    int anio;
    boolean bis;
    double cComunes;
    double desempleo;
    double FProfesional;
    double totalAportaciones;
    GregorianCalendar gc;

    public Objeto(Datos datosRec, int year) {
        claves = new HashMap<>();
        mesActual = 0;
        anio = year;
        mes = new Mes[12];
        datos = datosRec;
        if (year % 4 == 0) {
            bis = true;
        } else {
            bis = false;
        }
        for (int i = 0; i <= 11; i++) {
            mes[i] = new Mes(i, bis);
        }
        // rellenar los dias festivos (sabados y domingos)
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < mes[i].getN(); j++) {
                gc = new GregorianCalendar(anio, i, j);
                int d = gc.get(Calendar.DAY_OF_WEEK);
                mes[i].dia[j].setDiaSemana(d);
                if (d == 6 || d == 7) {
                    mes[i].dia[j].setFestivo(true);
                } else {
                    mes[i].dia[j].setFestivo(false);
                }
            }
        }

        mes[0].dia[0].setFestivo(true);
        mes[0].dia[0].setFestividad("Año nuevo");
        mes[0].dia[5].setFestivo(true);
        mes[0].dia[5].setFestividad("Dia de Reyes");
        mes[4].dia[0].setFestivo(true);
        mes[4].dia[0].setFestividad("Dia del trabajo");
        mes[7].dia[14].setFestivo(true);
        mes[7].dia[14].setFestividad("Virgen de agosto");
        mes[9].dia[11].setFestivo(true);
        mes[9].dia[11].setFestividad("Dia de la hispanidad");
        mes[10].dia[0].setFestivo(true);
        mes[10].dia[0].setFestividad("Todos los santos");
        mes[11].dia[5].setFestivo(true);
        mes[11].dia[5].setFestividad("Dia de la constitución");
        mes[11].dia[7].setFestivo(true);
        mes[11].dia[7].setFestividad("Inmaculada");
        mes[11].dia[24].setFestivo(true);
        mes[11].dia[24].setFestividad("Navidad");

        // calculo semana santa
        int a, b, c, d, e;
        int dm, m;
        a = anio % 19;
        b = anio % 4;
        c = anio % 7;
        d = ((19 * a) + 24) % 30;
        e = ((2 * b) + (4 * c) + (6 * d) + 5) % 7;
        int dia1 = 22 + d + e;
        int dia2 = d + e - 9;

        if (dia2 < 1) {
            dm = dia1;
            m = 3;
        } else {
            dm = dia2;
            m = 4;
        }
        if (dm < 4) {
            switch (dm) {
                case 3:
                    mes[m - 1].dia[dm - 3].setFestivo(true);
                    mes[m - 1].dia[dm - 3].setFestividad("Viernes santo");
                    mes[m - 2].dia[30].setFestivo(true);
                    mes[m - 2].dia[30].setFestividad("Jueves santo");
                    break;
                case 2:
                    mes[m - 2].dia[30].setFestivo(true);
                    mes[m - 2].dia[30].setFestividad("Viernes santo");
                    mes[m - 2].dia[29].setFestivo(true);
                    mes[m - 2].dia[29].setFestividad("Jueves santo");
                    break;
                case 1:
                    mes[m - 2].dia[29].setFestivo(true);
                    mes[m - 2].dia[29].setFestividad("Viernes santo");
                    mes[m - 2].dia[28].setFestivo(true);
                    mes[m - 2].dia[28].setFestividad("Jueves santo");
                    break;
            }
        } else {
            mes[m - 1].dia[dm - 3].setFestivo(true);
            mes[m - 1].dia[dm - 3].setFestividad("Viernes santo");
            mes[m - 1].dia[dm - 4].setFestivo(true);
            mes[m - 1].dia[dm - 4].setFestividad("Jueves santo");
        }
    }
}
