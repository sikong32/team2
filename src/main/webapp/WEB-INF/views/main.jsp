<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>화려한 디자인과 시계</title>
    <style>
        body {
            background-color: #f0f0f0;
            text-align: center;
            font-family: 'Arial', sans-serif;
            overflow: hidden;
        }

        h1 {
            color: #3498db;
        }

        #gallery {
            display: flex;
            overflow-x: auto;
            white-space: nowrap;
        }

        img {
            border-radius: 15px; /* 더 큰 border-radius로 변경 */
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2); /* 더 큰 그림자 효과로 변경 */
            width: 400px; /* 이미지 너비 확대 */
            height: 200PX;
            margin-right: 20px; /* 이미지 간 간격 조절 */
/*             animation: rotateImage 12s linear infinite; /* 이미지 회전 애니메이션 지속시간 조절 */ */
        }

        #clock {
            font-size: 28px; /* 더 큰 폰트 크기로 변경 */
            margin-top: 30px; /* 더 큰 상단 여백으로 변경 */
            color: #2ecc71;
            animation: bounceClock 1.5s ease-in-out infinite; /* 시계 튕김 애니메이션 지속시간 조절 */
        }

        @keyframes rotateImage {
            from {
                transform: rotate(0deg);
            }
            to {
                transform: rotate(360deg);
            }
        }

        @keyframes bounceClock {
            0%, 20%, 50%, 80%, 100% {
                transform: translateY(0);
            }
            40% {
                transform: translateY(-30px); /* 더 큰 튕김 거리로 변경 */
            }
            60% {
                transform: translateY(-15px); /* 더 큰 튕김 거리로 변경 */
            }
        }
    </style>
    <script>
        function updateClock() {
            var now = new Date();
            var hours = now.getHours();
            var minutes = now.getMinutes();
            var seconds = now.getSeconds();

            hours = hours < 10 ? '0' + hours : hours;
            minutes = minutes < 10 ? '0' + minutes : minutes;
            seconds = seconds < 10 ? '0' + seconds : seconds;

            var timeString = hours + ':' + minutes + ':' + seconds;
            document.getElementById('clock').innerHTML = timeString;

            setTimeout(updateClock, 1000);
        }

        window.onload = function() {
            updateClock();
        };
    </script>
</head>
</head>
<body>
	<img alt="" src="./image/sky1.jpg" width="300px">
	<img alt="" src="./image/sky2.jpg" width="300px">
	<img alt="" src="./image/sky3.jpg" width="300px">
	<div id="clock"></div>
</body>
</html>