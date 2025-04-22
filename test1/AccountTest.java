public class AccountTest {
    public static void main(String[] args){
        testInstantiate();
        testTransfer();
    }
    private static void testInstantiate(){
        System.out.println("newできるかテスト");
        Account a = new Account("ミナト", 30000);
        if(!"ミナト".equals(a.owner)){
            System.out.println("失敗!");
        }
        if(30000 != a.balance){
            System.out.println("失敗!");
        }
        System.out.println("ok");
    }
    public static void testTransfer() {
        System.out.println("振り込みテスト");
        Account a1 = new Account("ミナト", 30000);
        Account a2 = new Account("ヨ", 30000);
        a1.transfer(a2, 10000);
        if (a1.balance != 20000 || a2.balance != 40000) {
            System.out.println("失敗! 振込処理に問題があります。");
        } else {
            System.out.println("ok");
        }
    }
}