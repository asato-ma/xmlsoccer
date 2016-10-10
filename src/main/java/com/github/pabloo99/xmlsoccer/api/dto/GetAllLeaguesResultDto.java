package com.github.pabloo99.xmlsoccer.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLeaguesResultDto implements Serializable {

    private int id;
    private String name;
    private String country;
    private String historicalData;
    private String fixtures;
    private String livescore;
    private int numberOfMatches;
    private Date latestMatch;
}
