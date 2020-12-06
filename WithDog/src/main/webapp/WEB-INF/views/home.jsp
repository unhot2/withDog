<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="resources/css/index.css">
<section class="home">
	<script>
		$('.carousel').carousel({
			interval : 2000
		})
	</script>
	<div class="container">
		<div id="demo" class="carousel slide" data-ride="carousel">
			<div class="carousel-inner">
				<!-- 슬라이드 쇼 -->
				<div class="carousel-item active">
					<!--가로-->
					<img class="d-block w-100" src="resources/img/logo.jpg">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="resources/img/2.jpg">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="resources/img/3.jpg">
				</div>
				<!-- / 슬라이드 쇼 끝 -->
				
				<!-- 왼쪽 오른쪽 화살표 버튼 -->
				<a class="carousel-control-prev" href="#demo" data-slide="prev">
					<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					<!-- <span>Previous</span> -->
				</a>
				 <a class="carousel-control-next" href="#demo" data-slide="next">
					<span class="carousel-control-next-icon" aria-hidden="true"></span>
					<!-- <span>Next</span> -->
				</a>
				<!-- / 화살표 버튼 끝 -->
				
				<!-- 인디케이터 -->
				<ul class="carousel-indicators">
					<li data-target="#demo" data-slide-to="0" class="active"></li>
					<!--0번부터시작-->
					<li data-target="#demo" data-slide-to="1"></li>
					<li data-target="#demo" data-slide-to="2"></li>
				</ul>
				<!-- 인디케이터 끝 -->
			</div>
		</div>
	</div>
</section>
