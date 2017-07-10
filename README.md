# realife-eureka-server
The eureka server for Realife, an application for lifelong learner.

## Deploy

* Default run:
```$ java -jar demo-0.0.1-SNAPSHOT.jar```
* Run with fixed RAM:
```$ java -jar -Xmx256m demo-0.0.1-SNAPSHOT.jar```
* Run on Staging:
```$ java -jar -Dspring.profiles.active=staging demo-0.0.1-SNAPSHOT.jar```
* Run on Production:
```$ java -jar -Dspring.profiles.active=production demo-0.0.1-SNAPSHOT.jar```
