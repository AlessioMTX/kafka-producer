#!/bin/bash

mvn clean install -DskipTests
docker build -t kafka/producer .
docker run -p 8081:8081 -d kafka/producer