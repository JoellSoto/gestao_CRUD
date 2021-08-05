import crud.SignUp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddProduct extends JFrame implements ActionListener {
    private JLabel lblProduto, lblCategoria, lblPreco, lblQuantidade;
    private JTextField txtProduto, txtPreco, txtQuantidade;
    private JComboBox cboCategoria;
    private JButton butAdicionar, butCancelar;
    private Container cont;
    private String[] categorias = {"","1", "2", "3", "4", "5"};

    public AddProduct() {
        super("Adicionar Produto");
        cont = getContentPane();
        cont.setLayout(new GridLayout(5, 2, 20, 40));

        lblProduto = new JLabel("Produto");
        lblCategoria = new JLabel("Categoria");
        lblPreco = new JLabel("Preco");
        lblQuantidade = new JLabel("Quantidade");

        txtProduto = new JTextField(10);
        cboCategoria = new JComboBox(categorias);
        txtPreco = new JTextField(10);
        txtQuantidade = new JPasswordField(10);

        butAdicionar = new JButton("Adicionar");
        butCancelar = new JButton("Cancelar");

        cont.add(lblProduto);
        cont.add(txtProduto);

        cont.add(lblCategoria);
        cont.add(cboCategoria);

        cont.add(lblPreco);
        cont.add(txtPreco);

        cont.add(lblQuantidade);
        cont.add(txtQuantidade);

        cont.add(butAdicionar);
        cont.add(butCancelar);

        butAdicionar.addActionListener(this);
        butCancelar.addActionListener(this);

        setVisible(true);
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        String produto;
        byte categoria;
        float preco;
        short quantidade;

        if(e.getSource() == butAdicionar) {
            if(txtProduto.getText().trim().equalsIgnoreCase("") ||
                    cboCategoria.getSelectedIndex() == 0 ||
                    txtPreco.getText().trim().equalsIgnoreCase("") ||
                    txtQuantidade.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(AddProduct.this, "Preencha o(s) espaco(s) em branco", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                produto = txtProduto.getText().trim();
                categoria = Byte.parseByte((String) cboCategoria.getSelectedItem());
                preco = Float.parseFloat(txtPreco.getText().trim());
                quantidade = Short.parseShort(txtQuantidade.getText().trim());

                // MÉTODO QUE ADICIONA NOVO PRODUTO

                JOptionPane.showMessageDialog(AddProduct.this, "Produto adicionado com sucesso!", "Info", JOptionPane.INFORMATION_MESSAGE);
                dispose();

//                new Menu();
            }
        } else {
            dispose();
//            new Menu();
        }
    }
}
