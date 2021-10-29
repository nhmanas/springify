package com.springify.deneme.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data //getter ve setterlar otomatik oluşuyor, lombok özelliği
@Entity //veritabanında aşağıdaki değişkenlerin adında fieldlar oluşturuyor
@Table(name = "users") //tablo oluşturuyor
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String username;
    private String password;
}
