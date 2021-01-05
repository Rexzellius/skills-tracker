package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@ResponseBody
public class SkillsController {

    @GetMapping
    public String listOfSkills() {
        return "<html>" +
                "<body style='background-color:#3eafdf'>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<body>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "favorites")
    public String favoriteSkills(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<html>" +
                "<body style='background-color:#3eafdf'>" +
                "<h2>List of Favorite Languages</h2>" +
                "<h2>" + name + "</h2>" +
                "<body>" +
                "<ol>" +
                "<li><b>" + language1 + "</b></li>" +
                "<li><b>" + language2 + "</b></li>" +
                "<li><b>" + language3 + "</b></li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String formFavSkills() {
        return "<html>" +
                "<body style='background-color:#3eafdf'>" +
                "<form action='favorites' method='POST'>" + //submit a request to base path
                "<br><label>Favorite language:" +
                "<label>Name" +
                "<br><input type='text' name='name'>" +
                "</label>" +
                "<br><select name='language1' id='fav-lang'>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Html'>HTML</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label>" +
                "<br><label>Second Favorite language:" +
                "<br><select name='language2' id='second-lang'>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Html'>HTML</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label>" +
                "<br><label>Third Favorite language:" +
                "<br><select name='language3' id='third-lang'>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Html'>HTML</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label>" +
                "<br><input type='submit' value='Submit!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
