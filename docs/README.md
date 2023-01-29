```shell
mvn archetype:generate -DgroupId=com.luomor.mqtt -DartifactId=springboot -Dversion=1.0.0　-DinteractiveMode=false

tree -L 1

mvn archetype:generate -DgroupId=com.luomor.shop -DartifactId=shopingmall -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

mvn archetype:generate -DgroupId=com.wong.shop -DartifactId=shopingmall -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
```

```
mvn：maven命令
archetype:generate：这是一个Maven插件，原型 archetype 插件是一个Maven项目模板工具包，可以用它创建基本的java项目结构。
-DgourpId: 组织名，公司网址的反写 + 项目名称
-DartifactId: 项目名（模块名）
-Dversion：项目版本号
-DinteractiveMode：是否使用交互模式：false不使用，直接创建；true使用，需要根据提示输入相关信息。
```