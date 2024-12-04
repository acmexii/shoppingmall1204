package shoppingmall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import shoppingmall.domain.재고감소됨;
import shoppingmall.domain.재고바닥남;
import shoppingmall.상품관리Application;

@Entity
@Table(name = "인벤토리_table")
@Data
//<<< DDD / Aggregate Root
public class 인벤토리 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        재고감소됨 재고감소됨 = new 재고감소됨(this);
        재고감소됨.publishAfterCommit();

        재고바닥남 재고바닥남 = new 재고바닥남(this);
        재고바닥남.publishAfterCommit();
    }

    public static 인벤토리Repository repository() {
        인벤토리Repository 인벤토리Repository = 상품관리Application.applicationContext.getBean(
            인벤토리Repository.class
        );
        return 인벤토리Repository;
    }

    //<<< Clean Arch / Port Method
    public static void 재고차감(DeliveryCompleted deliveryCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        인벤토리 인벤토리 = new 인벤토리();
        repository().save(인벤토리);

        재고감소됨 재고감소됨 = new 재고감소됨(인벤토리);
        재고감소됨.publishAfterCommit();
        재고바닥남 재고바닥남 = new 재고바닥남(인벤토리);
        재고바닥남.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(인벤토리->{
            
            인벤토리 // do something
            repository().save(인벤토리);

            재고감소됨 재고감소됨 = new 재고감소됨(인벤토리);
            재고감소됨.publishAfterCommit();
            재고바닥남 재고바닥남 = new 재고바닥남(인벤토리);
            재고바닥남.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void 재고증가(DeliveryCancelled deliveryCancelled) {
        //implement business logic here:

        /** Example 1:  new item 
        인벤토리 인벤토리 = new 인벤토리();
        repository().save(인벤토리);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCancelled.get???()).ifPresent(인벤토리->{
            
            인벤토리 // do something
            repository().save(인벤토리);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
