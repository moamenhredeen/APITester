package com.moamen.services;

import lombok.*;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Response {
    @Getter
    @Setter
    private String statusCode;

    @Getter
    @Setter
    private String Body;

    @Getter
    @Setter
    private Map<String, String> headers;
}
