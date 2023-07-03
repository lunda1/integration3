package com.company.team.business.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;

    private String name;

    public void updateName(String name) {
        this.name = name;
    }
}
