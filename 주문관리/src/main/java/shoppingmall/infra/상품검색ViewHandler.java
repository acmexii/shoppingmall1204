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
public class 상품검색ViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private 상품검색Repository 상품검색Repository;
    //>>> DDD / CQRS
}
