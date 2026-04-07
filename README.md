# 🛵 Delivery - Kotlin

Projeto de simulação de um sistema de delivery desenvolvido em **Kotlin**, com foco na modelagem de classes e orientação a objetos. O sistema representa o fluxo básico de um pedido: criação de produtos, montagem de itens de pedido, associação a um cliente e seu endereço.

---

## 📁 Estrutura do Projeto

```
Delivery---Kotlin/
└── delivery-calsses/
    └── src/
        └── Main.kt
```

---

## 🧱 Classes Modeladas

### `Produto`
Representa um produto disponível para pedido.

| Atributo | Tipo     | Descrição              |
|----------|----------|------------------------|
| `nome`   | `String` | Nome do produto        |
| `preco`  | `Double` | Preço unitário         |

---

### `Item_pedido`
Representa um produto dentro de um pedido, com quantidade e subtotal.

| Atributo/Método         | Tipo/Retorno | Descrição                              |
|-------------------------|--------------|----------------------------------------|
| `produto`               | `Produto`    | Produto associado ao item              |
| `qtdInicial`            | `Int`        | Quantidade do produto                  |
| `adicionar_unidades()`  | `Unit`       | Incrementa a quantidade em 1           |
| `subTotal()`            | `Double`     | Retorna `preco * qtdInicial`           |

---

### `Pedido`
Agrupa uma lista de itens de pedido.

| Atributo/Método   | Tipo/Retorno              | Descrição                         |
|-------------------|---------------------------|-----------------------------------|
| `itens`           | `MutableList<Item_pedido>`| Lista de itens do pedido          |
| `adicionarItem()` | `Unit`                    | Adiciona um item à lista          |
| `totalBruto()`    | `Double`                  | Soma o subtotal de todos os itens |

---

### `Cliente`
Representa o cliente que realiza o pedido.

| Atributo   | Tipo       | Descrição              |
|------------|------------|------------------------|
| `nome`     | `String`   | Nome do cliente        |
| `endereco` | `Endereco` | Endereço de entrega    |

---

### `Endereco`
Representa o endereço de entrega do cliente.

| Atributo      | Tipo     | Descrição          |
|---------------|----------|--------------------|
| `rua`         | `String` | Nome da rua        |
| `numeroCasa`  | `Int`    | Número da residência |
| `bairro`      | `String` | Bairro             |
| `cidade`      | `String` | Cidade             |
| `cep`         | `Int`    | CEP                |

---

## ▶️ Exemplo de Uso (`main`)

```kotlin
fun main() {
    val _produto = Produto("Pizza", 80.00)
    _produto.preco = 100.00
    _produto.nome = "Calabresa"
    println(_produto.preco) // 100.0

    val _itemPedido = Item_pedido(_produto, 1)
    _itemPedido.adicionar_unidades() // qtd passa a ser 2

    val _pedido = Pedido()
    val _cliente = Cliente("", "")
    val _endereco = Endereco("", 1, "", "", 10101010)
}
```

---

## 🛠️ Tecnologias

- [Kotlin](https://kotlinlang.org/) — linguagem principal
- IntelliJ IDEA / qualquer IDE com suporte a Kotlin

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/HenriquePoltronieri/Delivery---Kotlin.git
   ```

2. Abra o projeto no **IntelliJ IDEA** ou **Android Studio**.

3. Navegue até `delivery-calsses/src/Main.kt` e execute a função `main`.

---

## 👨‍💻 Autor

**Henrique Poltronieri**  
[![GitHub](https://img.shields.io/badge/GitHub-HenriquePoltronieri-181717?style=flat&logo=github)](https://github.com/HenriquePoltronieri)
