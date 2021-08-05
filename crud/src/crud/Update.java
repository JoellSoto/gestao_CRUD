package crud;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Update extends JFrame implements ActionListener {
    private JLabel lblNome, lblEndereco, lblContacto, lblSenha;
    private JTextField txtNome, txtEndereco, txtContacto;
    private JPasswordField txtSenha;
    private JButton butActualizar, butCancelar;
    private Container cont;

    public Update() {
        super("Criar Conta");
        cont = getContentPane();
        cont.setLayout(new GridLayout(5, 2, 0, 40));

        lblNome = new JLabel("Nome");
        lblEndereco = new JLabel("Endereco");
        lblContacto = new JLabel("Contacto");
        lblSenha = new JLabel("Senha");

        txtNome = new JTextField(10);
        txtEndereco = new JTextField(10);
        txtContacto = new JTextField(10);
        txtSenha = new JPasswordField(10);

        butActualizar = new JButton("Actualizar");
        butCancelar = new JButton("Cancelar");

        cont.add(lblNome);
        cont.add(txtNome);

        cont.add(lblEndereco);
        cont.add(txtEndereco);

        cont.add(lblContacto);
        cont.add(txtContacto);

        cont.add(lblSenha);
        cont.add(txtSenha);

        cont.add(butActualizar);
        cont.add(butCancelar);

        butActualizar.addActionListener(this);
        butCancelar.addActionListener(this);

        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        String nome, endereco, senha;
        long contacto;

        if(e.getSource() == butActualizar) {
            if(txtNome.getText().trim().equalsIgnoreCase("") ||
                    txtEndereco.getText().trim().equalsIgnoreCase("") ||
                    txtContacto.getText().trim().equalsIgnoreCase("") ||
                    txtSenha.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(Update.this, "Preencha o(s) espaco(s) em branco", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                nome = txtNome.getText().trim();
                endereco = txtEndereco.getText().trim();
                contacto = Long.parseLong(txtContacto.getText().trim());
                senha = txtSenha.getText().trim();

                // MÉTODO QUE VERIFICA SE O USUÁRIO CONSTA NA DB

                // MÉTODO QUE FAZ UPDATE SE O USUÁRIO CONSTA NA DB

                JOptionPane.showMessageDialog(Update.this, "Conta actualizada com sucesso!", "Info", JOptionPane.INFORMATION_MESSAGE);
                dispose();

//                new Menu(); || new Login();
            }
        } else {
            dispose();
//            new Menu(); || new Login();
        }
    }
}
