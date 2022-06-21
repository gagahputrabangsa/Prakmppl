package src.prakPbo_Agus;


import javax.swing.JOptionPane;
public class banding {
    public static void main(String[] args) {
        String kata1, kata2;

        kata1 =JOptionPane.showInputDialog("Masukkan kata 1 : ");
        kata2 =JOptionPane.showInputDialog("Masukkan kata 2 : ");

        if (kata1.equals(kata2)) {
            JOptionPane.showMessageDialog(null, kata1+" sama dengan "+kata2);
        } else {
            JOptionPane.showMessageDialog(null, kata1+" tidak sama dengan "+kata2);
        }
    
}
}
