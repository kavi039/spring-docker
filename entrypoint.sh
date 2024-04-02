#!/bin/bash

mkdir -p /myapp/logs
exec > /myapp/logs/application.log 2>&1
exec "$@"
