/*let selectedItem = document.querySelector('li.selected');
let first = selectedItem.previousElementSibling;
let last = selectedItem.nextElementSibling;
let list = selectedItem.parentElement;
let header = selectedItem.parentElement.parentElement;
let section = selectedItem.parentElement.parentElement.nextElementSibling;

console.log(selectedItem.parentElement);
console.log(first);
console.log(last);
console.log(list);
console.log(header);*/

/*let h = document.querySelector('header');
        console.log(h);
let s = h.nextElementSibling.children; 
        console.log(s); 
let sc = document.querySelector('section.current');
        console.log(sc);
let sc1 = sc.nextElementSibling;
        console.log(sc1);
let sc2 = sc.previousElementSibling.children[0];
        console.log(sc2);
let sc3 = sc.parentElement;
        console.log(sc3);
let sc4 = document.querySelectorAll('section h2');
        console.log(sc4);*/


let inputBox = document.getElementById("input-box");
let listContainer = document.getElementById("list-container");

        function addToDo() {
            if(inputBox.value === '') {
                alert("You must add ToDo!");
            } else {
                let li = document.createElement("li");
                li.innerText = inputBox.value;
                listContainer.appendChild(li);
        let span = document.createElement("span");
                span.innerText = "\u2421";
                li.appendChild(span);
            }
            inputBox.value = "";
        }

listContainer.addEventListener("click", function(e) {
       if(e.target.tagName === "LI") {
        e.target.classList.toggle("checked");
       } 
       else if(e.target.tagName === "SPAN") {
        e.target.parentElement.remove();
       }
}, false);