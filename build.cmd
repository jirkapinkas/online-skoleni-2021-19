docker-compose down

cd eshop-web

call mvn clean package -DskipTests

cd ..

docker-compose up --build