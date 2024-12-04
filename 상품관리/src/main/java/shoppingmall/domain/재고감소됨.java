package shoppingmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shoppingmall.domain.*;
import shoppingmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class 재고감소됨 extends AbstractEvent {

    private Long id;

    public 재고감소됨(인벤토리 aggregate) {
        super(aggregate);
    }

    public 재고감소됨() {
        super();
    }
}
//>>> DDD / Domain Event
