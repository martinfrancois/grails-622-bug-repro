package com.example
import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration

import geb.spock.*

/**
 * See https://www.gebish.org/manual/current/ for more instructions
 */
@Integration
@Rollback
class DemoSpec extends GebSpec {

    void "test something"() {
        when:"The home page is visited"
            go '/'
        Thread.sleep(500000)
        then:"The title is correct"
            title == "Welcome to Grails"
    }

}
