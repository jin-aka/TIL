package com.ncp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;

import com.ncp.restapi.naverApi;

@SpringBootTest
class PAPAGOTest {
	
	@Autowired
	naverApi naverapi;
	
	@Test
	void contextLoads() {
		String txt = "잘자";
		naverapi.papago(txt);
		
	}	
}
