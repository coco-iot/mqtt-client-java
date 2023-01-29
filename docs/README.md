```shell
mvn archetype:generate -DgroupId=com.luomor.mqtt -DartifactId=springboot -Dversion=1.0.0 -DinteractiveMode=false

mvn archetype:generate -DgroupId=com.luomor.mqtt -DartifactId=springboot -Dversion=1.0.0

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

```
Choose archetype:
1: internal -> org.apache.maven.archetypes:maven-archetype-archetype (An archetype which contains a sample archetype.)
2: internal -> org.apache.maven.archetypes:maven-archetype-j2ee-simple (An archetype which contains a simplifed sample J2EE application.)
3: internal -> org.apache.maven.archetypes:maven-archetype-plugin (An archetype which contains a sample Maven plugin.)
4: internal -> org.apache.maven.archetypes:maven-archetype-plugin-site (An archetype which contains a sample Maven plugin site.
      This archetype can be layered upon an existing Maven plugin project.)
5: internal -> org.apache.maven.archetypes:maven-archetype-portlet (An archetype which contains a sample JSR-268 Portlet.)
6: internal -> org.apache.maven.archetypes:maven-archetype-profiles ()
7: internal -> org.apache.maven.archetypes:maven-archetype-quickstart (An archetype which contains a sample Maven project.)
8: internal -> org.apache.maven.archetypes:maven-archetype-site (An archetype which contains a sample Maven site which demonstrates
      some of the supported document types like APT, XDoc, and FML and demonstrates how
      to i18n your site. This archetype can be layered upon an existing Maven project.)
9: internal -> org.apache.maven.archetypes:maven-archetype-site-simple (An archetype which contains a sample Maven site.)
10: internal -> org.apache.maven.archetypes:maven-archetype-webapp (An archetype which contains a sample Maven Webapp project.)
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 7:
```