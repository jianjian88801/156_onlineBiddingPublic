
var projectName = '电子招投标系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '招标项目',
	url: './pages/zhaobiaoxiangmu/list.html'
}, 
{
	name: '结果公示',
	url: './pages/jieguogongshi/list.html'
}, 
{
	name: '中标公告',
	url: './pages/zhongbiaogonggao/list.html'
}, 
{
	name: '市场监督',
	url: './pages/shichangjiandu/list.html'
}, 
{
	name: '帮助中心',
	url: './pages/bangzhuzhongxin/list.html'
}, 
{
	name: '新闻资讯',
	url: './pages/xinwenzixun/list.html'
}, 

]

var adminurl =  "http://localhost:8080/springbootbtw32/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除","审核"],"menu":"责任单位","menuJump":"列表","tableName":"zerendanwei"}],"menu":"责任单位管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["新增","查看","修改","删除","审核"],"menu":"供应商","menuJump":"列表","tableName":"gongyingshang"}],"menu":"供应商管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除"],"menu":"招标分类","menuJump":"列表","tableName":"zhaobiaofenlei"}],"menu":"招标分类管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除","审核","查看评论"],"menu":"招标项目","menuJump":"列表","tableName":"zhaobiaoxiangmu"}],"menu":"招标项目管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","修改","删除","报表","审核"],"menu":"在线投标","menuJump":"列表","tableName":"zaixiantoubiao"}],"menu":"在线投标管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除"],"menu":"结果公示","menuJump":"列表","tableName":"jieguogongshi"}],"menu":"结果公示管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","修改","删除"],"menu":"中标公告","menuJump":"列表","tableName":"zhongbiaogonggao"}],"menu":"中标公告管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["新增","查看","修改","删除"],"menu":"市场监督","menuJump":"列表","tableName":"shichangjiandu"}],"menu":"市场监督管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除"],"menu":"帮助中心","menuJump":"列表","tableName":"bangzhuzhongxin"}],"menu":"帮助中心管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["新增","查看","修改","删除"],"menu":"新闻资讯","menuJump":"列表","tableName":"xinwenzixun"}],"menu":"新闻资讯管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","查看评论","投标"],"menu":"招标项目列表","menuJump":"列表","tableName":"zhaobiaoxiangmu"}],"menu":"招标项目模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"结果公示列表","menuJump":"列表","tableName":"jieguogongshi"}],"menu":"结果公示模块"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看"],"menu":"中标公告列表","menuJump":"列表","tableName":"zhongbiaogonggao"}],"menu":"中标公告模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"市场监督列表","menuJump":"列表","tableName":"shichangjiandu"}],"menu":"市场监督模块"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"帮助中心列表","menuJump":"列表","tableName":"bangzhuzhongxin"}],"menu":"帮助中心模块"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看"],"menu":"新闻资讯列表","menuJump":"列表","tableName":"xinwenzixun"}],"menu":"新闻资讯模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除","查看评论","公示","公告"],"menu":"招标项目","menuJump":"列表","tableName":"zhaobiaoxiangmu"}],"menu":"招标项目管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","删除","报表"],"menu":"在线投标","menuJump":"列表","tableName":"zaixiantoubiao"}],"menu":"在线投标管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除"],"menu":"结果公示","menuJump":"列表","tableName":"jieguogongshi"}],"menu":"结果公示管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["删除","查看"],"menu":"中标公告","menuJump":"列表","tableName":"zhongbiaogonggao"}],"menu":"中标公告管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","查看评论","投标"],"menu":"招标项目列表","menuJump":"列表","tableName":"zhaobiaoxiangmu"}],"menu":"招标项目模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"结果公示列表","menuJump":"列表","tableName":"jieguogongshi"}],"menu":"结果公示模块"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看"],"menu":"中标公告列表","menuJump":"列表","tableName":"zhongbiaogonggao"}],"menu":"中标公告模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"市场监督列表","menuJump":"列表","tableName":"shichangjiandu"}],"menu":"市场监督模块"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"帮助中心列表","menuJump":"列表","tableName":"bangzhuzhongxin"}],"menu":"帮助中心模块"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看"],"menu":"新闻资讯列表","menuJump":"列表","tableName":"xinwenzixun"}],"menu":"新闻资讯模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"责任单位","tableName":"zerendanwei"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","删除"],"menu":"在线投标","menuJump":"列表","tableName":"zaixiantoubiao"}],"menu":"在线投标管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["删除","查看"],"menu":"中标公告","menuJump":"列表","tableName":"zhongbiaogonggao"}],"menu":"中标公告管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","查看评论","投标"],"menu":"招标项目列表","menuJump":"列表","tableName":"zhaobiaoxiangmu"}],"menu":"招标项目模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"结果公示列表","menuJump":"列表","tableName":"jieguogongshi"}],"menu":"结果公示模块"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看"],"menu":"中标公告列表","menuJump":"列表","tableName":"zhongbiaogonggao"}],"menu":"中标公告模块"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"市场监督列表","menuJump":"列表","tableName":"shichangjiandu"}],"menu":"市场监督模块"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"帮助中心列表","menuJump":"列表","tableName":"bangzhuzhongxin"}],"menu":"帮助中心模块"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看"],"menu":"新闻资讯列表","menuJump":"列表","tableName":"xinwenzixun"}],"menu":"新闻资讯模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"供应商","tableName":"gongyingshang"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
