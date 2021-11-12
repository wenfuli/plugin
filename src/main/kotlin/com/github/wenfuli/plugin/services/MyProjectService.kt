package com.github.wenfuli.plugin.services

import com.intellij.openapi.project.Project
import com.github.wenfuli.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
