function vowels(str) {
	const chars = str.match(/[aeiou]/gi);
	return chars ? chars.length : 0;
}

module.exports = vowels;
