# mqtt-client-java

```
docker run --rm --gpus all nvidia/cuda nvidia-smi
docker run --rm --runtime=nvidia \
    -e NVIDIA_VISIBLE_DEVICES=all nvidia/cuda nvidia-smi

docker run --rm --gpus 2 nvidia/cuda nvidia-smi
docker run --gpus '"device=1,2"' \
    nvidia/cuda nvidia-smi --query-gpu=uuid --format=csv

nvidia-smi -i 3 --query-gpu=uuid --format=csv
uuid
GPU-18a3e86f-4c0e-cd9f-59c3-55488c4b0c24

docker run --rm --runtime=nvidia \
    -e NVIDIA_VISIBLE_DEVICES=1,2 \
    nvidia/cuda nvidia-smi --query-gpu=uuid --format=csv
docker run --gpus device=GPU-18a3e86f-4c0e-cd9f-59c3-55488c4b0c24 \
     nvidia/cuda nvidia-smi

docker run --rm --runtime=nvidia \
    -e NVIDIA_VISIBLE_DEVICES=2,3 \
    -e NVIDIA_DRIVER_CAPABILITIES=compute,utility \
    nvidia/cuda nvidia-smi

docker run --rm --gpus 'all,"capabilities=compute,utility"' \
    nvidia/cuda:11.6.2-base-ubuntu20.04 nvidia-smi
```