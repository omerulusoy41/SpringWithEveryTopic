package com.example.demo.service;

import com.example.demo.entity.Kisi;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface KisiRepo extends ElasticsearchRepository <Kisi,String> {

    @Query("{\"bool\": { \"must\":[ { \"match\": { \"ad\" : \"?0\" } } ] } }")
    public List<Kisi> getByCustomQuery(String search);

}
