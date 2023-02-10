function myMove() {
    let id = null;
    const elem = $("<div></div>").addClass("animate");
    $("#container").append(elem);
    let pos = 0;
    clearInterval(id);
    id = setInterval(frame, 5);

    function frame() {
        if (pos == 350) {
            clearInterval(id);
        } else {
            pos++;
            elem.css("top", pos + "px");
            elem.css("left", pos + "px");
        }
    }
}
