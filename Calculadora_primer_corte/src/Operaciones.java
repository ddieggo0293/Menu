import javax.swing.JOptionPane;

public class Operaciones {
    private int numero1 = 0;
    private int numero2 = 0;
    private double resultado;
    
    public void setNumero1(int num1){
        this.numero1 = num1;
    }
    public int getNumero1(){
        return this.numero1;
    }
    public void setNumero2(int num2){
        this.numero2 = num2;
    }
    public int getNumero2(){
        return this.numero2;
    }
    public void setResultado(double result){
        this.resultado = result;
    }
    public double getResultado(){
        return this.resultado;
    }
    public void opcionA(){
                int i=1;
                numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite por favor el valor del primer numero"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite por favor el valor del segundo numero"));
                while(i==1){
                String opc = JOptionPane.showInputDialog(null,"SELECCIONE UNA OPCION\n"+
                                                                            "A. SUMA\n"+
                                                                            "B. RESTA\n"+
                                                                            "C. MULTIPLICACION\n"+
                                                                            "D. DIVISION\n"+
                                                                            "E. VOLVER");
                //Indicador de casos
                switch (opc){
                    case "A":
                        JOptionPane.showMessageDialog(null, sumar());
                        break;
                    case "B": 
                        JOptionPane.showMessageDialog(null, restar());
                        break;
                    case "C":
                        JOptionPane.showMessageDialog(null, multiplicar());
                        break;
                    case "D":
                        JOptionPane.showMessageDialog(null, division());
                        break;
                    case "E":
                        i=0;
                        JOptionPane.showMessageDialog(null, "VOLVIENDO");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION NO VALIDA");
                 }     }
    }
    
    public int sumar(){
       return this.getNumero1() + this.getNumero2(); 
    }
    public int restar(){
       return this.getNumero1() - this.getNumero2(); 
    }
    public int multiplicar(){
       return this.getNumero1() * this.getNumero2(); 
    }
    public double division(){
       return (double) this.getNumero1()/this.getNumero2(); 
    }
   
}