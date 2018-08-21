# Spring-Cloud-Configuration
Spring Cloud Configuration

Quick Start
This quick start walks through using both the server and the client of Spring Cloud Config Server.

First Setup Git URL for cloud configuration:
`Update git url in /spring-server-config/src/main/resources/application.properties`
`spring.cloud.config.server.git.uri={provide valid git url}`

1) git init
2) vim spring-cloud-centralize-messages.properties
    
    Press I to conver in insert mode
    add following key pair

3) message=Hello It's Cloud Configuration
4) git add spring-cloud-centralize-messages.properties
5) git commit -m 'My First Commit'

Second, start the server, as follows:

$ cd spring-server-config
$ mvn spring-boot:run

It will start cloud server with url: http://localhost:8888

Third, start the client, as follows:

$ cd spring-client-config
$ mvn spring-boot:run

It will start cloud client with url: http://localhost:8889

Try Now:

Visit URL : http://localhost:8889/message
It will show the result "Hello It's Cloud Configuration

Now update the centralized properties file and commit as follows:

1) git init
2) vim spring-cloud-centralize-messages.properties
    
    Press I to conver in insert mode
    update following key pair

3) message=Hello It's Spring Cloud Configuration
4) git add spring-cloud-centralize-messages.properties
5) git commit -m 'My Second Commit'

Visit URL again : http://localhost:8889/message
It will show the result "Hello It's Spring Cloud Configuration
