public class Rectangle {
    private int positionX;
    private int positionY;
    private int height;
    private int width;
    private int thicknessLine;

    public Rectangle(int positionX, int positionY, int height, int width, int thicknessLine) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.height = height;
        this.width = width;
        this.thicknessLine = thicknessLine;
    }

    public void Draw() {
        // Implementación para dibujar el rectángulo
        System.out.println("Dibujando el rectángulo...");
    }
}
