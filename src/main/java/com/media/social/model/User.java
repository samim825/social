package com.media.social.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;


    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false, updatable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private RoleType role;

    @Column(columnDefinition = "boolean default true")
    private boolean isActive = true;

    @Column(name = "account_creating_date")
    private Date accountCreatingDate = new Date();

    @Column(name = "last_update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateDate;



}
