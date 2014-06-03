define(function (require, exports) {
    function helloPython() {
        alert("Hello,Python");
    }
    function helloJavaScript() {
        alert("Hello,JavaScript");
    }
    exports.helloPython = helloPython;
    exports.helloJavaScript = helloJavaScript;
});
