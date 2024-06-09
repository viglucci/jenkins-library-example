
import io.viglucci.jenkins.library.Message

def call() {
    def m = new Message("Hello World")
    echo m.text
}
