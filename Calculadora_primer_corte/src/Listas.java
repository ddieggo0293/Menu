import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Listas {
    public void opcionE(){
        int u=1;
        String dato = "";
        List <String> nombres;
        nombres = new ArrayList<>();
        
        while(u==1){
            String opc = JOptionPane.showInputDialog("SELECCIONE UNA OPCION\n"+
                                                                   "A. Insertar datos.\n"+
                                                                   "B. Mostrar datos.\n"+
                                                                   "C. Limpiar lista.\n"+
                                                                   "D. Salir.\n");
            //Indicador de casos
            switch(opc){
                case "A":
                    dato = JOptionPane.showInputDialog("Ingrese un valor de tipo String para ingresarlo a la lista");
                    nombres.add(dato);
                    JOptionPane.showMessageDialog(null, "DATO CARGADO");
                    break;
                case "B":
                    JOptionPane.showMessageDialog(null, nombres);
                    break;
                case "C":
                    nombres.clear();
                    JOptionPane.showMessageDialog(null, "LISTA VACIADA");
                    break;
                case "D":
                    u=0;
                    JOptionPane.showMessageDialog(null, "SALIENDO");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "DIGITE UNA OPCION VALIDA");
            }
        }
    }
}
