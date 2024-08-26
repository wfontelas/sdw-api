# Santander Dev Week 
Java RESTful API criada para a Santander Dev Week

## Diagrama de Classes
```mermaid
classDiagram
    class User {
        -Long id
        -String name
        -Account account
        -Card card
        -List~Feature~ features
        -List~News~ news
    }

    class Account {
        -Long id
        -String number
        -String agency
        -BigDecimal balance
        -BigDecimal limit
    }

    class Card {
        -String number
        -BigDecimal limit
    }

    class Feature {
        -Long id
        -String icon
        -String description
    }

    class News {
        -Long id
        -String icon
        -String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Card
    User "1" *-- "1" Feature
    User "1" *-- "N" News
```
