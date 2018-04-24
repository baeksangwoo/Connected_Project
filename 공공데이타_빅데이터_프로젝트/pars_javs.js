var xhr = new XMLHttpRequest();
var url = 'http://apis.data.go.kr/B552015/NpsBplcInfoInqireService/getDetailInfoSearch; /*URL*/
var queryParams = '?' + encodeURIComponent('ServiceKey') + '='+'bCmoAhi3OlijIFedb0McSQztB7s1AkW4KaM19P%2BGfs%2FwQ30Dk7T92JRsz92pVd%2BHBML8LzLWsYbAJ7vlLsTTfw%3D%3D'; /*Service Key*/
queryParams += '&' + encodeURIComponent('seq') + '=' + encodeURIComponent('22216); /*식별번호*/
xhr.open('GET', url + queryParams);
xhr.onreadystatechange = function () {
    if (this.readyState == 4) {
        alert('Status: '+this.status+' Headers: '+JSON.stringify(this.getAllResponseHeaders())+' Body: '+this.responseText);
    }
};

xhr.send('');