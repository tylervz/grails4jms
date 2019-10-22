# Grails 4 JMS

This is a Grails 4.0.1 application named HelloWorld that attempts to use the
[Grails JMS plugin](http://plugins.grails.org/plugin/grails/jms).

Currently, the application fails to start because the plugin does not support Grails 4.

The application does not actually send any messages or receive any messages;
it was merely created to demonstrate that startup fails when including the plugin.

## Running the application

Run `docker-compose up` to start ActiveMQ running in a Docker container.
After you're done running the service, you can stop ActiveMQ by running `docker-compose down` in a different terminal.

You can monitor ActiveMQ using the Web Console by pointing your browser to http://localhost:8161/admin/queueGraph.jsp .
The username and password is activemq/activemq .
These credentials are specified in the [docker-compose.yml](/docker-compose.yml) file,
and are referenced in the [application.yml](/grails-app/conf/application.yml) file of the Grails application.

Once you have ActiveMQ running in a Docker container, run the Grails application in IntelliJ or in another terminal with:

    grails run-app
