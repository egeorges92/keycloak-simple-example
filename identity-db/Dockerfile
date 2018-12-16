FROM postgres:10.5

HEALTHCHECK CMD pg_isready -d $POSTGRES_DB -h localhost -p 5432 -q -U $POSTGRES_USER || exit 1