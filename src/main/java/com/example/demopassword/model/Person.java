package com.example.demopassword.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;


@Entity
@Table(name = "Person")
public class Person {




        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, updatable = false)
        private long id;

        @Column(name = "email", nullable = false, unique = true)
        @Email(message = "Please provide a valid e-mail")
        @NotEmpty(message = "Please provide an e-mail")
        private String email;

        @Column(name = "password", nullable = false)
        private String password;

        @Column(name = "first_name")
        @NotEmpty(message = "Please provide your first name")
        private String firstName;

        @Column(name = "last_name")
        @NotEmpty(message = "Please provide your last name")
        private String lastName;

        @Column(name = "enabled")
        private boolean enabled;

        @Column(name = "created_on")
        private Date createdOn;

        @Column(name = "last_login")
        private Date lastLogin;

        @Column(name = "reset_token")
        private String resetToken;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
        public Date getLastLogin() {
            return lastLogin;
        }

        public void setLastLogin(Date lastLogin) {
            this.lastLogin = lastLogin;
        }

        public Date getCreatedOn() {
            return createdOn;
        }

        public void setCreatedOn(Date createdOn) {
            this.createdOn = createdOn;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(boolean value) {
            this.enabled = value;
        }

        public String getResetToken() {
            return resetToken;
        }

        public void setResetToken(String resetToken) {
            this.resetToken = resetToken;
        }
    }
