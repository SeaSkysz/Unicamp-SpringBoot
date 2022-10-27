package com.perfectmatch.unicampspringboot.db;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GradeDao implements Serializable {
    private Long id;
    private Long user_id;
    private Long course_id;
    private Long rating;
}
