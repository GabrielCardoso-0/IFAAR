# Comandos Git - Guia Rápido

## Configuração inicial

```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu@email.com"
git config --global core.editor "code --wait"
```

---

# Comandos básicos

| Comando | O que faz |
|---|---|
| `git init` | Inicia um repositório |
| `git clone URL` | Clona um repositório remoto |
| `git status` | Mostra o status dos arquivos |
| `git add .` | Adiciona todas as alterações |
| `git add arquivo.txt` | Adiciona um arquivo específico |
| `git commit -m "msg"` | Salva as alterações |
| `git log --oneline` | Mostra histórico de commits |

---

# Trabalhando com branches

```bash
git branch                 # Lista branches
git branch nova-branch     # Cria nova branch
git checkout nova-branch   # Muda para branch
git checkout -b nova       # Cria e muda para branch
git merge branch           # Mescla branch atual com outra
git branch -d branch       # Deleta branch
```

---

# Repositório remoto (GitHub)

```bash
git remote add origin URL   # Conecta ao GitHub
git push -u origin main     # Envia pela primeira vez
git push                    # Envia alterações
git pull                    # Puxa alterações
git fetch                   # Busca sem mesclar
```

---

# Desfazendo coisas

```bash
git restore arquivo.txt     # Desfaz alterações não commitadas
git reset --soft HEAD~1     # Desfaz último commit (mantém alterações)
git reset --hard HEAD~1     # Desfaz último commit (perde alterações)
```

---

# Fluxo de trabalho recomendado para iniciantes

```bash
# 1. Começar o dia
git pull origin main

# 2. Fazer alterações nos arquivos...

# 3. Ver o que mudou
git status

# 4. Adicionar as mudanças
git add .

# 5. Salvar com mensagem
git commit -m "Descrição do que fiz"

# 6. Enviar para o GitHub
git push origin main
```