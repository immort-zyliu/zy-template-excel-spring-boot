# zy-template-excel 框架的starter

## 前言
使用本框架可以方便的与spring-boot整合。引入本项目后，不用做任何操作即可使用框架中的功能。

## starter的使用方法
- 引入pom
```xml
<dependency>
    <groupId>io.github.immort-zyliu</groupId>
    <artifactId>zy-template-excel-spring-boot-starter</artifactId>
    <version>${zy-template-excel-boot.version}</version>
</dependency>
```
- 直接注入使用即可。
```java
/**
  * excel 填充者
  */
@Resource
private TemplateExcelFiller templateExcelFiller;
```

## 更详细的使用方法，请移步 zy-template-excel 项目。
