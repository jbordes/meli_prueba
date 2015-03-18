class UrlMappings {

	static mappings = {
/*
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
*/

        "/"(view:"/meliLogin")

        "/authenticate"(controller: 'meliAuthorization'){action = [GET: 'authenticate']}
        "/authorize"(controller: 'meliAuthorization'){action = [GET: 'authorize']}
        "/register"(controller: 'meliAuthorization'){action = [GET: 'register']}
        "500"(view:'/error')

	}
}
