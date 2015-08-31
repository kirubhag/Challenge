/**
 * Created by WebStorm.
 * User: kirubha-2911
 * Date: 8/30/15
 * Time: 3:22 PM
 * Project: Ember
 * File Name: challenge
 */

var Challenge = (function () {
    var Challenge = {};

    Challenge.init = function () {
        Challenge.makeItMiddle(screen.width, screen.height);
    };

    Challenge.makeItMiddle = function (sw, sh) {
        var h = 350;
        var w = 500;
        var top = ((( sh / 2) - (h / 2)) - 50) + 'px';
        var left = ((sw / 2) - (w / 2)) + 'px';
        $('.sign-up-wrap').css({top: top, left: left});
    };

    return Challenge;
})();

$(window).resize(function () {
    Challenge.makeItMiddle($(window).width(), $(window).height());
});