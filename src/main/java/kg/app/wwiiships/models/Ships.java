package kg.app.wwiiships.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_ships")
@Getter
@Setter
@RequiredArgsConstructor
public class Ships {
    @Id
    private String name;
    private short launchYear;

    @Column(name = "class")
    private String className;

}
