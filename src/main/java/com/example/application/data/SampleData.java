package com.example.application.data;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import java.time.LocalDate;

@Entity
public class SampleData extends AbstractEntity {

    private String titel;
    private String beschreibung;

    public String getTitel() {
        return titel;
    }
    public void setTitel(String firstName) {
        this.titel = firstName;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String lastName) {
        this.beschreibung = lastName;
    }

}
