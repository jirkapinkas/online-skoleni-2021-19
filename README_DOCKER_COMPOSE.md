Je zapotrebi mit nainstalovane:

- Docker
- Java (musi byt nastavena cesta JAVA_HOME + v Path musi byt cesta do adresare bin)
- Maven (musi byt v Path)
- NodeJS
- Yarn

POZOR!!! Do eshop-frontend/.env.production je zapotrebi nastavit:

  REACT_APP_API_URL=http://frontend.localhost/api


Spustit:

  build

Dale je zapotrebi nastavit v /etc/hosts nebo C:\Windows\System32\Drivers\etc\hosts:
(Tim se simuluje nastaveni u domeny):

  127.0.0.1 frontend.localhost
  127.0.0.1 backend.localhost

Pak funguje:

- http://frontend.localhost

Jak vypnout:

  CTRL + C
  docker-compose down