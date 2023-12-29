# Car shop

This application is responsible for creating a car selling environment


# Backend

The backend was developed in Java Spring-boot

## Development environment

Execute a **postgresql** and **mongodb** services through docker-compose.yml into the project.

## Production enviroment

Following this steps for running the application
1º - Pull of the docker image: `docker pull darlandc1998/car-shop:tagname`
2º - Create a file with the environment variables based on **application.properties**
2º - Run the image: `docker run -p 8080:8080 --env-file /home/user/Downloads/car_shop_env_variables.txt (or your file path) darlandc1998/car-shop`

