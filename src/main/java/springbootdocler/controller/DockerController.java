package springbootdocler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getData")
public class DockerController {

	@GetMapping("/getDummy")
	public String getDockerDummyMessage() {
		return "## Welcome to Docker Application + get commit";

	}

}
