import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DesafioAceito {

    @Test
   public void buscaDoProduto1(){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

         Driver.get("https://www.americanas.com.br/");

         Driver.findElement(By.name("conteudo")).sendKeys("Smartphone Samsung Galaxy A70");
         Driver.findElement(By.name("conteudo")).sendKeys(Keys.ENTER);

    }
    @Test
    public void buscaDoProduto2(){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        Driver.get("https://www.americanas.com.br/");

        Driver.findElement(By.name("conteudo")).sendKeys("Smartphone Motorola One Vision");
        Driver.findElement(By.name("conteudo")).sendKeys(Keys.ENTER);
    }
    @Test
    public void buscaDoProduto3(){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        Driver.get("https://www.americanas.com.br/");

        Driver.findElement(By.name("conteudo")).sendKeys("Smartphone Xiaomi Redmi Note 7");
        Driver.findElement(By.name("conteudo")).sendKeys(Keys.ENTER);

    }

}