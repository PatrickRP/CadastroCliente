package gui;

import dao.UsuarioDAO;
import modelo.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame {
    private JPanel panelMain;
    private JLabel cnpjTxt;
    private JTextField textField1;
    private JLabel nameTxt;
    private JTextField textField2;
    private JLabel cepTxt;
    private JTextField textField3;
    private JLabel enderecoTxt;
    private JTextField textField4;
    private JLabel cidadeTxt;
    private JTextField textField5;
    private JLabel estadoTxt;
    private JTextField textField6;
    private JLabel telTxt;
    private JTextField textField7;
    private JLabel emailTxt;
    private JTextField textField8;
    private JLabel inscEstTxt;
    private JTextField textField9;
    private JButton cadatroBtn;
public UserInterface() {
    cadatroBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // instanciando a classe Usuario do pacote modelo e criando seu objeto usuarios
            Usuario usuarios = new Usuario();
            usuarios.setCnpj(textField1.getText());
            usuarios.setNome(textField2.getText());
            usuarios.setCep(textField3.getText());
            usuarios.setEndereco(textField4.getText());
            usuarios.setCidade(textField5.getText());
            usuarios.setEstado(textField6.getText());
            usuarios.setTelefone(textField7.getText());
            usuarios.setEmail(textField8.getText());
            usuarios.setInscricao_estadual(textField9.getText());

            // fazendo a validação dos dados
            if ((textField1.getText().isEmpty()) || (textField2.getText().isEmpty()) || (textField3.getText().isEmpty()) || (textField4.getText().isEmpty()
            || (textField5.getText().isEmpty()) || (textField6.getText().isEmpty()) || (textField7.getText().isEmpty()) || (textField8.getText().isEmpty()) || (textField9.getText().isEmpty()))) {
                JOptionPane.showMessageDialog(cadatroBtn,  "Os campos não podem estar vazios");
            }
            else {

                // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
                UsuarioDAO dao = new UsuarioDAO();
                dao.add(usuarios);
                JOptionPane.showMessageDialog(null, "Usuário "+textField2.getText()+" inserido com sucesso! ");
            }

            // apaga os dados preenchidos nos campos de texto
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            textField6.setText("");
            textField7.setText("");
            textField8.setText("");
            textField9.setText("");
        }
    });
}

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();

        ui.setContentPane(ui.panelMain);
        ui.setTitle("Cadastro Cliente");
        ui.setSize(300, 400);
        ui.setVisible(true);
        ui.setLocationRelativeTo(ui.getParent());
        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
