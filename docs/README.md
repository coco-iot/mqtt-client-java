```shell
mvn archetype:generate -DgroupId=com.luomor.mqtt -DartifactId=springboot -Dversion=1.0.0 -DinteractiveMode=false

mvn archetype:generate -DgroupId=com.luomor.mqtt -DartifactId=springboot -Dversion=1.0.0

mvn org.apache.maven.plugins:maven-archetype-plugin:3.1.2:generate -DarchetypeArtifactId="spring-boot-blank-archetype" -DarchetypeGroupId="am.ik.archetype" -DarchetypeVersion="1.0.2.RELEASE" -DgroupId="com.luomor.mqtt" -DartifactId="demo"

tree -L 1

mvn package

/usr/bin/env /Library/Internet\ Plug-Ins/JavaAppletPlugin.plugin/Contents/H
ome/bin/java -cp /var/folders/qj/f4hb_yks03d_nzkhjqcrvnmw0000gp/T/cp_bkm89q7xy8pzc
krwx783683sf.jar com.luomor.mqtt.PublishSample

/usr/bin/env /Library/Internet\ Plug-I
ns/JavaAppletPlugin.plugin/Contents/Home/bin/java -cp /var/folders/qj/f4hb_yks03d_
nzkhjqcrvnmw0000gp/T/cp_bkm89q7xy8pzckrwx783683sf.jar com.luomor.mqtt.SubscribeSam
ple

/usr/libexec/java_home
/usr/libexec/java_home -V
ls /Library/Java/JavaVirtualMachines

Java: Configure Java Runtime
java.home

/Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home
/usr/local/Cellar/openjdk/17
"java.jdt.ls.java.home": "/usr/local/Cellar/openjdk/17"

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

```xml
<dependency>
      <!-- Import dependency management from Spring Boot -->
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-dependencies</artifactId>
      <version>2.2.5.RELEASE</version>
      <type>pom</type>
      <scope>import</scope>
</dependency>
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

```
Language Support for Java(TM) by Red Hat(1.3.0)
功能目录
设置
java.home

作用：

指定用于启动 Java 语言服务器的 JDK （11或更近版本）的文件夹路径。在 Windows 上，反斜杠必须转义

"java.home":"C:\\Program Files\\Java\\jdk11.0_8"
默认值：null

java.jdt.ls.java.home

作用：

指定用于启动Java语言服务器的JDK（11或更近版本）的文件夹路径。此设置将替换Java扩展的嵌入式JRE以启动Java语言服务器。在Windows上，反斜杠必须转义

"java.jdt.ls.java.home":"C:\\Program Files\\Java\\jdk11.0_8"
默认值：null

java.jdt.ls.vmargs

作用：

指定用于启动Java语言服务器的额外VM参数

"java.jdt.ls.vmargs":"-XX:+UseParallelGC -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -Dsun.zip.disableMemoryMapping=true -Xmx1G -Xms100m"
// 优化并行垃圾收集器的内存使用
默认值：-XX:+UseParallelGC -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -Dsun.zip.disableMemoryMapping=true -Xmx1G -Xms100m

java.errors.incompleteClasspath.severity

作用：

指定Java文件的类路径不完整时消息的严重性

"java.errors.incompleteClasspath.severity": "warning"
默认值：warning

java.configuration.checkProjectSettingsExclusions

作用：

控制是否从文件管理器中排除扩展生成的项目设置文件(.project, .classpath, .factorypath, .settings/)

"java.configuration.checkProjectSettingsExclusions": true
默认值：true

java.configuration.updateBuildConfiguration

作用：

指定对生成文件的修改如何更新Java类路径/配置

"java.configuration.updateBuildConfiguration": "interactive"
默认值：interactive

java.trace.server

作用：

跟踪VS代码与Java语言服务器之间的通信

"java.trace.server": "off"
默认值：off

java.import.maven.enabled

作用：

启用/禁用 Maven 导入器

"java.import.maven.enabled": true
默认值：true

java.import.gradle.enabled

作用：

启用/禁用 Gradle 导入程序

"java.import.gradle.enabled": true
默认值：true

java.import.gradle.wrapper.enabled

作用：

使用 gradle-wrapper.properties 文件中的Gradle

"java.import.gradle.wrapper.enabled": true
默认值：true

java.import.gradle.version

作用：

如果Gradle包装丢失或禁用，请使用特定版本的Gradle

"java.import.gradle.version": null
默认值：null

java.import.gradle.home

作用：

如果Gradle包装器丢失或禁用且没有指定 java.import.gradle.version ，请从指定的本地安装目录或 Gradle_HOME 使用 Gradle

"java.import.gradle.home": null
默认值：null

java.import.gradle.offline.enabled

作用：

启用/禁用 Gradle离线模式

"java.import.gradle.offline.enabled": false
默认值：false

java.import.gradle.arguments

作用：

要传递给 Gradle的参数

"java.import.gradle.arguments": null
默认值：null

java.import.gradle.jvmArguments

作用：

要传递给 Gradle的JVM参数

"java.import.gradle.jvmArguments": null
默认值：null

java.import.gradle.user.home

作用：

设置 GRADLE_USER_HOME

"java.import.gradle.user.home": null
默认值：null

java.maven.downloadSources

作用：

作为导入Maven项目的一部分，启用/禁用Maven源工件的下载

"java.maven.downloadSources": false
默认值：false

java.eclipse.downloadSources

作用：

为Eclipse项目启用/禁用Maven源代码工件的下载

"java.eclipse.downloadSources": false
默认值：false

java.maven.updateSnapshots

作用：

强制更新快照

"java.maven.updateSnapshots": false
默认值：false

java.referencesCodeLens.enabled

作用：

启用/禁用参考CodeLens(显示引用)

"java.referencesCodeLens.enabled": false
默认值：false

java.signatureHelp.enabled

作用：

启用/禁用识别标志帮助

"java.signatureHelp.enabled": false
默认值：false

java.implementationsCodeLens.enabled

作用：

启用/禁用实例CodeLens(显示引用)

"java.implementationsCodeLens.enabled": false
默认值：false

java.configuration.maven.userSettings

作用：

设置 Maven 用户配置文件(settings.xml)的路径

"java.configuration.maven.userSettings": null
默认值：null

java.configuration.maven.globalSettings

作用：

设置 Maven 全局配置文件(settings.xml)的路径

"java.configuration.maven.globalSettings": null
默认值：null

java.configuration.maven.notCoveredPluginExecutionSeverity

作用：

指定插件执行不在Maven build lifecycle范围内时的严重性

"java.configuration.maven.notCoveredPluginExecutionSeverity": "warning"
默认值：warning

java.configuration.workspaceCacheLimit

作用：

保留未使用的工作区缓存数据的天数（如果启用）

超过此限制后，缓存的工作区数据可能会被删除

"java.configuration.workspaceCacheLimit": null
默认值：null

java.format.enabled

作用：

启用/禁用默认Java格式化程序

"java.format.enabled": true
默认值：true

java.saveActions.organizeImports

作用：

启用/禁用保存操作时自动组织导入

"java.saveActions.organizeImports": false
默认值：false

java.import.exclusions

作用：

配置排除文件夹的全局模式
使用 ! 取消模式以允许子文件夹导入，你必须包含一个父目录
顺序很重要
"java.import.exclusions": "**/node_modules/**,**/.metadata/**,**/archetype-resources/**,**/META-INF/maven/**"
默认值：**/node_modules/**,**/.metadata/**,**/archetype-resources/**,**/META-INF/maven/**

java.import.generatesMetadataFilesAtProjectRoot

作用：

指定是否在项目根目录下生成项目元数据文件 (.project, .classpath, .factorypath, .settings/) 单击此处了解如何更改设置以使其生效

"java.import.generatesMetadataFilesAtProjectRoot": false
默认值：false

java.project.referencedLibraries

作用：

配置glob模式，以便将本地库引用到Java项目

"java.project.referencedLibraries": "lib/**/*.jar"
默认值：lib/**/*.jar

java.project.outputPath

作用：

存储编译输出的工作空间的相对路径
仅在工作区范围内有效
该设置不会影响Maven或Gradle项目
"java.project.outputPath": 
默认值：``

java.project.sourcePaths

作用：

存储源文件的工作区的相对路径
仅在工作区范围内有效
该设置不会影响Maven或Gradle项目
"java.project.sourcePaths": 
默认值：``

java.contentProvider.preferred

作用：

你喜欢的Content Providers（通常是第三方反编译器id）

"java.contentProvider.preferred": null
默认值：null

java.autobuild.enabled

作用：

启用/禁用"自动生成"(auto build)

"java.autobuild.enabled": true
默认值：true

java.maxConcurrentBuilds

作用：

最大同步项目构建数

"java.maxConcurrentBuilds": 1
默认值：1

java.recommendations.dependency.analytics.show

作用：

显示推荐的依赖项分析扩展

"java.recommendations.dependency.analytics.show": true
默认值：true

java.completion.maxResults

作用：

最大完成结果数（不包括代码段）
0（默认值）禁用该限制，将返回所有结果
在性能问题的情况下，考虑设置一个合理的限制
"java.completion.maxResults": 0
默认值：0

java.completion.enabled

作用：

启用/禁用代码补全支持

"java.completion.enabled": true
默认值：true

java.completion.overwrite

作用：

设置为true时，代码补全将覆盖当前文本
当设置为false时，只需添加代码即可
"java.completion.overwrite": true
默认值：true

java.completion.guessMethodArguments

作用：

当设置为true时，当从代码辅助方案列表中选择方法时，会猜测方法参数

"java.completion.guessMethodArguments": false
默认值：false

java.completion.favoriteStaticMembers

作用：

定义静态成员或具有静态成员的类型的列表。即使缺少导入，Content assist也会推荐这些静态成员

"java.completion.favoriteStaticMembers": "org.junit.Assert.*,org.junit.Assume.*,org.junit.jupiter.api.Assertions.*,org.junit.jupiter.api.Assumptions.*,org.junit.jupiter.api.DynamicContainer.*,org.junit.jupiter.api.DynamicTest.*,org.mockito.Mockito.*,org.mockito.ArgumentMatchers.*,org.mockito.Answers.*"
默认值：org.junit.Assert.*,org.junit.Assume.*,org.junit.jupiter.api.Assertions.*,org.junit.jupiter.api.Assumptions.*,org.junit.jupiter.api.DynamicContainer.*,org.junit.jupiter.api.DynamicTest.*,org.mockito.Mockito.*,org.mockito.ArgumentMatchers.*,org.mockito.Answers.*

java.completion.filteredTypes

作用：

定义类型过滤器。在内容辅助或快速修复方案中以及在组织导入时，将忽略其完全限定名称与所选筛选器字符串匹配的所有类型
例如 java.awt.* 将对awt包隐藏所有类型
"java.completion.filteredTypes": "java.awt.*,com.sun.*,sun.*,jdk.*,org.graalvm.*,io.micrometer.shaded.*"
默认值：java.awt.*,com.sun.*,sun.*,jdk.*,org.graalvm.*,io.micrometer.shaded.*

java.completion.importOrder

作用：

定义导入语句的排序顺序
包或类型名称前缀（例如“org.eclipse”）是有效的条目
导入始终添加到最特定的组
"java.completion.importOrder": "java,javax,com,org"
默认值：java,javax,com,org

java.foldingRange.enabled

作用：

启用/禁用智能折叠范围支持。如果禁用，它将使用 VS Code 提供的默认基于缩进的折叠范围

"java.foldingRange.enabled": true
默认值：true

java.progressReports.enabled

作用：

[实验性]启用/禁用服务器上后台进程的进度报告

"java.progressReports.enabled": true
默认值：true

java.format.settings.url

作用：

指定Eclipse格式化程序xml设置的url或文件路径

"java.format.settings.url": null
默认值：null

java.format.settings.profile

作用

Eclipse格式化程序设置中的可选格式化程序配置文件名称

"java.format.settings.profile": null
默认值：null

java.format.comments.enabled

作用

包括代码格式化期间的注释

"java.format.comments.enabled": true
默认值：true

java.format.onType.enabled

作用

在键入 ; 时启用/禁用自动块格式 <输入> 或 }

"java.format.onType.enabled": true
默认值：true

java.codeGeneration.hashCodeEquals.useJava7Objects

作用

使用 Objects.hash 和 Objects.equals 时生成生成 hashCode 和 equals methods
此设置仅适用于Java 7及更高版本
"java.codeGeneration.hashCodeEquals.useJava7Objects": false
默认值：false

java.codeGeneration.hashCodeEquals.useInstanceof

作用

在生成hashCode和equals方法时，使用 instanceof 比较类型

"java.codeGeneration.hashCodeEquals.useInstanceof": false
默认值：false

java.codeGeneration.useBlocks

作用

生成方法时，在“if”语句中使用块

"java.codeGeneration.useBlocks": false
默认值：false

java.codeGeneration.generateComments

作用

生成方法时生成方法注释

"java.codeGeneration.generateComments": false
默认值：false

java.codeGeneration.toString.template

作用

用于生成toString方法的模板

"java.codeGeneration.toString.template": "${object.className} [${member.name()}=${member.value}, ${otherMembers}]"
默认值：${object.className} [${member.name()}=${member.value}, ${otherMembers}]

java.codeGeneration.toString.codeStyle

作用

生成 toString 方法的代码风格

"java.codeGeneration.toString.codeStyle": "STRING_CONCATENATION"
默认值：STRING_CONCATENATION

java.codeGeneration.toString.skipNullValues

作用

生成toString方法时跳过空值

"java.codeGeneration.toString.skipNullValues": false
默认值：false

java.codeGeneration.toString.listArrayContents

作用

列出数组的内容，而不是使用本地toString()

"java.codeGeneration.toString.listArrayContents": true
默认值：true

java.codeGeneration.toString.limitElements

作用

限制要列出的数组/集合/映射中的项目数
如果为 0 则列出所有项目
"java.codeGeneration.toString.limitElements": 0
默认值：0

java.codeGeneration.insertionLocation

作用

指定源操作生成的代码的插入位置

afterCursor: 在光标所在的成员后面插入生成的代码
beforeCursor: 在光标所在成员之前插入生成的代码
lastMember: 插入生成的代码作为目标类型的最后一个成员
"java.codeGeneration.insertionLocation": "afterCursor"
默认值：afterCursor

java.selectionRange.enabled

作用

启用/禁用对Java的智能选择支持
禁用此选项不会影响VS代码内置的基于单词和基于括号的智能选择
"java.selectionRange.enabled": true
默认值：true

java.showBuildStatusOnStart.enabled

作用

启动时自动显示生成状态

notification：通过进度通知显示构建状态
terminal：通过终端显示构建状态
off：不显示任何构建状态
为了向后兼容，此设置还接受布尔值，其中true与notification和false具有相同含义off

"java.showBuildStatusOnStart.enabled": `notification`
默认值：notification

java.configuration.runtimes

作用

将Java执行环境映射到本地JDK

"java.configuration.runtimes": 
默认值：``

java.server.launchMode

作用

Java扩展的启动模式
Standard：提供完整的功能，如智能感知、重构、构建、Maven/Gradle 支持等...
LightWeight：以较低的启动成本启动语法服务器。仅提供大纲、导航、javadoc、语法错误等语法功能。轻量级模式不会加载第三方扩展，如java test runner、java debugger等。
Hybrid：提供具有更好响应能力的完整功能。它启动一个标准语言服务器和一个辅助语法服务器。语法服务器提供语法功能，直到标准服务器准备好。标准服务器完全准备好后，语法服务器将自动关闭
"java.server.launchMode": "Hybrid"
默认值：Hybrid

java.sources.organizeImports.starThreshold

作用

指定在使用star-import之前添加的导入数

"java.sources.organizeImports.starThreshold": 99
默认值：99

java.sources.organizeImports.staticStarThreshold

作用

指定在使用star-import之前添加的静态导入数

"java.sources.organizeImports.staticStarThreshold": 99
默认值：99

java.imports.gradle.wrapper.checksums

作用

定义Gradle包装的允许/不允许SHA-256校验和

"java.imports.gradle.wrapper.checksums": 
默认值：``

java.project.importOnFirstTimeStartup

作用

指定首次以(Hybrid)混合模式
支持的值是

disabled（从不导入）
interactive（要求导入或不导入）
automatic（总是导入）
"java.project.importOnFirstTimeStartup": "automatic"
默认值：automatic

java.project.importHint

作用

启动时跳过Java项目导入时，启用/禁用服务器模式切换信息

"java.project.importHint": true
默认值：true

java.project.resourceFilters

作用

不让Java语言服务器刷新文件和文件夹，这可以提高整体性能
["node_modules",".git"] 将排除所有名为 node_modules or .git 的文件和文件夹
"java.project.resourceFilters": "node_modules,.git"
默认值：node_modules,.git

java.templates.fileHeader

作用

指定新Java文件的文件头注释
支持使用字符串数组配置多行注释，并使用${variable}引用预定义变量
"java.templates.fileHeader": 
默认值：``

java.templates.typeComment

作用

指定新Java类型的类型注释
支持使用字符串数组配置多行注释，并使用${variable}引用预定义变量
"java.templates.typeComment": 
默认值：``

java.references.includeAccessors

作用

在查找引用时包括getter、setter和builder/constructor

"java.references.includeAccessors": true
默认值：true

java.references.includeDecompiledSources

作用

在查找引用时包括反编译的源代码

"java.references.includeDecompiledSources": true
默认值：true

java.typeHierarchy.lazyLoad

作用

启用/禁用延迟加载类型层次结构中的内容
延迟加载可以节省大量加载时间，但每个类型都应该手动扩展以加载其内容
"java.typeHierarchy.lazyLoad": false
默认值：false

java.settings.url

作用

指定工作区Java设置的url或文件路径。请参见设置全局首选项

"java.settings.url": null
默认值：null

java.symbols.includeSourceMethodDeclarations

作用

在符号搜索中包含源文件中的方法声明

"java.symbols.includeSourceMethodDeclarations": false
默认值：false

java.quickfix.showAt

作用

在问题或行级别显示快速修复

"java.quickfix.showAt": "line"
默认值：line

命令
java.server.mode.switch

切换到标准模式

java.projectConfiguration.update

更新项目

java.project.import

将Java项目导入工作区

java.open.serverLog

打开Java语言服务器日志文件

java.open.clientLog

打开Java扩展日志文件

java.open.logs

打开所有日志文件

java.workspace.compile

强制Java编译

java.open.formatter.settings

打开Java格式化程序设置

java.clean.workspace

清理Java语言服务器工作区

java.project.updateSourceAttachment

Attach Source

java.project.addToSourcePath

将文件夹添加到Java源路径

java.project.removeFromSourcePath

从Java源路径中删除文件夹

java.project.listSourcePaths

列出所有Java源路径

java.show.server.task.status

显示建立工作状态

java.action.navigateToSuperImplementation

转到实现该方法的类文件的父文件

java.action.showTypeHierarchy

显示类型层次结构

java.action.showClassHierarchy

显示类层次结构

java.action.showSupertypeHierarchy

显示超类型层次结构

java.action.showSubtypeHierarchy

显示子类型层次结构

java.action.changeBaseType

基于this类型

java.action.clipboardPasteAction

导入所有需要导入的类

快捷键：Ctrl + Shift + V

设置的使用
如果只是新手使用Language Support for Java(TM) by Red Hat拓展的LightWeight【轻量级模式】就够了

Language Support for Java(TM) by Red Hat拓展默认是Hybrid【混合模式】

在你的工作目录（如果不懂先学一下这个概念）

比如有一个目录(myProject)【随便】

在这个目录下建一个.vscode目录

在.vscode中是专门添加一些配置文件【会覆盖你对VScode的一些设置】
文件名必须是 .vscode
在 .vscode 目录新建 settings.json文件

配置就在 settings.json文件其中添加，上面的选项根据自身需求添加即可

1示例（使用拓展的LightWeight模式）：

{
    "java.server.launchMode": "LightWeight"
}
2示例（使用混合模式，打开文件夹时不想导入 Java 项目）

{
    "java.server.launchMode": "LightWeight",
    "java.project.importOnFirstTimeStartup": "disabled"
}
多设置就是示例2，以此类推

{
    选项: 值,
    选项: 值,
    ...
    选项: 值
}
选项和值在上面都有自身需求添加即可

命令的使用
比较复杂细学官方文档：
https://code.visualstudio.com/api

能快捷键调用的

Shift + Alt + U ：更新项目
Shift + Alt + B ：强制Java编译【不建议使用】
Ctrl + Shift + V : 导入所有需要导入的类【学习Java新手别用】
```