package com.ensg.spring.hello;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "evenement")
public class Evenement {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "num_event", nullable = false)
    private int num_event;

    @Column(name = "intitule", nullable = false)
    @NotEmpty(message = "Required")
    private String intitule;

    @Column(name = "theme")
    private String theme;

    @Column(name = "date_debut")
    private String date_debut;

    @Column(name = "duree")
    private String duree;

    @Column(name = "nb_part_max")
    private String nb_part_max;

    @Column(name = "description")
    private String description;

    @Column(name = "organisateur")
    private String organisateur;

    @Column(name = "type_event")
    private String type_event;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Participant> participant;

    ////////////////////////////Constructeurs Evénement///////////////////
    public Evenement(){}

    public Evenement(String intitule, String theme, String date_debut, String duree,
                     String nb_part_max, String description, String organisateur, String type_event) {
            this.intitule = intitule;
            this.theme = theme;
            this.date_debut = date_debut;
            this.nb_part_max = nb_part_max;
            this.duree = duree;
            this.description = description;
            this.organisateur = organisateur;
            this.type_event = type_event;

    }

    ////////////////////////////SETTERS////////////////////////////
    public void setIntitule() {
    }

    public void setTheme() {
    }

    public void setDate_debut() {
    }

    public void setDuree() {
    }

    public void setNb_part_max() {
    }

    public void setDescription() {
    }

    public void setOrganisateur() {
    }

    public void setType_event() {
    }

    /////////////////////// Ajouter un participant ////////////////
    public void addP(Participant parti) {
        participant.add(parti);
    }

    ////////////////////////////GETTERS////////////////////////////
    public int getNum_event() {
        return num_event;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getTheme() {
        return theme;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public String getDuree() {
        return duree;
    }

    public String getNb_part_max() {
        return nb_part_max;
    }

    public String getOrganisateur() {
        return organisateur;
    }

    public String getType_event() {
        return type_event;
    }

    public String getDescription() {
        return description;
    }


}
