const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootbtw32/",
            name: "springbootbtw32",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootbtw32/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "电子招投标系统"
        } 
    }
}
export default base
