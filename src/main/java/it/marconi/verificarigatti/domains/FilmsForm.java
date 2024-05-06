package it.marconi.verificarigatti.domains;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmsForm {
    @NotEmpty
    @Size(max = 14)
    private String codice;
    
    @NotEmpty
    @Size(max = 30)
    private String titolo;

    @NotEmpty
    @Size(max = 20)
    private String genere;

    @NotEmpty
    @Size(max=4)
    private int anno;
    
    @NotEmpty
    @Pattern(regexp = "([0-4]{5})") // regular expression per un numero da 10 cifre
    private int voto;

    
    
}
