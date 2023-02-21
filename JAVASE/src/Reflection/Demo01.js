
//dynamic language component could be changed during running the program.
function f(){
    var x = "var a=3; var b=5; alert(a+b);"
    eval(x);
}