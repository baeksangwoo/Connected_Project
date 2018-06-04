var state =0;
function ChangeStatusGo() {
  if(state==0){
    setTimeout(function (){
      document.getElementById("battery").innerHTML = "감속 중!";
      document.getElementById("carStatus").style.color = "#ff0000";
    }, 2000); // How long do you want the delay to be (in milliseconds)? 
    setTimeout(function (){
      document.img2.src="tesla.gif" //먼저 주행 신호를 
      document.getElementById("carStatus").innerHTML = "주행중";
      document.getElementById("carStatus").style.color = "#ff0000";
    }, 4000); // How long do you want the delay to be (in milliseconds)? 
  document.img2.src="back-stop.png"
  document.getElementById("carStatus").innerHTML = "자동 운전 명령!";
  document.getElementById("carStatus").style.color = "#ff6600";
    state=1;
  }
  else if(state==1){
    document.img2.src="tesla.gif"
    state=0;
  }
}