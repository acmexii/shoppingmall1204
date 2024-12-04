package shoppingmall.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shoppingmall.config.kafka.KafkaProcessor;
import shoppingmall.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    인벤토리Repository 인벤토리Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryCompleted'"
    )
    public void wheneverDeliveryCompleted_재고차감(
        @Payload DeliveryCompleted deliveryCompleted
    ) {
        DeliveryCompleted event = deliveryCompleted;
        System.out.println(
            "\n\n##### listener 재고차감 : " + deliveryCompleted + "\n\n"
        );

        // Sample Logic //
        인벤토리.재고차감(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryCancelled'"
    )
    public void wheneverDeliveryCancelled_재고증가(
        @Payload DeliveryCancelled deliveryCancelled
    ) {
        DeliveryCancelled event = deliveryCancelled;
        System.out.println(
            "\n\n##### listener 재고증가 : " + deliveryCancelled + "\n\n"
        );

        // Sample Logic //
        인벤토리.재고증가(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
