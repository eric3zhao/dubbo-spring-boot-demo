#!/bin/bash
DIR=`pwd`
cd `dirname $0`

SERVER_CLASS='com.azi.demo.service.bootstrap.DemoProvider'
SERVER_NAME='demo-server'

PIDS=`ps -ef | grep java | grep "${SERVER_NAME}" | grep ${SERVER_CLASS} | awk '{print $2}'`
if [ -z "$PIDS" ]; then
    echo "stop failed, the $SERVER_NAME not start!"
    exit 1
fi

for PID in ${PIDS};
do
    kill ${PID} > /dev/null 2>&1
done

echo "stop success! pid:"${PIDS}
cd ${DIR}