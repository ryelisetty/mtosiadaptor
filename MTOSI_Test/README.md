#MTOSI

1) import the attached project as a gradle project. You can use any gradle plugin for the IDE. 
2) Run the Application.java file; it will invoke the embedded container and will deploy all the components and configurations.

3) Use any soap client , or soapUi, and create a request.
4) add the authentication header, with any credentials
5) execute the service http://localhost:8080/mtosi/ManagedElementRetrieval , and a dummy response will be returned back.


sample request
<?xml version="1.0" encoding="UTF-8"?>
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/" xmlns:hdr="http://www.tmforum.org/mtop/fmw/xsd/hdr/v1" xmlns:mer="http://www.tmforum.org/mtop/mri/xsd/mer/v1" xmlns:nam="http://www.tmforum.org/mtop/fmw/xsd/nam/v1" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.tmforum.org/mtop/mri/xsd/mer/v1 ../xsd/ManagedElementRetrievalMessages.xsd http://schemas.xmlsoap.org/soap/envelope/ http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Header>
    <hdr:header>
      <hdr:activityName>getAllManagedElements</hdr:activityName>
      <hdr:msgName>getAllManagedElementsRequest</hdr:msgName>
      <hdr:msgType>REQUEST</hdr:msgType>
      <hdr:senderURI>/MTOSI/InventoryOS</hdr:senderURI>
      <hdr:destinationURI>/MTOSI/EmsOS</hdr:destinationURI>
      <hdr:correlationId>2222</hdr:correlationId>
      <hdr:communicationPattern>MultipleBatchResponse</hdr:communicationPattern>
      <hdr:communicationStyle>MSG</hdr:communicationStyle>
      <hdr:requestedBatchSize>500</hdr:requestedBatchSize>
      <hdr:timestamp>2007-07-30T09:26:00</hdr:timestamp>
    </hdr:header>
  </soap:Header>
  <soap:Body>
    <mer:getAllManagedElementsRequest>
      <mer:mdName>
        <nam:rdn>
          <nam:type>MD</nam:type>
          <nam:value>string</nam:value>
        </nam:rdn>
      </mer:mdName>
    </mer:getAllManagedElementsRequest>
  </soap:Body>
</soap:Envelope>