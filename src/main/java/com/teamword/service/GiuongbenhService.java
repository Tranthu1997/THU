package com.teamword.service;

import com.teamword.model.Giuongbenh;
import com.teamword.repository.GiuongBenhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

@Service("giuongbenhService")
public class GiuongbenhService {

   @Autowired
     private GiuongBenhRepository giuongBenhRepository;

    @Transactional
    public List<Giuongbenh> list_sv_id (int i){
        return (List<Giuongbenh>) giuongBenhRepository.findById(i);
    }

    @Transactional
    public List<Giuongbenh> list_sv (){
        return (List<Giuongbenh>) giuongBenhRepository.findAll();
    }

    @Transactional
    public List<Giuongbenh> list_name(String str){
        return (List<Giuongbenh>) giuongBenhRepository.findByName(str);
    }

    @Transactional
    public Giuongbenh get_giuongbenhId(int id){
        Giuongbenh gb = new Giuongbenh();
        gb = giuongBenhRepository.getById(id);
        return gb;
    }

    //
    @Transactional
    public List getAll_Giuongbenh() {
        List countries=new ArrayList();
        Iterable giuongbenhIterable= giuongBenhRepository.findAll();
        Iterator giuongbenhIterator=giuongbenhIterable.iterator();
        while(giuongbenhIterator.hasNext())
        {
            countries.add(giuongbenhIterator.next());
        }
        return countries;
    }

    @Transactional
    public Giuongbenh get_Giuongbenh(int id) {
        return giuongBenhRepository.findOne(id);
    }


    @Transactional
    public void add_Giuongbenh(Giuongbenh gb){
        giuongBenhRepository.save(gb);

    }
    @Transactional
    public void update_Giuongbenh(Giuongbenh gb){
        giuongBenhRepository.save(gb);

    }
    @Transactional
    public void delete_Giuongbenh(int id){
        giuongBenhRepository.delete(id);
    }
}
