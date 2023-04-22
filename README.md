# 101-spring-boot-with-fibers
A review about how to use Spring Boot with Virtual Threads, Structural Concurrency &amp; Scope Values (JEP 444, JEP 437 &amp; JEP 446)

## Requirements

Visit the section about [Requirements](./docs/requirements/README.md) for further information.

## How to build in local?

```
sdk env install
mvn spring-boot:run
mvn spring-boot:run -Dspring-boot.run.profiles=loom
http://localhost:8080/swagger-ui/index.html

time curl -X 'GET' \
  'http://localhost:8080/api/v1/req1?latency=1' \
  -H 'accept: application/json'

#docker
./docker-build.sh
docker images
docker run -e "SPRING_PROFILES_ACTIVE=loom" docker.io/jab/service:0.1.0-SNAPSHOT
docker compose up -d
docker stats
docker compose logs service-loom
docker compose logs service-default
docker compose down
```

## References

- https://www.oracle.com/java/technologies/java-se-support-roadmap.html
- https://openjdk.org/jeps/0
- https://openjdk.org/jeps/444
- https://openjdk.org/jeps/428
- https://openjdk.org/jeps/446
- https://hub.docker.com/_/openjdk
- https://start.spring.io/
- https://spring.io/blog/2022/10/11/embracing-virtual-threads
- https://spring.io/blog/2023/02/27/web-applications-and-project-loom
- https://paluch.biz/blog/182-experimenting-with-project-loom-eap-and-spring-webmvc.html