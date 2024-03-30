![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/ac54c69d-2c35-45cb-a106-4718ea7988de)


US n°1: [username=agentguichet, password=agentguichet, URL=http://localhost:8080/auth/signin, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/1554e9d1-aa77-4e88-86ab-09561fa855ce)

US n°2: [Token=generated in UC1, ROLE=ROLE_AGENT_GUICHET, URL=http://localhost:8080/api/rest/customer/agent_guichet/all, METHOD=GET]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/819cd4d0-1a07-4e02-b3a9-18d0fc0eb20a)

US n°3: [Token=generated in UC1, ROLE=ROLE_AGENT_GUICHET, URL=http://localhost:8080/api/rest/customer/agent_guichet/create, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/dabf78a6-bcf8-4498-995b-063c18d972d2)

US n°4: [username=adminguichet2, password=adminguichet2, URL=http://localhost:8080/auth/signin, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/f6822401-c314-4360-b051-4ec4e4c6bc5c)

US n°5: [Token=generated in UC4, ROLE=ROLE_AGENT_GUICHET_GET, URL=http://localhost:8080/api/rest/customer/agent_guichet/all, METHOD=GET]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/fecb69fb-05b1-4bca-bb72-50dd6cf45f0d)

US n°6: [Token=generated in UC4, ROLE=ROLE_AGENT_GUICHET_GET, URL=http://localhost:8080/api/rest/customer/agent_guichet/create, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/43a81cf3-7b4c-45f6-b290-807d03ec7e22)


US n°7: [username=client, password=client, URL=http://localhost:8080/auth/signin, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/e0c88520-9ed0-4d33-a7c2-093f8e7b9220)


US n°8: [Token=generated in UC7, ROLE=ROLE_CLIENT, URL=http://localhost:8080/api/rest/customer/agent_guichet/all, METHOD=GET]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/721b3ef1-1684-4d0c-af14-9e65ed7ff585)


US n°9: [Token=generated in UC7, ROLE=ROLE_CLIENT, URL=http://localhost:8080/api/rest/customer/agent_guichet/create, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/707f8ba7-a40c-480d-a91e-fa7c6eb5d0bf)


US n°10: [username=admin, password=admin, URL=http://localhost:8080/auth/signin, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/95cccdd7-03d0-4f87-825c-b678ac661375)

US n°11: [Token=generated in UC10, ROLE=ROLE_AGENT_GUICHET and ROLE_CLIENT, URL=http://localhost:8080/api/rest/customer/agent_guichet/all, METHOD=GET]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/1ac6ebca-82ec-4fc1-b08d-13b9fa7b13f7)


US n°12: [Token=generated in UC10, ROLE=ROLE_AGENT_GUICHET and ROLE_CLIENT, URL=http://localhost:8080/api/rest/customer/agent_guichet/create, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/7642c595-2d5d-4c4f-80ca-269c6293692c)


