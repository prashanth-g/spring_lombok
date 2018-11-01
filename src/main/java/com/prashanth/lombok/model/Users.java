package com.prashanth.lombok.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Users {

    private @Getter @Setter Long id;
    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;

}
