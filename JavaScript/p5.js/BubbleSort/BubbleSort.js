let lineHeight = [];
let lineWidth = 0;
let numLines = 0;

function setup() {
	createCanvas(1000, 400);
	numLines = 100;
	for (let i = 0; i < numLines; i++) {
		lineHeight.push(int(random(0, height)));
	}
	lineWidth = width / numLines;
	console.log(lineHeight);
}

function draw() {
	colorMode(RGB);
	background(100, 200, 300);

	for (let i = 0; i < lineHeight.length; i++) {
		colorMode(HSB);
		let lineColor = map(lineHeight[i], 0, height, 0, 360);
		stroke(0);
		fill(lineColor, 100, 100);
		rect(i * lineWidth, height - lineHeight[i], lineWidth, lineHeight[i]);
	}
}
