$(document).ready(function () {

    if (window.localStorage.length === 0) {
        generateGraphWeightAge(0);
        generateGraphTension(0);
        generateGraphHeartbeats(0);
    } else {
        generateGraphWeightAge(window.localStorage.length - 1);
        generateGraphTension( window.localStorage.length - 1);
        generateGraphHeartbeats(window.localStorage.length - 1);
    }

    $("form").submit(function (event) {
        event.preventDefault();
        let numberNewCockies = 0;
        let name = $("#name").val(), age = $("#age").val(), weight = $("#weight").val(),
            tensionS = $("#tension-s").val(), tensionD = $("#tension-d").val(),
            heartbeats = $("#heartbeat").val();

            localStorage.setItem("name", name);
            if (localStorage.length <= 1) {
                localStorage.setItem("age" + numberNewCockies, age);
                localStorage.setItem("weight" + numberNewCockies, weight);
                localStorage.setItem("tensionS" + numberNewCockies, tensionS);
                localStorage.setItem("tensionD" + numberNewCockies, tensionD);
                localStorage.setItem("heartbeats" + numberNewCockies, heartbeats);
            } else {
                numberNewCockies = (localStorage.length - 1) / 5;
                localStorage.setItem("age" + numberNewCockies, age);
                localStorage.setItem("weight" + numberNewCockies, weight);
                localStorage.setItem("tensionS" + numberNewCockies, tensionS);
                localStorage.setItem("tensionD" + numberNewCockies, tensionD);
                localStorage.setItem("heartbeats" + numberNewCockies, heartbeats);
            }
            generateGraphWeightAge(window.localStorage.length - 1);
            generateGraphTension(window.localStorage.length - 1);
            generateGraphHeartbeats(window.localStorage.length - 1);

    });
});

function generateGraphWeightAge(cookiesLong) {
    let xArray = [];
    let yArray = [];

    for (let i = 0; i < (cookiesLong / 5); i++) {
        xArray.push(window.localStorage.getItem("age" + i));
        yArray.push(window.localStorage.getItem("weight" + i));
    }

    let data = [
        {x: xArray, y: yArray, mode: "markers"}
    ];

    let layout = {
        xaxis: {range: [0, 160], title: "Edad"},
        yaxis: {range: [0, 200], title: "Peso"},
        title: "Peso vs Edad"
    };

    Plotly.newPlot("graph-weight-age", data, layout);
}

function generateGraphTension(cookiesLong) {
    let xArray = [];
    let yArray1 = [];
    let yArray2 = [];

    for (let i = 0; i < (cookiesLong / 5); i++) {
        yArray1.push(window.localStorage.getItem("tensionS" + i));
        yArray2.push(window.localStorage.getItem("tensionD" + i));
        xArray.push(i + 1);
    }

    let data = [
        {x: xArray, y: yArray1, mode: "markers"},
        {x: xArray, y: yArray2, mode: "markers"}
    ];

    let layout = {
        xaxis: {range: [0, 30], title: "Tiempo"},
        yaxis: {range: [40, 200], title: "Tensión"},
        title: "Tensión Sistólica vs Diastólica"
    };

    Plotly.newPlot("graph-tension", data, layout);
}

function generateGraphHeartbeats(cookiesLong) {
    let xArray = [];
    let yArray = [];

    for (let i = 0; i < (cookiesLong / 5); i++) {
        yArray.push(window.localStorage.getItem("heartbeats" + i));
        xArray.push(i + 1);
    }

    let data = [
        {x: xArray, y: yArray, mode: "markers"}
    ];

    let layout = {
        xaxis: {range: [0, 30], title: "Tiempo"},
        yaxis: {range: [40, 200], title: "Pulsaciones"},
        title: "Pulsaciones al Tiempo"
    };

    Plotly.newPlot("graph-heartbeats", data, layout);
}

