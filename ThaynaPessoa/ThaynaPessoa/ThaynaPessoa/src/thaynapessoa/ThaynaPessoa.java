package thaynapessoa;

import javax.swing.JOptionPane;
import modelo.Pessoa;

public class ThaynaPessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        while (p.getId() == null) {
            try {
                //Pra executar
                p.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o Código: ")));
            } catch (Exception ex) {
                //Fazer se der erro
                JOptionPane.showMessageDialog(null, "O código só pode ser preenchido com números.");
            }
        }
        p.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
        p.setSexo(JOptionPane.showInputDialog("Digite o Sexo: "));
        JOptionPane.showMessageDialog(null, "Código: " + p.getId() + "\nNome: " + p.getNome() + "\nSexo: " + p.getSexo());
    }
}
