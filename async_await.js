async function getdata(){
let response = await fetch ("https://jsonplaceholder.typicode.com/users");
console.log(response);
let data = await response.json();
console.log(data);
return data;

}
async function showdata(){
    try{ 
        let user = await getdata();
        console.log(user);
    }
    catch(error){
        console.log(error);
    }
}

showdata();