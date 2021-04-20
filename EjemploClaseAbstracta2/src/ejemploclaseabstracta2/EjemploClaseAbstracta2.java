package ejemploclaseabstracta2;

import java.util.Scanner;

public class EjemploClaseAbstracta2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tigo t = new Tigo();
        Claro c = new Claro();
        
        c.setColor("Rojo");
        c.apellido = "";
        c.setDireccion("Zona");
        c.setPersonas(4500);
        c.getColor();
        
        
        System.out.println("Listado de Empresas");
        System.out.println("1 Tigo");
        System.out.println("2 Claro");
        System.out.println("Elija una Empresa");
        int op;
        op = sc.nextInt();
        sc.nextLine();//capturador de linea
        while (op > 0 && op < 4) {
            switch (op) {
                case 1:
                    System.out.println("Empresa TIGO");
                    System.out.println("Ingrese Nombre del Trabajador");
                    t.nombre = sc.nextLine();
                    System.out.println("Ingrese Apellido del Trabajador");
                    t.apellido = sc.nextLine();
                    System.out.println("Ingrese la Edad del Trabajador");
                    t.edad = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la Direccion del Trabajador");
                    t.dire = sc.nextLine();
                    System.out.println("Ingrese el Sueldo del Trabajador");
                    t.sueldo = sc.nextInt();

                    System.out.println("");
                    System.out.println("TIGO");
                    System.out.println("Nombre: " + t.nombre);
                    System.out.println("Apellido: " + t.apellido);
                    System.out.println("Edad: " + t.edad);
                    System.out.println("Direccion: " + t.dire);
                    System.out.println("Sueldo: " + t.sueldo);
                    System.out.println("Salario por año: " + t.sueldoAnual());
                    System.out.println("Comisión de Tigo: " + t.comision());
                    break;
                case 2:
                    System.out.println("Empresa TIGO");
                    System.out.println("Ingrese Nombre del Trabajador");
                    c.nombre = sc.nextLine();
                    System.out.println("Ingrese Apellido del Trabajador");
                    c.apellido = sc.nextLine();
                    System.out.println("Ingrese la Edad del Trabajador");
                    c.edad = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la Direccion del Trabajador");
                    c.dire = sc.nextLine();
                    System.out.println("Ingrese el Sueldo del Trabajador");
                    c.sueldo = sc.nextInt();
                    System.out.println("");
                    System.out.println("CLARO");
                    System.out.println("Nombre: " + c.nombre);
                    System.out.println("Apellido: " + c.apellido);
                    System.out.println("Edad: " + c.edad);
                    System.out.println("Direccion: " + c.dire);
                    System.out.println("Sueldo: " + c.sueldo);
                    System.out.println("Salario por año: " + c.sueldoAnual());
                    System.out.println("Comisión de Claro: " + c.comision());
                    break;
            }
            System.out.println("Listado de Empresas");
            System.out.println("1 Tigo");
            System.out.println("2 Claro");
            System.out.println("Elija una Empresa");
            op = sc.nextInt();
            sc.nextLine();
        }
    }

}
