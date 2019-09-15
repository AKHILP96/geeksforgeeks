// --- Directions
// Write a function that accepts an integer N
// and returns a NxN spiral matrix.
// --- Examples
//   matrix(2)
//     [[1, 2],
//     [4, 3]]
//   matrix(3)
//     [[1, 2, 3],
//     [8, 9, 4],
//     [7, 6, 5]]
//  matrix(4)
//     [[1,   2,  3, 4],
//     [12, 13, 14, 5],
//     [11, 16, 15, 6],
//     [10,  9,  8, 7]]

function matrix(n) {
	var result = [];
	for(let i=0;i<n;i++){
	 	result.push([]);
	}

	var startRow = 0;
	var endRow = n-1;
	var startCol = 0;
	var endCol = n-1;

	var counter = 1;

	while(startRow<=endRow && startCol<=endCol){
		// this is for the top row
		for(let i=startCol;i<=endCol;i++){
			result[startRow][i] = counter;
			counter+=1;
		}
		startRow++;
		// this is end col
		for(let j=startRow;j<=endRow;j++){
			result[j][endCol] = counter;
			counter+=1;
		}
		endCol--;
		//this is for last row
		for(let i=endCol;i>=startCol;i--){
			result[endRow][i] = counter;
			counter+=1;
		}
		endRow--;
		//this is for first col
		for(let j=endRow;j>=startRow;j--){
			result[j][startCol] = counter;
			counter+=1;
		}
		startCol++;
	}
	for(var i=0;i<n;i++){
				console.log(result[i]);
	}
	return result;
}

module.exports = matrix;
