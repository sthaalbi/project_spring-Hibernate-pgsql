package com.ensg.spring.hello;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import com.ensg.spring.hello.Evenement;

import java.util.List;

/**
 *
 * @author postgres
 */
@Entity
@Table(name = "participant")
public class Participant {


        @Id
        @GeneratedValue(generator = "increment")
        @GenericGenerator(name = "increment", strategy = "increment")
        @Column(name = "num_pers")
        private int numpers;

        @Column(name = "nom", nullable = false)
        private String nom;

        @Column(name = "prenom", nullable = false)
        private String prenom;

        @Column(name = "email", nullable = false)
        private String email;

        @Column(name = "datenaiss", nullable = false)
        private String datenaiss;

//        @ManyToOne
//        @JoinColumn(name="num_event", nullable=false)
        @ManyToOne
        @JoinColumn(name = "num_event")
        private Evenement event;

        public Participant(String nom, String prenom, String email, String datenaiss) {

            this.nom = nom;
            this.prenom = prenom;
            this.email = email;
            this.datenaiss = datenaiss;
        }

    public Participant() {
    }

    public int getNumpers() {
            return numpers;
        }

        public void setNumpers(int numpers) {
            this.numpers = numpers;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDatenaiss() {
            return datenaiss;
        }

        public void setDatenaiss(String datenaiss) {
            this.datenaiss = datenaiss;
        }


    public void addE(Evenement ev1) {
        event = ev1;
    }
}
