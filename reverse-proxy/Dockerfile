FROM nginx:1.15.7-alpine

LABEL maintainer="Eric GEORGES <eric.georges@businessdecision.com>"

# see https://github.com/staticfloat/docker-nginx-certbot

COPY nginx.conf /etc/nginx/nginx.conf
COPY ssl/ /etc/nginx/ssl/

HEALTHCHECK CMD wget --quiet --spider --tries=1 --no-check-certificate http://localhost || exit 1