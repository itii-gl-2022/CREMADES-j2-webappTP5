package fr.lixtec.form10.j2.exo6;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "individu")
public class Individu
{
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;

    

    @Id
    @Column(name = "individuId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }



    @Column(length = 30, nullable = false)
    public String getNom()
    {
        return nom;
    }
    public void setNom(String nom)
    {
        this.nom = nom;
    }



    @Column(length = 30, nullable = false)
    public String getPrenom()
    {
        return prenom;
    }
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }



    @Column(length = 255, nullable = false)
    public String getAdresse()
    {
        return adresse;
    }
    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }
}