package helloworld

import grails.converters.JSON
import grails.gorm.transactions.Transactional
import grails.plugin.jms.JmsService

@Transactional
class SubmissionService {

    JmsService jmsService

    String exampleQueueName = "example"

    def sendData(Map data) {
        String json = (data as JSON).toString(true)
        jmsService.send(queue: exampleQueueName, json)
    }
}
