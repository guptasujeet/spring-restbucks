package org.springsource.restbucks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springsource.restbucks.order.Item;

/**
 * Date: 3/21/13
 * Time: 1:08 PM
 */
public interface ItemRepository extends CrudRepository<Item,Long> {

}
