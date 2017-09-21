package org.techiehints.restful;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techiehints.pojo.Info;
import com.techiehints.pojo.ResponseBean;

@RestController
@RequestMapping(value = "ws/rest")
public class JSONService {

	@RequestMapping(value = "get/message.json", produces = MediaType.APPLICATION_JSON_VALUE)
	public Info getJSONResponse () {
		
		Info info = new Info();
		info.setName("Techiehints");
		info.setWebsite("in.techiehints.com");
		return info;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "post/data.json", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBean postJSONRequest (@RequestBody Info info) {
		
		ResponseBean bean = new ResponseBean();
		bean.setMessage("Received Thanks !! ");
		bean.setInfo(info);
		
		return bean;
	}
}
