package com.eIMEI.IMEchecker;

import com.eIMEI.IMEchecker.comtroller.Controller;
import com.eIMEI.IMEchecker.front.front;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImEcheckerApplication {

	public static void main(String[] args) {
            front c = new front();
                c.setVisible(true);
		SpringApplication.run(ImEcheckerApplication.class, args);
                
	}

}
