# This is my first Kafka project to learn how to produce/consume message
# How to deploy Kafka with docker
https://hub.docker.com/r/bitnami/kafka
Seach "Apache Kafka development setup example"
docker-compose up
docker exec -it <kafka_conatiner_id> sh
Now we are inside our Docker container. We will move to the folder where all the executives are located.
cd /opt/kafka_<version>/bin
https://levelup.gitconnected.com/running-kafka-on-docker-container-1a15b8d0b77c
https://developer.confluent.io/quickstart/kafka-docker/


./kafka-topics.sh --list --bootstrap-server PLAINTEXT://localhost:9092 列出所有topic
./kafka-topics.sh --create --bootstrap-server PLAINTEXT://localhost:9092 --replication-factor 1 --partitions 1 --topic first-topic 创建ttopic
以前--zookeeper的参数已经被depecit了
