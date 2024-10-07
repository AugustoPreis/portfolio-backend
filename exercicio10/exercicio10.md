# Bloco de notas

### Alunos
- Augusto Preis Tomasi
- Luiz Felipe Silveira Zomer
- Willian Minatto

### Casos de Uso
 - Cadastrar usuário
 - Listar notas do usuário
 - Manipular notas

### Recursos
 - `Notas`
 - `Usuários`

### Endpoints

| Descrição | URI | Método | Body | Response | Erro |
| --- | --- | --- | --- | --- | --- |
Buscar usuário | /usuario/{id} | GET | Vazio | `200 OK` | `404 Not Found` - Usuário não encontrado |
Logar | /usuario/login | PUT | `{"email": "string", "senha": "string"}` | `200 OK` | `404 Not Found` - Login inválido |
Cadastrar usuário | /usuario/cadastrar | POST | `{"nome": "string", "email": "string", "senha": "string"}` | `201 Created` | `404 Not Found` - Dados inválidos |
Alterar usuário | /usuario/alterar/{id} | PUT | `{"nome": "string", "email": "string", "senha": "string"}` | `200 OK` | `404 Not Found` - Dados inválidos |
Inativar usuário  | /usuario/inativar/{id} | PUT | Vazio | `200 OK` | `404 Not Found` - Usuário não encontrado |
Listar notas | /notas/listar | GET | Vazio | `200 OK` | Vazio |
Buscar nota | /notas/{id} | GET | Vazio | `200 OK` | `404 Not Found` - Nota não encontrada |
Cadastrar nota | /notas/cadastrar | POST | `{"titulo": "string", "descricao": "string", "usuario_id": "number"}` | `201 Created` | `404 Not Found` - Dados inválidos |
Alterar nota | /notas/{id} | PUT | `{"titulo": "string", "descricao": "string"}` | `200 OK` | `404 Not Found` - Nota não encontrada |
Deletar nota | /notas/{id} | DELETE | Vazio | `200 OK` | `404 Not Found` - Nota não encontrada |
