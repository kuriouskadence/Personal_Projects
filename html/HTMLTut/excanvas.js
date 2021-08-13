function init() {
	var canvas = document.getElementById('canvas');
	console.log(canvas);

	if (canvas.getContext) {
		var ctx = canvas.getContext('2d');
		ctx.fillStyle = '#FAEBD7';
		ctx.fillRect(0, 0, canvas.width, canvas.height);

		ctx.fillStyle = '#AF002A';
		ctx.fillRect(100, 100, 50, 50);

		ctx.lineWidth = 5;
		ctx.strokeStyle = '#A4C639';
		ctx.strokeRect(100, 100, 50, 50);

		ctx.fillStyle = '00308F';
		/* this allows u to start drawing arcs or circles*/
		ctx.beginPath();

		/* x, y , radius, starting angle, and if u want a perfect cirlce Math.PI*2; true goes counterclockwise, false goes clockwise*/
		ctx.arc(200, 200, 50, 0, Math.PI * 2, true);

		ctx.fill();

		/* to draw polygons or oddly shaped shapes*/
		ctx.fillStyle = '#3B444';
		ctx.beginPath();

		ctx.moveTo(350, 200);
		ctx.lineTo(400, 50);
		ctx.lineTo(450, 200);
		ctx.closePath();
		ctx.fill();

		ctx.strokeStyle = '#A4C639';
		ctx.beginPath();
		ctx.moveTo(350, 200);
		ctx.lineTo(400, 50);
		ctx.lineTo(450, 200);
		ctx.closePath();
		ctx.stroke();

		/* u can create gradient fills*/

		var linGrad = ctx.createLinearGradient(400, 100, 500, 500);

		linGrad.addColorStop(0, '#8DB600');
		linGrad.addColorStop(0.5, '#9966CC');
		linGrad.addColorStop(1, '#7C0A02');

		ctx.fillStyle = linGrad; /* "rgba(10,150,255,0.5");*/
		ctx.fillRect(400, 100, 100, 100);

		var radGrad = ctx.createRadialGradient(275, 250, 5, 290, 260, 100);
		radGrad.addColorStop(0, 'red');
		radGrad.addColorStop(1, 'white');
		ctx.fillStyle = radGrad;
		ctx.arc(200, 200, 50, 0, Math.PI * 2, true);
		ctx.fill();

		ctx.font = 'bold 40px Arial';
		ctx.fillStyle = '#8BD600';
		ctx.fillText('Hello', 100, 100);

		ctx.strokeStyle = 'black';
		ctx.lineWidth = 1;
		ctx.strokeText('Hello', 100, 100);

		ctx.shawdowOffsetX = 2;
		ctx.shawdowOffsetY = 2;
		ctx.shawdowBlur = 3;
		ctx.shawdowColor = 'black';
		ctx.fillText('Hello', 100, 100);

		ctx.lineWidth = 20;
		ctx.strokeStyle = 'purple';
		ctx.beginPath();
		ctx.moveTo(200, 150);
		ctx.lineCap = 'butt'; /* u can also put it as "round" or "sqaure*/
		ctx.lineTo(200, 250);
		ctx.stroke();

		ctx.beginPath();

		ctx.arc(270, 270, 50, 0, 3.14, true);
		ctx.stroke();

		ctx.strokeStyle = 'red';
		ctx.beginPath();

		ctx.moveTo(300, 150);
		ctx.quadraticCurveTo(350, 250, 450, 250);
		ctx.stroke();

		ctx.strokeStyle = 'blue';
		ctx.beginPath();
		ctx.moveTo(450, 250);
		ctx.bezierCurveTo(550, 250, 450, 100, 550, 100);
		ctx.stroke();

		ctx.fillStyle = 'purple';
		ctx.fillRect(200, 200, 100, 100);

		ctx.rotate(Math.PI / 4);
		ctx.scale(0.5, 1);
		ctx.fillRect(400, 50, 400, 100);
	}
}

onload = init;
