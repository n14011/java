#!/bin/sh

# 各自の環境に合わせて記述
CLASSPATH=~/java.2014/junit-4.10.jar:.

export CLASSPATH
javac  $1
