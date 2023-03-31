import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SimpleTest extends TestBase{
    @DisplayName("Первый тест")
    @Test
    void  test (){
      open ("https://novo-estate.ru/");
}}
