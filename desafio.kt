/* Feito por Brendon Gomes */
class Usuario(val nome: String?, val email: String) { // 1
    override fun equals(other: Any?) = other is Usuario && other.email == this.email

    override fun toString() = "Usuário '$nome', email: $email"
}

// classe utilitária de exception quando o email não é válido
class InvalidEmailException(message: String) : Exception(message) // 2

// função que verifica se o e-mail é valido
fun isEmailValid(email: String) = email.contains("@") // 3

// Enumeravel que define os níveis do conteudo educacional
enum class Nivel {
    BASICO,
    INTERMEDIARIO,
    DIFICIL
} // 4

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel) // 5

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) { // 6

    // utilizado a collection Set (conjunto) para não permitir...
    // usuários se matricular duas vezes com o mesmo e-mail
    private val inscritos = mutableSetOf<Usuario>() // 7

    private fun inscreverUsuario(usuario: Usuario) { // 8
        if (!isEmailValid(usuario.email)) {
            throw InvalidEmailException("Email inválido!!") // 9
        }
        inscritos.add(usuario) // 10
        // utilização com o with
        with(usuario) { // 11
            println("🟢 Matriculado com sucesso o aluno(a): $nome, $email") // 12
        }
    }

    fun matricular(usuario: Usuario) { // 13
        try { // 14
            inscreverUsuario(usuario)
        } catch (e: Exception) {
            println("🔴 $usuario não matriculado: $e") // 15
        }
    }

    // - cadastrar uma lista de usuários
    fun matricular(usuarios: List<Usuario>) { // 16
        usuarios.forEach { matricular(it) } // 17
    }

    fun exibirUsuariosMatriculados() { // 18
        println("\n--> Usuários matriculados na formação '$nome'")
        inscritos.forEach { println("• $it") } // 19
    }

    fun exibirConteudos() {
        println("\n--> Conteúdos da formação '$nome'")
        conteudos.forEach { println("• $it") } // 20
    }
}

// 21
fun main() {
    val kotlinFundamentos =
        ConteudoEducacional(nome = "Fundamentos de Kotlin", nivel = Nivel.BASICO)
    val kotlinCollections =
        ConteudoEducacional("Trabalhando com Collections no Kotlin", 90, Nivel.BASICO)
    val kotlinSpring = ConteudoEducacional("Kotlin com Spring", 180, Nivel.DIFICIL)

    // 22
    val conteudos: List<ConteudoEducacional> =
        listOf(kotlinFundamentos, kotlinCollections, kotlinSpring)

    // 23
    val formacaoKotlinBackEnd =
        Formacao("Desenvolvimento Backend com Kotlin e Spring Boot", conteudos)

    // 24
    val brendonUser = Usuario("Brendon", "brendon@email.com")
    val sayMyNameUser = Usuario("Walter White", "heisenberg@email.com")
    val gladosUser = Usuario("GLaDOS", "thecakeisalie@email.com")
    val invalidEmailUser = Usuario("John Doe", "johndoe#email.com") // 25

    val usuariosMatricula = listOf(brendonUser, sayMyNameUser, gladosUser, invalidEmailUser) // 26

    formacaoKotlinBackEnd.matricular(brendonUser) // 27
    formacaoKotlinBackEnd.matricular(usuariosMatricula) // 28

    formacaoKotlinBackEnd.exibirUsuariosMatriculados() // 29
    formacaoKotlinBackEnd.exibirConteudos() // 30
}
