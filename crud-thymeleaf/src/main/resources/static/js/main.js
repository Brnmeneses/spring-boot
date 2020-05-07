

$(document).ready(function(){

    $('.nBtn, .table .eBtn').on('click',function(event){

        event.preventDefault();

        var href = $(this).attr('href');
        var text = $(this).text();

        if (text=='Edit'){
            $.get(href,function(aluno,status){
                $('.myForm #id').val(aluno.id);
                $('.myForm #nome').val(aluno.nome);
                $('.myForm #sobrenome').val(aluno.sobrenome);
            });

            $('.myForm #exampleModal').modal();
        } else {

            $('.myForm #id').val('');
            $('.myForm #nome').val('');
            $('.myForm #sobrenome').val('');

            $('.myForm #exampleModal').modal();
        }
    });

    $('.table .delBtn').on('click',function (event) {

        event.preventDefault();

        var href = $(this).attr('href');
        $('#myModal #delRef').attr('href', href);
        $('#myModal').modal();

    });
});