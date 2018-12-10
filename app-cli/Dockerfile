FROM node:lts-alpine AS build

COPY . /usr/src/app/

# Expose the port the app runs in
EXPOSE 4200

#Install and build the app
RUN cd /usr/src/app;\
    npm install;\
    npm run build

#==================== Setting up stage ==================== 
# Create image based on the official nginx - Alpine image
FROM nginx:1.13.7-alpine

COPY --from=build /usr/src/app/dist /usr/share/nginx/html

#COPY ./nginx-to-do-app.conf /etc/nginx/conf.d/default.conf

