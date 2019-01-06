package com.libery.liberyaplication.mapperDTO;

public class PersonCreateDTO {


    private Long idUser;
    private String firstName;
    private String lastName;

    public PersonCreateDTO( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public PersonCreateDTO( ) {
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
