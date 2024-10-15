import com.JQIndustries.sceenmatch.calculos.CalculadoraDeTiempo;
import com.JQIndustries.screenmatch.modelos.Pelicula;
import com.JQIndustries.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula();

        pelicula.evaluaPelicula(9);
        pelicula.evaluaPelicula(9);

        pelicula.setNombre("Hola");
        pelicula.setDuracionEnMinutos(345);
        pelicula.setFechaDeLanzamiento(2022);
        pelicula.setIncluidoEnElPlan(false);

        pelicula.muestraFichaTecnica();
        System.out.println(pelicula.getSumaDeEvaluaciones());
        System.out.println(pelicula.getTotalEvaluaciones());
        System.out.println(pelicula.calcularMedia());

        Serie serie = new Serie();

        serie.setNombre("Inside Job");
        serie.setFechaDeLanzamiento(2022);
        serie.setIncluidoEnElPlan(false);
        serie.setTemporadas(2);
        serie.setMinutosPorEpisodio(50);
        serie.setEpisodiosPorTemporada(10);

        System.out.println(serie.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();

        calculadora.incluye(pelicula);

        System.out.println(calculadora.getTiempoTotal());

        calculadora.incluye(serie);

        System.out.println(calculadora.getTiempoTotal());

    }
}
