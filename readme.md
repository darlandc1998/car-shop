# Car shop

This application is responsible for creating a car selling environment working with hexagonal architecture

# Backend

The backend was developed in Java Spring-boot

## Development environment

Execute a **postgresql** and **mongodb** services through docker-compose.yml into the project.

#### Create new postgreSQL database manually

Case the init.db scripts were not executed you can create new database and user on postgresql container by following the command below:

1 - Connect to postgresql docker container:

``docker exec -it postgres bash``

2 - Connect to a PostgreSQL Database Server:

``psql -h localhost -U postgres``

3 - Execute the command for creating a new database:

``CREATE DATABASE car_shop;``

#### Create new mongoDB database manually

Case the init.db scripts were not executed you can create new database and user on mongodb container by following the command below:

1 - Connect to mongodb docker container: 

``docker exec -it mongo mongosh``

2 - Create database with command: 

``use car_shop``;

3 - Create user of according the database:

```
db.createUser(
    {
        user: "mongodb",
        pwd: "admin",
        roles: [
            {
                role: "readWrite",
                db: "car_shop"
            }
        ]
    }
);
```

## Production enviroment

Following this steps for running the application

1º - Pull of the docker image: 

``docker pull user_name/car-shop:tagname``

2º - Create a file with the environment variables based on **application.properties**

3º - Run the image: 

``docker run -p 8080:8080 --env-file /home/user/Downloads/car_shop_env_variables.txt (or your file path) user_name/car-shop:tagname``

