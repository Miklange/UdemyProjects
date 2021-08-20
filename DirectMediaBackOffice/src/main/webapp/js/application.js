/**
 * jQuery('form').after(x);
 * Trouve moi dans le DOM toutes les balises form, et apres, ajoute moi un nouveau noeud 'x' 
 * JQuery est une fonction javascript
 * On remplace par $
 * $('form').after(x);
 */
$(document).ready(function () {
    $('a[href=catalogue]').on('click', function (event) {
        event.preventDefault();
        console.log($('body').children().length);

        if ($('body').children().length<6) {
            $.ajax({
                url: "catalogue",
                success: function (result) {
                    $("a[href=catalogue]").after('<br>'+result);
                }
            });
        }
    });
});
