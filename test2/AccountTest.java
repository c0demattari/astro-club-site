package test2;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
    @Test public void depositTest() {
        Account a = new Account("ミナト", 0);
        assertEquals("ミナト", a.owner);
        assertEquals(0, a.balance);
        System.out.printf("残高 %d\n",a.balance);
        a.balance += 30000;
        assertEquals(30000, a.balance);
        System.out.printf("残高 %d\n\n",a.balance);
    }
    @Test public void payTest() {
        Account a = new Account("ミナト", 30000);
        assertEquals("ミナト", a.owner);
        assertEquals(30000, a.balance);
        int value = 5000;
        if (a.balance >= value) {
            a.balance -= 5000;
            assertEquals(25000,a.balance);
            System.out.println("成功");
            System.out.printf("残高 %d\n\n",a.balance);
        } else {
            System.out.println("失敗");
        }
    }
    @Test public void transferTest() {
        Account a1 = new Account("ミナト", 30000);
        Account a2 = new Account("ミナ", 10000);
        int fee=200,value = 5000;
        if (a1.balance >= value+fee) {
            a1.balance -= fee;
            a1.transfer(a2,value);
            assertEquals(24800,a1.balance);
            assertEquals(15000,a2.balance);
            System.out.println("成功");
            System.out.printf("残高1 %d\n",a1.balance);
            System.out.printf("残高2 %d\n\n",a2.balance);
        } else {
            System.out.println("失敗");
        }
    }
}