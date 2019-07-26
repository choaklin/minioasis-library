/*
 * This file is generated by jOOQ.
*/
package org.minioasis.library.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements Serializable {

    private static final long serialVersionUID = -247843442;

    private Long      userId;
    private Boolean   enabled;
    private Timestamp lastLogin;
    private String    password;
    private String    username;

    public User() {}

    public User(User value) {
        this.userId = value.userId;
        this.enabled = value.enabled;
        this.lastLogin = value.lastLogin;
        this.password = value.password;
        this.username = value.username;
    }

    public User(
        Long      userId,
        Boolean   enabled,
        Timestamp lastLogin,
        String    password,
        String    username
    ) {
        this.userId = userId;
        this.enabled = enabled;
        this.lastLogin = lastLogin;
        this.password = password;
        this.username = username;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Timestamp getLastLogin() {
        return this.lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(userId);
        sb.append(", ").append(enabled);
        sb.append(", ").append(lastLogin);
        sb.append(", ").append(password);
        sb.append(", ").append(username);

        sb.append(")");
        return sb.toString();
    }
}