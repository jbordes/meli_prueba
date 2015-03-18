package meli_prueba

import com.mercadolibre.sdk.Meli
import com.ning.http.client.FluentStringsMap
import grails.converters.JSON
import grails.transaction.Transactional

@Transactional
class MeliJavaSDKService {

    def final static APP_ID = 4608581284630502L
    def final static SECURE_KEY = 'jIVEaLuEY3Eoqv1zXwQZJGxr0pyVRQZR'
    def private meli = new Meli(APP_ID, SECURE_KEY)

    def authenticate(callback) {
        log.info "AUTHENTICATING..."
        return meli.getAuthUrl(callback)
    }

    def authorize(code, redirectUri) {
        log.info "AUTHORIZING..."
        return meli.authorize(code, redirectUri)
    }

    def getMeAsJSON() {
        FluentStringsMap params = new FluentStringsMap();
        params.add("access_token", meli.getAccessToken());
        def response = meli.get("/users/me", params);
        def data = response.getResponseBody()
        def jsonData = JSON.parse(data)
        return jsonData
    }

    def getMeli() {
        return meli;
    }

    def isLoggedIn() {
        println getMeAsJSON()
        if(meli.getAccessToken() != null)
            return true;
        return false
    }
}
