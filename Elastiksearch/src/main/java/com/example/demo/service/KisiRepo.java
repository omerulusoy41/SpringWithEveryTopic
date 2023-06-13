package com.example.demo.service;

import com.example.demo.entity.Kisi;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KisiRepo extends ElasticsearchRepository <Kisi,String> {
}
