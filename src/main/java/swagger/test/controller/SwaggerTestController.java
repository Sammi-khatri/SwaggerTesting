package swagger.test.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SwaggerTestController {

    @GetMapping("/getById/{id}")
    @ApiOperation(value="Here we can get the details by id",notes="You can pass the id and get the details via id"
            ,response = String.class,httpMethod = "GET")
    public String findById(@PathVariable("id") int id) {
        return "success";
    }

    @GetMapping("/getAll")
    @ApiOperation(value="Here we can get all the data",notes="You can get all details as list"
            ,response = ArrayList.class,httpMethod = "GET")
    public List<String> getAll() {
        List<String> response = new ArrayList<>();
        response.add("safds");
        response.add("sad");
        response.add("fre");
        return response;
    }

    @PostMapping("/createPass")
    @ApiOperation(value="Here we create Pass",notes="You can provide the pass details to create the pass"
            ,response = PassPojo.class,httpMethod = "POST")
    public PassPojo createPass(@RequestBody PassPojo passPojo) {
        return passPojo;
    }


}
