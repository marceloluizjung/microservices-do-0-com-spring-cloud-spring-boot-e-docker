**Webservices:** Um web service pode ser construído usando REST ou SOAP, o webservice pode ser executado ou acessado por um protocolo HTTP, ou um navegador qualquer.

**Rest X Soap**
SOAP
- Protocolo de troca de mensagens em XML
- Usa WSDL na comunicação entre cliente e servidor
- Invoca serviços através de chamadas de método RPC
- Não retorna um resultado facilmente legível para humanos
- Comunicação feita por HTTP mas pode usar outros protocolos como SMTP, FTP etc.
- JavaScript pode invocar um serviço SOAP mas essa implementação é bastante complexa de se fazer.
- Comparado com o REST sua performance não é das melhores.
- Os dados são encapsulados, oque tornam o request mais pesado.

REST
- Um estilo arquitetural
- Usa XML, JSON etc. para enviar e receber dados
- Simplesmente chama serviço via URL PATH
- Resultado legível para humanos já que é simplesmente JSON ou XML por exemplo.
- Comunicação feita unicamente por HTTP
- Fácil de invocar via JavaScript
- Comparado com o SOAP a performance é melhor, consome menos recursos de processamento, código mais enxuto etc.
- Não existe encapsulamento.

**Oque é REST?**
Representational State Transfer (REST), é um estilo de arquitetura de software para sistemas distribuídos de hipermídia, como a Word Wide Web.
- Cliente-servidor: Clientes e servidores separados.
- Stateless server: O servidor não deve guardar o estado do cliente. Cada request de um cliente contém todas as informações necessárias para atendê-las.
- Cacheable: O cliente deve ser informado sobre as propriedades de cache de um recurso para que possa decidir quando deve ou não utilizar cache.
- Interface uniforme
- Existe uma interface uniforme: Existe uma interface uniforme entre cliente e servidor. Identificação de recursos (URI), manipulação de recursos a partir de suas representações, mensagens auto descritivas. Hypermedia as te engine of application state - HATEOAS
- Sistema em camadas: Deve suportar conceitos como balanceamento de carga proxies e firewalls.
- Código sob demanda: O cliente pode solicitar o código do servidor e executá-lo.

**Parâmetros das requisições:**
- Path params (parâmetros de busca - GET) - São parâmetros obrigatórios passados pela URL, exemplo: http://localhost/param1/param2
- Query params (parâmetros de busca - GET) - São parâmetros opcionais passados pela URL, exemplo: http://localhost?a=param1&b=param2
- Header params (interceptado pelo framework utilizado na implementação - Spring) - Enviados no cabeçalho do request.
- Body params (parâmetros de persistência - PUT, POST e PATCH) - JSON, objeto que contém os dados. Pode ser xml, yaml ou outros que a API aceita. 

**HTTP Status Codes:**
- Corresponde ao status da requisição que o nosso client fez.
- 1xx - Informacionais
- 2xx - Sucesso	
	- 200 - OK
	- 201 - Created
	- 202 - Accepted
	- 203 - Non-authoritative Information
	- 204 - No content
	- 205 - Reset content
	- 206 - Partial content
	- 207 - Multi-status
	- 208 - Already reported
	- 226 - IM Used
- 3xx - Redirecionamento
	- 300 -  Multiple Choices
	- 301 - Moved Permanently
	- 302 - Found
	- 303 - See Other
	- 304 - Not Modified
	- 305 - Use Proxy
	- 307 - Temporary Redirect
	- 308 - Permanent Redirect
- 4xx - Erro de client
	- 400 - Bad request
	- 401 - Unauthorized
	- 402 - Payment required
	- 403 - Forbiden
	- 404 - Not found
	- 405 - Method not allowed
	- 406 - Not acceptable
	- 407 - Proxy authentication required
	- 408 - Request timeout
	- 409 - Conflict
	- 410 - Gone
	- 411 - Length required
	- 412 - precondition failed
	- 413 - Payload too large
	- 414 - Request-URI too long
	- 415 - Unsupported media type
	- 416 - Requested range not satisfiable
	- 417 - Expectation failed
	- 418 - Im a teapot
	- 421 - Misdirected Request
	- 422 - Unprocessable Entity
	- 423 - Locked
	- 424 - Failed dependency
	- 426 - Upgrade required
	- 428 - Precondition required
	- 429 - Too many requests
	- 431 - Request header fields too large
	- 444 - Connection closed without response
	- 451 - Unavailable for legal reasons
	- 499 - Client closed request
- 5xx - Erro de server
	- 500 - Internal server error
	- 501 - Not implemented
	- 502 - Bad gateway
	- 503 - Service unavailable
	- 504 - Gateway timeout
	- 505 - HTTP Version not supported 
	- 506 - Variant also negotiates
	- 507 - Insufficient storage
	- 508 - Loop detected
	- 510 - Not extended
	- 511 - Network authentication required
	- 599 - Nework connect timeout error

https://docs.oracle.com/en/cloud/iaas/messaging-cloud/csmes/rest-api-http-status-codes-and-error-messages-reference.html#GUID-AAB1EE32-BE4A-4ACC-BEAC-ABA85EB41919
https://www.restapitutorial.com/httpstatuscodes.html
https://dzone.com/refcardz/rest-foundations-restful?chapter=5
http://www.semeru.com.br/blog/http-status-codes-em-servicos-rest/

**Verbos HTTP:** 
Post, Put, Get, Delete, Patch, Head, Trace, Options, Connect

**Richardson Maturity Model**
Níveis de maturidade do rest.
Level 0: The swamp of pox
Level 1: Resources
Level 2: HTTP verbs
Level 3: Hypermedia controls

**HATEOAS**
Hateoas faz parte da arquitetura REST, o json contém recursos para serem acessados. Uma api normal já teria tudo carregado de uma vez.
https://www.treinaweb.com.br/blog/o-que-e-hateoas

