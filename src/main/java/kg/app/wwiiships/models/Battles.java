package kg.app.wwiiships.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tb_battles")
@Getter
@Setter
@RequiredArgsConstructor
public class Battles {
    @Id
    private String name;
    private LocalDate date;


}
