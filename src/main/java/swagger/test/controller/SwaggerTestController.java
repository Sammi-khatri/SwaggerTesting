package swagger.test.controller;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class SwaggerTestController {

    @GetMapping("/getById/{id}")
    public String findById(@PathVariable("id") int id) {
        return "success";
    }

    @GetMapping("/getAll")
    public List<String> getAll() {
        List<String> response = new ArrayList<>();
        response.add("safds");
        response.add("sad");
        response.add("fre");
        return response;
    }

    @PostMapping("/createPass")
    public PassPojo createPass(@RequestBody PassPojo passPojo) {
        return passPojo;
    }


}
