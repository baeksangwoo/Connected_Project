<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="initial-scale=1.0" />


<style>
#container {
	text-align: center;
}
</style>

</head>
<body>

	<div class="row">
		<section class="content">
			<div class="col-md-12 col-md-offset-0">
				<div class="panel panel-default">
					<div class="panel-body">
						<div class="pull-right">
							<div class="btn-group">
								<button type="button" class="btn btn-success btn-filter"
									data-target='pagado'>충전 완료!</button>
								<button type="button" class="btn btn-warning btn-filter"
									data-target='pendiente'>오류 ⋅ 지연</button>
								<button type="button" class="btn btn-danger btn-filter"
									data-target='cancelado'>충전 취소</button>
								<button type="button" class="btn btn-default btn-filter"
									data-target="all">모든 정보</button>
							</div>
						</div>
						<div class="table-container">
							<table class="table table-filter">
								<tbody>
									<!-- paging 처리 부분입니다. -->
									<!-- 매우 중요한 부문 이부분을 아는 것이 게시판의 목록을 조회하는 것과 비슷하다-->
									<c:forEach items="${charginglist}" var="list">
															<tr data-status=<c:choose><c:when test="${list.car_charging_status == 'Charging'}">pagado</c:when>
													       <c:when test="${list.car_charging_status == 'Delay'}">pendiente</c:when>
													       <c:when test="${list.car_charging_status == 'Cancel'}">cancelado</c:when>
													       <c:otherwise>pendiente</c:otherwise></c:choose>>
											<!-- data-status를 pagado 충전[charging]바꾸어야 한다. pendiente 접속 지연[delay], cancelado 취소[cancel] -->
											<td>
												<div class="ckbox">
													<input type="checkbox" id="checkbox1"> <label
														for="checkbox1"></label>
												</div>
											</td>
											<td><a href="javascript:;" class="star"> <i
													class="glyphicon glyphicon-star"></i>
											</a></td>
											<td>
												<div class="media">
													<a href="#" class="pull-left"> <img
														src="https://s3.amazonaws.com/uifaces/faces/twitter/fffabs/128.jpg"
														class="media-photo">
													</a>
													<div class="media-body">
														<span class="media-meta pull-right">${list.car_charging_date}</span>
														<!--날짜가 들어와야한다.-->
														<h4 class="title">
															Model ${list.car_number} <span
																class="pull-right <c:choose>
																			<c:when test="${list.car_charging_status == 'Charging'}">pagado</c:when>
													       <c:when test="${list.car_charging_status == 'Delay'}">pendiente</c:when>
													       <c:when test="${list.car_charging_status == 'Cancel'}">cancelado</c:when>
													      </c:choose>">
																<c:choose>
																	<c:when
																		test="${list.car_charging_status == 'Charging'}">(충전 완료!)</c:when>
																	<c:when test="${list.car_charging_status == 'Delay'}">(접속 지연)</c:when>
																	<c:when test="${list.car_charging_status == 'Cancel'}">(Cancel!)</c:when>
																</c:choose>
															</span>
														</h4>
														<p class="summary">${list.car_charging_place}</p>
													</div>
												</div>
											</td>
										</tr>
									</c:forEach>
								</tbody>

							</table>
						</div>
					</div>
				</div>
			</div>
			
		</section>
	</div>
</body>
</html>