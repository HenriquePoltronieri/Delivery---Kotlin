// Classe Produto
class Produto(
    var nome:String,
    var preco:Double
)

// Classe Item_pedido
class Item_pedido(
    val produto:Produto,
    var qtdInicial:Int
){
    fun adicionar_unidades(){
        qtdInicial++
    }
    fun subTotal(): Double{
        return produto.preco * qtdInicial
    }
}

// Classe Pedido
class Pedido(
    var itens: MutableList<Item_pedido> = mutableListOf()
){
    fun adicionarItem(){
        itens.add(produto)
    }

    fun totalBruto(){
        var total = 0.0
        for (item in itens) {
            total += item.subTotal()
        }
    }
}

// Classe Cliente
class Cliente(
    val nome:String,
    var endereco:Endereco
)

// Classe Endereco
class Endereco(
    var rua:String,
    var numeroCasa:Int,
    var bairro:String,
    var cidade:String,
    var cep:Int
)





fun main() {
    val _produto = Produto("Pizza", 80.00)
    _produto.preco = 100.00
    _produto.nome = "Calabresa"
    println(_produto.preco)

    val _itemPedido = Item_pedido(_produto,1)
    _itemPedido.adicionar_unidades()

    val _pedido = Pedido("" )

    val _cliente = Cliente("", "")

    val _endereco = Endereco("", 1, "", "", 10101010)







}
