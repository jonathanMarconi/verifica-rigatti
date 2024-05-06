package it.marconi.verificarigatti.domains;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// @Entity
// @Table(name = "films")
public class Films {
    // @Id
    // @Column(name="codice")
    private String codice;
    
    // @Column(name = "Titolo")
    private String titolo;

    // @Column(name = "Genere")
    private String genere;

    // @Column(name = "Anno")
    private int anno;

    // @Column(name = "voto")
    private int voto;

}
