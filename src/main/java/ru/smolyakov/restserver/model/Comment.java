package ru.smolyakov.restserver.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Comment extends BaseEntity {
    @Column(length = 100)
    private String content;

    public Comment(String content) {
        this.content = content;
    }

}
