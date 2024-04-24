package com.ecommerce.dao;

import com.ecommerce.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface EcommerceDao extends JpaRepository <Item,Integer>{


}
