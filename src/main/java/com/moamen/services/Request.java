package com.moamen.services;

import lombok.*;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Request {

     @Getter
     @Setter
     private String url;

     @Getter
     @Setter
     private String body;

     @Getter
     @Setter
     private Map<String, String> headers;
}
