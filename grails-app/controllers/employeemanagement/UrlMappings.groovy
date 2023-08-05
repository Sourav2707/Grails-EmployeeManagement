package employeemanagement
/**
 * Define URL mappings to map incoming requests to specific controller actions.
 * This is typically done in the urls.groovy file or through annotations in the controllers
 */
class UrlMappings {

    static mappings = {
        "/employee"(controller : "employee") {
            action = [GET:"index", POST: "save"]
        }
        "/employee/create"(controller: "employee", action: "create")
        "/employee/$id/edit"(controller: "employee", action: "edit")
        "/employee/$id/delete"(controller: "employee", action: "delete")
        "/$controller/$action?/$id?(.$format)?"{}
    }
}
