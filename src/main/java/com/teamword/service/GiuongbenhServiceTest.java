package com.teamword.service;

import com.teamword.model.Giuongbenh;
import com.teamword.repository.GiuongBenhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
@Service("giuongbenhServiceTest")

public class GiuongbenhServiceTest {
    @Autowired
    private GiuongBenhRepository giuongBenhRepository;

    @Transactional
    public List<Giuongbenh> list_id (int id){
        return (List<Giuongbenh>) giuongBenhRepository.findById(id);

    }

    @Transactional
    public boolean exist (int id){
      return giuongBenhRepository.exists(id);
    }

    @Transactional
    public void delete (Giuongbenh gb){
        giuongBenhRepository.delete(gb);
    }

    @Transactional
    public Giuongbenh get_Giuongbenh(int id) {
        return giuongBenhRepository.findOne(id);
    }











}
