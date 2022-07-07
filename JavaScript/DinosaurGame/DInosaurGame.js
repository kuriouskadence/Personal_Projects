let dino;
let obstacles;
let downFrame = -1;
let jumpFrame = -1;
const jumpTime = 30;
const distance = 200;

let obstacleCreateFrame = 1;
const obstacleGapBeginRange = 50;
const obstacleGapEndRange = 200;
const obstacleHeightBeginRange = 50;
const obstacleHeightEndRange = 75;

function setup() {
	createCanvas(1000, 600);
	colorMode(HSB);
	dino = new Dinosaur(100, 400, 100, 200);
	obstacles = [];
}

function draw() {
	if (touchOrNo()) {
		console.log('Loser');
		noLoop();
	}

	background('#5961d9');
	// console.log(frameCount);
	drawAllObs();
	dino.drawDino();
	jumpConditions();
	createDestroyObstacles();
}

function keyPressed() {
	if (keyCode == 32 && frameCount - jumpFrame > 2 * jumpTime) {
		jumpFrame = frameCount;
	}
}

function getRandom(inclusiveBegin, inclusiveEnd) {
	return Math.floor(
		Math.random() * (inclusiveEnd - inclusiveBegin + 1) + inclusiveBegin
	);
}

function jumpConditions() {
	//this says jump upwards for jumpTime Frames
	if (frameCount - jumpFrame <= jumpTime && jumpFrame != -1) {
		dino.jump(distance / jumpTime);
	}

	// when it's reached the top, start to descend
	if (frameCount - jumpFrame + 1 == jumpTime + 1 && jumpFrame != -1) {
		downFrame = frameCount;
	}

	//descend for jumpTime Frames
	if (frameCount - downFrame < jumpTime && downFrame != -1) {
		dino.jump(-distance / jumpTime);
	}
}

function createDestroyObstacles() {
	if (frameCount == obstacleCreateFrame) {
		let randHeight = getRandom(
			obstacleHeightBeginRange,
			obstacleHeightEndRange
		);
		obstacles.push(
			new Obstacle(width + 1, height - randHeight, 10, randHeight)
		);
		obstacleCreateFrame += getRandom(
			obstacleGapBeginRange,
			obstacleGapEndRange
		);
	}

	obstacles = obstacles.filter((obstacle) => {
		return obstacle.x + obstacle.w >= 0;
	});
}

function drawAllObs() {
	obstacles.forEach((obstacle) => {
		obstacle.drawObstacle();
		obstacle.moveLeft(4);
	});
}

function touchOrNo() {
	let dinoTopLeftCornerx = dino.x;
	let dinoTopRightCornerx = dino.x + dino.w;
	let dinoTopLeftCornery = dino.y;
	let dinoBottomLeftCornery = dino.y + dino.h;

	let collisonBool = false;

	obstacles.forEach((obstacle) => {
		let obsTopLeftCornerx = obstacle.x;
		let obsTopRightCornerx = obstacle.x + obstacle.w;
		let obsTopLeftCornery = obstacle.y;
		let obsBottomLeftCornery = obstacle.y + obstacle.h;

		let obsTopLeftInsideDinox =
			obsTopLeftCornerx >= dinoTopLeftCornerx &&
			obsTopLeftCornerx <= dinoTopRightCornerx;
		let obsTopRightInsideDinox =
			obsTopRightCornerx >= dinoTopLeftCornerx &&
			obsTopRightCornerx <= dinoTopRightCornerx;
		let obsCornerOutsideDinox =
			obsTopLeftCornerx <= dinoTopLeftCornerx &&
			obsTopRightCornerx >= dinoTopRightCornerx;

		let obsTopLeftInsideDinoy =
			obsTopLeftCornery <= dinoBottomLeftCornery &&
			obsTopLeftCornery >= dinoTopLeftCornery;

		if (
			obsTopLeftInsideDinoy &&
			(obsCornerOutsideDinox ||
				obsTopLeftInsideDinox ||
				obsTopRightInsideDinox)
		) {
			collisonBool = true;
		}
	});

	return collisonBool;
}
