let money : number | string = 100;
money = "1 M"

// Union type is used when we want to assign more than 
// one type to a variable. In this case, the variable 'money' can be either a number or a string.

let status: "success" | "pending" |"error" = "pending"
 status = "success"

//any type is used when we want to assign any type of value to a variable.
// It is a fallback type that can be used when we don't know the type of value that will be assigned to the variable.

let orders = ["12" , "23" , "34"];

let customerorder ;

for ( let order of orders ){
    if (order === "23"){
        customerorder = order;
    }
}
console.log(customerorder);

// In the above code, the variable 'customerorder' is declared without a type,
//  which means it can be assigned any type of value.

//but we avoid using any type as it defeats the purpose of using TypeScript, 
// which is to provide type safety and catch errors at compile time.