open module pbouda.prometheus.app {
    requires spring.web;
    requires spring.context;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.boot.actuator.autoconfigure;
    requires micrometer.core;
    requires java.sql;
}