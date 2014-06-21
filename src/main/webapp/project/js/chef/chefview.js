
var TrainExViews=Backbone.View.extend({
    el:$(".trainexcontainer"),
    events: {
        'click  .addTrain': 'addTrainView',
    },
    //将模型渲染
    render:function()
    {
        var model=this.model.toJSON;
        var htmlitem = this.template(this.model.toJSON());
        this.$el.append(htmlitem);
        return this.$el;
    } ,
    addTrainView:function(e)
    {
        var trainadd=new TrainExAddView();
        var item=trainadd.render();
        this.$el.find(".trainexitems").append(item);
        
        trainadd.on("form:savetrainex",function(attrs){
        	
        	 console.dir(attrs);   
        	
        	
        });

    }
});


var TrainExAddView=Backbone.View.extend({
    template: _.template($('#tpl-trainexadd').html()),
    events: {
        'click  .save': 'onFormSave',
        'click  .cancel': 'onFormCancel'
    },
    //将模型渲染
    render:function()
    {
        //var model=this.model.toJSON;
        var htmlitem = this.template();
        this.$el.append(htmlitem);
        return this.$el;
    } ,
    onFormSave:function(e)
    {
    	var that=this;
    	this.trigger("form:savetrainex",{
    		 "startdate":that.$el.find("input[name='startdate']").val(),
    		 "enddate":that.$el.find("input[name='enddate']").val(),
    		 "traincontent":that.$el.find(".traincontent").val()
    	});
        alert("onFormSave!!!");

    },
    onFormCancel:function()
    {
    	//alert("onFormCancel!!!");
    	this.$el.remove();
    	
    	
    }
});

var UserEditView=Backbone.View.extend({
    // tagName:"div",
    // className:"testclass",
    //编辑模板
    template: _.template($('#tpl-contactedit').html()),
    //将模型渲染
    render:function()
    {
        var model=this.model.toJSON;
        var htmlitem = this.template(this.model.toJSON());
        // $(document.body).append(htmlitem);
        //console.dir(model);
        //console.log(this.$el);
        this.$el.append(htmlitem);
        return htmlitem;
    }
});


 App.View.UserViews=Backbone.View.extend({

        render:function()
        {
          this.collection.each(this.renderOne,this);
        },
        renderOne:function(model){
            var item=new App.View.UserView({model:model}).render();
            this.$el.append(item);
        }

 });