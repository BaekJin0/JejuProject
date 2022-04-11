package site.metacoding.project.map;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

import site.metacoding.batch.DBInitializer.java;

@RequiredArgsConstructor
@Controller
public class MapController {

    private final Repository repository;

    @GetMapping("/loading")
    public @ResponseBody List<List<String>> load() {

        List<Item> list = repository.findAll();
        PointDto pointDto = new PointDto();

        List<List<String>> points = pointDto.toPoint(list);

        return points;

    }
}