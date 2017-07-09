package org.omf.messy.controller

import com.google.api.client.http.HttpHeaders
import com.google.api.client.http.HttpMethods
import com.google.api.client.http.HttpRequest
import org.omf.messy.model.Headers
import static org.omf.messy.util.HttpHeaderUtility.constructHttpHeader

import static org.omf.messy.util.HttpRequestUtility.constructHttpRequest
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
    String update() {
        HttpHeaders httpHeaders = constructHttpHeader(new Headers().withAccpet("")
                .withContentType("").withUsername(USERNAME).withPassword(PASSWORD))
        HttpRequest httpRequest = constructHttpRequest(HttpMethods.GET, UPDATE_URL)
        httpRequest.setHeaders(httpHeaders)

        return "Test"
    }


}
