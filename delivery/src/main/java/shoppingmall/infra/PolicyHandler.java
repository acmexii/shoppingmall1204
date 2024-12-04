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
    DeliveryRepository deliveryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderPlaced'"
    )
    public void wheneverOrderPlaced_DeliveryStarted(
        @Payload OrderPlaced orderPlaced
    ) {
        OrderPlaced event = orderPlaced;
        System.out.println(
            "\n\n##### listener DeliveryStarted : " + orderPlaced + "\n\n"
        );

        // Comments //
        //배송시작은
        // 1. 물류사에 배송지시 보내고,
        // 2. 고객에 배송시작 알리고,
        // 3. 우리장부에도 키핑

        // Sample Logic //
        Delivery.deliveryStarted(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderCancelled'"
    )
    public void wheneverOrderCancelled_CancelDelivery(
        @Payload OrderCancelled orderCancelled
    ) {
        OrderCancelled event = orderCancelled;
        System.out.println(
            "\n\n##### listener CancelDelivery : " + orderCancelled + "\n\n"
        );

        // Sample Logic //
        Delivery.cancelDelivery(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
