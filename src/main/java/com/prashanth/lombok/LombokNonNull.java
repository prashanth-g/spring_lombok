package com.prashanth.lombok;

import com.prashanth.lombok.model.Person;
import lombok.NonNull;

public class LombokNonNull {

    private Person person;

    @NonNull
    void nonNullExperiment() {
        System.out.println(person.getFullName());
    }
}
