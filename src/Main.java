
public class Main {

    public static void main(String[] args) {
        String initialString = "zwxuabfkafutbbbb";
        MinSort t = new MinSort(initialString);
//        System.out.println(t.rmin(initialString));
//        System.out.println(t.minPos);
//        System.out.println(t.eliminatedMinPosElement(initialString));
        System.out.println(t.sort(initialString));
    }
}
