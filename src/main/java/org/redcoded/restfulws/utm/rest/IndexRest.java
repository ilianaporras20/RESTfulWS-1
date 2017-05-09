package org.redcoded.restfulws.utm.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.redcoded.restfulws.utm.model.Link;
import org.redcoded.restfulws.utm.model.Resource;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

@Controller
public class IndexRest {
	
	@RequestMapping(value = { "", "/" }, 
			method = RequestMethod.GET, 
			produces = { "application/json", "text/json" })
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public Map<String, Object> indexJson() {
		ServletUriComponentsBuilder builder = ServletUriComponentsBuilder.fromCurrentServletMapping();
		List<Link> links = new ArrayList<Link>();
		links.add(new Link(builder.path("/").build().toString(), "self"));
		links.add(new Link(builder.path("/user").build().toString(), "user"));
		Map<String, Object> response = new Hashtable<>(2);
		response.put("_links", links);
		response.put("version", "1");
		return response;
	}
	
	@RequestMapping(value = { "", "/" },
			method = RequestMethod.GET, 
			produces = { "application/xml", "text/xml" })
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public Resource indexXml() {
		ServletUriComponentsBuilder builder = ServletUriComponentsBuilder.fromCurrentServletMapping();
		Resource resource = new Resource();
		resource.addLink(new Link(builder.path("/").build().toString(), "self"));
		resource.addLink(new Link(builder.path("/user").build().toString(), "user"));
		return resource;
	}
}