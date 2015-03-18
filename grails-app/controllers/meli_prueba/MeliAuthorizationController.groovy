package meli_prueba

import com.ning.http.client.FluentStringsMap
import grails.converters.JSON

class MeliAuthorizationController {

    def meliJavaSDKService
    def userService
    //static defaultAction = "authenticate"


    def authenticate(){
        redirect url: meliJavaSDKService.authenticate('http://localhost:8080/meli_prueba/authorize')
    }

    def authorize(){
        meliJavaSDKService.authorize(params.code, 'http://localhost:8080/meli_prueba/authorize')
        redirect uri: '/register'
    }

    def register(){
        def user = userService.register()
        session[user.nickName]
    }

    /*def sayHello(){
        if(meliJavaSDKService.isLoggedIn()) {
            render 'Hello ' + meliJavaSDKService.getMeAsJSON().nickname
        } else {
            authenticate()
        }
    }*/
}
