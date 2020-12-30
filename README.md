springboot加载流程

1.创建springapplication对象
      1.创建的过程中初始化web容器的选择（通过判断加载类，reactor优先，其次servlet）。
      2.加载spring.factories里的实例（1.Bootstrapper.class的实现类2.ApplicationContextInitializer.class实现类3.ApplicationListener.class实现类）。
      3.根据异常堆栈找主类，没有找到的话继续往下走。

2.创建一个默认的启动上下文，并调用Bootstrapper.class的实现类initialize方法设入上下文。
3.初始化listener，根据启动的不同步骤打印对应日志。
4.prepareEnvironment,加载配置文件和环境变量的参数
5.prepareContext,这个也是根据当前的web容器来决定的
6.refreshContext 最核心的一步
      1.注册shutdownhook
      2.加载postprocessor
      3.启动web容器 onRefresh,里面的servlet是通过DispatcherServletAutoConfiguration注入到容器中的。
      4.生成bean对象 这一步包含很多判断单例的步骤//todo后续再补充

7.最后执行applicationRunner