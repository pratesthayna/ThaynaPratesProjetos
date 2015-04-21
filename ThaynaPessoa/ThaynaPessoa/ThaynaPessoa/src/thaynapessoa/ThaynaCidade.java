package thaynapessoa;

import javax.swing.JOptionPane;
import modelo.Cidade;

public class ThaynaCidade {

    public static void main(String[] args) {
        Cidade c = new Cidade();
        while (c.getId() == null) {
            try {
                c.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o Código: ")));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "O código só pode ser preenchido com números.");
            }
        }
        c.setNomecidade(JOptionPane.showInputDialog("Digite o Nome: "));
        JOptionPane.showMessageDialog(null, "Cidade\nCódigo: " + c.getId() + "\nNome: " + c.getNomecidade());
    }
}
