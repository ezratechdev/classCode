const username123 = document.getElementById("username123");
const password123 = document.getElementById("password123");
const login = document.getElementById("login");

const listenForLength = element =>{
}

window.onload = function(){
    var counter = 0;
    login.style.backgroundColor = "red";
    username123.addEventListener("change" , e =>{
        if(e.target.value.length > 5){
            counter++;
        }
        if(counter >= 2){
            login.style.backgroundColor = "blue";
        }
    });
    password123.addEventListener("change" , e =>{
        if(e.target.value.length > 5){
            counter++;
        }
        if(counter >= 2){
            login.style.backgroundColor = "blue";
        }
    });
}