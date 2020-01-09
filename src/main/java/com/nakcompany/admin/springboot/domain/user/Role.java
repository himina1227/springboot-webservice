package com.nakcompany.admin.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;
}
