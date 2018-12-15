# keycloak-simple-example

Inspired by the article and the code from :

- https://blog.ineat-conseil.fr/2017/11/securisez-vos-apis-spring-avec-keycloak-1-installation-de-keycloak/
- https://www.callicoder.com/spring-boot-jpa-hibernate-postgresql-restful-crud-api-example/

Update .env file with the docker host IP:
HOST_IP=192.168.99.100

Add to your hosts file :
192.168.99.100      identity.example.org
192.168.99.100      www.example.org
192.168.99.100      api.example.org

Launch the application :
go to the project directory and launch :
```sh
docker-compose up -d
```

Connect to the application : http://www.example.org

Connect to the Keycloak admin console : http://identity.example.org


## default users

- user : 'jean.de-la-fontaine'
- admin : 'nicolas.fouquet'

Password: 'password'
