package meli_prueba

class User {

    static constraints = {
    }

    def private nickName
    def private firstName
    def private lastName

    def private identificationNumber
    def private identificationType

    def User(){

    }

    def User(nickName, firstName, lastName, identificationType, identificationNumber){
        this.nickName = nickName
        this.firstName = firstName
        this.lastName = lastName
        this.identificationType = identificationType
        this.identificationNumber = identificationNumber
    }

    def getNickName() {
        return nickName
    }

    void setNickName(nickName) {
        this.nickName = nickName
    }

    def getFirstName() {
        return firstName
    }

    void setFirstName(firstName) {
        this.firstName = firstName
    }

    def getLastName() {
        return lastName
    }

    void setLastName(lastName) {
        this.lastName = lastName
    }

    def getIdentificationNumber() {
        return identificationNumber
    }

    void setIdentificationNumber(identificationNumber) {
        this.identificationNumber = identificationNumber
    }

    def getIdentificationType() {
        return identificationType
    }

    void setIdentificationType(identificationType) {
        this.identificationType = identificationType
    }
}
