package org.omf.messy.model

/**
 *
 */
class Headers {

    private String username
    private String password
    private String accept
    private String contentType

    String getUsername() {
        return username
    }

    String getPassword() {
        return password
    }

    String getAccept() {
        return accept
    }

    String getContentType() {
        return contentType
    }

    Headers withUsername(final String username){
        this.username = username
        return this
    }

    Headers withPassword(final String password){
        this.password = password
        return this
    }

    Headers withAccpet(final String accept){
        this.accept = accept
        return this
    }

    Headers withContentType(final String contentType){
        this.contentType = contentType
        return this
    }
}
