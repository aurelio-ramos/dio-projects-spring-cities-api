# Usando o Docker

## comando para criar pelo terminal
```
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
```

```
#usar o client do postgres para popular as tabelas
 docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

docker exec -it cities-db /bin/bash

psql -U postgres_user_city cities
```