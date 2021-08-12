let lineHeight = [];
let rectWidth = 0;
let numLines = 1000;
let i = 0;

// this gets called once and at the beggining of the program
function setup() {
	createCanvas(1000, 400);

	// this plugs in the number of lines into the array
	for (let i = 0; i < numLines; i++) {
		lineHeight.push(int(random(0, height)));
	}
	// this sets the rectWidth of the rectangles when in rectangle mode
	rectWidth = width / numLines;

	frameRate();
}

function draw() {
	// this draws the background in RGB mode continuosly
	colorMode(RGB);
	background(100, 200, 300);

	// swap(
	// 	lineHeight,
	// 	Math.floor(random(0, lineHeight.length)),
	// 	Math.floor(random(0, lineHeight.length))
	// );

	// this simply draws the rect/lines using the array as its height values
	for (let i = 0; i < lineHeight.length; i++) {
		// this maps the color from its height to its corresponding color
		colorMode(HSB);
		let lineColor = map(lineHeight[i], 0, height, 0, 360);

		// this says that if width is greater than one, then draw a rectangle else, draw a line
		if (rectWidth > 1) {
			stroke(0);
			fill(lineColor, 100, 100);
			rect(
				i * rectWidth,
				height - lineHeight[i],
				rectWidth,
				lineHeight[i]
			);
		} else {
			stroke(lineColor, 100, 100);
			line(i, height, i, height - lineHeight[i]);
		}
	}

	if (i < lineHeight.length) {
		let shifterIndex = i - 1;
		let key = lineHeight[i];
		while (shifterIndex >= 0 && key < lineHeight[shifterIndex]) {
			lineHeight[shifterIndex + 1] = lineHeight[shifterIndex];
			shifterIndex--;
		}
		lineHeight[shifterIndex + 1] = key;
	} else {
		noLoop();
	}
	i++;
}

function swap(array, index1, index2) {
	let temp = array[index1];
	array[index1] = array[index2];
	array[index2] = temp;
}

function insertionSort() {
	for (let i = 1; i < lineHeight.length; i++) {
		let shifterIndex = i - 1;
		let key = lineHeight[i];
		while (shifterIndex >= 0 && key < lineHeight[shifterIndex]) {
			lineHeight[shifterIndex + 1] = lineHeight[shifterIndex];
			shifterIndex--;
		}
		lineHeight[shifterIndex + 1] = key;
	}
}
