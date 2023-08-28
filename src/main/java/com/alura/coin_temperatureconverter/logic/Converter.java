package com.alura.coin_temperatureconverter.logic;
public class Converter{
    private static final float valorDolarEn$=367.11f;
    private static final float valorEuroEn$=314.9069f;
    private static final float valorLibraEn$=365.3943f;
    private static final float valorYenEn$=198.4282f;
//  DIVISA - PESO
    public static float usdToArs(float usd){
        return valorDolarEn$*usd;
    }
    public static float euroToArs(float euro){
        return valorEuroEn$*euro;
    }
    public static float libraToArs(float libra){
        return valorLibraEn$*libra;
    }
    public static float yenToArs(float yen){
        return valorYenEn$*yen;
    }
//  PESO - DIVISA
    public static float arsToUSD(float ars){
        return ars/valorDolarEn$;
    }
    public static float arsToEuro(float ars){
        return ars/valorEuroEn$;
    }
    public static float arsToLibra(float ars){
        return ars/valorLibraEn$;
    }
    public static float arsToYen(float ars){
        return ars/valorYenEn$;
    }
    //  TEMPERATURA
    public static float deCelsiusAKelvin(float celsius){
        return celsius + 273.15f;
    }
    public static float deCelsiusAFahrenheit(float celsius){
        return celsius * 9/5 + 32f;
    }
    public static float deKelvinACelsius(float kelvin){
        return kelvin - 273.15f;
    }
    public static float deKelvinAFahrenheit(float kelvin){
        return kelvin * 9/5 - 459.67f;
    }
    public static float deFahrenheitACelsius(float fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
    public static float deFahrenheitAKelvin(float fahrenheit){
        return (fahrenheit + 459.67f) * 5/9;
    }
}