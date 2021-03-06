class SerializableSessionGrailsPlugin {
    // the plugin version
    def version = "0.4"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.0 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def scm = [ url: "https://github.com/dawsonsystems/SerializableSession" ]

    def author = "David Dawson"
    def authorEmail = "david@dawsonsystems.com"
    def title = "Serializable Session"
    def description = 'Enforces that the session will only accept serializable objects.'

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/serializable-session"
}
