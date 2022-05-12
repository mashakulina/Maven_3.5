import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int res = service.numberOfSqr(100, 200);

        System.out.println(res);
    }

}
