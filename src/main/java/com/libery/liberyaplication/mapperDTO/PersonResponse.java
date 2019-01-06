package com.libery.liberyaplication.mapperDTO;

public class PersonResponse {

    private Long idUser;
    private String firstName;
    private String lastName;

    public PersonResponse(Long idUser, String firstName, String lastName) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getIdUser() {
        return idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


}
