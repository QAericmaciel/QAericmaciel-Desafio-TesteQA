
#language: pt

Funcionalidade: Buscando Produtos nas Americanas

  Esquema do Cenário: Validação de cenarios

    Dado que estou <site_de_compras>
    Quando pesquiso <nome_do_produto>
    Entao o produto buscado deve aparecer <valor_a_vista> <valor_do_cashback>

    Exemplos:

      | site_de_compras                  | nome_do_produto                  | valor_a_vista | valor_do_cashback |
      | "https://www.americanas.com.br/" | "Smartphone Samsung Galaxy A70"  | "R$ 1.309,00" | ""                |
      | "https://www.americanas.com.br/" | "Smartphone Motorola One Vision" | "R$ 2.169,90" | ""                |
      | "https://www.americanas.com.br/" | "Smartphone Xiaomi Redmi Note 7" | "R$ 1.999,99" | ""                |
        
        
