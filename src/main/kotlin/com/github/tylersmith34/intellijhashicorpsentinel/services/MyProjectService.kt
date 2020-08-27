package com.github.tylersmith34.intellijhashicorpsentinel.services

import com.intellij.openapi.project.Project
import com.github.tylersmith34.intellijhashicorpsentinel.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
