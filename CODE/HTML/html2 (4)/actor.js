$(document).ready(function(){
    const mouseEvent00 = (buttonEl, animateEl) => {
        buttonEl.css("opacity", "0.6")
        buttonEl.children("div").css("height", "100%")
        buttonEl.children("div").css("background-size", "cover")
        // buttonEl.children("div").css("background-image",
        // `)
        animateEl.css("opacity", "0")
        buttonEl.on('mouseover', () => {
            buttonEl.css("opacity", "1")
            buttonEl.css("width", 146 * 1.3)
            buttonEl.css("height", 198 * 1.3)
            animateEl.css("opacity", "1")
        })
        buttonEl.on('mouseleave', () => {
            buttonEl.css("opacity", "0.6")
            buttonEl.css("width", 146)
            buttonEl.css("height", 198)
            animateEl.css("opacity", "0")
        })
        // buttonEl.on('click', () => {
        // })
    }

    mouseEvent00($('#song1'), $('#songf1'))
    mouseEvent00($('#song2'), $('#songf2'))
    mouseEvent00($('#song3'), $('#songf3'))
    mouseEvent00($('#dong1'), $('#dongf1'))
    mouseEvent00($('#dong2'), $('#dongf2'))
    mouseEvent00($('#dong3'), $('#dongf3'))
    mouseEvent00($('#yoo1'), $('#yoof1'))
    mouseEvent00($('#yoo2'), $('#yoof2'))
})