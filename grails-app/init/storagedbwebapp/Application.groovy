package storagedbwebapp

import com.amazonaws.auth.AWSCredentialsProvider
import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {

        GrailsApp.run(Application)
    }
}