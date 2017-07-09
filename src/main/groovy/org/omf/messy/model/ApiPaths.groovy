package org.omf.messy.model
/**
 * API paths stored here.
 */
enum ApiPaths {

    /**
     * client_id - The clientId Medium will supply that identifies the integration.
     * state - Arbitrary text of our choosing, which Medium will repeat back to us to help us prevent request forgery.
     * request_uri - The URL where Medium will send the user after they have completed the login dialog.
     * This must exactly match one of the callback URLs we provided when creating our app.
     * This field should be URL encoded.
     */
    GET_AUTHORIZED("https://medium.com/m/oauth/authorize?" +
            "client_id=%s" +
            "&scope=basicProfile,listPublications" +
            "&state=%s" +
            "&response_type=code" +
            "&redirect_uri=%s"),
    GET_AUTHENTICATION_TOKEN_URL_ENCODED_FORM("code=%s&client_id=%s&client_secret=%s&grant_type=authorization_code&redirect_uri=%s"),
    GET_PUBLICATIONS_FOR_USER("https://api.medium.com/v1/users/%s/publications")

    private String url

    ApiPaths(String url){
        this.url = url
    }

    String getUrl(){
        return url
    }


}