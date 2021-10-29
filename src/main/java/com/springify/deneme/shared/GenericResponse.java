package com.springify.deneme.shared;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //bütün argümanlar için otomatik olarak constructor oluşturur
public class GenericResponse {
    private String message;
}
