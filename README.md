personal-shopper-server
=======================

Server that implements the RESTful API to write and read information from the database.

Create new services in package com.personalshopper.services
Services will be accessible with URL /rip/yourservicepath
Services should use Guice for injecting DAO's and everything else.

Static HTML to be places in /src/main/webapp
JQueryUI theme files should be downloaded and placed in /src/main/webapp/jqueryui
Jooq files should be generated to: /src/main/jooq/

To test that server is running properly the following pages should be accessible:
/index.html


### Generating JOOQ database api:
mvn compile -P jooqgenerate