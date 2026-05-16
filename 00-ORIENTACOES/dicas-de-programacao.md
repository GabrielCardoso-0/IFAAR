# Dicas de Programação

## Para iniciantes

### 1. Comece pelo básico
Antes de frameworks e bibliotecas, domine:
- Variáveis e tipos de dados
- Estruturas condicionais (if/else)
- Laços de repetição (for/while)
- Funções/métodos

### 2. Debug é seu amigo
Aprenda a usar o debugador do VS Code. É melhor que ficar colocando `print` em tudo.

### 3. Leia erros!
O computador está te dizendo exatamente o que está errado. Aprenda a ler mensagens de erro.

## Código limpo (Clean Code)

| Ruim ❌ | Bom ✅ |
|---------|--------|
| `a = 10` | `idade_usuario = 10` |
| `x = y * z` | `total = quantidade * preco_unitario` |
| `if (x == 1)` | `if (status == ATIVO)` |
| `// calcula` | `// Calcula a média das notas do aluno` |

## Versionamento com Git

```bash
# Comandos essenciais
git init                    # Inicia repositório
git add .                   # Adiciona todas as alterações
git commit -m "mensagem"    # Salva alteração
git push                    # Envia para GitHub
git pull                    # Pega atualizações (sincroniza com repositório remoto)