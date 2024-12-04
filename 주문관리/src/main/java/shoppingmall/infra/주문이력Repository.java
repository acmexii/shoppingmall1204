package shoppingmall.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shoppingmall.domain.*;

@RepositoryRestResource(collectionResourceRel = "주문이력", path = "주문이력")
public interface 주문이력Repository
    extends PagingAndSortingRepository<주문이력, Long> {}
