#!/bin/bash
set -ex
rm -rf $JENKINS_HOME/plugins/jshint-checkstyle*
cp target/*.hpi $JENKINS_HOME/plugins/
