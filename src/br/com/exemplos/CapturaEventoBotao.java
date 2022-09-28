package br.com.exemplos;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Font;

public class CapturaEventoBotao implements ActionListener {
  private JButton botao;

  public void janela() {
    JFrame frame = new JFrame();
    botao = new JButton();

    botao.addActionListener(this);

    frame.getContentPane().add(botao);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 100);
    frame.setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    botao.setText("Botão foi clicado!");
    botao.setFont(new Font("SansSerif", Font.BOLD, 20));
  }
}
