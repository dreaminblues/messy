package org.omf.messy.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Primary controller for the messy bot.
 */
@RestController
class BotController {

    private final static UPDATE_URL = ""
    private final static USERNAME = ""
    private final static PASSWORD = ""

    @RequestMapping(path = "/update", method = RequestMethod.GET)
    String getUpdate() {


        return "Test"
    }

    @RequestMapping(path="/notify",method=RequestMethod.PUT)
    String sendNotification(){


        return "Test"
    }


}
