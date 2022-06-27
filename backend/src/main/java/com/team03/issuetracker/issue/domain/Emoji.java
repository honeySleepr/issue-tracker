package com.team03.issuetracker.issue.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Emoji {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String unicode;

    private String description;

    /********************************************************************/

    @Builder
    private Emoji(Long id, String unicode, String description) {
        this.id = id;
        this.unicode = unicode;
        this.description = description;
    }

    public static Emoji of(Long id, String unicode, String description) {
        return Emoji.builder()
            .id(id)
            .unicode(unicode)
            .description(description)
            .build();
    }

    /********************************************************************/
}