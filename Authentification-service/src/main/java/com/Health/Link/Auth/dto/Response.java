package com.Health.Link.Auth.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.Health.Link.Auth.enums.UserRole;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private int status;
    private String message;
    private final LocalDateTime timestamp = LocalDateTime.now();

    private String token;
    private String role;
    private String  expirationTime;

    private int totalPage;
    private long totalElement;


    private UserDto user;
    private List<UserDto> userList;



}
