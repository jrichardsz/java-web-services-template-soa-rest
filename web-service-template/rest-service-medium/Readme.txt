Fuente:
http://www.mkyong.com/webservices/jax-rs/json-example-with-jersey-jackson/
http://www.mastertheboss.com/resteasy/
http://vrsbrazil.wordpress.com/2013/08/07/passing-parameters-to-a-restful-web-service/
http://www.mastertheboss.com/resteasy/resteasy-tutorial-part-two-web-parameters


Links by method:

#################
http://localhost:8080/rest-service/rest/eventoService/getDefault

Example:

Request headers 
User-Agent: Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.22 (KHTML, like Gecko) Chrome/25.0.1364.172 Safari/537.22
Content-Type: text/plain; charset=utf-8 
Accept: */*
Accept-Encoding: gzip,deflate,sdch
Accept-Language: es-ES,es;q=0.8
Accept-Charset: ISO-8859-1,utf-8;q=0.7,*;q=0.3

Response headers
Server: Apache-Coyote/1.1 
Content-Type: application/json 
Transfer-Encoding: chunked 
Date: Wed, 11 Dec 2013 02:47:13 GMT 

{
id: "Q@AZAVwd@k"
denominacion: "4Qqhvv~To{"
userAdministrador: "RvuNwybY]<"
}


#################
http://localhost:8080/rest-service/rest/eventoService/getEventById/125

Request headers 
User-Agent: Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.22 (KHTML, like Gecko) Chrome/25.0.1364.172 Safari/537.22
Content-Type: text/plain; charset=utf-8 
Accept: */*
Accept-Encoding: gzip,deflate,sdch
Accept-Language: es-ES,es;q=0.8
Accept-Charset: ISO-8859-1,utf-8;q=0.7,*;q=0.3

Response headers 
Server: Apache-Coyote/1.1 
Content-Type: application/json 
Transfer-Encoding: chunked 
Date: Wed, 11 Dec 2013 04:12:42 GMT 


{
id: "ZxMC::xJVN"
denominacion: "LPl:H\WpY9"
userAdministrador: "[~hxH|udc4"
}

#################
http://localhost:8080/rest-service/rest/eventoService/getEventByUri?uri=5

Request headers 
User-Agent: Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.22 (KHTML, like Gecko) Chrome/25.0.1364.172 Safari/537.22
Content-Type: text/plain; charset=utf-8 
Accept: */*
Accept-Encoding: gzip,deflate,sdch
Accept-Language: es-ES,es;q=0.8
Accept-Charset: ISO-8859-1,utf-8;q=0.7,*;q=0.3

Response headers 
Server: Apache-Coyote/1.1 
Content-Type: application/json 
Transfer-Encoding: chunked 
Date: Sat, 14 Dec 2013 13:31:25 GMT

{
id: "5"
denominacion: "Aq7Y8SjzNu"
userAdministrador: "8KUuBZmb3i"
}