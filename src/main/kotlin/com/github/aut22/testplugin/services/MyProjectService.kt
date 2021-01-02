package com.github.aut22.testplugin.services

import com.intellij.openapi.project.Project
import com.github.aut22.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
