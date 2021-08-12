let lineHeight = [];
let rectWidth = 0;
let numLines = 100;
let i = 0;

// This gets called once and at the beginning of the program
function setup() {
	createCanvas(1000, 400);

	// This plugs in the number of lines into the array
	for (let i = 0; i < numLines; i++) {
		lineHeight.push(int(random(0, height)));
	}

	// This sets the rectWidth of the rectangles when in rectangle mode
	rectWidth = width / numLines;
}

function draw() {
	// This draws the background in RGB Mode
	colorMode(RGB);
	background(0);

	// This simply draws the rect/lines using the array as its height values
	for (let i = 0; i < lineHeight.length; i++) {
		// This maps the color fromm its height to its corresponding color
		colorMode(HSB);
		let lineColor = map(lineHeight[i], 0, height, 0, 360);

		// This says that if width > 1, then draw rectangle, else draw lines
		if (rectWidth > 1) {
			stroke(0);
			fill(lineColor, 100, 100);
			rect(i * rectWidth, height - lineHeight[i], rectWidth, lineHeight[i]);
		} else {
			stroke(lineColor, 100, 100);
			line(i, height, i, height - lineHeight[i]);
		}
	}

	if (i < lineHeight.length) {
		let key = lineHeight[i];
		let shifterIndex = i - 1;
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
		let key = lineHeight[i];
		let shifterIndex = i - 1;
		while (shifterIndex >= 0 && key < lineHeight[shifterIndex]) {
			lineHeight[shifterIndex + 1] = lineHeight[shifterIndex];
			shifterIndex--;
		}
		lineHeight[shifterIndex + 1] = key;
	}
}
