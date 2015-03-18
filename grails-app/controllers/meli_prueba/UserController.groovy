package meli_prueba

class UserController {

    def userService

    def sayHello() {
        render 'Hello ' + userService.get('firstName') + ' ' + userService.get('lastName')
    }
}
