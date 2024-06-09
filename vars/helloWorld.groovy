
import io.viglucci.jenkins.library.Message

call() {
    def m = new Message("Hello World")
    echo m.text
}
