package com.teamword.controller;


import com.teamword.dao.Giuongbenhlmpl;
import com.teamword.model.Giuongbenh;
import com.teamword.service.GiuongbenhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GiuongbenhControllerNew {

    @Autowired
    public GiuongbenhService giuongbenhService;

    @Autowired
    private Giuongbenhlmpl gbDao;

    @RequestMapping(value ="giuongbenh/list")
    public ModelAndView list_servic(){
        ModelAndView mav = new ModelAndView("giuongbenh/list");
        List<Giuongbenh> dsGiuongbenh = giuongbenhService.list_sv();
        mav.addObject("listResult",dsGiuongbenh);
        return mav;
    }


    @RequestMapping(value = "giuongbenh/addnew")
    public  ModelAndView addnew_sv(@ModelAttribute("gb") Giuongbenh gb){
        ModelAndView mav = new ModelAndView("giuongbenh/edit");
        return mav;
    }

    @RequestMapping(value = "giuongbenh/editform")
    public ModelAndView edit (@ModelAttribute("gb") Giuongbenh gb){
        ModelAndView  mav = new ModelAndView("giuongbenh/edit");
        gb = gbDao.get(gb.getId());
        mav.addObject("gb",gb);
        return mav;
    }

    @RequestMapping(value = "giuongbenh/CreateOrEdit", method = RequestMethod.GET)
    public ModelAndView saveGiuongBenh(@ModelAttribute("gb") Giuongbenh gb ){
        ModelAndView mav = new ModelAndView("redirect:list");
        if (gb.getId() != 0){
            gbDao.update(gb);
        }
        else{
            gbDao.create(gb);
        }
        return mav;
    }

    @RequestMapping(value = "giuongbenh/delete")
    public  ModelAndView deleteGiuongbenh(@RequestParam int id){
        ModelAndView mav = new ModelAndView("redirect:list");
        if (id != 0){
            gbDao.delete(id);

        }

        return mav;
    }


    //transactional
    /*

    @RequestMapping(value ="giuongbenh/list")
    public ModelAndView list_servic(){
        ModelAndView mav = new ModelAndView("giuongbenh/list");
        List<Giuongbenh> dsGiuongbenh = giuongbenhService.list_sv();
        mav.addObject("listResult",dsGiuongbenh);
        return mav;
    }

    @RequestMapping(value = "/add-giuongbenh", method = RequestMethod.POST,headers = "Accept=application/jon")
    public String add_Giuongbenh(@ModelAttribute("giuongbenh") Giuongbenh gb){
        if(gb.getId()==0){
            giuongbenhService.add_Giuongbenh(gb);
        }else {
            giuongbenhService.update_Giuongbenh(gb);
        }
        return "redirect:giuongbenh/list";
        }


     @RequestMapping(value ="/update-giuongbenh/{id}",method = RequestMethod.GET,headers = "Accept=application/jon")
    public String update_Giuongbenh(@PathVariable("id")int id , Model model){
        model.addAttribute("giuongbenh",this.giuongbenhService.get_Giuongbenh(id));
        model.addAttribute("listOfGiuongbenh",this.giuongbenhService.getAll_Giuongbenh());
        return "giuongbenhDetails";
     }

    @RequestMapping(value = "/delete-giuongbenh/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public String delete_Giuongbenh(@PathVariable("id") int id) {
        giuongbenhService.delete_Giuongbenh(id);
        return "redirect:/getAllCountries";

    }

     */

}
