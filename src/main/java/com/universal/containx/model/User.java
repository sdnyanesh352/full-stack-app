package com.universal.containx.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import javax.persistence.*;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 *  .
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mobile_number")
    private String mobileNumber;
    
    private Integer coins=0;
    
    private String username;
    
    private Collection<Role> roles;
    
    @OneToMany(mappedBy = "userHistory", cascade = CascadeType.ALL)
    private List<LoginHistory> loginHistoryList = new ArrayList<>();
    
    public void addLoginHistory(LoginHistory loginHistory) {
        loginHistoryList.add(loginHistory);
        loginHistory.setUserHistory(this);
    }
    

    @OneToMany(mappedBy = "referrer", cascade = CascadeType.ALL)
    private List<Referral> referrals = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
   

    public String getFullName() {
        return firstName != null ? firstName.concat(" ").concat(lastName) : "";
    }
}
