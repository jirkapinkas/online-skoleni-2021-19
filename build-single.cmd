docker-compose down

cd eshop-web
call mvn clean package -DskipTests -P single
cd ..

docker-compose up --build