package shoppingmall.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shoppingmall.config.kafka.KafkaProcessor;
import shoppingmall.domain.*;

@Service
public class 주문이력ViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private 주문이력Repository 주문이력Repository;
    //>>> DDD / CQRS
}
