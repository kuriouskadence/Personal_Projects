function init() {
	var h1tags = document.getElementsByTagName('h1');
	console.log(h1tags);

	// 0 represents the very first htag incase there are mulitple, onclick = when it is clicked on
	// run function changeColor

	h1tags[0].onclick = changeColor;
}

function changeColor() {
	// 'this'refers to the h1 tag
	this.innerHTML = 'Click again';

	// generate a random hex code - color
	var randomcolor = '#' + Math.floor(Math.random() * 16777215).toString(16);

	this.style.color = randomcolor;
}

function toggleImg() {
	// refrence to image
	var img = document.getElementById('danceImg');
	var isImgVisible = img.style.visibility != 'visible';
	// isImgVisible has a value of true or false, so if it is not visible make it visible however keep it hidden
	img.style.visibility = isImgVisible ? 'visible' : 'hidden';
}

onload = init;
