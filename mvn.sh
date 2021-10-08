#!/bin/sh
mvn deploy:deploy-file -Dfile=ej4tezos/org/ej4tezos/cgp.sample/1.0.0.0-SNAPSHOT/cgp.sample-1.0.0.0-SNAPSHOT-jar-with-dependencies.jar -DartifactId=cgp.sample -Dversion=0.8.3 -DgroupId=java-se -Dpackaging=jar -Durl=file:maven_repo
mvn deploy:deploy-file -Dfile=./ej4tezos/org/ej4tezos/java-se.model/1.0.0.0-SNAPSHOT/java-se.model-1.0.0.0-SNAPSHOT.jar -DartifactId=java-se.model -Dversion=0.8.3 -DgroupId=java-se -Dpackaging=jar -Durl=file:maven_repo
mvn deploy:deploy-file -Dfile=./ej4tezos/org/ej4tezos/java-se.api/1.0.0.0-SNAPSHOT/java-se.api-1.0.0.0-SNAPSHOT.jar -DartifactId=java-se.api -Dversion=0.8.3 -DgroupId=java-se -Dpackaging=jar -Durl=file:maven_repository
