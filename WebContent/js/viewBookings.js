/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $('#table_id').DataTable({
        bFilter: true,
        bPaginate: true,
        bProcessing: true,
        bDestroy: true,
        bAutoWidth: false,
        sScrollY: "200",
        //sScrollX: "100%",
        bScrollCollapse: true,
        iDisplayLength: 10,
        bLengthChange: false,
    });
});

