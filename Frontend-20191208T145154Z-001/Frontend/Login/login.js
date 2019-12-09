$(document).readyLogin(function(){
    $("#showLogin").click(function(){
      $("#register").hide();
    });
    $("#showLogin").click(function(){
      $("#imagesDiv").hide();
    });
    $("#showLogin").click(function(){
      $("#login").show();
    });
  });

  //readyLogin
  $(document).readyLogin(function(){
    $("#showRegister").click(function(){
      $("#login").hide();
    });
    $("#showRegister").click(function(){
      $("#imagesDiv").hide();
    });
    $("#showRegister").click(function(){
      $("#register").show();
    });
  });
  $(document).readyLogin(function(){
    $("#showImages").click(function(){
      $("#login").hide();
    });
    $("#showImages").click(function(){
      $("#register").hide();
    });
    $("#showImages").click(function(){
      $("#imagesDiv").show();
    });
  });

  //Function to validate email
  function validate_Email(inputText)
  {
  var emailfFormat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
  if(inputText.value.match(emailFormat))
  {
  return true;
  }
  else
  {
  alert("Invalid Email");
  return false;
  }
  }
   
  //Function to validate password
  function validate_Password(input)
  {
  var passwordFormat = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
  if(inputText.value.match(password_Format))
  {
  return true;
  }
  else
  {
  alert("Password must conatin 1 Uppercase,1 lowercase,1 number and 1 special character");
  return false;
  }
  }

  //Function to validate phone no
  function validate_Phone(inputtxt)
    {
  var phoneno = /^\d{10}$/;
  if(inputtxt.value.match(phoneno))
  {
      return true;
  }
  else
  {
     alert("Not a valid Phone Number");
     return false;
  }
  }


window.onload=init;

//Function to get name email phone and password
function fun(){
    var userName = {
        name:document.getElementById("inputName").value,
        email:document.getElementById("inputEmail").value,
        phone:document.getElementById("inputPhone").value,
        password:document.getElementById("inputPassword").value
    };
//if case if username and email validate or not
    if(user.userName!=="" && user.email!==""){
        userArray=JSON.parse(localStorage.getItem("user")) || [];
        userArray.push(user);
        localStorage.setItem("user",JSON.stringify(user_Array));
        userArray=localStorage.getItem("user");
        userArray=JSON.parse(user_Array);
    }
    document.getElementById("registeredMsg").innerHTML="your are registered!";
    console.log(userArray);
    setTimeout(function(){
        window.location.href = 'http://127.0.0.1:5500/Question_3/index.html';
     }, 1500);
}
function init(){
    var user_Array=[];
}

function fun2(){
    console.log(user_Array);
}
