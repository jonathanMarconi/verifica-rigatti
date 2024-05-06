package it.marconi.verificarigatti.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import it.marconi.verificarigatti.domains.Films;
import it.marconi.verificarigatti.domains.FilmsForm;


@Service
public class FilmService {
    // @Autowired
    // private FilmRepository filmRepo;

    ArrayList<Films> aFilm = new ArrayList<>();

    public  void add(FilmsForm filmForm){
        Films f = mapFilms(filmForm);
        aFilm.add(f);

        
    }
    private Films mapFilms(FilmsForm film){
        Films f = new Films();
        f.setCodice(film.getCodice());
        f.setTitolo(film.getTitolo());
        f.setGenere(film.getGenere());
        f.setAnno(film.getAnno());
        f.setVoto(film.getVoto());
       
        return f;
    }
    public List<Films> findAll() {
        return aFilm;
    }
}
