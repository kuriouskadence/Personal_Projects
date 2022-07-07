class Dinosaur {
	constructor(x, y, w, h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	drawDino() {
		fill('#47485e');
		rect(this.x, this.y, this.w, this.h);
	}

	jump(step) {
		this.y -= step;
	}
}
