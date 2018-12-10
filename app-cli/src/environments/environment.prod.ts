export const environment = {
  production: true,
  apiUrl: 'http://docker:8080',
  keycloak: {
    url: 'http://keycloak.example.org:8000/auth',
    realm: 'example',
    clientId: 'app-cli',
  }
};
