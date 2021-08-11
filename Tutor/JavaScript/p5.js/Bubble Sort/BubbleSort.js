let lineHeight = [];
let lineWidth = 0;
let numLines = 0;
let i = 0;

function setup() {
	createCanvas(1000, 400);
	numLines = 100;
	for (let i = 0; i < numLines; i++) {
		lineHeight.push(int(random(0, height)));
	}
	lineWidth = width / numLines;
}

function draw() {
	colorMode(RGB);
	background(100, 200, 300);

	swap(lineHeight, Math.floor(random() * numLines), Math.floor(random() * numLines));

	for (let i = 0; i < lineHeight.length; i++) {
		colorMode(HSB);
		let lineColor = map(lineHeight[i], 0, height, 0, 360);
		if (lineWidth > 1) {
			stroke(0);
			fill(lineColor, 100, 100);
			rect(i * lineWidth, height - lineHeight[i], lineWidth, lineHeight[i]);
		} else {
			stroke(lineColor, 100, 100);
			line(i, height, i, height - lineHeight[i]);
		}
	}
}

function swap(array, index1, index2) {
	let temp = array[index1];
	array[index1] = array[index2];
	array[index2] = temp;
}
