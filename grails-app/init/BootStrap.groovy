import AWSAccesserClasses.DynamoHandler

class BootStrap {

    def init = { servletContext ->
        DynamoHandler dh = new DynamoHandler();

    }
    def destroy = {
    }
}
