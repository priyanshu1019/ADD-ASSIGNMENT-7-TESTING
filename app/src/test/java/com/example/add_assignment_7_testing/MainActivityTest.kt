package com.gaur.testing

import org.junit.After
import org.junit.Before
import org.junit.Test

class MainActivityTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun username_is_empty() {
        val username = ""
        val assert = LoginUtils.validate(username, "dflja@3", "dkjafjla", 20)
        assert(assert == "please enter username")
    }


    @Test
    fun username_length_less_than_6() {
        val username = "djlfa"
        assert(
            LoginUtils.validate(username, "dflja@3", "dkjafjla", 20)
                    == "very short username"
        )
    }

    @Test
    fun username_length_very_long(){
        val username="fdlksakjfklafjkjfklkaljfklajfkajfkjasldkjfajlksfjlakjfakl"
        assert(
            LoginUtils.validate(username, "dflja@3", "dkjafjla", 20)
                    == "long username"
        )
    }


}