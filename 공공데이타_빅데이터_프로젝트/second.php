<?php
header("Content-Type: text/html; charset=UTF-8");

$ch2 = curl_init();
$url2 = 'http://apis.data.go.kr/B552015/NpsBplcInfoInqireService/getPdAcctoSttusInfoSearch'; /*URL*/
$queryParams2 = '?' . urlencode('ServiceKey') . '=bCmoAhi3OlijIFedb0McSQztB7s1AkW4KaM19P%2BGfs%2FwQ30Dk7T92JRsz92pVd%2BHBML8LzLWsYbAJ7vlLsTTfw%3D%3D'; /*Service Key*/
$queryParams2 .= '&' . urlencode('seq') . '=' . urlencode('17735069'); /*식별번호*/
$queryParams2 .= '&' . urlencode('data_crt_ym') . '=' . urlencode('201512'); /*년월(yyyymm)*/


curl_setopt($ch2, CURLOPT_URL, $url2 . $queryParams2);
curl_setopt($ch2, CURLOPT_RETURNTRANSFER, TRUE);
curl_setopt($ch2, CURLOPT_HEADER, FALSE);
curl_setopt($ch2, CURLOPT_CUSTOMREQUEST, 'GET');
$response2 = curl_exec($ch2);
curl_close($ch2);

$load_string2=simplexml_load_string($response2);
  
$com_in=$load_string2->body->items->item->lssJnngpCnt;
$com_out=$load_string2->body->items->item->nwAcqzrCnt;


print_r($com_out);
echo "퇴사".$com_out;

echo "신입".$com_in;
?>