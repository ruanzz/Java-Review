## IOC容器

给容器注册组件
1. 包扫描+组件标注扫描
2. @Bean
3. @Import  
4. FactoryBean

## Bean生命周期
创建 --> 初始化 --> 销毁

指定初始化和销毁方法
1. 通过@Bean指定init-method和destroy-method
2. 通过Bean实现InitailizingBean和DisposableBean
3. @PostConstruct构造方法之后完成初始化,@PreDestroy容器移除对象之前完成销毁
4. postProcessBeforeInitialization 在初始化之前，postProcessAfterInitialization在初始化之后


销毁：
 单实例：容器关闭的时候
 多实例：容器不会管理这个bean，容器不会调用销毁方法
 
