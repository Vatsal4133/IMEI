/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eIMEI.IMEchecker.comtroller;
/**
 *
 * @author vbhat
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eIMEI.IMEchecker.ImEcheckerApplication;
import com.eIMEI.IMEchecker.front.front;
@RestController
public class Controller {
    @GetMapping("/home")
    public void home(){
        front c = new front();
        c.setVisible(true);
    }
}
