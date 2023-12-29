![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/ed8d6edd-cc11-4d95-b99b-469f0089b076)

US n°1: [username=adminguichet1, password=adminguichet1, URL=http://localhost:8080/auth/signin, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/427a485e-aeaf-4465-984d-fbe5afd077c4)


US n°2: [Token=generated in UC1, ROLE=ROLE_AGENT_GUICHET, URL=http://localhost:8080/api/rest/customer/agent_guichet/all, METHOD=GET]
![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/96e7d4e6-0c66-458b-9bfa-d6150e7aa982)

US n°3: [Token=generated in UC1, ROLE=ROLE_AGENT_GUICHET, URL=http://localhost:8080/api/rest/customer/agent_guichet/create, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/a334fcb9-01e8-417c-ba77-e820ce90a43d)


US n°4: [username=adminguichet2, password=adminguichet2, URL=http://localhost:8080/auth/signin, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/85e9c53d-4459-4d42-b912-8e72691d16b6)


US n°5: [Token=generated in UC4, ROLE=ROLE_AGENT_GUICHET_GET, URL=http://localhost:8080/api/rest/customer/agent_guichet/all, METHOD=GET]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/782e635d-a822-481d-ae85-1afd8dc5f583)


US n°6: [Token=generated in UC4, ROLE=ROLE_AGENT_GUICHET_GET, URL=http://localhost:8080/api/rest/customer/agent_guichet/create, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/ffbdff45-a680-430e-a302-91fa0e0d7017)


US n°7: [username=client, password=client, URL=http://localhost:8080/auth/signin, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/c7103d38-a4aa-47b6-920e-51e9585b757b)


US n°8: [Token=generated in UC7, ROLE=ROLE_CLIENT, URL=http://localhost:8080/api/rest/customer/agent_guichet/all, METHOD=GET]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/8a32d5df-8d38-4fb8-a5a6-161d7d72302f)


US n°9: [Token=generated in UC7, ROLE=ROLE_CLIENT, URL=http://localhost:8080/api/rest/customer/agent_guichet/create, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/cff73079-8a75-4c34-a88c-60a07403f2fc)


US n°10: [username=admin, password=admin, URL=http://localhost:8080/auth/signin, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/f0b3c6a6-0306-4375-b2d9-a203b8fb8344)


US n°11: [Token=generated in UC10, ROLE=ROLE_AGENT_GUICHET and ROLE_CLIENT, URL=http://localhost:8080/api/rest/customer/agent_guichet/all, METHOD=GET]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/d9eda731-efda-4b5a-8d03-cbca273ea4f1)


US n°12: [Token=generated in UC10, ROLE=ROLE_AGENT_GUICHET and ROLE_CLIENT, URL=http://localhost:8080/api/rest/customer/agent_guichet/create, METHOD=POST]

![image](https://github.com/abbouformations/bank-service-multi-connecteur-jwt/assets/135717843/8a3007c6-bb73-4dcc-a59e-bc8899b31537)

