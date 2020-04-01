package cn.wfc.shiro.bean;

import org.springframework.stereotype.Component;

@Component
public class User {
    private Integer id;
    private String username;
    private String password;
    private String passwordSalt;
    private String perms;

    public String getPerms() {
        return perms;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", passwordSalt='" + passwordSalt + '\'' +
                ", perms='" + perms + '\'' +
                '}';
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
