function validate() {

    var category = document.getElementById("category");
    var stockname = document.getElementById("stockname");
    var quantity = document.getElementById("quantity");
    var baseprice = document.getElementById("baseprice");
    var profit = document.getElementById("profit");
    var expirydate = document.getElementById("expirydate");

    var catglbl = document.getElementById("catglbl");
    var stklbl = document.getElementById("stklbl");
    var quanlbl = document.getElementById("quanlbl");
    var bsprlbl = document.getElementById("bsprlbl");
    var prolbl = document.getElementById("prolbl");
    var explbl = document.getElementById("explbl");


    if (category.value == "") {
        category.style.border = "1px solid red";
        catglbl.style.visibility = "visible";
        return false;
    }
    if (stockname.value == "") {
        stockname.style.border = "1px solid red";
        stklbl.style.visibility = "visible";
        return false;
    }

    if (quantity.value == "") {
        quantity.style.border = "1px solid red";
        quanlbl.style.visibility = "visible";
        return false;
    }
    if (baseprice.value == "") {
        baseprice.style.border = "1px solid red";
        bsprlbl.style.visibility = "visible";
        return false;
    }
    if (profit.value == "") {
        profit.style.border = "1px solid red";
        prolbl.style.visibility = "visible";
        return false;
    }
    if (expirydate.value == "") {
        expirydate.style.border = "1px solid red";
        explbl.style.visibility = "visible";
        return false;
    }
}
$(document).ready(function() {


    $.ajax({
        url: "https://mocki.io/v1/3af8f072-1edb-46eb-aaf0-e9d6b9d8fda8",
        type: "GET",
        async: true,
        success: function(data) {
            console.log(data);
        }
    })
});