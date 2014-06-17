define(function () {
    return function print(msg) {
        console.log(msg);
    };
    var add=function(x,y){
    	return x+y;
    };
    return{
    	add:add
    };
});