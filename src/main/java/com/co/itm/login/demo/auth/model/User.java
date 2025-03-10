package com.co.itm.login.demo.auth.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "users") // Indica que esta clase representa un documento en MongoDB
@Getter
@Setter
public class User {

    @Id
    private String id; // Mongo usa String para el ID en lugar de Long

    private String username;
    private String password;
}
