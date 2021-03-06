package com.example.demo.DAO;

import com.example.demo.Entity.Seller;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SellerMapper {
    List<Seller> selectSeller(String seller_id);
    void insertSeller(String sID, String password, String name,
                      String phone, String address);
}
