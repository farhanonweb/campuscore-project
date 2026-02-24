const BASE_URL = "http://localhost:8080";

function addStudent() {
    const student = {
        id: Number(document.getElementById("id").value),
        name: document.getElementById("name").value,
        course: document.getElementById("course").value,
        marks: Number(document.getElementById("marks").value)
    };

    fetch(BASE_URL + "/addStudent", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(student)
    })
    .then(res => res.text())
    .then(data => {
        alert(data);
        clearForm();
    });
}

function getStudents() {
    fetch(BASE_URL + "/students")
    .then(res => res.json())
    .then(data => {
        document.getElementById("output").textContent =
            JSON.stringify(data, null, 2);
    });
}

function getTopper() {
    fetch(BASE_URL + "/topper")
    .then(res => res.json())
    .then(data => {
        document.getElementById("output").textContent =
            JSON.stringify(data, null, 2);
    });
}

function getCount() {
    fetch(BASE_URL + "/count")
    .then(res => res.text())
    .then(data => {
        document.getElementById("output").textContent =
            "Total Students: " + data;
    });
}

function clearForm() {
    document.getElementById("id").value = "";
    document.getElementById("name").value = "";
    document.getElementById("course").value = "";
    document.getElementById("marks").value = "";
}