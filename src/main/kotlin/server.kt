package kweb.template

import kweb.*

fun main(args: Array<String>) {
    Kweb(port = 16097, buildPage = {
        doc.body.new {
            h1().text("Replace Me!")
        }
    })
}

