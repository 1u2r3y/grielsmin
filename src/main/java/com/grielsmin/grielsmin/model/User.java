package com.grielsmin.grielsmin.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity(name="user")
@Table(name = "user", schema = "public")
public class User {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "login", nullable = false, unique=true)
    private String login;

    @Column(name = "pass", nullable = false)
    private String pass;

    @Column(name = "name", nullable = false)
    private String name;

    /*public Long getUserId() {
            return id;
        }

    public String getUserLogin() {
            return login;
        }

    public String getUserPass() {
                return pass;
            }
    public String getUserName() {
            return name;
        }

    public void setUserId(Long id) {
            this.id = id;
        }
    public void setUserLogin(String login) {
            this.login = login;
        }


    public void setUserPass(String pass) {
            this.pass = pass;
        }

    public void setUserName(String name) {
            this.name = name;
        }*/
}
