function fnGetUser() {
    let userId = document.querySelector("#user-id").value;
    console.log(userId);

    fetch("https://jsonplaceholder.typicode.com/users/"+ userId)
        .then((resp) => resp.json())
        .then(resp => {
            document.getElementById("name").innerHTML = resp.name;
            document.getElementById("username").innerHTML = resp.username;
            document.getElementById("email").innerHTML = resp.email;
            document.getElementById("street").innerHTML = resp.address.street;

        });
}


/**
 * 
 * @author Naveen 
 * @returns 
 */
function fnPostUser() {
    let obj ={} ;
    // obj.userid = document.getElementById("userid").value; 
    obj.userid = 100; 
    obj.name = "Peter"; 

    fetch("https://jsonplaceholder.typicode.com/users/",  
    {
        method:"POST", 
        body: JSON.stringify(obj), 
        headers : {
            "Content-Type":"application/json"
        }
    })
        .then( resp => resp.json())
        .then(resp => {
            console.log("response got from server"); 
            return true; }
            )
        .catch(err => console.log("Error : ", err)); 

        return false; 
}