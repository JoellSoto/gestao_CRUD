package crud;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Login extends JFrame {
    private JLabel lblNome, lblSenha, lblCreate;
    private JTextField txtNome;
    private JPasswordField txtSenha;
    private JButton butEntrar;
    private Container cont;
    private JPanel panel_NomeSenha, panel_Entrar, panel_Create;

    public Login() {
        super("Login");
        cont = getContentPane();
        cont.setLayout(null);

        lblNome = new JLabel("Nome");
        lblSenha = new JLabel("Senha");
        lblCreate = new JLabel("<html><u>Nao tenho conta</u></html>");

        txtNome = new JTextField(10);
        txtSenha = new JPasswordField(10);
        butEntrar = new JButton("Entrar");

        panel_NomeSenha = new JPanel(new GridLayout(2, 2, 0, 20));
        panel_Entrar = new JPanel(new BorderLayout());
        panel_Create = new JPanel(new BorderLayout());

        lblCreate.setForeground(Color.BLUE);

        panel_NomeSenha.add(lblNome);
        panel_NomeSenha.add(txtNome);
        panel_NomeSenha.add(lblSenha);
        panel_NomeSenha.add(txtSenha);
        panel_Entrar.add(butEntrar, BorderLayout.CENTER);
        panel_Create.add(lblCreate, BorderLayout.CENTER);

        panel_NomeSenha.setBounds(25, 20, 250, 80);
        panel_Entrar.setBounds(75, 110, 150, 40);
        panel_Create.setBounds(95, 170, 120, 30);

        cont.add(panel_NomeSenha);
        cont.add(panel_Entrar);
        cont.add(panel_Create);

        butEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                String nome = txtNome.getText().trim();
                String senha = txtSenha.getText().trim();
                if(nome.equals("") || senha.equals(""))
                    JOptionPane.showMessageDialog(Login.this, "Adicione os dados necessarios para entrar", "Erro!", JOptionPane.ERROR_MESSAGE);
                else {
//                    MÉTODO QUE FAZ LOGIN

//                    new Menu();
                    dispose();
                }
            }
        });

        lblCreate.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent ev) {
                new SignUp();
                dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        setVisible(true);
        setSize(300,230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}

