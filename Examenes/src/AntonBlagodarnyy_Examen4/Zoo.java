package AntonBlagodarnyy_Examen4;

public abstract class Zoo {
	//Atributos
	public static final int CAPACIDAD_ZOO=5;
	private static Animal[] habitaculos= new Animal [CAPACIDAD_ZOO];

	public static Animal[] getHabitaculos() {
		return habitaculos;
	}
	public static void setHabitaculos(Animal[] habitaculos) {
		Zoo.habitaculos = habitaculos;
	}

	public static int contarAnimalesBienUbicados() {
		int contadorBienUbicado=0;

		for (int i = 0; i < habitaculos.length; i++) {//Lo recorremos
			if (habitaculos[i]!=null) {//Evitamos los nulos
				if(animalEsFeliz(habitaculos[i])) {
					if(i==0) {//Si es el primero
						if(animalEsFeliz(habitaculos[i+1])) {
							contadorBienUbicado++;
						}
					} else if(i==habitaculos.length-1) {//Si es el ultimo
						if(animalEsFeliz(habitaculos[i-1])) {
							contadorBienUbicado++;
						}
					} else {//Si es cualquiera de enmedio
						if(habitaculos[i-1]!=null) {
							if(animalEsFeliz(habitaculos[i-1])){
								contadorBienUbicado++;
								
							}
						}else	if(habitaculos[i+1]!=null) {
							if(animalEsFeliz(habitaculos[i+1])){
								contadorBienUbicado++;
								
							}
						}
					}
				}

			}
		}
			return contadorBienUbicado;
		}
		
		private static boolean animalEsFeliz(Animal animal) {
			boolean esFeliz=false;
			if (animal instanceof Peligroso) {
				Peligroso animalPeligroso = (Peligroso) animal;
				if(animalPeligroso.isFeliz()) {
					esFeliz=true;
				}
			} else {
				if(animal.isFeliz()){
					esFeliz=true;
				}
			}
			return esFeliz;
		}

	}