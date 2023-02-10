$("document").ready(async function () {
    let ulist = $("body").html();
    console.log("Se va a eliminar la lista");
    await new Promise(resolve => setTimeout(resolve, 1000));
    $("ul").remove();
    console.log("Se va a restaurar la lista");
    await new Promise(resolve => setTimeout(resolve, 1000));
    $("body").append(ulist);
    console.log("Se va a añadir un nuevo elemento al final");
    await new Promise(resolve => setTimeout(resolve, 1000));
    $("ul").children("li:last-child").after($("<li></li>").text("nuevo item"));
    console.log("Se va un nuevo elemento al principio");
    await new Promise(resolve => setTimeout(resolve, 1000));
    $("ul").children("li:first-child").before($("<li></li>").text("nuevo item"));
    console.log("Se va a eliminar el ultimo elemento");
    await new Promise(resolve => setTimeout(resolve, 1000));
    $("ul").children("li:last-child").remove();
    console.log("Se va a eliminar el primer elemento");
    await new Promise(resolve => setTimeout(resolve, 1000));
    $("ul").children("li:first-child").remove();
    console.log("Se van a eliminar los dos primeros elementos");
    await new Promise(resolve => setTimeout(resolve, 1000));
    $("ul").children("li:first-child").remove();
    $("ul").children("li:nth-child(1)").remove();
    console.log("Se van a eliminar los dos ultimos elementos");
    await new Promise(resolve => setTimeout(resolve, 1000));
    $("ul").children("li:nth-last-child(1)").remove();
    $("ul").children("li:last-child").remove();


});