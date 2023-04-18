import { initializeApp } from "https://www.gstatic.com/firebasejs/9.15.0/firebase-app.js"
import {getDatabase, ref, push, onValue, remove} from "https://www.gstatic.com/firebasejs/9.15.0/firebase-database.js";

const appSettings = {
    databaseURL: "https://playground-f5525-default-rtdb.firebaseio.com/"
}

const app = initializeApp(appSettings);
const database = getDatabase(app);
const shoppingListInDB = ref(database,"goods");

const inputField = document.getElementById("input-field");
const addButton = document.getElementById("add-button");
const shoppingListEl = document.getElementById("shopping-list");

onValue(shoppingListInDB, function(snapshot){
    if(snapshot.exists()){
        let itemsArray = Object.entries(snapshot.val());
        clearShoppingListEl();

        for(let i in itemsArray) {
            let currentItem = itemsArray[i];
            let currentItemID = currentItem[0];
            let currentItemValue = currentItem[1];
            appendItemToShoppingListEl(currentItemID, currentItemValue);
        }
    }
    else{
        shoppingListEl.innerHTML = "<b>No items here...</b>";
    }

});

addButton.addEventListener("click", function(){
    let inputValue = inputField.value;
    push(shoppingListInDB, inputValue);

    clearInputEl();
});


function clearInputEl() {
    inputField.value = "";
}

function clearShoppingListEl(){
    shoppingListEl.innerHTML = "";
}

function appendItemToShoppingListEl(id,itemValue) {
    // shoppingListEl.innerHTML += `<li id="${id}">${itemValue}</li>`;

    let newEL = document.createElement("li");
    newEL.textContent = itemValue;
    newEL.id = id;
    newEL.addEventListener("click", function(){
        let location = ref(database, "goods/" + this.id);
        remove(location);
    })
    shoppingListEl.append(newEL);
}


// let emails = {
//     "00": "Raymondu1199@oiw.com",
//     "01": "Ruaasodm@scas.com",
//     "02": "sap@edu.com"
// }
//
// console.log(Object.values(emails));
// console.log(Object.keys(emails));
// console.log(Object.entries(emails));
//
// // let scrimbaUsersEmails = Object.values(emails);
// // let scrimbaUsersEmails = Object.keys(emails);
// let scrimbaUsersEmails = Object.entries(emails);
// console.log(scrimbaUsersEmails)