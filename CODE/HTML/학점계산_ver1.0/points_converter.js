
/*
*	다시계산
*/
function fn_reset() {

	$("input[name=subject]").val("과목 명"); //과목명
	$("select[name=sel_point]").each(function() { //점수
		this.selectedIndex = 0;
	});
	$("input[name=credit]").val("0"); //학점
	$('input:checkbox[name="chk_major"]').each(function() {	//전공
		this.checked = false; //checked 처리
	});

	for (i = $('.tb_subject > tbody > tr').length; i > 4 ; i--)
		$('.tb_subject > tbody > tr:last').remove(); //입력부분 4개로 설정

	$("#total_avg").val("0");
	$("#total_major_avg").val("0");
	$("#total_point").val("0");
	$("#total_major_point").val("0");

	inputFnc();//인풋박스
	selectboxFnc();//셀렉트박스
	checkboxFnc();//체크박스
	radioboxFnc();//라디오박스
}

/*
*	학점계산 변환
*/
function fn_calculate() {

	var total_avg = 0; //총 평점
	var total_avg_sum = 0; //총 평점
	var total_major_avg = 0; //전공 평점
	var total_major_avg_sum = 0; //전공 평점

	var total_point = 0; //총 이수학점
	var total_major_point = 0; //전공 이수학점

	var exam_type = $("#exam_type option:selected").val(); //만점형태
	var f_di = $("#di").is(":checked"); //F학점 포함여부

	var obj_cnt = $('input[name="subject"]').length //전체과목 수

	for (i=1; i<=obj_cnt; i++)
	{
		var set_point = $("#sel_point"+i+" option:selected").val(); //점수
		var set_credit = parseInt($("#credit" + i).val()); //학점
		var set_major = $("#chk_major" + i).is(":checked");

		if (set_point != "" || set_credit != 0)
		{
			if (set_point == "" || set_credit == 0)
			{
				alert("한과목의 점수/학점을 모두 입력해주세요.");
				return;
			}
		}

		if (set_point == "" && set_credit == 0 && set_major)
		{
			alert("한과목의 점수/학점 입력없이 전공만 체크할 수 없습니다.");
			return;
		}
	}

	var input_obj_cnt = 0;
	var input_major_cnt = 0;
	for(i=1; i <= obj_cnt; i++)
	{
		var set_point = $("#sel_point"+i+" option:selected").val();
		var set_credit = parseInt($("#credit" + i).val());
		var set_major = $("#chk_major" + i).is(":checked");

		if (set_point != "" && set_credit > 0)
		{
			input_obj_cnt = input_obj_cnt + 1; //실제 입력한 1set 개수계산

			//점수변환 및 계산
			var convert_point = "";
			if (set_point != "")
			{
				convert_point = eval("arrCreditType"+exam_type+"['"+ set_point +"']");
				total_avg_sum = total_avg_sum + parseFloat(convert_point);
				if ($("#chk_major" + i).is(":checked") == true)
				{
					input_major_cnt = input_major_cnt + 1; //체크한 전공의 개수
					total_major_avg_sum = total_major_avg_sum + parseFloat(convert_point);
				}
			}

			//이수학점 계산
			if (f_di) //F학점 포함
			{
				total_point = total_point + parseInt($("#credit" + i).val());
				if ($("#chk_major" + i).is(":checked") == true)
				{
					total_major_point = total_major_point + parseInt($("#credit" + i).val());
				}
			}
			else //F학점 미포함
			{
				if (set_point != "F")
				{
					total_point = total_point + parseInt($("#credit" + i).val());
					if ($("#chk_major" + i).is(":checked") == true)
					{
						total_major_point = total_major_point + parseInt($("#credit" + i).val());
					}
				}
			}

		}
	}

	if (input_obj_cnt > 0)
	{
		total_avg = total_avg_sum / input_obj_cnt;
		if (total_major_avg_sum > 0)
			total_major_avg = total_major_avg_sum / input_major_cnt;

		$("#total_avg").val(total_avg.toFixed(1));
		$("#total_major_avg").val(total_major_avg.toFixed(1));
		$("#total_point").val(total_point);
		$("#total_major_point").val(total_major_point);
	}
}

/*
*	만점 타입변경
*/
function fn_chg_exam_type(val) {

	//초기화
	fn_reset();

	for (i=1; i <= 4; i++)
	{
		$("#sel_point"+i).html("");
		if (val == "A")
		{
			$("#sel_point"+i).append("<option value=''>선택</option>");
			$("#sel_point"+i).append("<option value='A+'>A+</option>");
			$("#sel_point"+i).append("<option value='A'>A</option>");
			$("#sel_point"+i).append("<option value='B+'>B+</option>");
			$("#sel_point"+i).append("<option value='B'>B</option>");
			$("#sel_point"+i).append("<option value='C+'>C+</option>");
			$("#sel_point"+i).append("<option value='C'>C</option>");
			$("#sel_point"+i).append("<option value='D+'>D+</option>");
			$("#sel_point"+i).append("<option value='D'>D</option>");
			$("#sel_point"+i).append("<option value=''>F</option>");
		}
		else
		{
			$("#sel_point"+i).append("<option value=''>선택</option>");
			$("#sel_point"+i).append("<option value='A+'>A+</option>");
			$("#sel_point"+i).append("<option value='A'>A</option>");
			$("#sel_point"+i).append("<option value='A-'>A-</option>");
			$("#sel_point"+i).append("<option value='B+'>B+</option>");
			$("#sel_point"+i).append("<option value='B'>B</option>");
			$("#sel_point"+i).append("<option value='B-'>B-</option>");
			$("#sel_point"+i).append("<option value='C+'>C+</option>");
			$("#sel_point"+i).append("<option value='C'>C</option>");
			$("#sel_point"+i).append("<option value='C-'>C-</option>");
			$("#sel_point"+i).append("<option value='D+'>D+</option>");
			$("#sel_point"+i).append("<option value='D'>D</option>");
			$("#sel_point"+i).append("<option value='D-'>D-</option>");
			$("#sel_point"+i).append("<option value=''>F</option>");
		}
	}



}
