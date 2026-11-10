#!/bin/bash
set -e

echo "Running start_application.sh script"

# Start the application
nohup java -jar /home/ec2-user/app/app.jar > /home/ec2-user/app/app.log 2>&1 &
echo "Application started"

# Verify that the application is running
ps aux | grep app.jar | grep -v grep
if [ $? -eq 0 ]; then
  echo "Application is running"
else
  echo "Application failed to start"
  exit 1
fi