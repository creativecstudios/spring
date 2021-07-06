var result;
//validation
function validate() {
    var category = document.getElementById("category");
    var stockname = document.getElementById("stockname");
    var quantity = document.getElementById("quantity");
    var baseprice = document.getElementById("baseprice");
    var profit = document.getElementById("profit");
    var expirydate = document.getElementById("expirydate");

    var clbl = document.getElementById("clbl");
    var slbl = document.getElementById("slbl");
    var qlbl = document.getElementById("qlbl");
    var blbl = document.getElementById("blbl");
    var plbl = document.getElementById("plbl");
    var elbl = document.getElementById("elbl");

    // var inputid = [category, stockname, quantity, baseprice, profit, expirydate];
    // var labelid = [clbl, slbl, qlbl, blbl, plbl, elbl];
    // for (var temp = 0; temp < inputid.length; temp++) {
    //     // if (inputid[temp].value == "" || inputid[temp].value == null) {
    //     //     inputid[temp].style.border = "1px solid red";
    //     //     labelid[temp].style.visibility = "visible";
    //     //     return false;
    //     // }
    //     // else {
    //     //     return true;
    //     // }
    //     console.log(inputid[temp].value);
    // }

    if (category.value == "") {
        category.style.border = "1px solid red";
        clbl.style.visibility = "visible";
        return false;
    } else if (stockname.value == "") {
        stockname.style.border = "1px solid red";
        slbl.style.visibility = "visible";
        return false;
    } else if (quantity.value == "") {
        quantity.style.border = "1px solid red";
        qlbl.style.visibility = "visible";
        return false;
    } else if (baseprice.value == "") {
        baseprice.style.border = "1px solid red";
        blbl.style.visibility = "visible";
        return false;
    } else if (profit.value == "") {
        profit.style.border = "1px solid red";
        plbl.style.visibility = "visible";
        return false;
    } else if (expirydate.value == "") {
        expirydate.style.border = "1px solid red";
        elbl.style.visibility = "visible";
        return false;
    } else {
        return true;
    }

}
//submit button
function submit(event) {

    event.preventDefault();
    let result = validate();
    // alert(result);
    if (result == true) {

        var details = {
            "category": $("#category").val(),
            "stockname": $("#stockname").val(),
            "quantity": $("#quantity").val(),
            "baseprice": $("#baseprice").val(),
            "profit": $("#profit").val(),
            "expirydate": $("#expirydate").val(),
        };
        $.ajax({
            dataType: "json",
            contentType: "application/json",
            data: JSON.stringify(details),
            url: "http://localhost:8080/distinctinventory",
            type: "POST",
            async: true,
            success: function(data) {
                result = data;
                console.log(result);
                swal("Saved", "It's pretty, isn't it?", "success");
            },
            error: function(data) {
                console.log(data);
                if (data.responseText == "stock already exists") {
                    swal({
                        title: "Not saved",
                        text: data.responseText,
                        icon: "error",
                        buton: "ok"
                    })
                } else {
                    swal({
                        title: "Saved",
                        text: data.responseText,
                        icon: "success",
                        buton: "ok"
                    })
                }
            }
        });
    }
}



// <script>
//     function submit() {
//         console.log("clicked");
//         var details = {
//             "category": "food",
//             "stockname": "rice basmathi",
//             "quantity": 3,
//             "baseprice": 30,
//             "profit": 40,
//             "expirydate": "2022-05-23"
//         };

//         $.ajax({
//             // url: "https://mocki.io/v1/3af8f072-1edb-46eb-aaf0-e9d6b9d8fda8",
//             dataType: "json",
//             contentType: "application/json",
//             url: "http://localhost:8080/inventory",
//             type: "POST",
//             data: JSON.stringify(details),
//             async: true,
//             success: function(data) {
//                 result = data;
//                 console.log(result);
//             }
//         })
//     }
// </script>