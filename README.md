# Spring-Cloud-Configuration
Spring Cloud Configuration

Quick Start
This quick start walks through using both the server and the client of Spring Cloud Config Server.

<b>First Setup Git URL for cloud configuration:</b><br>
Update git url in `/spring-server-config/src/main/resources/application.properties`
<br>
`spring.cloud.config.server.git.uri={provide valid git url}`
<br><br>
1) `git init`
2) `vim spring-cloud-centralize-messages.properties`
    <br><br>
    Press I to conver in insert mode and add following key pair
    <br>
3) `message=Hello It's Cloud Configuration`
4) `git add spring-cloud-centralize-messages.properties`
5) `git commit -m 'My First Commit'`
<br><br>
<b>Second, start the server, as follows:</b>
<br><br>
$ `cd spring-server-config`
$ `mvn spring-boot:run`
<br><br>
It will start cloud server with url: `http://localhost:8888`
<br><br>
<b>Third, start the client, as follows:</b>
<br><br>
$ `cd spring-client-config`
<br>
$ `mvn spring-boot:run`
<br><br>
It will start cloud client with url: `http://localhost:8889`
<br><br>
<b>Try Now:</b>
<br><br>
Visit URL : `http://localhost:8889/message`
<br>
It will show the result <b>Hello It's Cloud Configuration</b>
<br><br>
Now update the centralized properties file and commit as follows:
<br><br>
1) `git init`<br>
2) `vim spring-cloud-centralize-messages.properties`
    <br>
    Press I to conver in insert mode and update following key pair
    <br>
3) `message=Hello It's Spring Cloud Configuration`<br>
4) `it add spring-cloud-centralize-messages.properties`<br>
5) `git commit -m 'My Second Commit'`<br>
<br><br>
Visit URL again : `http://localhost:8889/message`
It will show the result <b>Hello It's Spring Cloud Configuration</b>
