import javax.swing.JOptionPane;
import clasesempresa.*;


public class AppEmpresaObjetos {
    public static void main(String[] args) throws Exception {
    int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados:"));

    Empresa empresa = new Empresa();
    for (int emp = 0; emp < cantidad; emp++) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del Empleado :");
        String cargo =JOptionPane.showInputDialog(null, " Ingrese el cargo del Empleado :");
        double salario = Double.parseDouble(JOptionPane.showInputDialog(cargo));

        empresa.contratarEmpleado(new Empleado (nombre, cargo, salario));

        System.out.println( " El total de empleados es: " + empresa.getTotalEmpleados());

        System.out.println(" Los nombres y salarios de los empleados son .");

        System.out.println("Total de dinero pagado a los empleados");
    }
    
    }
}
