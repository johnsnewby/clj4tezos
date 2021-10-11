#!/bin/bash



for FILE in `find ej4tezos -name \*SNAPSHOT.jar`; do
    BASENAME=`basename $FILE`
    LIBNAME=`echo $BASENAME | awk -F'-1' '{print $1}'`
#    mvn deploy:deploy-file -Dfile=$FILE -DartifactId=$LIBNAME -Dversion=0.8.3 -DgroupId=tezos -Dpackaging=jar -Durl=file:maven_repo

    echo "                 [tezos/$LIBNAME \"0.8.3\"]"

done
