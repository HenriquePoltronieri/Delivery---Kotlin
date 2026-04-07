// Classe Produto
class Produto(
    var nome: String,
    var preco: Double
)

// Classe Item_pedido
class Item_pedido(
    val produto: Produto,
    var qtdInicial: Int
) {
    fun adicionar_unidades() {
        qtdInicial++
    }

    fun subTotal(): Double {
        return produto.preco * qtdInicial
    }
}

// Classe Pedido
class Pedido(
    var itens: MutableList<Item_pedido> = mutableListOf()
) {
    fun adicionarItem(item: Item_pedido) {
        itens.add(item)
    }

    fun totalBruto(): Double {
        var total = 0.0
        for (item in itens) {
            total += item.subTotal()
        }
        return total
    }
}

// Classe Cliente
class Cliente(
    val nome: String,
    var endereco: Endereco
)

// Classe Endereco
class Endereco(
    var rua: String,
    var numeroCasa: Int,
    var bairro: String,
    var cidade: String,
    var cep: Int
)


fun main() {
    // Produto
    val _produto = Produto("Pizza", 80.00)
    _produto.preco = 100.00
    _produto.nome = "Calabresa"
    println("Produto: ${_produto.nome} | Preço: R$${_produto.preco}")

    // Item do pedido
    val _itemPedido = Item_pedido(_produto, 1)
    _itemPedido.adicionar_unidades()
    println("Qtd: ${_itemPedido.qtdInicial} | Subtotal: R$${_itemPedido.subTotal()}")

    // Pedido
    val _pedido = Pedido()
    _pedido.adicionarItem(_itemPedido)
    println("Total bruto: R$${_pedido.totalBruto()}")

    // Endereço
    val _endereco = Endereco(
        rua = "Rua das Flores",
        numeroCasa = 42,
        bairro = "Centro",
        cidade = "Belo Horizonte",
        cep = 30110000
    )

    // Cliente
    val _cliente = Cliente(
        nome = "João Silva",
        endereco = _endereco
    )

    println("Cliente: ${_cliente.nome}")
    println("Endereço: ${_cliente.endereco.rua}, ${_cliente.endereco.numeroCasa} - ${_cliente.endereco.bairro}, ${_cliente.endereco.cidade}")
}

