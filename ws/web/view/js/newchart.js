
$(document).ready(function(){
	  var speedCanvas = document.getElementById("speedChart");
	    Chart.defaults.global.defaultFontFamily = "Lato";
	    Chart.defaults.global.defaultFontSize = 18;
	    
	    var dataFirst = {
	        label: "Car  - 용량 (%)",
	        data: [0, 59, 75, 20, 20, 55, 40],
	        lineTension: 0.3,
	        fill: false,
	        borderColor: 'red',
	        backgroundColor: 'transparent',
	        pointBorderColor: 'red',
	        pointBackgroundColor: 'lightgreen',
	        pointRadius: 5,
	        pointHoverRadius: 15,
	        pointHitRadius: 30,
	        pointBorderWidth: 2,
	        pointStyle: 'rect'
	      };
	    
	    var dataSecond = {
	        label: "Car  - 온도 (°C)",
	        data: [20, 15, 38, 40, 55, 30, 60],
	        lineTension: 0.3,
	        fill: false,
	        borderColor: 'purple',
	        backgroundColor: 'transparent',
	        pointBorderColor: 'purple',
	        pointBackgroundColor: 'lightgreen',
	        pointRadius: 5,
	        pointHoverRadius: 15,
	        pointHitRadius: 30,
	        pointBorderWidth: 2
	      };
	    
	    var speedData = {
	      labels: ["0s", "10s", "20s", "30s", "40s", "50s", "60s"],
	      datasets: [dataFirst, dataSecond]
	    };
	    
	    var chartOptions = {
	      legend: {
	        display: true,
	        position: 'top',
	        labels: {
	          boxWidth: 10,
	          fontColor: 'black'
	        }
	      }
	    };
	    
	    var lineChart = new Chart(speedCanvas, {
	      type: 'line',
	      data: speedData,
	      options: chartOptions
	    }); 
}); 
 
 

