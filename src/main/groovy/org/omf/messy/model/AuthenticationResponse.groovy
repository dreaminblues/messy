package org.omf.messy.model

/**
 * Response from Medium authentication response
 */
class AuthenticationResponse {

    private String token_type
    private String access_token
    private String refresh_token
    private String[] scope
    private int expires_at

    String getToken_type() {
        return token_type
    }

    void setToken_type(String token_type) {
        this.token_type = token_type
    }

    String getAccess_token() {
        return access_token
    }

    void setAccess_token(String access_token) {
        this.access_token = access_token
    }

    String getRefresh_token() {
        return refresh_token
    }

    void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token
    }

    String[] getScope() {
        return scope
    }

    void setScope(String[] scope) {
        this.scope = scope
    }

    int getExpires_at() {
        return expires_at
    }

    void setExpires_at(int expire_at) {
        this.expires_at = expire_at
    }
}
