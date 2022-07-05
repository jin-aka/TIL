package com.ncp.restapi;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

import org.springframework.stereotype.Component;

@Component
public class kakaoApi {

	public String kakaolocalapi(String keyword) throws Exception {
		String address = "https://dapi.kakao.com/v2/local/search/keyword.JSON";
		
        String param = "query=" + keyword
                //+ "&category_group_code=" + "FD6"
                + "&x=" + "37.5606326"
                + "&y=" + "126.9433486"
                + "&radius=" + "1000";
                
        String apiKey = "07d8cd56ad7c161bebc76b19a5edc158";	//발급받은 restapi key
		
		
		
		URL url = new URL(address);  			//접속할 url 설정
		HttpURLConnection conn;					//httpURLConnection 객체
		conn = (HttpURLConnection) url.openConnection();	//접속할 url과 네트워크 커넥션을 연다.
		conn.setRequestMethod("POST");             
		conn.setDoOutput(true);
        conn.setUseCaches(false);
		conn.setRequestProperty("Authorization", "KakaoAK " + apiKey);	//Property 설정

		OutputStreamWriter ds = new OutputStreamWriter(conn.getOutputStream());
		ds.write(param);
		ds.flush();
		ds.close();
		
		
		int responseCode = conn.getResponseCode();		//responseCode를 받아옴.
	
		InputStream inputStream = conn.getInputStream();	//데이터를 받아오기 위한 inputStream
		BufferedReader br;		//inputStream으로 들어오는 데이터를 읽기 위한 reader
		String json = null;
		Charset charset = Charset.forName("UTF-8");
		if(responseCode == 200) {
			br = new BufferedReader(new InputStreamReader(inputStream,charset));
			json = br.readLine();
			br.close();
		}
		else {
			System.out.println(" ERROR !!! ");
		}
	
		inputStream.close();
		conn.disconnect();

		return json;		
	}
	
}
