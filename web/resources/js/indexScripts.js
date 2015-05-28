// Sliders for the index page parts
$(document).ready(function() {
    // One third parts
    $(".indexThirdPartTitleText").click(function(){
        if($(this).children().first().css('display')==='none'){
            $(this).children().first().slideDown('slow');
            $(this).parent().siblings().children().children().slideUp('slow');            
            $(this).parent().siblings().children().css("color", "#000066"); // Set default title color for closed divs            
            $(this).css("color", "red"); // Set title color for current div       
        }else{
            // Nothing
        }
    });

    // Two thirds parts
    $(".indexTwoThirdsPartTitleText").click(function() {
        if($(this).children().first().css('display')==='none'){
            $(this).children().first().slideDown('slow');
            $(this).parent().siblings().children().children().slideUp('slow');            
            $(this).parent().siblings().children().css("color", "#000066"); // Set default title color for closed divs            
            $(this).css("color", "red"); // Set title color for current div       
        }else{
            // Nothing
        }
    });

    // Full parts
    $(".indexFullPartTitleListItem").mouseover(function() {
        var ord = $(this).index();
        $(this).css("background-color", "red");
        $(this).siblings().css("background-color", "black");
        $(this).parent().siblings().children(".indexFullPartItemListItem" + ord).css('display', 'block');
        $(this).parent().siblings().children(".indexFullPartItemListItem" + ord).siblings().css('display', 'none')
    });
});
