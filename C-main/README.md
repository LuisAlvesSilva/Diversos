# C
Idealização de API

Identificador de fonte por imagem	| ASP.NET Core (C#) |

Requisitos Funcionais:

Coletar imagens: A API deve ser capaz de receber imagens como entrada. Isso pode ser feito através do envio da imagem via HTTP POST ou outro método adequado.

Realizar a leitura da imagem: A API deve ser capaz de processar a imagem recebida e extrair o texto contido nela. Isso pode ser alcançado usando técnicas de OCR (Reconhecimento Óptico de Caracteres).

Apresentar resultados a partir da leitura da imagem: Após a extração do texto da imagem, a API deve retornar os resultados para o usuário. Isso pode incluir o texto extraído e informações sobre a fonte usada no texto.

Requisitos Não Funcionais:

Desempenho: A API deve ser capaz de processar imagens com eficiência e rapidez. Isso pode envolver a otimização do código, uso de técnicas de processamento de imagem eficientes e uso de recursos de hardware adequados.

Resolução da imagem: A API deve ser capaz de lidar com diferentes resoluções de imagem, desde imagens de baixa resolução até imagens de alta qualidade. Isso garantirá que a API seja versátil e útil para uma variedade de casos de uso.

Transformar em texto/lista: A API deve ser capaz de converter as informações visuais contidas na imagem em texto estruturado ou, se necessário, em uma lista de caracteres reconhecidos. Isso permitirá uma análise mais detalhada do conteúdo da imagem.

Identificar fonte: A API deve ser capaz de analisar as características do texto extraído da imagem, como estilo, tamanho e outros atributos, a fim de identificar a fonte usada. Isso pode envolver a comparação das características com uma base de dados de fontes conhecidas.

Apresentar texto e fonte: A API deve retornar não apenas o texto extraído, mas também informações sobre a fonte identificada. Isso pode incluir o nome da fonte, características dela e, possivelmente, até mesmo exemplos visuais da fonte.

Segurança: A API deve ser projetada com medidas de segurança adequadas para garantir que os dados do usuário sejam protegidos durante a transmissão e o processamento.

Escala: A API deve ser projetada para escalabilidade, permitindo lidar com um grande número de solicitações simultâneas de maneira eficiente.

Documentação e suporte: A API deve ser bem documentada, com informações claras sobre como usá-la, formatos de entrada/saída e exemplos. Além disso, um suporte adequado deve ser fornecido para ajudar os desenvolvedores a integrar e solucionar problemas relacionados à API.


                 |
                 |
                 v
	+---------------------------------------+
	|             ImageFontAPI              |
  	+--------------------------------------+
  	| - image: Image                        |
  	| - extractedText: String               |
  	| - identifiedFont: FontInfo            |
  	+---------------------------------------+
  	| + setImage(image: Image): void        |
  	| + extractTextFromImage(): void        |
  	| + identifyFont(): void                |
 	| + getExtractedText(): String          |
 	| + getIdentifiedFont(): FontInfo       |
 	+---------------------------------------+

                 |
                 |usos
                 v

 	+---------------------------------------+
  	|                Image                  |
  	+---------------------------------------+
  	| - imageData: byte[]                   |
  	+---------------------------------------+
  	| + getImageData(): byte[]              |
  	+---------------------------------------+

                 ^
                 |é composto de
                 
  	+---------------------------------------+
  	|              FontInfo                 |
  	+---------------------------------------+
  	| - fontName: String                    |
  	| - fontSize: int                       |
  	| - fontStyle: String                   |
  	+---------------------------------------+
  	| + getFontName(): String               |
  	| + getFontSize(): int                  |
  	| + getFontStyle(): String              |
  	+---------------------------------------+


ImageFontAPI é a classe principal que representa a API. Ela contém atributos para a imagem, texto extraído e informações da fonte identificada. Possui métodos para definir a imagem, extrair o texto da imagem, identificar a fonte usada no texto e obter informações sobre o texto e a fonte.

Image é uma classe que representa uma imagem. Ela tem um atributo imageData que armazena os dados da imagem em formato binário. A classe oferece um método para obter os dados da imagem.

FontInfo é uma classe que armazena informações sobre a fonte identificada. Ela possui atributos como fontName (nome da fonte), fontSize (tamanho da fonte) e fontStyle (estilo da fonte). A classe também oferece métodos para obter essas informações.



