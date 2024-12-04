package shoppingmall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "상품검색_table")
@Data
public class 상품검색 {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
