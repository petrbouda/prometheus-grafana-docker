FROM adoptopenjdk/openjdk11

COPY maven/target/dependency /app/modules
COPY maven/target/*.jar /app/modules
CMD java --module-path app/modules --module pbouda.prometheus.app/pbouda.prometheus.app.Application
