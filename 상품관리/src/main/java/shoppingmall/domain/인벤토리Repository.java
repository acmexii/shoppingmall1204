package shoppingmall.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shoppingmall.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "인벤토리", path = "인벤토리")
public interface 인벤토리Repository
    extends PagingAndSortingRepository<인벤토리, Long> {}
