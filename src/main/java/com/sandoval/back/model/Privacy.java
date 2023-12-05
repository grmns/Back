package com.sandoval.back.model;

import jakarta.persistence.*;


@Entity
public class Privacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrivacy;

    private String privacyOption;

    public Privacy() {
    }

    public Privacy(String privacyOption) {
        this.privacyOption = privacyOption;
    }

    public Long getIdPrivacy() {
        return idPrivacy;
    }

    public void setIdPrivacy(Long idPrivacy) {
        this.idPrivacy = idPrivacy;
    }

    public String getPrivacyOption() {
        return privacyOption;
    }

    public void setPrivacyOption(String privacyOption) {
        this.privacyOption = privacyOption;
    }

}

