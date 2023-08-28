package com.alura.coin_temperatureconverter;
import com.alura.coin_temperatureconverter.windows.ConverterWindow;
/**
 *
 * @author Nahuel
 */
public class Coin_temperatureConverter {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
        ConverterWindow converter=new ConverterWindow();
        converter.setVisible(true);
        converter.setTitle("Conversor");
        converter.setLocationRelativeTo(null);
        });
    }
}