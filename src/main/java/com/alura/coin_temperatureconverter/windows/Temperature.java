package com.alura.coin_temperatureconverter.windows;
import com.alura.coin_temperatureconverter.logic.Converter;
import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
/**
 *
 * @author Nahuel
 */
public class Temperature extends javax.swing.JFrame {
    private int xMouse, yMouse;
    private final String error="Ingresó un valor no numérico. Inténtelo nuevamente.";
    private javax.swing.JLabel backLabel;
    private javax.swing.JPanel bodyTempPanel;
    private javax.swing.JRadioButton btnC_F;
    private javax.swing.JRadioButton btnC_K;
    private javax.swing.JRadioButton btnF_C;
    private javax.swing.JRadioButton btnF_K;
    private javax.swing.ButtonGroup btnGroupTemp;
    private javax.swing.JRadioButton btnK_C;
    private javax.swing.JRadioButton btnK_F;
    private javax.swing.JPanel containerTempPanel;
    private javax.swing.JPanel headerTempPanel;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JLabel labelOptionTemp;
    private javax.swing.JLabel labelResultTemp;
    private javax.swing.JLabel labelTitleResultTemp;
    private javax.swing.JLabel salirLabel;
    private javax.swing.JSeparator separatorResult;
    private javax.swing.JSeparator separatorTitle;
    private javax.swing.JSeparator sepatatorText;
    private javax.swing.JLabel titleTemperature;
    private javax.swing.JTextField txtFieldTemp;
    public Temperature() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        btnGroupTemp = new javax.swing.ButtonGroup();
        containerTempPanel = new javax.swing.JPanel();
        headerTempPanel = new javax.swing.JPanel();
        salirLabel = new javax.swing.JLabel();
        titleTemperature = new javax.swing.JLabel();
        separatorTitle = new javax.swing.JSeparator();
        backLabel = new javax.swing.JLabel();
        bodyTempPanel = new javax.swing.JPanel();
        instructionLabel = new javax.swing.JLabel();
        txtFieldTemp = new javax.swing.JTextField(){
            int maxLength=12;
            @Override
            protected Document createDefaultModel() {
                return new PlainDocument() {
                    @Override
                    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                        if (str == null) {
                            return;
                        }
                        if ((getLength() + str.length()) <= maxLength) {
                            super.insertString(offs, str, a);
                        }
                    }
                };
            }
        };
        sepatatorText = new javax.swing.JSeparator();
        labelOptionTemp = new javax.swing.JLabel();
        btnC_F = new javax.swing.JRadioButton();
        btnF_C = new javax.swing.JRadioButton();
        btnK_F = new javax.swing.JRadioButton();
        btnF_K = new javax.swing.JRadioButton();
        btnC_K = new javax.swing.JRadioButton();
        btnK_C = new javax.swing.JRadioButton();
        labelTitleResultTemp = new javax.swing.JLabel();
        labelResultTemp = new javax.swing.JLabel();
        separatorResult = new javax.swing.JSeparator();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        containerTempPanel.setBackground(new java.awt.Color(57, 105, 138));
        headerTempPanel.setBackground(new java.awt.Color(57, 105, 138));
        headerTempPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerTempPanelMouseDragged(evt);
            }
        });
        headerTempPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerTempPanelMousePressed(evt);
            }
        });
        salirLabel.setFont(new java.awt.Font("Russo One", 0, 36));
        salirLabel.setForeground(new java.awt.Color(153, 153, 153));
        salirLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirLabel.setText("X");
        salirLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirLabelMouseClicked(evt);
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirLabelMouseEntered(evt);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirLabelMouseExited(evt);
            }
        });
        titleTemperature.setFont(new java.awt.Font("Russo One", 3, 48));
        titleTemperature.setForeground(new java.awt.Color(204, 153, 0));
        titleTemperature.setText("Temperatura");
        separatorTitle.setForeground(new java.awt.Color(153, 153, 153));
        backLabel.setFont(new java.awt.Font("Russo One", 0, 48));
        backLabel.setForeground(new java.awt.Color(153, 153, 153));
        backLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLabel.setText("<");
        backLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backLabelMouseEntered(evt);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLabelMouseExited(evt);
            }
        });
        javax.swing.GroupLayout headerTempPanelLayout = new javax.swing.GroupLayout(headerTempPanel);
        headerTempPanel.setLayout(headerTempPanelLayout);
        headerTempPanelLayout.setHorizontalGroup(
            headerTempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerTempPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(headerTempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerTempPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(separatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(headerTempPanelLayout.createSequentialGroup()
                        .addComponent(titleTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        headerTempPanelLayout.setVerticalGroup(
            headerTempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerTempPanelLayout.createSequentialGroup()
                .addGroup(headerTempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerTempPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        bodyTempPanel.setBackground(new java.awt.Color(57, 105, 138));
        instructionLabel.setFont(new java.awt.Font("Russo One", 2, 18));
        instructionLabel.setForeground(new java.awt.Color(204, 153, 0));
        instructionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructionLabel.setText("Coloque la cantidad y luego seleccione el tipo de conversión. ");
        txtFieldTemp.setBackground(new java.awt.Color(57, 105, 138));
        txtFieldTemp.setFont(new java.awt.Font("Russo One", 0, 14));
        txtFieldTemp.setForeground(new java.awt.Color(40, 82, 113));
        txtFieldTemp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldTemp.setText("TEMPERATURA");
        txtFieldTemp.setBorder(null);
        txtFieldTemp.setCaretColor(new java.awt.Color(57, 105, 138));
        txtFieldTemp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFieldTemp.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFieldTempMousePressed(evt);
            }
        });
        sepatatorText.setBackground(new java.awt.Color(204, 153, 0));
        sepatatorText.setForeground(new java.awt.Color(204, 153, 0));
        labelOptionTemp.setFont(new java.awt.Font("Russo One", 2, 24));
        labelOptionTemp.setForeground(new java.awt.Color(204, 153, 0));
        labelOptionTemp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelOptionTemp.setText("Tipo de conversión:");
        btnC_F.setBackground(new java.awt.Color(57, 105, 138));
        btnGroupTemp.add(btnC_F);
        btnC_F.setFont(new java.awt.Font("Russo One", 3, 16));
        btnC_F.setForeground(new java.awt.Color(204, 204, 204));
        btnC_F.setText("Celcius-Fahrenheit");
        btnC_F.setBorder(null);
        btnC_F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC_F.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnC_F.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnC_FActionPerformed(evt);
        });
        btnF_C.setBackground(new java.awt.Color(57, 105, 138));
        btnGroupTemp.add(btnF_C);
        btnF_C.setFont(new java.awt.Font("Russo One", 3, 16));
        btnF_C.setForeground(new java.awt.Color(204, 204, 204));
        btnF_C.setText("Fahrenheit-Celcius");
        btnF_C.setBorder(null);
        btnF_C.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnF_C.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnF_C.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnF_CActionPerformed(evt);
        });
        btnK_F.setBackground(new java.awt.Color(57, 105, 138));
        btnGroupTemp.add(btnK_F);
        btnK_F.setFont(new java.awt.Font("Russo One", 3, 16));
        btnK_F.setForeground(new java.awt.Color(204, 204, 204));
        btnK_F.setText("Kelvin-Fahrenheit");
        btnK_F.setBorder(null);
        btnK_F.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnK_F.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnK_F.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnK_FActionPerformed(evt);
        });
        btnF_K.setBackground(new java.awt.Color(57, 105, 138));
        btnGroupTemp.add(btnF_K);
        btnF_K.setFont(new java.awt.Font("Russo One", 3, 16));
        btnF_K.setForeground(new java.awt.Color(204, 204, 204));
        btnF_K.setText("Fahrenheit-Kelvin");
        btnF_K.setBorder(null);
        btnF_K.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnF_K.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnF_K.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnF_KActionPerformed(evt);
        });
        btnC_K.setBackground(new java.awt.Color(57, 105, 138));
        btnGroupTemp.add(btnC_K);
        btnC_K.setFont(new java.awt.Font("Russo One", 3, 16));
        btnC_K.setForeground(new java.awt.Color(204, 204, 204));
        btnC_K.setText("Celcius-Kelvin");
        btnC_K.setBorder(null);
        btnC_K.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC_K.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnC_K.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnC_KActionPerformed(evt);
        });
        btnK_C.setBackground(new java.awt.Color(57, 105, 138));
        btnGroupTemp.add(btnK_C);
        btnK_C.setFont(new java.awt.Font("Russo One", 3, 16));
        btnK_C.setForeground(new java.awt.Color(204, 204, 204));
        btnK_C.setText("Kelvin-Celcius");
        btnK_C.setBorder(null);
        btnK_C.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnK_C.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnK_C.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnK_CActionPerformed(evt);
        });
        labelTitleResultTemp.setFont(new java.awt.Font("Russo One", 2, 18));
        labelTitleResultTemp.setForeground(new java.awt.Color(204, 153, 0));
        labelTitleResultTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitleResultTemp.setText("Respuesta:");
        labelResultTemp.setFont(new java.awt.Font("Russo One", 0, 18));
        labelResultTemp.setForeground(new java.awt.Color(40, 82, 113));
        labelResultTemp.setText("");
        separatorResult.setBackground(new java.awt.Color(204, 153, 0));
        separatorResult.setForeground(new java.awt.Color(204, 153, 0));
        javax.swing.GroupLayout bodyTempPanelLayout = new javax.swing.GroupLayout(bodyTempPanel);
        bodyTempPanel.setLayout(bodyTempPanelLayout);
        bodyTempPanelLayout.setHorizontalGroup(
            bodyTempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyTempPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyTempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instructionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bodyTempPanelLayout.createSequentialGroup()
                        .addGroup(bodyTempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sepatatorText, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                            .addComponent(btnK_C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnC_K, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnF_K, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnK_F, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnC_F, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                            .addComponent(btnF_C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFieldTemp))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bodyTempPanelLayout.createSequentialGroup()
                        .addGroup(bodyTempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(separatorResult, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitleResultTemp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelResultTemp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                            .addComponent(labelOptionTemp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))))
        );
        bodyTempPanelLayout.setVerticalGroup(
            bodyTempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyTempPanelLayout.createSequentialGroup()
                .addComponent(instructionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepatatorText, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelOptionTemp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnC_F)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnF_C)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnK_F)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnF_K)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnC_K)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnK_C)
                .addGap(18, 18, 18)
                .addComponent(labelTitleResultTemp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelResultTemp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorResult, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );
        javax.swing.GroupLayout containerTempPanelLayout = new javax.swing.GroupLayout(containerTempPanel);
        containerTempPanel.setLayout(containerTempPanelLayout);
        containerTempPanelLayout.setHorizontalGroup(
            containerTempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerTempPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(containerTempPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bodyTempPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        containerTempPanelLayout.setVerticalGroup(
            containerTempPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerTempPanelLayout.createSequentialGroup()
                .addComponent(headerTempPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bodyTempPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerTempPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerTempPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }
    private void salirLabelMouseClicked(java.awt.event.MouseEvent evt) {                                        
        var buttonMouse=evt.getButton();
        switch(buttonMouse){
            case 1 -> System.exit(0);
        }
    }
    private void headerTempPanelMousePressed(java.awt.event.MouseEvent evt) {                                             
        xMouse=evt.getX();
        yMouse=evt.getY();
    }
    private void headerTempPanelMouseDragged(java.awt.event.MouseEvent evt) {                                             
        var x=evt.getXOnScreen();
        var y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }
    private void salirLabelMouseEntered(java.awt.event.MouseEvent evt) {                                        
        salirLabel.setForeground(new Color(204,0,0));
    }
    private void salirLabelMouseExited(java.awt.event.MouseEvent evt) {                                       
        salirLabel.setForeground(new Color(153,153,153));
    }
    private void backLabelMouseEntered(java.awt.event.MouseEvent evt) {                                       
        backLabel.setForeground(new Color(204,153,0));
    }
    private void backLabelMouseExited(java.awt.event.MouseEvent evt) {                                      
        backLabel.setForeground(new Color(153,153,153));
    }
    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {                                       
        var buttonMouse=evt.getButton();
        switch(buttonMouse){
            case 1 -> {
                this.dispose();
                java.awt.EventQueue.invokeLater(() -> {
                    ConverterWindow converter=new ConverterWindow();
                    converter.setVisible(true);
                    converter.setTitle("Conversor");
                    converter.setLocationRelativeTo(null);
                });
                break;
            }
        }
    }
    private void txtFieldTempMousePressed(java.awt.event.MouseEvent evt) {                                          
        txtFieldTemp.setText("");
        txtFieldTemp.setForeground(new Color(204,204,204));
    }                                         
    private float getTemp() throws NumberFormatException{
        try{
            var inputValue = txtFieldTemp.getText().replace(",", ".");
            labelTitleResultTemp.setText("Respuesta:");
            labelTitleResultTemp.setForeground(new Color(204,153,0));
            return Float.parseFloat(inputValue);
        }
        catch(NumberFormatException e){
            labelTitleResultTemp.setText("Error:");
            labelTitleResultTemp.setForeground(new Color(204,0,0));
            labelResultTemp.setText(error);
            labelResultTemp.setForeground(new Color(204,0,0));
            throw new NumberFormatException("Valor no numerico");
        }
    }
    private void btnC_FActionPerformed(java.awt.event.ActionEvent evt) {                                       
        var flot=Converter.deCelsiusAFahrenheit(getTemp());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultTemp.setText(bd.toString());
        labelResultTemp.setForeground(new Color(204,153,0));
    }
    private void btnF_CActionPerformed(java.awt.event.ActionEvent evt) {                                       
        var flot=Converter.deFahrenheitACelsius(getTemp());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultTemp.setText(bd.toString());
        labelResultTemp.setForeground(new Color(204,153,0));
    }
    private void btnK_FActionPerformed(java.awt.event.ActionEvent evt) {                                       
        var flot=Converter.deKelvinAFahrenheit(getTemp());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultTemp.setText(bd.toString());
        labelResultTemp.setForeground(new Color(204,153,0));
    }
    private void btnF_KActionPerformed(java.awt.event.ActionEvent evt) {                                       
        var flot=Converter.deFahrenheitAKelvin(getTemp());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultTemp.setText(bd.toString());
        labelResultTemp.setForeground(new Color(204,153,0));
    }
    private void btnC_KActionPerformed(java.awt.event.ActionEvent evt) {                                       
        var flot=Converter.deCelsiusAKelvin(getTemp());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultTemp.setText(bd.toString());
        labelResultTemp.setForeground(new Color(204,153,0));
    }
    private void btnK_CActionPerformed(java.awt.event.ActionEvent evt) {                                       
        var flot=Converter.deKelvinACelsius(getTemp());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultTemp.setText(bd.toString());
        labelResultTemp.setForeground(new Color(204,153,0));
    }      
}