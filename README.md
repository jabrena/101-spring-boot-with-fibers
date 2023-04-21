# 101-spring-boot-with-fibers
A review about how to use Spring Boot with Virtual Threads, Structural Concurrency &amp; Scope Values (JEP 444, JEP 437 &amp; JEP 446)

## How to build in local?

```
sdk env install
mvn spring-boot:run
mvn spring-boot:run -Dspring-boot.run.profiles=loom
```

## References

- https://www.oracle.com/java/technologies/java-se-support-roadmap.html
- https://openjdk.org/jeps/0
- https://openjdk.org/jeps/444
- https://openjdk.org/jeps/428
- https://openjdk.org/jeps/446
- https://start.spring.io/
- https://spring.io/blog/2022/10/11/embracing-virtual-threads
- https://spring.io/blog/2023/02/27/web-applications-and-project-loom