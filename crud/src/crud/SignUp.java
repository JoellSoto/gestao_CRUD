package crud;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class SignUp extends JFrame implements ActionListener {
    private JLabel lblNome, lblEndereco, lblContacto, lblSenha;
    private JTextField txtNome, txtEndereco, txtContacto;
    private JPasswordField txtSenha;
    private JButton butRegistar, butCancelar;
    private Vector vc;
    private Container cont;

    public SignUp(Vector vector) {
        super("Criar Conta");
        cont = getContentPane();
        cont.setLayout(new GridLayout(5, 2, 0, 40));
        vc = vector;

        lblNome = new JLabel("Nome");
        lblEndereco = new JLabel("Endereco");
        lblContacto = new JLabel("Contacto");
        lblSenha = new JLabel("Senha");

        txtNome = new JTextField(10);
        txtEndereco = new JTextField(10);
        txtContacto = new JTextField(10);
        txtSenha = new JPasswordField(10);

        butRegistar = new JButton("Registar");
        butCancelar = new JButton("Cancelar");

        cont.add(lblNome);
        cont.add(txtNome);

        cont.add(lblEndereco);
        cont.add(txtEndereco);

        cont.add(lblContacto);
        cont.add(txtContacto);

        cont.add(lblSenha);
        cont.add(txtSenha);

        cont.add(butRegistar);
        cont.add(butCancelar);

        butRegistar.addActionListener(this);
        butCancelar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String nome, endereco, senha;
        long contacto;

        if(e.getSource() == butRegistar) {
            if(txtNome.getText().trim().equalsIgnoreCase("") ||
                    txtEndereco.getText().trim().equalsIgnoreCase("") ||
                    txtContacto.getText().trim().equalsIgnoreCase("") ||
                    txtSenha.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(SignUp.this, "Preencha o(s) espaco(s) em branco", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                nome = txtNome.getText().trim();
                endereco = txtEndereco.getText().trim();
                contacto = Long.parseLong(txtContacto.getText().trim());
                senha = txtSenha.getText().trim();

                // MÉTODO QUE FAZ O REGISTO

                JOptionPane.showMessageDialog(SignUp.this, "Conta criada com sucesso!", "Info", JOptionPane.INFORMATION_MESSAGE);
                dispose();

//                new Menu(); || new Login();
            }
        } else {
            dispose();
//            new Menu(); || new Login();
        }
    }
}
