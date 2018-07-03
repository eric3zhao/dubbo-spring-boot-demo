#!/bin/bash
DIR=`pwd`
cd `dirname $0`
cd ../libs
LIB_DIR=`pwd`
cd ../config
RES_DIR=`pwd`

SERVER_CLASS='com.azi.demo.service.bootstrap.DemoProvider'
SERVER_NAME='demo-server'


PIDS=`ps -ef | grep java | grep "${SERVER_NAME}" | grep ${SERVER_CLASS} | awk '{print $2}'`
if [ -n "$PIDS" ]; then
    echo "start failed, the $SERVER_CLASS already started!"
    exit 1
fi

LIB_JARS=`ls ${LIB_DIR} | grep .jar | awk '{print "'${LIB_DIR}'/"$0}' | tr "\n" ":"`
CLASS_PATH=${LIB_JARS}${RES_DIR}
cd ..
nohup java -Dname=${SERVER_NAME} -classpath ${CLASS_PATH} ${SERVER_CLASS} > logs/server.log 2>&1 &

echo "start "${SERVER_CLASS}" success!"
cd ${DIR}