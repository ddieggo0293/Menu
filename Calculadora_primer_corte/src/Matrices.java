

import javax.swing.JOptionPane;

public class Matrices {
    public void opcionC(){
        int tamanio;
        tamanio = Integer.parseInt(JOptionPane.showInputDialog("Digite por favor el tamaño de la matriz cuadrada"));
        int tabla [][] = new int [tamanio][tamanio];
        int f=1;
        
        while(f==1){
            String opc = JOptionPane.showInputDialog("SELECCIONE UNA OPCION\n"
                                                                    +"A. Cargar datos\n"
                                                                    +"B. Mostrar datos\n"
                                                                    +"C. SALIR");
            //Indicador de casos
            switch(opc){
                case "A":
                    for(int i=0 ; i<tamanio;i++){
                        for(int j=0;j<tamanio;j++){
                            tabla[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite por favor un valor en la posicion ["+i+"] ["+j+"]"));
                        }
                    }
                    break;
                case "B":
                    for(int i=0 ; i<tamanio;i++){
                        for(int j=0;j<tamanio;j++){
                            JOptionPane.showMessageDialog(null,"El valor en la posicion ["+i+"] ["+j+"] es "+tabla[i][j]);
                        }
                    }
                    break;
                case "C":
                    JOptionPane.showMessageDialog(null, "SALIENDO");
                    f++;
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION VALIDA");
            }
        }
    }
}
