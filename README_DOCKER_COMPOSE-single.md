Je zapotrebi mit nainstalovane:

- Docker
- Java (musi byt nastavena cesta JAVA_HOME + v Path musi byt cesta do adresare bin)
- Maven (musi byt v Path)

POZOR!!! Do eshop-frontend/.env.production je zapotrebi nastavit:

  REACT_APP_API_URL=http://localhost:8080

Spustit:

  build-single

Pak funguje:

- http://localhost:8080

Jak vypnout:

  CTRL + C
  docker-compose -f docker-compose-single.yml down