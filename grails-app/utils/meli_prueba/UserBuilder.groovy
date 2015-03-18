package meli_prueba

/**
 * Created by administraor on 17/03/15.
 */
 class UserBuilder {

   def static User build(jsonData){
        def user = new User()
        println jsonData.identification.type + jsonData.identification.number
        user.setFirstName(jsonData.first_name)
        user.setNickName(jsonData.nickname)
        user.setLastName(jsonData.last_name)
        user.setIdentificationType(jsonData.identification.type)
        user.setIdentificationNumber(jsonData.identification.number)
        return user;
    }
}
