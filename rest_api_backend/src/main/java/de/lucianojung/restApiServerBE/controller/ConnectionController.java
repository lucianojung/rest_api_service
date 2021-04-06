package de.lucianojung.restApiServerBE.controller;

import de.lucianojung.restApiServerBE.model.Connection;
import de.lucianojung.restApiServerBE.model.ConnectionCategoryEnum;
import de.lucianojung.restApiServerBE.model.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ConnectionController {

    private final List<Connection> connections = Arrays.asList(
            new Connection("Personal Homepage", "https://lucianojung.de", ConnectionCategoryEnum.WEBSITE),
            new Connection("LinkedIn", "https://linkedin.lucianojung.de/", ConnectionCategoryEnum.SOCIALMEDIA),
            new Connection("XING", "https://xing.lucianojung.de/", ConnectionCategoryEnum.SOCIALMEDIA),
            new Connection("Github", "https://github.com/lucianojung", ConnectionCategoryEnum.SOCIALMEDIA),
            new Connection("Random Generator App Website", "https://random-app.lucianojung.de/", ConnectionCategoryEnum.WEBSITE),
            new Connection("Api Website", "https://api.lucianojung.de", ConnectionCategoryEnum.WEBSITE),
            new Connection("Random Generator App", "https://play.google.com/store/apps/details?id=de.lucianojung.random_chooser", ConnectionCategoryEnum.PROJECT),
            new Connection("Dev.to", "https://dev.to/lucianojung", ConnectionCategoryEnum.SOCIALMEDIA),
            new Connection("Personal Public Mail", "mailto:LucianoJ@posteo.de", ConnectionCategoryEnum.MAIL),
            new Connection("IWiGA Website", "https://iwiga.lucianojung.de", ConnectionCategoryEnum.PROJECT),
            new Connection("Space Invader Project", "https://github.com/lucianojung/SpaceInvadeUs", ConnectionCategoryEnum.PROJECT)
            );

    @GetMapping("/connections")
    public List<Connection> connections() {
        return connections;
    }

    @RequestMapping(value="connections/{category}", method= RequestMethod.GET)
    public List<Connection> connectionsFiltered(@PathVariable String category) {
        return connections.stream().filter(c -> c.getCategory().name.equals(category)).collect(Collectors.toList());
    }
}
