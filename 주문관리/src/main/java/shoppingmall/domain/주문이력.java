package shoppingmall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "주문이력_table")
@Data
public class 주문이력 {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
