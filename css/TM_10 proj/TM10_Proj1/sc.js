function fun(){
var x=document.f.fname.value;
var y=document.f.f1name.value;
if(x.length<1){alert("First name cannot be empty")
	return false;}

var letters = /^[A-Za-z]+$/;
if(!x.match(letters))
  {
	alert("Name must be in characters");
	  return false;
	  }
	
if(y.length<1){alert("Last name cannot be empty")
	return false;
	}

if(!y.match(letters))
  {
	alert("Name must be in characters");
	  return false;
  }
if((document.f.r1.checked==false)&&(document.f.r2.checked==false)&&(document.f.r3.checked==false)){
	alert("Gender must be selected");
	return false;
}
var email=document.f.mail.value;
if(email.length<1){
	alert("email is mandatory");
	return false;
}
if(document.f.psd1.value!=document.f.psd2.value){
	alert("password and confirm passsword are not matching");
	return false;
}

}

