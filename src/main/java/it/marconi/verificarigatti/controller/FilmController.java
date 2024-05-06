package it.marconi.verificarigatti.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import it.marconi.verificarigatti.Services.FilmService;
import it.marconi.verificarigatti.domains.FilmsForm;


@Controller
@RequestMapping("/films")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping
    public ModelAndView viewHomePage() {

        return new ModelAndView("homepage");
    }

    @GetMapping("/new")
    public ModelAndView newFilmsForm() {
        return new ModelAndView("film-form").addObject(new FilmsForm());
    }
    @PostMapping("/new")
    public ModelAndView handleNewContact( FilmsForm filmsForm){
       
        filmService.add(filmsForm);
        return new ModelAndView("film-detail").addObject("films", filmsForm);
       

    
    

       
    }

}
