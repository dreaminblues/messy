package org.omf.messy.util

import com.google.api.client.http.HttpHeaders
import org.omf.messy.model.Headers

/**
 *
 */
class HttpHeaderUtility {

    static HttpHeaders constructHttpHeader(Headers headers) {
        HttpHeaders httpHeaders = new HttpHeaders()
        httpHeaders.setBasicAuthentication(headers?.getUsername(), headers?.getPassword())
        httpHeaders.setAccept(headers?.getAccept())
        httpHeaders.setContentType(headers?.getContentType())

        return httpHeaders
    }
}
