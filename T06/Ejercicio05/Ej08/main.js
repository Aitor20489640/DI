function anade() {
    let ul = document.getElementById("lista");
    let li = document.createElement("li");
    let text = document.createTextNode("another element (added using javascript)");
    li.appendChild(text);
    ul.appendChild(li);
}