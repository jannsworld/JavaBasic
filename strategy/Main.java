package strategy;

public class Main {
    public static void main(String[] args) {

        Encoder encoder = new Encoder();

        // base64 전략1
        EncodingStrategy base64 = new Base64Strategy();

        // normal 전략2
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";

        // 각각의 전략 사용하기
        encoder.setEncodingStrategy(base64);
        String base64result = encoder.getMessage(message);
        System.out.println(base64result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);

    }
}

