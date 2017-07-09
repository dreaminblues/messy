package org.omf.messy.sender

import com.google.api.client.http.HttpRequest
import com.google.api.client.http.HttpResponse
import org.omf.messy.model.ApiPaths
import org.omf.messy.util.HttpRequestUtility
import org.springframework.web.bind.annotation.RequestMethod

/**
 *
 */
class MediumSender {

    private final static String CLIENT_ID = "" // need this from RYM
    private final static String STATE = "SUPER_COOL_STATE" // some arbitrary string
    private final static String REDIRECT_URI = "https://something.something.something.com/update" // this should call our api

    static HttpResponse sendForAuth(){
        HttpRequest httpRequest = HttpRequestUtility.constructHttpRequest(RequestMethod.GET.toString(),
                String.format(ApiPaths.GET_AUTHORIZED.getUrl(), CLIENT_ID, STATE, REDIRECT_URI))
        return httpRequest.execute()
    }
}
