FROM jboss/keycloak:4.5.0.Final

HEALTHCHECK CMD curl --fail --silent http://localhost:8080/auth/realms/master || exit 1