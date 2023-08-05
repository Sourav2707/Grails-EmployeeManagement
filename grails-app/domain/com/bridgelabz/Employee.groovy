package com.bridgelabz
/**
 * Domain Classes: Define the domain classes that represent the data model of your application.
 * These classes typically represent the tables in your database. Add properties to the domain classes to define the fields of the tables.
 */
class Employee {
    String firstName
    String lastName
    String designation
    Integer age

    static constraints = {
        firstName blank: false
        lastName blank: false
        designation nullable: true
        age min: 18
    }
}
