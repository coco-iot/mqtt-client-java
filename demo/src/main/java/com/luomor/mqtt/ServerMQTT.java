package com.luomor.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class ServerMQTT {

    public static void main(String[] args) throws MqttException {
        ServerMQTT server = new ServerMQTT();

        server.message = new MqttMessage();
        server.message.setQos(2);
        server.message.setRetained(true);
        //编辑消息
        server.message.setPayload("hello mqtt".getBytes());
        server.publish(server.topic , server.message);
        System.out.println(server.message.isRetained() + "------ratained状态");
    }

        //MQTT安装的服务器地址和端口号
        public static final String HOST = "tcp://49.232.6.131:1883";
        //定义一个主题
        public static final String TOPIC = "test";
        //定义MQTT的ID，可以在MQTT服务配置中指定
        private static final String clientid = "client-1";

        private MqttClient client;
        private MqttTopic topic; //用户和密码
        private String userName = "test";
        private String passWord = "test";
        private MqttMessage message;

        /**
         * g构造函数
         */
        public ServerMQTT() throws MqttException {
            // MemoryPersistence设置clientid的保存形式，默认为以内存保存
            client = new MqttClient(HOST, clientid, new MemoryPersistence());
            connect();
        }

        /**
         * l连接服务器
         */
        private void connect() {
            MqttConnectOptions options = new MqttConnectOptions();
            options.setCleanSession(false);
            options.setUserName(userName);
            options.setPassword(passWord.toCharArray());
            // 设置超时时间
            options.setConnectionTimeout(10);
            // 设置会话心跳时间
            options.setKeepAliveInterval(20);
            try {
                client.setCallback(new MqttCallback() {
                    public void connectionLost(Throwable cause) {
                        // 连接丢失后，一般在这里面进行重连
                        System.out.println("连接断开……（可以做重连）");
                    }

                    public void deliveryComplete(IMqttDeliveryToken token) {
                        System.out.println("deliveryComplete---------" + token.isComplete());
                    }

                    public void messageArrived(String topic, MqttMessage message) throws Exception {
                        // subscribe后得到的消息会执行到这里面
                        System.out.println("接收消息主题:" + topic + "  接收消息Qos:" + message.getQos() + "接收消息内容:" + new String(message.getPayload()));
                    }
                });
                client.connect(options);

                topic = client.getTopic(TOPIC);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /**
         * t推送消息
         */
        public void publish(MqttTopic topic , MqttMessage message) throws MqttPersistenceException, MqttException {
            MqttDeliveryToken token = topic.publish(message);
            token.waitForCompletion();
            System.out.println("测试成功为true失败为false " + token.isComplete());
        }



}
