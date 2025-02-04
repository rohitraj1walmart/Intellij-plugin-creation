package com.example.mytestdemo

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class HelloAction: AnAction (){
    override fun actionPerformed(e: AnActionEvent) {
        print("Action Performed")
    }
}

