# Getting Started

1. build docker image locally

`./gradlew jibDockerBuild` // used google jib https://cloud.google.com/blog/products/gcp/introducing-jib-build-java-docker-images-better

2. deploy to kubernetes 

`kubectl apply -f k8s/deploy.yaml`
