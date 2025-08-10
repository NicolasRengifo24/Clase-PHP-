
import java.util.Scanner;

/*A un trabajador le pagan según sus horas y una tarifa de pago por   horas. 
si la cantidad de horas trabajadas es mayor a 40 horas. 
la   tarifa se incrementa en un 50% para las horas extras.
 calcular el   salario del trabajador dadas las horas trabajadas y la tarifa.
 */
public class sueldo {

    public static void main(String[] args) {

        float horas_trabajadas;
        float pago_hora = 5000;
        float pago_hora_extra = (float) (pago_hora + (pago_hora * 0.5));

        float pago_extras;

        float pago_sin_extras;
        float total_pago;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las horas que trabajo en la semana ");
        horas_trabajadas = entrada.nextFloat();

        if (horas_trabajadas > 40) {

            float horas_extras = horas_trabajadas - 40;
            float horas_legales = horas_trabajadas - horas_extras;

            pago_extras = horas_extras * pago_hora_extra;

            pago_sin_extras = horas_legales * pago_hora;
            total_pago = (horas_legales * pago_hora) + (horas_extras * pago_hora_extra);  

            
            System.out.println("El total de horas laboradas es de " + horas_trabajadas + "horas ");
            System.out.println("De las cuales " + horas_extras +" son horas extra");
            System.out.println("Para un total de Salario por horas legales de : $" + pago_sin_extras );
            System.out.println("y un pago por horas extras de :$" + pago_extras);
            System.out.println("Para un total debengado de : $" + total_pago );

        }else {
             System.out.println("El total de horas laboradas es de " + horas_trabajadas);
             System.err.println("Para un total debengado de: " + (horas_trabajadas * pago_hora ));
        }

    }
}
