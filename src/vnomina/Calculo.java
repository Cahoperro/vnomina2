package vnomina;

/**
 *
 * @author cahoperro
 */
public class Calculo {

    Principal p;

    public Calculo(Principal p) {
        this.p = p;
    }

    private double redondear(double n) {
        return (Math.floor(n * 100)) / 100;
    }

    public void calcular() {
        p.tArma = redondear(p.horasArma * p.vArma);
        p.horas = p.horas + p.horasVacaciones;
        p.horasExtra = p.horas - 176;
        if (p.horasExtra < 0) {
            p.horasExtra = 0;
        }
        p.tExtra = redondear(p.horasExtra * p.vExtra);
        p.tAntiguedad = redondear(p.tAntiguedad);
        p.festivos = redondear(p.horasFestivas * p.vFestiva);
        p.nocturnos = redondear(p.horasNocturnas * p.vNocturna);
        p.pPagasExtras = redondear(p.pPagasExtras);
        p.tHorasRadio = redondear(p.horasRadio * p.vRadio);
        p.tHorasRadioB = redondear(p.horasRadioB * p.vRadioB);
        
        p.cComunes = redondear(p.salarioBase + p.tAntiguedad + p.festivos + p.nocturnos + p.pPeligrosidad
                + p.pPagasExtras + p.JefeEquipo + p.tNochebuena + p.tHorasRadio + p.tHorasRadioB + p.tArma);
        p.tDevengado = redondear(p.cComunes + p.tExtra + p.pTransporte + p.pVestuario);
        p.dCcomunes = redondear((p.tDevengado * 4.7) / 100);
        p.desempleo = redondear(((p.tDevengado + p.tExtra) * 1.65) / 100);
        p.fp = 0;
        p.dHorasExtra = (p.tExtra * 4.7) / 100;
        p.IRPF = redondear((p.tDevengado * p.tIrpf) / 100);
        p.tAportaciones = redondear(p.dCcomunes + p.fp + p.desempleo);
        p.tDeducir = redondear(p.dCcomunes + p.desempleo + p.fp + p.dHorasExtra + p.IRPF);
        p.liquido = redondear(p.tDevengado - p.tDeducir);
    }
}
