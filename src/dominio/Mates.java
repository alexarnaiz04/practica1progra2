package dominio;
import java.util.Random;

public class Mates{
	public static double numeropi(long pasos){
		double aciertos = 0;
                double areaCuadrado = 4;
		for (long i=1;i<pasos; i++){
			Random numaleatorio=new Random();
			double x=numaleatorio.nextDouble();
			double y=numaleatorio.nextDouble();
		if ((x*x+y*y)<=1){
				aciertos++;
			}
		}
		
		return areaCuadrado*aciertos/pasos;
	}
}