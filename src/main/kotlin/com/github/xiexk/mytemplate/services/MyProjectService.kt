package com.github.xiexk.mytemplate.services

import com.intellij.openapi.project.Project
import com.github.xiexk.mytemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
