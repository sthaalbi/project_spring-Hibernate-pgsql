package com.ensg.spring.hello;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "evenement")
public class Evenement {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private int num_event;
    private String intitule;
    private String theme;
    private String date_debut;
    private String duree;
    private String nb_part_max;
    private String description;
    private String organisateur;
    private String type_event;
//    @OneToMany(mappedBy = "evenement")
//    private List<Participant> participant;
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Participant> participant;
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

    public void addP(Participant parti) {
        participant.add(parti);
    }


}
