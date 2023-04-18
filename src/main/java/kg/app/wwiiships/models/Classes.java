package kg.app.wwiiships.models;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_classes")
@Setter
@Getter
@RequiredArgsConstructor
public class Classes {
    @Id
    private String name;
    private String type;
    @Enumerated(EnumType.STRING)
    private Country country;
    private short numGuns;
    private double bore;
    private int displacement;
}
