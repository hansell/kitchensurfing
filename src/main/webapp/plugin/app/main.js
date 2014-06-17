define(function (require) {
    // Load any app-specific modules
    // with a relative require call,
    // like:
    var messages = require('./messages');
    var print = require('print');
    var i18n=require('i18next-1.7.3');
    $.i18n.init({
        //lng: 'en-US',
        ns: { namespaces: ['ns.special'], defaultNs: 'ns.special'},
        useLocalStorage: false,
        debug: true
    }, function() {
      
    // alert($.t('headline.blog.blog'));
       
        $('#hamburger-head').i18n();
       // $('#extendedAttr').i18n();
    });
   
    print(messages.getHello());
});