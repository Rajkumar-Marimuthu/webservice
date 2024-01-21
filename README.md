# webservice
This project needs spring-ws-core and wsdl4j dependencies.
dependencies {
    implementation 'wsdl4j:wsdl4j'
    jaxb("org.glassfish.jaxb:jaxb-xjc")
}

http://localhost:8080/ws/countries.wsdl

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
xmlns:gs="http://rojatech.com/webservice">
<soapenv:Header/>
<soapenv:Body>
<gs:getCountryRequest>
<gs:name>Spain</gs:name>
</gs:getCountryRequest>
</soapenv:Body>
</soapenv:Envelope>