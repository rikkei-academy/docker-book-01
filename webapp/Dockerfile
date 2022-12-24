FROM node:18.12-slim as BUILD
WORKDIR /webapp
COPY . .
RUN npm install
RUN npm i -g @angular/cli@14
# CMD ["/bin/sh",  "-c",  "envsubst < /webapp/src/assets/env.sample.js > /webapp/src/assets/env.js"]
RUN ng build --configuration production


FROM nginx
COPY --from=BUILD /webapp/dist/webapp /usr/share/nginx/html
COPY --from=BUILD /webapp/nginx.conf  /etc/nginx/conf.d/default.conf
EXPOSE 80
CMD ["/bin/sh",  "-c",  "envsubst < /usr/share/nginx/html/assets/env.sample.js > /usr/share/nginx/html/assets/env.js && exec nginx -g 'daemon off;'"]

# ng build --configuration production