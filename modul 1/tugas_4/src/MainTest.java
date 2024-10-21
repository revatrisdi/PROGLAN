import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void pengujian1() {
        int result = Main4.findMax(1, 2, 3);
        System.out.println("Nilai maksimum adalah: " + result);
    }
    @Test
    public void pengujian2() {
        int result = Main4.findMax(-1, -2, -3);
        System.out.println("Nilai maksimum adalah: " + result);
    }
    @Test
    public void pengujian3() {
        int result = Main4.findMax(0, 0, 1);
        System.out.println("Nilai maksimum adalah: " + result);
        assertEquals(1, result);

}