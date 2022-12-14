package pss.trabalhofinal.bancodeimagens.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class AplicarFiltroView extends javax.swing.JInternalFrame {

    public AplicarFiltroView() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFiltros = new javax.swing.JLabel();
        scpPainel = new javax.swing.JScrollPane();
        lblImagem = new javax.swing.JLabel();
        lblPredefinicoes = new javax.swing.JLabel();
        cmbPredefinicoes = new javax.swing.JComboBox<>();
        btnFechar = new javax.swing.JButton();
        txtRotacao = new javax.swing.JTextField();
        txtPixel = new javax.swing.JTextField();
        txtBrilho = new javax.swing.JTextField();
        btnRestaurar = new javax.swing.JButton();
        btnImgVermelha = new javax.swing.JButton();
        btnImgVerde = new javax.swing.JButton();
        btnImgAzul = new javax.swing.JButton();
        btnEspelhar = new javax.swing.JButton();
        btnRotacionar = new javax.swing.JButton();
        btnNegativo = new javax.swing.JButton();
        btnSepia = new javax.swing.JButton();
        btnPixelar = new javax.swing.JButton();
        btnCinza = new javax.swing.JButton();
        btnBrilho = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblFiltros1 = new javax.swing.JLabel();
        lblFiltros2 = new javax.swing.JLabel();

        setTitle("Aplicar filtro em uma imagem");

        lblFiltros.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblFiltros.setText("Filtros");

        scpPainel.setViewportView(lblImagem);

        lblPredefinicoes.setText("Predefinições");

        cmbPredefinicoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1. Vermelho = Sépia", "2. Verde + Sépia", "3. Azul + Sépia", "4. Vermelho + Negativo", "5. Verde + Negativo", "6. Azul + Negativo", "7. Sépia + Negativo"}));

        btnFechar.setText("Fechar");

        txtRotacao.setText("0");

        txtPixel.setText("1");

        txtBrilho.setText("0");

        btnRestaurar.setText("Desfazer");

        btnImgVermelha.setText("Imagem Vermelha");

        btnImgVerde.setText("Imagem Verde");

        btnImgAzul.setText("Imagem Azul");

        btnEspelhar.setText("Espelhar");

        btnRotacionar.setText("Rotacionar");

        btnNegativo.setText("Negativo");

        btnSepia.setText("Sépia");

        btnPixelar.setText("Pixelar");

        btnCinza.setText("Tons de Cinza");

        btnBrilho.setText("Brilho");

        jLabel1.setText("Desfaz o último efeito aplicado, para as predefinições, pressione duas vezes.");

        lblFiltros1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblFiltros1.setText("Efeitos:");

        lblFiltros2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblFiltros2.setText("Imagens:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRestaurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFiltros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 470, Short.MAX_VALUE)
                        .addComponent(lblPredefinicoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbPredefinicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImgAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnImgVerde, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(btnImgVermelha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lblFiltros1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(lblFiltros2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCinza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPixelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBrilho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBrilho)
                                    .addComponent(txtPixel)
                                    .addComponent(txtRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSepia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEspelhar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRotacionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(btnNegativo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(scpPainel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPredefinicoes)
                    .addComponent(cmbPredefinicoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFiltros))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblFiltros2)
                        .addGap(5, 5, 5)
                        .addComponent(btnImgVerde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImgAzul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImgVermelha)
                        .addGap(29, 29, 29)
                        .addComponent(lblFiltros1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEspelhar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRotacionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNegativo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSepia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPixelar)
                            .addComponent(txtRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCinza)
                            .addComponent(txtPixel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBrilho)
                            .addComponent(txtBrilho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(scpPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(jLabel1)
                    .addComponent(btnRestaurar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnBrilho() {
        return btnBrilho;
    }

    public JButton getBtnRotacionar() {
        return btnRotacionar;
    }

    public JButton getBtnCinza() {
        return btnCinza;
    }

    public JButton getBtnEspelhar() {
        return btnEspelhar;
    }

    public JButton getBtnImgAzul() {
        return btnImgAzul;
    }

    public JButton getBtnImgVerde() {
        return btnImgVerde;
    }

    public JButton getBtnNegativo() {
        return btnNegativo;
    }

    public JButton getBtnPixelar() {
        return btnPixelar;
    }

    public JButton getBtnSepia() {
        return btnSepia;
    }

    public JButton getBtnFechar() {
        return btnFechar;
    }

    public JButton getBtnRestaurar() {
        return btnRestaurar;
    }

    public JButton getBtnImgVermelha() {
        return btnImgVermelha;
    }

    public JComboBox<String> getCmbPredefinicoes() {
        return cmbPredefinicoes;
    }

    public JLabel getLblFiltros() {
        return lblFiltros;
    }

    public JLabel getLblImagem() {
        return lblImagem;
    }

    public JLabel getLblPredefinicoes() {
        return lblPredefinicoes;
    }

    public JScrollPane getScpPainel() {
        return scpPainel;
    }

    public JTextField getTxtBrilho() {
        return txtBrilho;
    }

    public JTextField getTxtPixel() {
        return txtPixel;
    }

    public JTextField getTxtRotacao() {
        return txtRotacao;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrilho;
    private javax.swing.JButton btnCinza;
    private javax.swing.JButton btnEspelhar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnImgAzul;
    private javax.swing.JButton btnImgVerde;
    private javax.swing.JButton btnImgVermelha;
    private javax.swing.JButton btnNegativo;
    private javax.swing.JButton btnPixelar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnRotacionar;
    private javax.swing.JButton btnSepia;
    private javax.swing.JComboBox<String> cmbPredefinicoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFiltros;
    private javax.swing.JLabel lblFiltros1;
    private javax.swing.JLabel lblFiltros2;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblPredefinicoes;
    private javax.swing.JScrollPane scpPainel;
    private javax.swing.JTextField txtBrilho;
    private javax.swing.JTextField txtPixel;
    private javax.swing.JTextField txtRotacao;
    // End of variables declaration//GEN-END:variables
}
