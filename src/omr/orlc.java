package omr;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class orlc extends BaseDriver {

    @Test
    public void orlc(){
        driver.get("https://www.akakce.com");
        WebElement login= driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[2]"));
        login.click();
        MyFunc.wait(1);
        WebElement mail= driver.findElement(By.xpath("//*[@id='life']"));
        mail.sendKeys("adem@gmail.com");
        MyFunc.wait(1);
        WebElement pass= driver.findElement(By.xpath("//*[@id='lifp']"));
        pass.sendKeys("Benim.45");
        MyFunc.wait(1);
        WebElement gir= driver.findElement(By.xpath("//*[@id='lfb']"));
        gir.click();
        MyFunc.wait(1);
        WebElement sip= driver.findElement(By.xpath("//*[@id='HM_v8']/i/a"));
        sip.click();
        MyFunc.wait(1);
        WebElement sipa= driver.findElement(By.xpath("//*[@id='AL']/li[1]/a[1]"));
        sipa.click();
        MyFunc.wait(1);//*[@id="user-order-info"]/div
        WebElement tex= driver.findElement(By.xpath("//*[@id='user-order-info']/div"));
        if (tex.getText().equals("Kayıtlı siparişiniz bulunmuyor.")){
            System.out.println("siparis listesi bos kontrol edildi");
        }
        MyFunc.wait(1);

    }
}
