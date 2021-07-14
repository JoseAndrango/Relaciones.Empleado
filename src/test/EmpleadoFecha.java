package test;

import dominio.Empleado;
import dominio.Fecha;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class EmpleadoFecha {

    public static void main(String[] args) {
        Calendar fecha = new GregorianCalendar();
        Scanner entrada = new Scanner(System.in);
        Fecha fNacimiento;
        Fecha fIngreso;
        Empleado empleado1;
        int anio = 2022, mes = 0, dia = 0;
        String nombre;
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la fecha de nacimiento: ");
        System.out.print("Anio: ");
        while (anio > fecha.get(Calendar.YEAR)) {
            anio = entrada.nextInt();
        }
        System.out.print("Mes: ");
        while (mes < 1 || mes > 12) {
            mes = entrada.nextInt();
        }
        System.out.print("Dia: ");
        while (dia < 1 || dia > 31) {
            dia = entrada.nextInt();
        }
        fNacimiento = new Fecha(anio, mes, dia);
        anio = 2022;
        mes = 0;
        dia = 0;
        System.out.println("Ingrese la fecha de ingreso a la empresa: ");
        System.out.print("Anio: ");
        while (anio > fecha.get(Calendar.YEAR)) {
            anio = entrada.nextInt();
        }
        System.out.print("Mes: ");
        while (mes < 1 || mes > 12) {
            mes = entrada.nextInt();
        }
        System.out.print("Dia: ");
        while (dia < 1 || dia > 31) {
            dia = entrada.nextInt();
        }
        fIngreso = new Fecha(anio, mes, dia);
        empleado1 = new Empleado(nombre, fNacimiento, fIngreso);
        System.out.println("Los datos Ingresados son:");
        empleado1.verDatos();
    }

}