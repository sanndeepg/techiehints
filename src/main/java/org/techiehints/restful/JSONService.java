package org.techiehints.restful;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techiehints.pojo.Info;

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
	
	@RequestMapping(value = "get/message.xml", produces = MediaType.APPLICATION_XML_VALUE)
	public Info getXMLResponse () {
		
		Info info = new Info();
		info.setName("Techiehints");
		info.setWebsite("in.techiehints.com");
		return info;
	}
	
}
