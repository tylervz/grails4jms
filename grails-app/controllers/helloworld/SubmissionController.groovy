package helloworld

import grails.converters.JSON

class SubmissionController {

    SubmissionService submissionService

    def send(String text) {
        Map data = [message: text]
        submissionService.sendData(data)
        // Render the data as JSON that we just sent to an ActiveMQ queue
        render(data as JSON)
    }
}
