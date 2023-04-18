package kg.app.wwiiships.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "tb_outcomes")
@Getter
@Setter
@RequiredArgsConstructor
public class Outcomes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ship;

    private String battle;

    @Enumerated(EnumType.STRING)
    private Result result;
}

