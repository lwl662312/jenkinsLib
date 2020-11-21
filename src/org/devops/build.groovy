package org.devops

def Build(type, command){
  def buildTools = ["mvn": "Maven", "ant": "Ant", "gradle": "Gradle", "npm": "Npm"]
  
  buildPath = tool buildTools[type]
  
  sh "${buildPath}/bin/${type} ${command}"
}
