docker-compose -f docker-compose-single.yml down

cd eshop-web
call mvn clean package -DskipTests -P single
cd ..

docker-compose -f docker-compose-single.yml up --build