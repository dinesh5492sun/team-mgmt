package com.team.mgmt.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
 
@Data
@JsonInclude(Include.NON_NULL)
public class ErrorResponse
{
    public ErrorResponse(String message, int resultCode) {
        super();
        this.message = message;
        this.resultCode = resultCode;
    }
 
    private String message;
    private int resultCode;
   
    
}