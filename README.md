# Bridge

Aspectos Avançados em Engenharia de Software

Implementação do padrão de projeto estrutural Bridge aplicada ao cálculo do prêmio de seguros de
uma seguradora. A abstração é o tipo de seguro (residencial, automóvel e viagem) e a implementação
é o perfil de risco do cliente (baixo, médio e alto). O padrão se aplica porque as duas hierarquias
variam de forma independente: é possível criar um novo tipo de seguro sem alterar os perfis de
risco e criar um novo perfil de risco sem alterar os tipos de seguro, evitando a explosão de
subclasses que surgiria ao combinar as duas variações por herança.

![Diagrama de classes](uml/diagrama.png)
