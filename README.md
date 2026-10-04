# ☕ Design Patterns em Java

Este documento contém um resumo teórico dos principais Padrões de Projeto (Design Patterns) divididos em suas três categorias oficiais: **Criacionais**, **Estruturais** e **Comportamentais**.

---

## 🏗️ Padrões Criacionais
Focam no processo de criação de objetos, abstraindo a lógica de instanciação e tornando o sistema independente de como seus objetos são criados.

* **Singleton**: Garante que uma classe tenha apenas uma única instância em todo o ciclo de vida da aplicação e fornece um ponto de acesso global para ela.
* **Factory Method**: Define uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe instanciar.
* **Abstract Factory**: Permite produzir famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
* **Builder**: Separa a construção de um objeto complexo da sua representação, permitindo que o mesmo processo de construção crie diferentes representações (passo a passo).
* **Prototype**: Permite copiar (clonar) objetos existentes sem fazer seu código depender das classes deles.

---

## 📐 Padrões Estruturais
Focam em como classes e objetos são compostos para formar estruturas maiores, garantindo a flexibilidade e a eficiência do sistema.

* **Adapter**: Permite que objetos com interfaces incompatíveis colaborem entre si, agindo como um tradutor.
* **Bridge**: Divide uma classe grande ou um conjunto de classes intimamente ligadas em duas hierarquias separadas (abstração e implementação) para que possam se desenvolver de forma independente.
* **Composite**: Permite compor objetos em estruturas de árvore para representar hierarquias partes-todo, tratando objetos individuais e composições de maneira uniforme.
* **Decorator**: Permite adicionar novos comportamentos a um objeto dinamicamente, colocando-os dentro de objetos "envoltórios" (wrappers) que contêm esses comportamentos.
* **Facade**: Fornece uma interface simplificada e unificada para uma biblioteca, framework ou qualquer outro grupo complexo de classes.
* **Flyweight**: Permite ajustar mais objetos na quantidade de RAM disponível, compartilhando partes comuns de estado entre múltiplos objetos em vez de manter todos os dados em cada um.
* **Proxy**: Fornece um substituto ou marcador de localização para outro objeto para controlar o acesso a ele (como lazy loading ou segurança).

---

## 🧠 Padrões Comportamentais
Focam na comunicação, atribuição de responsabilidades e interatividade entre os objetos do sistema.

* **Chain of Responsibility**: Permite passar requisições por uma cadeia de manipuladores. Ao receber uma requisição, cada manipulador decide se a processa ou a passa para o próximo da fila.
* **Command**: Transforma uma requisição ou operação em um objeto autônomo, permitindo parametrizar clientes com diferentes requisições, enfileirar ou registrar operações e suportar operações reversíveis.
* **Iterator**: Permite navegar por elementos de uma coleção (lista, árvore, etc.) sem expor sua representação subjacente.
* **Mediator**: Restringe comunicações diretas entre objetos e os força a colaborar apenas por meio de um objeto mediador, reduzindo o acoplamento.
* **Memento**: Permite salvar e restaurar o estado prévio de um objeto sem violar seu encapsulamento (famoso comando "Desfazer").
* **Observer**: Define um mecanismo de assinatura para notificar múltiplos objetos sobre quaisquer eventos que aconteçam com o objeto que eles estão observando.
* **State**: Permite que um objeto altere seu comportamento quando seu estado interno muda, parecendo que o objeto mudou de classe.
* **Strategy**: Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis, permitindo que o algoritmo varie independentemente dos clientes que o utilizam.
* **Template Method**: Define o esqueleto de um algoritmo na superclasse, mas deixa as subclasses sobrescreverem etapas específicas do algoritmo sem modificar sua estrutura.
* **Visitor**: Permite separar algoritmos dos objetos nos quais eles operam, adicionando novas operações a estruturas de objetos existentes sem modificá-las.
