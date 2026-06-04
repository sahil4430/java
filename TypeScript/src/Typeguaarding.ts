// typeguarding is an expression or function that perform a run time check to narrow down the type 
//of a variable within a specific  condition block 

function isString( value: any ) : value is string {
        return typeof value === "string";
};


function isStringorNumber ( value : string | number)  {
    if (typeof value  === "string"){
        return value;
    }else{
        return(value) 
    }
    
}

class ballpen {
    type(){
        return `ball pen `;
    }
}
class Gelpen {
    type(){
        return `gel pen `;
    }
}

function whichPen( pen :ballpen | Gelpen){
    if (pen instanceof ballpen){
        return pen.type();
    }else{
        return pen;
    }
}

type newType ={
    name : string
    amount : number
}

function isNewType( value : any ) : value is newType{
    return (
        typeof value === "object" &&
        value !== null &&
        typeof value.name == "string" &&
        typeof value.amount === "number"
    )
}

function addType( Type : newType | string){

    if ( isNewType(Type)){
        return ( `this is new type ${Type.name}`)
    }else{
        return ( `this is string type ${Type}`)
    }
}