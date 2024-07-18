package Homework2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Ticket {

    private String number;
    private LocalDateTime mockowTime;
}
