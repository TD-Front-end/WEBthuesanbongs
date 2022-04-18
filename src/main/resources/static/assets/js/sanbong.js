
$('document').ready(function(){
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		
		$.get(href, function(sanbong, status){
			$('#masanEdit').val(sanbong.maSan);
			$('#nameEdit').val(sanbong.tenSan);
			$('#addressEdit').val(sanbong.diaChi);
			$('#dientichEdit').val(sanbong.dienTich);
			$('#priceEdit').val(sanbong.donGia);
			$('#tgdatEdit').val(sanbong.thoiGianDat);
			$('#tgTraEdit').val(sanbong.thoiGianTra);
			$('#makhuEdite').val(sanbong.maKhu);
			$('#tinhtrangEdit'.val(sanbong.tinhTrang));
		});
		
		$('#editModal').modal();

	});	
});
	
	
		