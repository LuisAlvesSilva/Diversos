<h1 align="center">Resumo Estudo Git</h1>

## Controle de Versão

### O que é controle de versão?

- Uma técnica que ajuda a **gerenciar o código-fonte** de uma aplicação;

- Registrando **todas as modificações** de código, podendo também reverter as mesmas;

- Criar versões de um software em diferentes estágios, podendo **alterar facilmente entre elas**;

- Cada membro da equipe pode trabalhar em uma versão diferente;

- Há ferramentas para trabalhar o controle de versão como **git** e SVN;

## O que é Git?

- O sistema de controle de versão **mais utilizado do mundo** atualmente (2023);

- O git é baseado em **repositórios**, que contêm todas as versões do código e também as cópias de cada desenvolvedor;

- Todas as operações do git **são otimizadas para ter alto desempenho**;

- Todos os objetos do git são **protegidos como criptografia** para evitar alterações indevidas e maliciosas;

- O git é um **projeto de código aberto**;

## O que é um repositório?

- é onde o código será **armazenado**;

- Na maioria das vezes cada projeto tem **um repositório**

- Quando criamos um repositório estamos iniciando um projeto;

- O repositório pode ir para servidores que são especializados em gerenciar repos, como: **GitHub** e **Bitbucket**;

- Cada um dos desenvolvedores do time pode baixar o repositório e **criar versões diferentes** em sua máquina;

## Criando repositórios

- Para criar um repositório utilizamos o comando: **`git init`**

- Desta maneira o git vai criar os arquivos necessários para inicializá-lo;

- Os arquivos criados estão na pasta oculta **.git**;

- Após este comando o diretório atual **será reconhecido pelo git como um projeto** e responderá aos seus demais comandos;

## O que é github?

- É um **serviço para gerenciar repositórios**, gratuito e amplamente utilizado;

- Podemos **enviar nossos projetos** para o GitHub e disponibilizá-lo para outros desenvolvedores;

- O GitHub é gratuito tanto para projetos públicos como **privados**;

## Enviando repositórios para o GitHub

- Precisamos criar o projeto no GitHub, inicializar o mesmo no git em nossa máquina, sincronizar com o GitHub e enviar;

1. Utilize o comando `git init` para começar o processo

2. Adicione os arquivos que deseja subir para o repositório com o comando `git add (nome-do-arquivo)` ou `git add .` para adicionar todos os arquivos

3. Utilize o `git commit -m "first commit"` para criar um commit no seu repositório Git com a mensagem que desejar dentro dos aspas.
'
4. Utilize o comando `git remote add origin https://github.com/seu-usuario/nome-do-repositorio.git` para sincronizar o repositório no GitHub com o repositório local

5. Por fim, utilize o `git push -u origin master` para subir o seu projeto ao GitHub.

## Verificando mudanças no projeto

- As mudanças do projeto podem ser verificados por: **`git status`**;

- Aqui serão mapeadas todas as alterações do projeto;

- Como: **arquivos não monitorados** e **arquivos modificados**;

- Podemos também dizer a **diferença** do que já está enviado ao servidor ou salvo no projeto;

## Recebendo as mudanças
- É comum também ter que **sincronizar o local** com as mudanças do remoto;

- Esta ação é feita pelo **`git pull`**;

- Após o comando serão **buscadas atualizações**, se encontradas elas **serão unidas ao código atual** existente na nossa máquina;

## Clonando repositórios

- O ato de baixar um repositório de um servidor remoto é chamado de **clonar repositório**;

- Para esta ação utilizamos o **`git clone`**

- Este comando é utilizado quando **entramos em um novo projeto**;

## Removendo arquivos

- Os arquivos **podem ser deletados da monitoração** do git;

- O comando para deletar é **`git rm`**

- Após deletar um arquivo do git ele não terá mais suas atualizações consideradas pelo git;

- Apenas quando for adicionando novamente pelo **`git add`**

## Histórico de alterações

- Podemos **acessar um log** de modificações feitas no projeto;

- O comando para este recurso é **`git log`**;

- Você receberá uma informação dos **commits realizados** no projeto até então;

## Renomeando arquivos

- Com o comando **`git mv`** podemos renomear um arquivo;

- O mesmo também pode ser movido para outra pasta;

- E isso fará com que este novo arquivo **seja monitorado pelo git**;

- O arquivo anterior é excluído;

## Desfazendo alterações

- O arquivo modificado pode ser **retornado ao estado original**;

- O comando utilizado é o **`git checkout`**;

- Após a utilização do mesmo o arquivo sai do staging;

- Caso seja feita uma próxima alteração, ele entra em staging novamente;

## Ignorando arquivos no projeto

- Uma técnica muito utilizada é **ignorar arquivos no projeto;

- Devemos inserir um arquivo chamado **.gitignore** na raiz do projeto;

- Nele podemos inserir todos os arquivos que nao devem entrar no versionamento;

- Isso é útil para **arquivos gerados automaticamente** ou arquivos que contêm **informações sensíveis**;

## Desfazendo todas as alterações

- Com o comando **`git reset`** podemos resetar todas as mudanças feitas;

- Geralmente é utilizado com a flag **`--hard`**

- Todas as alterações **commitadas** e **também as pendentes** serão **excluídas**;

## O que é um branch

- Branch é a forma que o git **separa as versões dos projetos**;

- Quando um projeto é criado ele inicia na branch **master** ou **main**;

- Geralmente cada nova feature de um projeto **fica em um branch separado**;

- Após a finalização das alterações os **branchs são unidos** para ter o código-fonte final;

## Criando e visualizando os branches

- Para visualizar os branch disponíveis, basta digitar **`git branch`**;

- Para criar um branch, você precisa utilizar o comando **`git branch <nome>`**;

## Deletando branches

- Podemos deletar um branch com a flag **`-d`** ou **`--delete`**;

- Exemplo: **`git branch -d <nome-da-branch>`**

- **Não é comum deletar um branch**, normalmente guardamos os histórico do trabalho;

- Geralmente se usa o delete quando o branch foi criado errado;

## Mundando de branch

- Podemos mudar para outro branch utilizando o comando **`git checkout <nome-da-branch>`**;

- Podemos criar um branch e mudar para ele no mesmo comando apenas adicionando a flag **`-b`** antes do nome da branch;

- Exemplo: **`git checkout -b <nome-da-branch>`**

## Unindo branches

- O código de dois branches distintos pode ser unido pelo comando **`git merge <nome>`**;

- Normalmente é por ele que recebemos as atualizações de outros devs;

## Stash

- Podemos salvar as modificações atuais **para prosseguir com uma outra abordagem de solução** e não perder o código;

- O comando para esta ação é o **`git stash`**;

- Após o comando o branch será resetado para a sua versão de acordo com o repositório;

## Recuperando stash

- Podemos verificar as stashs criadas pelo comando **`git stash list`**;

- Também podemos recuperar a stash com o comando **`git stash <nome>`**;

- Desta maneira podemos continuar de onde paramos com os arquivos adicionados a stash;

## Removendo a stash

- Para limpar totalmente as stash de um branch podemos utilizar o comando **`git stash clear`**;

- Caso seja necessário deletar uam stash específica podemos utilizar o comando **`git stash drop <nome>`;

## Criando tags

- Podemos criar tags nos branches por meio do comando **`git tag -a <nome> -m "<msg>"`

- A tag é diferente do stash, serve como um **checkpoint de um branch**;

- É utilizada para demarcar estágios do desenvolvimento de algum recurso;

## Alterando a tag

- Podemos verificar uma tag com o comando **`git show <nome-tag>`**

- Podemos trocar de tags com o comando **`git checkout <nome-tag>`**

- Desta maneira podemos retroceder ou avançar em checkpoints de um branch;

## Enviando e compartilhando tags

- As tags podem ser **enviadas para o repositório de código** sendo compartilhada entre os devs;

- O comando é **`git push origin <nome>`**;

- Ou se você quiser enviar mais tags **`git push origin --tags`**;

## Encontrando branches

- Branches novos são criados a todo tempo e **o git pode não estar mapeando ele**;

- Com o comando **`git fetch`** você é atualizado de todos os branches e tags que ainda não estão reconhecidos;

- Este comando é útil para utilizar o branch de algum outro dev do time;

## Recebendo alterações

- O comando **`git pull`** serve para recebermos atualizações do repositório remoto;

- Cada branch pode ser atualizado com o `git pull`;

- Utilizamos para atualizar a master do repositório como também quando trabalhamos em conjunto e queremos receber as atualizações de um dev;

## O comando **`git push `** faz o inverso do pull, ele envia as alterações para o repositório remoto;

- Serve também para **enviar as atualizações de um branch específico** para um outro dev;

- Ou quando terminamos uma tarefa e precisamos enviar ao repositório;

## Utilizando o remote

- Com o **`git remote`** podemos fazer algumas ações como: adicionar um repositório para trackear ou remover;

- Quando criamos um repositório remoto, adicionamos ele ao git com **`git remote add origin <link>`;

## Trabalhando com submódulos

- Submódulo é a maneira que temos de possuir **dois ou mais projetos em um só repositório**;

- Podemos adicionar uma dependência ao nosso projeto atual, porém mantendo suas estruturas separadas;

- Para adicionar o submódulo utilizamos o comando **`git submodule add <repositório>`**;

- Para verificar os submódulos o comando é **`git submodule`**;

## Atualizando submódulos

- Para atualizar um submódulo primeiro devemos **commitar as mudanças**;

- E para enviar para o repo do submódulo utilizamos **`git push --recurse-submodules=on-demand`**;

- Este fluxo fará a atualização apenas do submódulo;

## Exibindo informações

- O comando **`git show`** nos dá diversas informações úteis;

- Ele nos dá as informações do branch atual e também **seus commits**;

- As **modificações de arquivos** entre cada commit também são exibidas;

- Podemos exibir as informações de tags também com: **`git show <tag>`**;

## Exibindo diferenças

- O comando **`git diff`** serve para exibir as diferenças de um branch;

- Quando utilizando as diferenças do branch atual com o remoto serão exibidas no terminal;

- Podemos também verificar a diferença entre arquivos: **`git diff <arquivo> <arquivo_b>`**;

## Log resumido 

- O comando **`git shortlog`** nos dá um log resumido do projeto;

- Cada commit será unido por **nome do autor**

- Podemos então saber quais commits foram enviados ao projeto e por quem;

## Limpando arquivos untracked

- O comando **`git clean`** vai verificar e limpar arquivos que não estão sendo trackeados;

- Ou seja, todos que você não **utilizou `git add`**;

- Utilizado para arquivos que são **gerados automaticamente**, por exemplo, e atrapalham a visualização do que é realmente importante;

## Otimizando o repositório

- O comando **`git gc`** é uma abreviação para **garbage collector**;

- Ele identifica arquivos que **não são mais necessários e os exclui;

- Isso fará com que o repositório seja otimizado em questões de **performance**

## Checando a integridade de arquivos

- O comando **`git fsck`** é uma abreviação de File System Check;

- Esta instrução verifica a integridade de arquivos e sua conectividade;

- Verificando assim possíveis **corrupções em arquivos**;

- **Comando de rotina**, utilizado para ver se está tudo certo com nossos arquivos;

## Reflog

- o **`git reflog`** vai mapear todos os seus passos no repositório, até uma mudança de branch é inserida neste log;

- Já o **`git log`**, que vimos anteriormente, apenas armazena os commits de um branch;

- Os **reflogs ficam salvos até expirar**, o tempo de expiração padrão é de 30 dias;

## Transformando o repositório para arquivo

- Com o comando **`git archive`** podemos transformar o repositório em um arquivo compactado, por exemplo;

- O comando é **`git archive --format zip --output master_files.zip master`**;

- E então a master vai estar zipada no arquivo master_files.zip

## A importância do commit

- **O problema:** commits sem sentido atrapalham o projeto;

- Precisamos padronizar os commits, para que o projeto cresça de forma saudável também no versionamento, isso ajuda em:

- Review do **Pull Request**

- Melhoria dos logs em **`git log`**;

- Manutenção do projeto (voltar o código, por exemplo);

## Branches com commits ruins

- Há uma solução chamada **private branches**;

- Onde criamos branches que **não serão compartilhados no
repositório**, então podemos colocar qualquer commit;

- Ao fim da solução do problema podemos fazer um **rebase**;

- O comando será: **`git rebase <atual> <funcionalidade> -i`**

- Escolhemos os branches para excluir (**squash**) e renomear com
(**reword**);

## Boas mensagens de commit

- Separar **assunto** do corpo da mensagem;

- Assunto com no **máximo 50 caracteres**

- Assunto com **letra inicial maiúscula**;

- Corpo com no **máximo 72 caracteres**;

- Explicar o **porque e como** do commit, e não como o código foi escrito

