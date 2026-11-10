#!/bin/bash
set -e
mkdir -p /home/ec2-user/app

echo "Running before_install.sh script"

aws s3 cp s3://aws-devops-professional-use1-096938402899/java-cicd-main/target/app.jar /home/ec2-user/app/app.jar

echo "Downloaded app.jar from S3"