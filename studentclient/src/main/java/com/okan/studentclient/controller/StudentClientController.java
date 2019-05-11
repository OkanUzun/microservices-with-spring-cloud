package com.okan.studentclient.controller;

import com.okan.studentclient.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Okan UZUN
 * @date 2019-05-11
 */
@Controller
public class StudentClientController {

    private final DiscoveryClient discoveryClient;

    @Autowired
    public StudentClientController(final DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/")
    public String handleRequest(final Model model) {

        final List<ServiceInstance> instances = discoveryClient.getInstances("Student-Service");
        if (instances != null && !instances.isEmpty()) {
            final ServiceInstance serviceInstance = instances.get(0);
            String url = serviceInstance.getUri().toString();
            url = url + "/list";
            final RestTemplate restTemplate = new RestTemplate();
            final List<Student> result = restTemplate.getForObject(url, List.class);

            model.addAttribute("result", result);
        }

        return "student";
    }
}
