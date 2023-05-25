package gui;

import GerBDdao.ProdutoDAO;
import modelo.Produto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadProductInterface extends JFrame{
    private JLabel cod;
    private JTextField textFieldCod;
    private JLabel preco;
    private JTextField textFieldPreco;
    private JTextField textFieldNome;
    private JTextField textFieldCa;
    private JTextField textFieldModelo;
    private JTextField textFieldMaterial;
    private JTextField textFieldFab;
    private JTextField textFieldQntd;
    private JButton adicionarButton;
    private JPanel panelMain;

    public CadProductInterface() {
    adicionarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Produto produtos = new Produto();

            produtos.setCod(textFieldCod.getText());
            produtos.setPreco(Double.parseDouble(textFieldPreco.getText()));
            produtos.setNome(textFieldNome.getText());
            produtos.setCa(textFieldCa.getText());
            produtos.setModelo(textFieldModelo.getText());
            produtos.setMaterial(textFieldMaterial.getText());
            produtos.setFabricante(textFieldFab.getText());
            produtos.setQuantidade(Integer.parseInt(textFieldQntd.getText()));

            if((textFieldCod.getText().isEmpty()) || (textFieldPreco.getText().isEmpty()) || (textFieldNome.getText().isEmpty()) ||
                    (textFieldCa.getText().isEmpty()) || (textFieldModelo.getText().isEmpty()) || (textFieldMaterial.getText().isEmpty())
                || (textFieldFab.getText().isEmpty()) || (textFieldQntd.getText().isEmpty())) {
                JOptionPane.showMessageDialog(adicionarButton,  "Os campos não podem estar vazios");
            } else {
                ProdutoDAO dao = new ProdutoDAO();
                dao.cadastrarProduto(produtos);
                JOptionPane.showMessageDialog(null, "Produto "+textFieldNome.getText()+" inserido com sucesso! ");
            }

            textFieldCod.setText("");
            textFieldPreco.setText("");
            textFieldNome.setText("");
            textFieldCa.setText("");
            textFieldModelo.setText("");
            textFieldMaterial.setText("");
            textFieldFab.setText("");
            textFieldQntd.setText("");
        }
    });
}
    public static void main(String[] args) {
        CadProductInterface ui = new CadProductInterface();

        ui.setContentPane(ui.panelMain);
        ui.setTitle("Cadastro de Produto");
        ui.setSize(300, 400);
        ui.setVisible(true);
        ui.setLocationRelativeTo(ui.getParent());
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
