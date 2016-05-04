(function ($) {

	$(document).ready(function () {


		//  C O N T E N T   A N I M A T I O N

			$(window).bind('scroll', function() {
				var scrll = $(window).scrollTop();
				var showMargin = $(window).height()-$(window).height()*0.3;
				$('.section > .inner > h2, .section > .inner > h3, .section > .inner > p, .section > .inner > div, .section > .inner > ul li').each( function() {
					var posY = $(this).offset().top;
					if ( posY < scrll+showMargin ) { $(this).addClass('show'); }
				});
			});


		//  P A R A L L A X   S C R O L L

			$(window).bind('scroll', function() {
				$('.section > img').each( function() {
					elem = $(this);
					var scrollPos = $(window).scrollTop();
					var elemPos = elem.offset().top;
					var windH = $(window).height();
					var elemH = elem.height();
					if ( scrollPos >= (elemPos-windH+200) && scrollPos < (elemPos+elemH) ) {
						elem.css('top',-(scrollPos+windH-200-elemPos)*0.2+'px');
					}
				});
			});


	        //   T O   T O P   B U T T O N

	                $('body').append('<div id="to-top" class="hidden" ><a href="#" >&nbsp;</a></div>');

			$(function () {
				$(window).bind('scroll', function() {
					TopButton();
				});
				function TopButton() {
					if ($(this).scrollTop() > 400) { $('#to-top').removeClass('hidden'); }
					else { $('#to-top').addClass('hidden'); }
				}
				TopButton();

				$('#to-top a').click( function () {
					$('body,html').animate({ scrollTop: 0 }, 800);
					return false;
				});
			});

        });

})(jQuery);
