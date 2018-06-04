
Highcharts.chart('container', {
    chart: {
      type: 'spline',
      scrollablePlotArea: {
        minWidth: 600,
        scrollPositionX: 1
      }
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
        pointStart: Date.UTC(2018, 1, 13, 0, 0, 0)
      }
    },
    series: [{
      name: '미세먼지',
      data: [
        3.7, 3.3, 160.9, 5.1, 3.5, 3.8, 4.0, 5.0, 6.1, 3.7, 3.3, 6.4,
        6.9, 6.0, 6.8, 60.4, 4.0, 3.8, 5.0, 4.9, 9.2, 9.6, 9.5, 6.3,
        9.5, 10.8, 14.0, 11.5, 90.0, 10.2, 10.3, 9.4, 8.9, 10.6, 10.5, 11.1,
        10.4, 10.7, 50.3, 10.2, 9.6, 10.2, 11.1, 10.8, 13.0, 12.5, 12.5, 11.3,
        10.1
      ]
  
    }, {
      name: '초미세먼지',
      data: [
        0.2, 0.1, 0.1, 0.1, 0.3, 0.2, 0.3, 0.1, 0.7, 0.3, 0.2, 0.2,
        0.3, 0.1, 0.3, 0.4, 0.3, 0.2, 0.3, 0.2, 0.4, 0.0, 0.9, 0.3,
        0.7, 1.1, 1.8, 1.2, 1.4, 1.2, 0.9, 0.8, 0.9, 0.2, 0.4, 1.2,
        0.3, 2.3, 1.0, 0.7, 1.0, 0.8, 2.0, 1.2, 1.4, 3.7, 2.1, 2.0,
        1.5
      ]
    }],
    navigation: {
      menuItemStyle: {
        fontSize: '10px'
      }
    }
  });