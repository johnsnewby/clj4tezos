#!/bin/bash

for FILE in `find ej4tezos -name \*javadoc\*.jar`; do
    BASENAME=`basename $FILE`
    LIBNAME=`echo $BASENAME | awk -F'-1' '{print $1}'`
    mkdir -p javadoc/$LIBNAME
    cd javadoc/$LIBNAME
    jar xf ../../$FILE
    cd ../..
done
