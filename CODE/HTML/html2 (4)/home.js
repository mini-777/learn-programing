$(document).ready(function(){
    const mouseEvent00 = (buttonEl, animateEl) => {
        animateEl.css("opacity", "0")
        buttonEl.on('mouseover', () => {
            animateEl.css("opacity", "1")
        })
        buttonEl.on('mouseleave', () => {
            animateEl.css("opacity", "0")
        })
        // buttonEl.on('click', () => {
        // })
    }

    mouseEvent00($('#hd1'), $('#hd1t'))
    mouseEvent00($('#hd2'), $('#hd2t'))
    mouseEvent00($('#hd3'), $('#hd3t'))
    mouseEvent00($('#hd4'), $('#hd4t'))
})