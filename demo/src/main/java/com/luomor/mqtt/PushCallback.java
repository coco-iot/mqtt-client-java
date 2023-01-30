package com.luomor.mqtt;

import java.text.SimpleDateFormat;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import com.alibaba.fastjson.JSONObject;

/**
 * 必须实现MqttCallback的接口并实现对应的相关接口方法CallBack 类将实现 MqttCallBack。
 * 每个客户机标识都需要一个回调实例。在此示例中，构造函数传递客户机标识以另存为实例数据。
 * 在回调中，将它用来标识已经启动了该回调的哪个实例。
 * 必须在回调类中实现三个方法：
 * public void messageArrived(MqttTopic topic, MqttMessage message)接收已经预订的发布。
 * public void connectionLost(Throwable cause)在断开连接时调用。
 * public void deliveryComplete(MqttDeliveryToken token))
 * 接收到已经发布的 QoS 1 或 QoS 2 消息的传递令牌时调用。
 * 由 MqttClient.connect 激活此回调。
 */
public class PushCallback implements MqttCallback {
    public void connectionLost(Throwable cause) {
        // 连接丢失后，一般在这里面进行重连
        System.out.println("连接断开……（可以做重连）");
    }

    public void deliveryComplete(IMqttDeliveryToken token) {
        System.out.println("deliveryComplete---------" + token.isComplete());
    }

    public void messageArrived(String topic, MqttMessage message) throws Exception {
        // subscribe后得到的消息会执行到这里面
        System.out.println(
                "接收消息主题:" + topic + "  接收消息Qos:" + message.getQos() + "接收消息内容:" + new String(message.getPayload()));
        // 特别注意一下，messageArrived这个里面不允许调用代码和写方法，如果调用就会断开连接这个是个坑，然后用我这个try{}catch{}就没有问题了，就不会再去掉线断开连接
        try {
            JSONObject jsonObject = JSONObject.parseObject(message.toString());
            String equipment = jsonObject.getString("equipment");
            double temperature = Double.parseDouble(jsonObject.getString("temperature"));
            double humidity = Double.parseDouble(jsonObject.getString("humidity"));
            String datetime = jsonObject.getString("datetime");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
            System.out.println(equipment);

            // MySQLDemo mysqldemo = new MySQLDemo();
            // mysqldemo.add(equipment, temperature, humidity, datetime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void MqttPublisherFetch() {
        // JSONObject jsonObject = JSONObject.parseObject(messtr);
        // jsonObject.put("李鹏", "1111");
        // jsonObject.put("李12", "222");
        // System.out.println(jsonObject.toString());
        // System.out.println(equipment + "-------" + temperature + "---------------" + humidity + "-----------" + datetime
        //         + "-----------猪蹄---");
    }
}
