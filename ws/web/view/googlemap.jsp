<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="initial-scale=1.0" />

<script type="text/javascript"
   src="http://maps.google.com/maps/api/js?sensor=false&language=ko"></script>
<script async defer
   src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDKy-W18gyBXJQGDU2diCyAdo_0nzc2ze0&callback=initMap"
   type="text/javascript"></script>


<script>
$(document).ready(function() {
    // Server에 데이터를 요청한다.
    // AJAX로
    $.ajax({
       url : 'mapimpl.do',
       dataType : 'json',
       success : function(data) {
          var table = $('<div style="height: 350px;overflow-y: scroll;"><table class="table"></table></div>')   
          var markerList = $('#markerList').append(table);
          for(idx in data){
             var tr = $('<tr></tr>')
             var td = $('<td></td>')
             var di = $('<div class="list" ></div>')
             var button=$('<button></button>')
             di.attr('id','addrdiv_'+idx)
             table.append(tr)
             tr.append(td)
             td.append(di)
            
             di.html('<table class="table"><tr id="rows" class="button"><td id="address">'+ data[idx].address +'</td></tr></table>');

             (function(i){
                $(document).on("click","#addrdiv_"+idx,function(){
                   for(j in data){
                      $('#addrdiv_'+j).css('background-color','')
                   }
                   $(this).css('background-color','#17b7c8')
                   moveToLocation(data[i].lat,data[i].lng)                
                });   
             
             })(idx)
          }
          initMap(data);
       },

       error : function(e) {
          alert('fail');
       }
    });
 });


   var posList = [];
   var map;
   function changeColor(){
       document.getElementsByClassName("list").style.backgroundColor = "#17b7c8";  //RGB코드        
   }

   function initMap(input) {
      var mapOptions = {
         zoom : 15,
         center: {lat: input[0].lat, lng: input[0].lng},
         mapTypeId : google.maps.MapTypeId.ROADMAP
      }
      map = new google.maps.Map(document.getElementById('map_canvas'),
            mapOptions);

      for (i in input) {
         (function(i) {
            var myLatlng = new google.maps.LatLng(input[i]); // y, x좌표값
            var address = JSON.stringify(input[i]['address']);
            var content1 = JSON.stringify(input[i]['dLevel']);
            var content2 = JSON.stringify(input[i]['dTime']);
            var iwContent = '<div style="font-weight:bold;font-size: 10px;font-family: Verdana;letter-spacing:-1px;">주소 '
                  + address
                  + '</div>'
                  + '<div style="font-weight:bold;font-size: 10px;font-family: Verdana;letter-spacing:-1px;">상세 주소: '
                  + content1
                  + '</div><div style="font-weight:bold;font-size: 10px;font-family: Verdana;letter-spacing:-1px;">이용 시간: '
                  + content2 + '</div>'
                   var marker = new google.maps.Marker({
               position : myLatlng,
               map : map,
            //icon: 'http://127.0.0.1/first/img/pin3.png'
            });
                  var infowindow= new google.maps.InfoWindow({
               content : iwContent,
               maxWidth : 300
            });
            google.maps.event.addListener(marker, 'click', function() {
               infowindow.open(map, marker);
            });
            google.maps.event.addListener(marker, 'mouseout', function() {
               infowindow.close();
            });
         })(i);
      }    
   }

   function moveToLocation(lat, lng){
       var center = new google.maps.LatLng(lat, lng);
       // using global variable:
       map.panTo(center);

   }

</script>

<style>
#container {
   text-align: center;
}

#map_canvas {
   float: left;
   position: relative;
   z-index: 1;
}

#markerList {
   position: relative;
   display: inline-block;
   width: 25%;
   height: 350px; 
   background-color: rgb(47, 60, 81);
   text-align: center;
  box-shadow: -7px 0px 1px silver; 
   z-index: 1;
}

#detail {
   margin: auto;
    width: 95%;
 	background-color: white;
 	height: 20px;
 	font-family: Palatino Linotype;
}

.table {
   text-align: center;
   width: 100%;
   margin-left: auto;
   margin-right: auto;
}

.list {
   width: 95%;
   color: #333333;
   font-size: 9px;
   letter-spacing: -1px;
   border: none;
   background-color: transparent;
   margin-top:auto;
   margin-left: auto;
   margin-right: auto;
   float: center;
   margin-bottom: auto;
   text-align: center;
   font-family: Palatino Linotype;
}
.list:hover {
background-color: #0099ff;
}
.list:active {
  background-color: #0099ff;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
#rows{
	 background-color: #66ccff;
	 height: 30px;
	 
}
#address{
font-size:13px;
font-weight:bold;
padding-top:1px;
padding-bottom:1px;

}
#lat{
font-size:10px;
padding-top:1px;
padding-bottom:1px;
}

#wrappers {
	background-color: white:
}

</style>

</head>
<body>

   <!-- 지도를 출력할 영역에 아래 소스 삽입! -->
   <div id="container">
      <div id="map_canvas" style="width: 75%; height: 350px;"></div>
      <div id="markerList">
        
        <!--   <input type="search" style="width: 80%; margin-top:1px;"></input>
        <div id="detail"></div>
        	<div id="detail">
        	<h5>가까운 충전소</h5>
        	</div>
        -->
<!--          <div style="height: 500px;overflow-y: scroll;">
 -->         
         <div>
      </div>

   </div>

</body>
</html>