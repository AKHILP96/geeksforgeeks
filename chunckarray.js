function chunk(array, size) {
	var res = [];
	var j=0;
	console.log(array);
	console.log(size);
	for(var i=0;i<array.length;i++){
		var temp = size;
		var arr = [];
		while(temp-->0){
			arr.push(array[i]);
			i++;
			if(i>=array.length){
				//i-=2;
				break;
			}
		}
		i--;
		console.log(arr);
		res.push(arr);
		console.log(res);
	}
	return res;
	
}
