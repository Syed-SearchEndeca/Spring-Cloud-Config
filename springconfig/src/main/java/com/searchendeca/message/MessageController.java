package com.searchendeca.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

	@Autowired
	private GlobalProperties global;

    @GetMapping("/message")
    public String getMessage() {
        return global.getGreetmsg();
    }
    
    @GetMapping("/employee/message/{id}")
    public String getEmployeeMessage(@PathVariable String id) {
        return id+":"+global.getGreetmsg();
    }
}
