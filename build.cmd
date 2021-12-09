docker-compose down

cd eshop-web
call mvn clean package -DskipTests
cd ..

cd eshop-frontend
call yarn
call yarn build
cd ..

docker-compose up --build