package com.rocketseat.course.urlShortener;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class UrlData {
    @Getter @Setter private String originalUrl;
    @Getter @Setter private long expirationTime;
}
