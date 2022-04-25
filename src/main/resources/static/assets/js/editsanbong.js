$('document').ready(function(){
    $('#editButton').on('click',function(event){
        // var modal = $('#editModal');
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function(sanbong, status){
            $('#masanEdit').val(sanbong.id);
            $('#tensanEdit').val(sanbong.tenSanBong);
            $('#makhuEdit').val(sanbong.MaKhuVuc);
            $('#anhsanEdit').val(sanbong.anhSan);
            $('#chieudaiEdit').val(sanbong.chieuDai);
            $('#chieurongEdit').val(sanbong.chieuRong);
            $('#diachiEdit').val(sanbong.diaChi);
            $('#dongiaEdit').val(sanbong.donGia);

        });

        $('#editModal').modal("show");
        // modal.show();
    });

    // $('table #deleteButton').on('click', function (event){
    //    event.preventDefault();
    //
    //
    //    var href = $(this).attr('href');
    //    $('#confirmDeleteButton').attr('href', href);
    //
    //
    //    $('#deleteModal').modal();
    // });
});