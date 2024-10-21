package clasesempresa;

import java.util.ArrayList;


public class Empresa {
    ArrayList<empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<Empleado>();

    }

    public void contratarEmpleado (Empleado e) {
        empleados.add(e);
    }

    public int getTotalempleados() {
        return empleados.size();

    }

    public void nombreSalario() {
        for (Empleado e: empleados){
        System.out.println("Nombre:" + e.getNombre() + "Salario:" + e.getSalario());

        }
    }
    public double getTotalSalario () {
        double total = 0;
        for (Empleado e:empleado) {
            total = + e.getSalario();

        }

        public void EmpleadoMayorSalario() {
            Empleado EmpleadoMayorSalario = empleados.get(index:0);
            double mayorSalario = empleados.get(0).getSalario();
            if (e.getSalario() > mayorSalario) {
                mayorSalario = empleados.getSalario();
                empMayorSalario = e;

            }
        }
        System.out.println( "Nombre:" + empMayorSalario.getNombre() + "Salario" + empSalario.getSalario());


        public void EmpleadoMenorSalario() {
            Empleado EmpleadoMenorSalario = empleados.get(index:0);
            double menorSalario = empleados.get(0).getSalario();
            if (e.getSalario() > menorSalario) {
                menorSalario = empleados.getSalario();
                empMenorSalario = e;

            }
        }
        System.out.println( "Nombre:" + empMenorSalario.getNombre() + "Salario" + empSalario.getSalario());
    }
}
