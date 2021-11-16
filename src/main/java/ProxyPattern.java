interface IService {
    public String greeting(String str);
}

class Service implements IService{

    @Override
    public String greeting(String str) {
        // TODO Auto-generated method stub

        return "안녕하세요 " + str + "입니다.";
    }
}

class Proxy implements IService {
    IService iService;

    @Override
    public String greeting(String str) {
        // TODO Auto-generated method stub
        System.out.println("호출에 대한 흐름 제어가 주목적이며, 반환 결과를 그대로 전달한다.");

        iService = new Service();
        return iService.greeting(str);
    }

}

public class ProxyPattern {
    public static void main(String[] args) {
        IService service = new Proxy();
        System.out.println(service.greeting("청와대"));
    }
}