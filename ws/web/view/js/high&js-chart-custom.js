function ChangeDust() {	
    //div로
    document.getElementById('car_Status').innerHTML='<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>';        
    Highcharts.chart('container', {
        chart: {
          type: 'spline',
          scrollablePlotArea: {
            minWidth: 600,
            scrollPositionX: 1
          }
        },
        credits: {
          enabled: false
            },
        title: {
          text: '미세먼지 & 초미세먼지'
        },
        subtitle: {
          text: 'Connected Car Dust project'
        },
        xAxis: {
          type: 'datetime',
          labels: {
            overflow: 'justify'
          }
        },
        yAxis: {
          title: {
            text: '실내 미세먼지 (㎍/㎥)'
          },
          minorGridLineWidth: 0,
          gridLineWidth: 0,
          alternateGridColor: null,
          plotBands: [{ // Light air
            from: 0.1,
            to: 15.5,
            color: 'rgba(68, 170, 213, 0.1)',
            label: {
              text: '매우 좋음',
              style: {
                color: '#606060'
              }
            }
          }, { // Light breeze
            from: 15.5,
            to: 30.0,
            color: 'rgba(0, 0, 0, 0)',
            label: {
              text: '좋음',
              style: {
                color: '#606060'
              }
            }
          }, { // Gentle breeze
            from: 30.0,
            to: 55.5,
            color: 'rgba(68, 170, 213, 0.1)',
            label: {
              text: '보통',
              style: {
                color: '#606060'
              }
            }
          }, { // Moderate breeze
            from: 55.5,
            to: 80.0,
            color: 'rgba(0, 0, 0, 0)',
            label: {
              text: '보통 이상',
              style: {
                color: '#606060'
              }
            }
          }, { // Fresh breeze
            from: 80.0,
            to: 115.0,
            color: 'rgba(68, 170, 213, 0.1)',
            label: {
              text: '나쁨',
              style: {
                color: '#606060'
              }
            }
          }, { // Strong breeze
            from: 115.0,
            to: 150.0,
            color: 'rgba(0, 0, 0, 0)',
            label: {
              text: '매우 나쁨',
              style: {
                color: '#606060'
              }
            }
          }, { // High wind
            from: 150,
            to: 300,
            color: 'rgba(68, 170, 213, 0.1)',
            label: {
              text: '건강 위험',
              style: {
                color: '#606060'
              }
            }
          }]
        },
        tooltip: {
          valueSuffix: ' m/s'
        },
        plotOptions: {
          spline: {
            lineWidth: 4,
            states: {
              hover: {
                lineWidth: 5
              }
            },
            marker: {
              enabled: false
            },
            pointInterval: 3600000, // one hour
            pointStart: Date.UTC(2018, 5, 29, 0, 0, 0)
          }
        },
        series: [{
          name: '미세먼지',
          data: [
        	  71,45,45,35,30,34,28,44,33,48,  //10개\
        	  56,48,56,49,37,39,29,43,33,41,
        	  66,61,42,48,47,34,37,30,43,34,
        	  84,73,54,52,42,34,42,38,53,41,
        	  59,64,40,41,41,31,29,25,49,35
          ]
      
        }, {
          name: '초미세먼지',
          data: [ //50개
        	  25,29,24,21,29,26,17,20,15,20,20,25,
        	  73,84,78,52,58,54,38,37,34,63,53,83,
        	  53,85,74,56,53,44,36,34,35,58,42,58,
        	  65,79,85,57,55,55,39,38,33,55,44,56
          ]
        }],
        navigation: {
          menuItemStyle: {
            fontSize: '10px'
          }
        }
      });
}


function display(input){
   Highcharts.chart('container', {
       chart: {
           type: 'variablepie'
       },
       title: {
           text: 'Countries compared by population density and total area.'
       },
       tooltip: {
           headerFormat: '',
           pointFormat: '<span style="color:{point.color}">\u25CF</span> <b> {point.name}</b><br/>' +
               'Area (square km): <b>{point.y}</b><br/>' +
               'Population density (people per square km): <b>{point.z}</b><br/>'
       },
       series: [{
           minPointSize: 10,
           innerSize: '80%',
           zMin: 0,
           name: 'countries',
           data: input
       }]
   });
}




function ChangeDefault() {
  document.getElementById('car_Status').innerHTML='<div class="rows" style="margin: auto;" id="car_Status" onclick="ChangeDefault()"><img name="img2" src="view/tesla.gif" style="height: auto; margin-left: auto; margin-right: auto; max-height:100%; max-width:100%;" ><h1 id="carStatusText" style="color: rgb(58, 220, 4);"><li class="b">주행중</li></h1></div>';
}

//<!-- Default 화면 되돌아 가기 -->


function ChangeImage() {
//div로
document.getElementById('car_Status').innerHTML='<div class="card mb-3"><div class="card-header"><i class="fa fa-thermometer-three-quarters"></i>실내온도</div><div class="card-body"><canvas id="teChart" width="100%" height="40"></canvas> </div><div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div></div>';
refreshChart('teChart');
}
//<!-- 실내 온도 Chart -->


function ChangeHumidity() {

document.getElementById('car_Status').innerHTML='<div class="card mb-3"><div class="card-header"><i class="fa fa-shower"></i>실내습도</div><div class="card-body"><canvas id="humidity" width="100%" height="40"></canvas> </div><div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div></div>';
refreshChart('humidity');
}
// <!-- 실내 습도 Chart -->