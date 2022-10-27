package com.perfectmatch.unicampspringboot.db;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SubCategoryDao implements Serializable {
    private Long id;
    private Long category_id;
    private String name;
}
