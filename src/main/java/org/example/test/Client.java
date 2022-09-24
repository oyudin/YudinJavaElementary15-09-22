package org.example.test;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Client {

    private String fName;
    private String lName;

    public Client(String name, String lName) {
        this.fName = name;
        this.lName = lName;
    }
}
