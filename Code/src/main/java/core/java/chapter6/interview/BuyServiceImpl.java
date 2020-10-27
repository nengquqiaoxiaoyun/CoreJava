package core.java.chapter6.interview;

public class BuyServiceImpl implements IBuyService {
    @Override
    public void buyItem(int userId) {
        System.out.println("要买东西！ id是： " + userId);
        refund(100);
    }

    @Override
    public void refund(int nums) {
        System.out.println("商品过保质期了，需要退款，退款数量 ：" + nums);
    }
}
