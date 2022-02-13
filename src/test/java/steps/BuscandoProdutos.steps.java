
package steps;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BuscandoProdutos {

 WebDriver robo = new ChromeDriver();

 @Before
 public void buscaDoProduto() {

  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
  robo.manage().window().maximize();
  robo.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

 }

    @Dado("que estou {string}")
    public void que_estou(String site_de_compras) {

        robo.get(site_de_compras);
    }
    @Quando("pesquiso {string}")
    public void pesquiso(String nome_do_produto) {

        robo.findElement(By.name("conteudo")).sendKeys(nome_do_produto);
        robo.findElement(By.name("conteudo")).sendKeys(Keys.ENTER);

    }
    @Entao("o produto buscado deve aparecer {string} {string}")
    public void o_produto_buscado_deve_aparecer(String valor_a_vista, String valor_do_cashback) {

        Assert.assertEquals(valor_a_vista , robo.findElement(By.xpath("/html/body/div/div/div/main/div/div[3]/div[3]/div[1]/div/div/a/div[3]/span[1]")).getText());
        Assert.assertEquals(valor_a_vista , robo.findElement(By.xpath("/html/body/div/div/div/main/div/div[3]/div[3]/div[2]/div/div/a/div[3]/span[1]")).getText());
        Assert.assertEquals(valor_a_vista , robo.findElement(By.xpath("/html/body/div/div/div/main/div/div[3]/div[3]/div[1]/div/div/a/div[3]/span[1]")).getText());

    }

 }
 
