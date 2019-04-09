/**
 *	主界面 
 */
function startRequest(){
	//alert("startRequest");
	var userlist=[];
	$.ajax({
		url:"http://localhost/weiya/test2",
		type:"POST",
		async:false,
		data:{},
		dataType:"json",
		success : function(data){
			//alert("startRequest");
			userlist=data;
			//alert(userlist.userName);
			var str="";

			str+="<ol>"+
				"<li>"+userlist.userName+"</li>"+
				"<li>"+userlist.password+"</li>"+
				"<li>"+userlist.age+"</li>"+
				"</ol>";
//			str+="<div>"+userlist.userName+"</div>";
			document.getElementById("box").innerHTML=str;
		}
	});
}

/*
 * 用户登陆
 */
function login(){
	//alert("login");
	var userName=document.getElementById("loginUserName").value;
	var password=document.getElementById("loginPassword").value;
	//alert(userName+password);
	$.ajax({
		url:"http://localhost/weiya/login",
		type:"POST",
		async:false,
		dataType:"TEXT",
		data:{"userName":userName,"password":password},
		success:function(data){
			//alert("login");
			var res=data;
			if(res=="success"){
				alert("登陆成功");
			}else{
				alert("登陆失败");
			}
		}
	});
}

/*
*用户注册
**/
function register(){
	//alert("register");
	var userName=document.getElementById("registerUserName").value;
	var password=document.getElementById("registerPassword").value;
	var age=document.getElementById("registerAge").value;
	alert(userName);
	$.ajax({
		url:"http://localhost/weiya/add",
		type:"POST",
		async:false,
		dataType:"TEXT",
		data:{"userName":userName,"password":password,"age":age},
		success:function(data){
			var res=data;
			if(res=="success"){
				alert("注册成功");
			}else{
				alert("注册失败");
			}
		}
	});
}

/*
 * 用户修改
 */
function chargeUser(){
	var userName=document.getElementById("userName").value();
	var password=document.getElementById("password").value();
	var age=document.getElementById("age").value();
	$.ajax({
		url:"",
		type:"POST",
		async:false,
		dataType:"json",
		data:{},
		success:function(data){
			var res=data.getResult();
			if(res=="success"){
				alert("修改成功");
			}else{
				alert("修改失败");
			}
		}
	});
}

/*
 * 删除用户
 * */
function deleteUser(){
	var userName=document.getElementById("userName").value();
	$.ajax({
		url:"",
		type:"POST",
		async:false,
		dataType:"json",
		data:{},
		success:function(data){
			var res=data.getResult();
			if(res=="success"){
				alert("删除成功");
			}else{
				alert("删除失败");
			}
		}
	});
}
