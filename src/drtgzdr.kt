import java.awt.Color
import java.awt.Graphics
import java.awt.Window
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

fun main() {
    var window = JFrame()
    window.setSize(1000, 1000)
    window.add(JButton())
    window.isVisible = true
    window.contentPane = Game()

}

class Game : JPanel() {
    override fun paintComponent(g: Graphics) {
        g.color = Color.BLUE
        g.fillOval(570, 354, 50, 50)
        g.fillOval(546, 403, 100, 100)
        g.fillOval(520, 500, 150, 150)
        g.color = Color.darkGray
        g.fillRect(570, 315, 50, 50)
        var y = y + 420
        for (i in 0..7) {

            g.fillOval(593, y,5,5)
            y += 30

        }

    }
}
