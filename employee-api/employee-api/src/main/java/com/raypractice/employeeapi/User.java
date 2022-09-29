package com.raypractice.employeeapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document   // It is used to identify a domain object, which is persisted to MongoDB
@Data   // bundles the features of @ToString , @EqualsAndHashCode , @Getter / @Setter and @RequiredArgsConstructor together
@NoArgsConstructor  // generate the no-argument constructor for a class
@AllArgsConstructor // generates a constructor with one parameter for every field in the class
@Component
public class User {
    @Id // specifies the primary key of an entity
    private String id;
    private String name;
    private String email;
    private String password;

}
