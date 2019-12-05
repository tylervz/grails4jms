// Place your Spring DSL code here
beans = {

    // https://github.com/gpc/jms/issues/21
    //
    // Grails JMS plugin looks for jsmConnectionFactory Bean for its templates
    // https://github.com/gpc/jms/blob/2.0.x/src/main/groovy/grails/plugin/jms/bean/DefaultJmsBeans.groovy
    //
    // SpringBoot started to use different namings for different config setup,
    // so one to get over from it is to use Bean aliases

    // when spring.activemq.pool.enabled=true then SpringBoot will create 'pooledJmsConnectionFactory'
    springConfig.addAlias('jmsConnectionFactory', 'pooledJmsConnectionFactory')

    // when spring.jms.cache.enabled=true then SpringBoot will create 'cachingJmsConnectionFactory'
    // This is SpringBoot DEFAULT behaviour
    // springConfig.addAlias('jmsConnectionFactory', 'cachingJmsConnectionFactory')

}
