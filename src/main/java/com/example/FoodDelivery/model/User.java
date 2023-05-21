package com.example.FoodDelivery.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank
    private String userFirstName;

    @NotBlank
    private String userLastName;

    @Email
    private String userEmail;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Length(min =8)
    private String userPassword;

    private String userContactNumber;
}
