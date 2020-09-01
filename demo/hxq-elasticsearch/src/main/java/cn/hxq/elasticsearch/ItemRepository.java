package cn.hxq.elasticsearch;

import cn.hxq.elasticsearch.pojo.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ItemRepository extends ElasticsearchRepository<Item,Long> {

    List<Item> findByTitle(String title);

    List<Item> findByPriceBetween(Double d1, Double d2);
}
