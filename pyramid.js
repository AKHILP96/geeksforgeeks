function pyramid(n) {
	var totalLength = 1+(n-1)*2;
	for(var i=1;i<=n;i++){
		var str = '';
		var temp1 = n-i;
		var temp2 = n-i;
		var strC = totalLength - temp1 - temp2;
		while(temp1--){
			str+= ' ';
		}
		while(strC--){
			str+='#';
		}
		while(temp2--){
			str+=' ';
		}
		console.log(str);
	}
}
