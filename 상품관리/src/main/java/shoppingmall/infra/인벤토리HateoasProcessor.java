package shoppingmall.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import shoppingmall.domain.*;

@Component
public class 인벤토리HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<인벤토리>> {

    @Override
    public EntityModel<인벤토리> process(EntityModel<인벤토리> model) {
        return model;
    }
}
