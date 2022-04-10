package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    //    var keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()
//    var mouse: Mouse = DaggerNewComponent.create().getMouse()
//    var monitor: Monitor = DaggerNewComponent.create().getMonitor()
    @Inject
    lateinit var keyboard: Keyboard

    @Inject
    lateinit var mouse: Mouse

    @Inject
    lateinit var monitor: Monitor

    init {
        DaggerNewComponent.create().inject(this)
    }
}