$("document").ready(function () {
    let altimgs = $("img");

    altimgs.hover(function () {
        altimgs.css("border-width", "0");
        altimgs.css("opacity", "0.4");
        $(this).css("border", "3px solid black");
        $(this).css("opacity", "1");
    });
    altimgs.mouseleave(function () {
        altimgs.css("border-width", "0");
        altimgs.css("opacity", "1");
    });
})