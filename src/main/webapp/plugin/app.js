// For any third party dependencies, like jQuery, place them in the lib folder.

// Configure loading modules from the lib directory,
// except for 'app' ones, which are in a sibling
// directory.
requirejs.config({
	 //By default load any module IDs from 
	baseUrl:'/KitchenSurfing/plugin',
	paths:{
		app:'app',
		jquery:'jquery/jquery'
		//backbone:'backbone/backbone'
	},
    shim:{
    	'backbone':{
    		deps:['underscore','jquery'],
	        exports:'Backbone'
    	},
    	'underscore':{
    		exports:'_'
    	}
    }
});
//Start loading the main app file. Put all of
//your application logic in there.
require(['jquery'],function($){
	//alert($().jquery);
});
requirejs(['app/main']);