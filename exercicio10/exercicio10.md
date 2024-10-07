# Bloco de notas

### Alunos
- Augusto Preis Tomasi
- Luiz Felipe Silveira Zomer
- Willian Minatto

### Recursos
 - `Notas`
 - `Usuários`

### Endpoints

| Descrição | URI | Método | Body | Response | Erro |
| --- | --- | --- | --- | --- | --- |
Buscar usuário | /usuario/{id} | GET | Vazio | 200 | 404 - Usuário não encontrado |
Logar | /usuario/login | PUT | Vazio | 200 | 404 - Login inválido |
Cadastrar usuário | /usuario/cadastrar | POST | `{"nome": "string", "email": "string", "senha": "string"}` | 201 | 404 - Dados inválidos |
Alterar usuário | /usuario/alterar/{id} | PUT | `{"nome": "string", "email": "string", "senha": "string"}` | 200 | 404 - Dados inválidos |
Inativar usuário  | /usuario/inativar/{id} | PUT | Vazio | 200 | 404 - Usuário não encontrado |
Listar notas | /notas/listar | GET | Vazio | 200 | Vazio |
Buscar nota | /notas/{id} | GET | Vazio | 200 | 404 - Nota não encontrada |
Cadastrar nota | /notas/cadastrar | POST | `{"titulo": "string", "descricao": "string", "usuario_id": "number"}` | 201 | 404 - Dados inválidos |
Alterar nota | /notas/{id} | PUT | `{"titulo": "string", "descricao": "string"}` | 200 | 404 - Nota não encontrada |
Deletar nota | /notas/{id} | DELETE | Vazio | 200 | 404 - Nota não encontrada |