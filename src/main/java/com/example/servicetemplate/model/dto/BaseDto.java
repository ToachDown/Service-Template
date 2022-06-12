package com.example.servicetemplate.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class BaseDto {

    @NotNull
    @Size(min = 1, max = 127)
    private String baseField;
}
