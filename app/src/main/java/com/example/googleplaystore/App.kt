package com.example.googleplaystore

class App(private var logo: Int, private var nameApp: String) {

    fun getLogo(): Int {
        return logo
    }

    fun setLogo(logo: Int) {
        this.logo = logo
    }

    fun getNameApp(): String {
        return nameApp
    }

    fun setNameApp(nameApp: String) {
        this.nameApp = nameApp
    }
}
