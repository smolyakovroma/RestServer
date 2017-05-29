package ru.smolyakov.restserver.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post  extends BaseEntity {

    private String title;
    private String content;
    @OneToOne
    @JoinColumn(name = "user_fk")
    private User user;
//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
//    @Column(columnDefinition = "TIMESTAMP")
//    @Temporal(TemporalType.TIMESTAMP)
//    private LocalDateTime dateTime;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }


}
