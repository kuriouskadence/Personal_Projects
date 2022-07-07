class Obstacle {
	constructor(x, y, w, h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	drawObstacle() {
		fill('#47485e');
		rect(this.x, this.y, this.w, this.h);
	}

	moveLeft(step) {
		this.x -= step;
	}
}
