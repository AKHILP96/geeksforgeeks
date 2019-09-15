const Stack = require('./stack');

class Queue {
	constructor(){
		this.first = new Stack();
		this.second = new Stack();
	}
	add(n){
		first.push(n);
	}
	remove(){
		while(first.peek()){
			second.push(first.pop());
		}
		second.pop();
		while(second.peek()){
			first.push(second.pop());
		}
	}
	peek(){
		while(first.peek()){
			second.push(first.pop());
		}
		return second.peek();
		while(second.peek()){
			first.push(second.pop());
		}
	}

}

module.exports = Queue;
