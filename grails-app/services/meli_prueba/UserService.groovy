package meli_prueba

import com.ning.http.client.FluentStringsMap
import grails.converters.JSON
import grails.transaction.Transactional

@Transactional
class UserService {

    def meliJavaSDKService
    def user

    def User register() {
        FluentStringsMap params = new FluentStringsMap();
        params.add("access_token", meliJavaSDKService.getMeli().getAccessToken());
        def response = meliJavaSDKService.getMeli().get("/users/me", params);
        def data = response.getResponseBody()
        def jsonData = JSON.parse(data)
        return UserBuilder.build(jsonData)
    }

    def get(property) {
        FluentStringsMap params = new FluentStringsMap();
        println(meliJavaSDKService)
        params.add("access_token", meliJavaSDKService.getMeli().getAccessToken());

        def response = meliJavaSDKService.getMeli().get("/users/me", params);
        def data = response.getResponseBody()
        def jsonData = JSON.parse(data)
        def builder = new UserBuilder(jsonData)
        user = builder.build()
        return user.getProperty(property)
    }

    def getName() {
        FluentStringsMap params = new FluentStringsMap();
        println(meliJavaSDKService)
        params.add("access_token", meliJavaSDKService.getMeli().getAccessToken());

        def response = meliJavaSDKService.getMeli().get("/users/me", params);
        def data = response.getResponseBody()
        def jsonData = JSON.parse(data)
        def builder = new UserBuilder(jsonData)
        user = builder.build()
        return user.getFirstName() + ' ' + user.getLastName()
    }
}
