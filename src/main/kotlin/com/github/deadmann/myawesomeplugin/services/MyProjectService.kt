package com.github.deadmann.myawesomeplugin.services

import com.intellij.openapi.project.Project
import com.github.deadmann.myawesomeplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
