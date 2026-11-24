package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
class ContainerIT {

    @Container
    private static final GenericContainer<?> CONTAINER =
            new GenericContainer<>("alpine:3.20").withCommand("sleep", "30");

    @Test
    void containerDeveSubir() {
        assertTrue(CONTAINER.isRunning());
    }
}