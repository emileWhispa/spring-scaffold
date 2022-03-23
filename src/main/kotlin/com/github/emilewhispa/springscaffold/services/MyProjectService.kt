package com.github.emilewhispa.springscaffold.services

import com.intellij.openapi.project.Project
import com.github.emilewhispa.springscaffold.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
