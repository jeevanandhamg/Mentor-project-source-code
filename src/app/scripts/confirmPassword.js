$(document).ready(function(){
    $("form").click(function(){
      var p1= $("#password").val();
      var p2= $("#confirm_password").val();
      if(p1!=p2)
      {
        $("#confirm_password").attr("pattern", p1);
      }
    });
  });