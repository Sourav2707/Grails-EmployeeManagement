package com.bridgelabz


/**
 * Controllers: Create controllers that handle user requests and perform appropriate actions.
 * Controllers define action methods corresponding to different URLs and HTTP methods.

 */

class EmployeeController {
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    def index() {
        def employees = Employee.list()
        [employees: employees]
    }

    def create() {
        [employeeInstance: new Employee(params)]
    }

    def save() {
        def employeeInstance = new Employee(params)
        if (employeeInstance.save()) {
            redirect(action: "index")
        } else {
            render(view: "create", model: [employeeInstance: employeeInstance])
        }
    }

    def edit(Long id) {
        def employeeInstance = Employee.get(id)
        [employeeInstance: employeeInstance]
    }

    def update() {
        def employeeInstance = Employee.get(params.id)
        employeeInstance.properties = params
        if (employeeInstance.save()) {
            redirect(action: "index")
        } else {
            render(view: "edit", model: [employeeInstance: employeeInstance])
        }
    }

    def delete(Long id) {
        def employeeInstance = Employee.get(id)
        employeeInstance.delete()
        redirect(action: "index")
    }
}
