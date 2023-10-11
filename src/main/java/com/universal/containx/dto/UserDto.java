package com.universal.containx.dto;



import java.util.Collection;
import java.util.Set;


public class UserDto {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String ref;
    private String refto;
    private String username;
    private Integer coins=0;
    private boolean isAdmin;
    private Collection<RoleDto> roles;

    public String getFullName() {
        return firstName != null ? firstName.concat(" ").concat(lastName) : "";
    }
}
