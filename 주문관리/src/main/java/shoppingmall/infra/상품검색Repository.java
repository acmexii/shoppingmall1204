package shoppingmall.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shoppingmall.domain.*;

@RepositoryRestResource(collectionResourceRel = "상품검색", path = "상품검색")
public interface 상품검색Repository
    extends PagingAndSortingRepository<상품검색, Long> {}
