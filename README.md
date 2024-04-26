# spring boot校园回收小程序后端
# 使用教程：
#后端代码（spring boot，注：所有的代码都在ruoyi-admin，其他的模块没有特殊需求千万不要动）
git colne https://gitee.com/xu-pufen/xs将仓库里的代码克隆下来
# 进入ruoyi-admin，修改resources里面的application.yml配置redis 我的密码默认是0，redis库设置是1，可以根据自己的实际情况更改
# 修改resources里面的application-druid.yml修改mysql的用户密码，我的是用户recycle，密码root,可以根据自己的情况修改sql文件在文件夹sql里面
配置完成即可使用，


##前端代码（vue）
npm install 安装依赖，然后npm run dev即可运行，记得配置vue.config.js配置自己后端所在的地址，一般默认是没问题的，除非修改了后端的端口，后端端口：8081

#打包上服务器
##后端：正在运行正常后，使用maven打成jar包（ruoyi-admin里面的才是，其他的不用管）得到ruoyi-admin.jar文件（已经是可执行的jar包，放服务器上）
##前端：npm run build:port即可，等待打包会生成dist文件夹，打包上服务器
