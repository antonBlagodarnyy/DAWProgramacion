package boletinAmpliacion;

public class metodos {
public static int printPath(int xOrigin, int yOrigin, int xEnd, int yEnd) {
	//Parametros
	int pasos = 0;
	
	//devuelve un contador.
	do {
		if(xOrigin < xEnd) {
			xOrigin++;
		} else if (xOrigin > xEnd) {
			xOrigin--;
		}
		if(yOrigin < yEnd) {
			yOrigin++;
		} else if (yOrigin > yEnd) {
			yOrigin--;
		}
		pasos++;
	}while ( xOrigin!=xEnd && yOrigin!=yEnd);
	return pasos;
}
}