package latihanmembuatkonversisuhucelcius;
import java.util.Scanner;
public class LatihanMembuatKonversiSuhuCelcius {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan suhu celcius : ");
        double celcius = input.nextDouble();
        double fahrenheit, kelvin, reamur;
        fahrenheit = (9.0/5.0 * celcius)+32;
        kelvin =  celcius + 273.15;
        reamur = celcius * (4.0/5.0);
        
        System.out.println(celcius +" derajat celcius = "+fahrenheit+" derajat fahrenheit");
        System.out.println(celcius + " derajat celcius = " + kelvin + " derajat kelvin");
        System.out.println(celcius +" derajat celcius = "+reamur+" derajat reamur");
        
    }
    
}
