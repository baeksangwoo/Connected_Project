<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width"/>
<title>API Demo - Kakao JavaScript SDK</title>


</head>
<body>
<a id="navi" href="#" onclick="navi();">
<img src="/assets/img/about/buttons/navi/kakaonavi_btn_medium.png"/>
</a>
<script type='text/javascript'>
  //<![CDATA[
    // ����� ���� JavaScript Ű�� ������ �ּ���.
    Kakao.init('e4b983888306c07ffb11f843c2590a3f');
    // īī�� �α��� ��ư�� �����մϴ�.
    function navi(){
        Kakao.Navi.start({
            name: "�����ȭ�� �Ǳ���",
            x: 127.11205203011632,
            y: 37.39279717586919,
            coordType: 'wgs84'
        });
    }
  //]]>
</script>

</body>
</html>