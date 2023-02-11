$("document").ready(function (){
    $("input[type='submit']").click(function (){
        $("form").bind("submit", manualValidate());
    })
})

function manualValidate() {
    let boolArray = [true, true, true, true];

    let name = $("input[name='nombre']").text();
    console.log(name);
    if (!name.match(/^[A-Z][a-z]{3}$/)) {
        boolArray[0] = false;
        $("input[name='nombre']").css("border-color", "red");
        let nameSpan = $("<span></span>").text("Xxxx");
        $("input[name='nombre']").after(nameSpan);
    } else {
        $("input[name='nombre']").css("background-color", "green");
    }

    let tel = $("input[name='tel']").text();
    console.log(tel);
    if (!tel.match(/^[0-9]{3}-[0-9]{6}$/)) {
        boolArray[1] = false;
        $("input[name='tel']").css("border-color", "red");
        let telSpan = $("<span></span>").text("XXX-XXXXXX");
        $("input[name='tel']").after(telSpan);
    } else {
        $("input[name='tel']").css("background-color", "green");
    }

    let cp = $("input[name='cp']").text();
    console.log(cp)
    if (!cp.match(/^[0-9]{5}$/)) {
        boolArray[2] = false;
        $("input[name='cp']").css("border-color", "red");
        let cpSpan = $("<span></span>").text("XXXXX");
        $("input[name='cp']").after(cpSpan);
    } else {
        $("input[name='cp']").css("background-color", "green");
    }

    let email = $("input[name='email']").text();
    console.log(email)
    if (!email.match(/^[a-z0-9]{3}@[a-z]{4}\.[a-z]{2}$/)) {
        boolArray[3] = false;
        $("input[name='email']").css("border-color", "red");
        let emailSpan = $("<span></span>").text("xxx@xxxx.xx");
        $("input[name='email']").after(emailSpan);
    } else {
        $("input[name='email']").css("background-color", "green");
    }

    for (const bool in boolArray) {
        if (bool === false) {
            return false;
        }
        return true;
    }
}