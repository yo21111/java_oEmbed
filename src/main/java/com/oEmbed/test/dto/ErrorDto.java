package com.oEmbed.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDto {
    private String type;
    private Integer code;
    private String message;
}
