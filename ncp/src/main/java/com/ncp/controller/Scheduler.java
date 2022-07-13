package com.ncp.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ncp.vo.Msg;

@Component
public class Scheduler {
	@Autowired
	private SimpMessageSendingOperations messagingTemplate;

	
    @Scheduled(cron = "*/15 * * * * *") //15초에 한 번씪
    public void cronJobDailyUpdate() {
    	
    	System.out.println("----------- Scheduler ------------");
    	Msg msg = new Msg();
    	Random r = new Random();
    	int data = r.nextInt(100);
    	int data2 = r.nextInt(100);
    	msg.setContent1("Server Message1:"+data);
    	msg.setContent2("Server Message2:"+data2);
    	messagingTemplate.convertAndSend("/send/serversend", msg); //웹소켓에 /send/ser... 의 이름으로, msg를 전송하라
    }

    @Scheduled(cron = "1 0 0 1,8,15,22 * *")
    public void cronJobWeeklyUpdate(){

    }


}