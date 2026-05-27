function myfunc(){
    let n="abc";
    console.log(n);
    function name(){
       console.log(n);
    }
    console.log("hello");
    return name;
    
}
var a = myfunc();
a();

console.log(9*"8")
//act acc to to first value if hteir is "9"+9+9 value is 999 but if their is 9+9+"9"
// then the answer is 189
console.log(9+"(9+9)")
