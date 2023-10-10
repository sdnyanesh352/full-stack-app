package com.universal.containx.model;

import java.time.LocalDateTime;
public class Referral {
    private Long id;
    
   
    private User referrer;
    
    private String referralCode;
    private String email;
    private String status;
    private LocalDateTime referredAt;
}
