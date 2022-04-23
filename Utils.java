package utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    static NumberFormat formatandoNumeros = new DecimalFormat("R$ #,##0.00");
    static SimpleDateFormat formatandoData = new SimpleDateFormat("dd/MM/yyyy");

    public static String dateToString(Date data) {
        return Utils.formatandoData.format(data);
    }

    public static String doubleToString(Double valor) {
        return Utils.formatandoNumeros.format(valor);
    }

}