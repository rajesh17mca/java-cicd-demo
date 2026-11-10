#!/bin/bash
set -e

echo "Running after_install.sh script"

# Set permissions for the app directory
chmod -R 755 /home/ec2-user/app
echo "Set permissions for /home/ec2-user/app"

# Verify permissions
ls -l /home/ec2-user/app
