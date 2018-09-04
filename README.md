## Home Family API

Spring boot and PostgresSQL with Docker


# Wiki

``` bash 
# Download and build container - specify parameter for build one container
$ docker-compose build ${name}
# Start Container - -d no show terminal (background)
$ docker-compose up ${name}
# Open terminal in container
$ docker-compose exec ${name} bash 
# Delete container
$ docker-compose rm ${name}
```