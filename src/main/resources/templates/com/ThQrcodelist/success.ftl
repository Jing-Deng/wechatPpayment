<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
	<title>Document</title>
	<!-- 	<link rel="stylesheet" href="https://res.wx.qq.com/open/libs/weui/0.4.3/weui.min.css"> -->
    <link rel="stylesheet" href="/thxl/css/weuix.css">
    <link rel="stylesheet" href="/thxl/css/weui.css">

	<style>
	body{
		box-sizing: border-box;;
		padding-top: 2rem
	}
	#icon_wx{
		margin: 0 auto;
		width: 5rem;
	}
	#wx_btn{
		width: 10rem;
		height: 1.6rem;
		line-height: 1.6rem;
		margin-top: 1rem;
		font-size: 0.8rem;
	}
	p{
		text-align: center;
		font-style: 24rem;
		margin-top: 0.8rem;

	}
	.text{
		width: 12rem;
		margin: 0 auto;
		color:#a1a1a1;
	}
</style>
</head>
<body>
	<div class="weui_icon_area" id="icon_wx"><i class="weui-icon-success weui-icon_msg"></i></div>
	<p>红包领取成功</p>
	<p style="color: #dfc72f">金额：<span style="color:#f9002e">${money}</span>元</p>
	<p class="text">
	到账说明：红包已通过微信的方式转入零钱，请打开微信查看到账通知，若有疑问请联系我们</p>
	<a href="http://www.yumatianhong.com" class="weui-btn weui-btn_primary" id="wx_btn">返回</a>
</body>
</html>
<script>
	(function (doc, win) {
		var docEle = doc.documentElement,
		resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize',
		recalc = function () {
			var clientWidth = docEle.clientWidth;
			if (!clientWidth) return;
			if(clientWidth>=750){
				docEle.style.fontSize = '50px';
			}else{
                docEle.style.fontSize = 20 * (clientWidth / 375) + 'px';//这里是1rem=20px
            }
        };
        if (!doc.addEventListener) return;
        win.addEventListener(resizeEvt, recalc, false);
        doc.addEventListener('DOMContentLoaded', recalc, false);
    })(document, window);
</script>