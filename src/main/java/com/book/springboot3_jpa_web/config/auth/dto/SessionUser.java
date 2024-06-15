package com.book.springboot3_jpa_web.config.auth.dto;

import lombok.Getter;

import java.io.Serializable;
import com.book.springboot3_jpa_web.domain.user.User;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
