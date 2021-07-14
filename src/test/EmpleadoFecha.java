
package test;

import dominio.Empleado;
import dominio.Fecha;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EmpleadoFecha {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        Fecha fNacimiento;
        Fecha fIngreso;
        Empleado empleado1;
        int anio,mes,dia;
        String nombre;
        System.out.println("Ingrese el nombre del Empleado");
        nombre =  entrada.nextLine();
        System.out.println("Fecha de nacimiento");
        System.out.printf("Año: ");
        anio=entrada.nextInt();
        System.out.printf("Mes: ");
        mes=entrada.nextInt();
        System.out.printf("Dia: ");
        dia=entrada.nextInt();
        fNacimiento = new Fecha(anio,mes,dia);
        System.out.println("Fecha de Ingreso a la Empresa");
        System.out.printf("Año: ");
        anio=entrada.nextInt();
        System.out.printf("Mes: ");
        mes=entrada.nextInt();
        System.out.printf("Dia: ");
        dia=entrada.nextInt();
        fIngreso = new Fecha(anio,mes,dia);
        empleado1 =new Empleado(nombre,fNacimiento,fIngreso);
        System.out.println("\n Resumen de los datos Ingresados");
        System.out.println(nombre);
        System.out.println("Fecha de nacimiento  : "+fNacimiento);
        System.out.println("* Segun la fecha de nacimiento :");
        EdadNacimiento(fNacimiento);
        System.out.println("Fecha de ingreso : "+fIngreso);
        System.out.println("* Segun la fecha de ingreso");
        EdadIngreso(fIngreso);
      


    }
    public static void EdadNacimiento(Fecha fNacimiento){
        int anio=fNacimiento.getAnio();
        int mes=fNacimiento.getMes();
        int dia=fNacimiento.getDia();
        Period p = Period.between(LocalDate.of(anio,mes,dia), LocalDate.now());
        System.out.printf("El empleado tiene : %d años, %d meses, %d días \n",  p.getYears(), p.getMonths(), p.getDays());
}
    public static void EdadIngreso(Fecha fIngreso){
        int anio=fIngreso.getAnio();
        int mes=fIngreso.getMes();
        int dia=fIngreso.getDia();
        Period p = Period.between(LocalDate.of(anio,mes,dia), LocalDate.now());
        System.out.printf("El empleado trabaja en la empresa : %d años, %d meses, %d días \n",  p.getYears(), p.getMonths(), p.getDays());
    }
}