const loginForm = document.getElementById("loginForm");
const username = document.getElementById("username");
const password = document.getElementById("password");
// const verifyLength = value => {
//     if(value.length >= 6) return true;
//     else return false;
// }
window.onload = function(){
    loginForm.addEventListener("submit" , event =>{
        event.preventDefault();
        if((password.value.length >= 6) && (username.value.length >= 6)){
            sessionStorage.setItem("credentials" , JSON.stringify({
                username:username.value,
                password:password.value
            }));
            window.location.href = "./show.html";
            password.value = "";
            username.value = "";
        }else alert(`Invalid Credentials length \n Password ${password.value.length} \n Username ${username.value.length}`);
        

    })
}