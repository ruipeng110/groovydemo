# 项目引入的时候报错了？

    项目拿到的第一步是指定groovy文件夹为source文件夹，否则ide不会把groovy文件夹下的文件当class文件。
    
    不会可以看截图。
    
# 为什么项目可以混合在一起打包

    本质上来说，最终java目录和groovy目录的文件都编译成class文件，但是.class文件不是有javac编译，由groovyc编译。
    
    项目能成功运行是ide帮你解决编译问题的，但是线上的环境是需要maven帮你做这个事情，所以自然是由maven plugin。
    
    这个maven plugin叫gmavenplus-plugin，在项目的pom已经配置了。
    
## groovy/priv/crp/groovymodule/TestPlugin

    测试自定义的string的附加方法，fuck。
    
## java/priv/crp/studyproject/JavaCallGroovy

    测试java调起groovy方法。