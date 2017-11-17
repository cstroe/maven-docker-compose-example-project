package com.github.cstroe.example;

import com.sun.net.httpserver.HttpServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = LogManager.getLogger("Main");

        int port = 8080;
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(port), 0);
        httpServer.createContext("/", new IndexHandler());
        httpServer.setExecutor(null);

        logger.info("Starting HttpServer on port: {}", port);
        logger.info("Access the server via: http://localhost:{}", port);
        httpServer.start();
    }
}
