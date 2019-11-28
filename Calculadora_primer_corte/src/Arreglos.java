import javax.swing.JOptionPane;

public class Arreglos {
    public void opcionB(){
        int i=1;
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño del arreglo"));
        String arregloDatos [] = new String[tamanio];
        
        while(i==1){
            String opc = JOptionPane.showInputDialog  ("SELECCIONE UNA OPCION\n"
                                                                    +"A.Cargar datos\n"
                                                                    +"B. Mostrar datos\n"
                                                                    +"C. Salir\n");
            
            switch(opc){
                case "A":
                    for(int f=0; f<arregloDatos.length;f++){
                        arregloDatos[f]=JOptionPane.showInputDialog("ingrese un valor tipo String en la posicion "+ f );
                    }
                    break;
                    
                case "B":
                    for(int j=0;j<arregloDatos.length;j++){
                        JOptionPane.showMessageDialog(null,"el valor en la posicion "+ j + " es "+ arregloDatos[j] );
                    }
                    break;
                    
                case "C":
                    JOptionPane.showMessageDialog(null, "SALIENDO");
                    i++;
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "digite una opcion valida");
            }
        }
    }         
}

