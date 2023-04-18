package kg.app.wwiiships.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Result {
    SUNK("Потоплен"),
    DAMAGED("Повреждён"),
    OK("Невредим");

    private final String status;
}
