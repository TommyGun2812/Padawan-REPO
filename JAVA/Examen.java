import javax.swing.JOptionPane;

public class Examen{
    public static void main(String[] args) {
        
        double a, A1, V;

        a=Double.parseDouble(JOptionPane.showInputDialog("teclea el valor de a"));

        A1= Math.sqrt(3)*Math.pow(a,2);
        V=Math.sqrt(2)*Math.pow(a,3)/12;

        JOptionPane.showMessageDialog(null, "el area es= "+A1+" el volumen es="+V, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
    }
}