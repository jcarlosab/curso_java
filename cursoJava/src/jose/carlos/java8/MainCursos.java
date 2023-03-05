package jose.carlos.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class MainCursos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Curso> listaCursos = new ArrayList<>();
		listaCursos.add(new Curso("JAVA 18", 20.5f, 22, 3));
		listaCursos.add(new Curso("ANGULAR", 35.5f, 65, 83));
		listaCursos.add(new Curso("SPRING", 120.5f, 36, 23));
		listaCursos.add(new Curso("KAFKA", 250.5f, 18, 33));
		listaCursos.add(new Curso("MAGNOLIA", 18.5f, 15, 54));
		
		//TODO INTENTAR HACERLOS EN UN SOLO STREAM (CADA UNO)

		// Obtener la cantidad de cursos con duración mayor a 5 horas
		System.out.println(listaCursos.stream().filter(c -> c.getDuracion()>5).count());
		// Obtener la cantidad de cursos con duración menor a 2 horas
		System.out.println(listaCursos.stream().filter(c -> c.getDuracion()<2).count());
		// Listar el título de aquellos cursos con más de 50 videos
		listaCursos.stream().filter(c -> (c.getVideos()>50)).forEach(e -> System.out.println(e.getTitulo()));
		//listaCursos.stream().filter(c -> (c.getVideos()>50)).map(c -> c.getTitulo()).forEach(null);
		// Mostrar el titulo de los 3 cursos con mayor duración
		listaCursos.stream().limit(3).forEachOrdered(c -> System.out.println(c.getTitulo()));
		// Mostrar la duración total de los cursos
		// Obtener el curso con mayor duración
		// Crear una lista de string con los titulos de todos los cursos
		// Mostrar todos aquellos cursos cuya duración supere el promedio de duración en horas del conjunto
		// Mostrar la duración de los cursos con menos de 500 alumnos
	}
	
	//test

}
