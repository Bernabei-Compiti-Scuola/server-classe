**Come serializzare e deserializzare un oggetto in XML**

Serializzare (va fatto nel server): 
 - prendere un oggetto e trasformarlo in una stringa : 
     XmlMapper xmlMapper = new XmlMapper();
     String s = xmlMapper.writeValueAsString(studente);
     System.out.println(s);

Deserializzare (va fatto nel client): 
 - prendere una stringa e trasformarla in un oggetto :
     Alunno a = xmlMapper.readValue(s, Alunno.class);
     System.out.println(a.nome);
     System.out.println(a.cognome);
 
*---------------------------------------------------------------------------------------------------------------*

**Come serializzare e deserializzare un oggetto in JSON**

Serializzare (va fatto nel server): 
 - prendere un oggetto e trasformarlo in una stringa : 
     ObjectMapper ObjectMapper = new ObjectMapper();
     String s = ObjectMapper.writeValueAsString(studente);
     System.out.println(s);

Deserializzare (va fatto nel client): 
 - prendere una stringa e trasformarla in un oggetto :
     Alunno a = ObjectMapper.readValue(s, Alunno.class);
     System.out.println(a.nome);
     System.out.println(a.cognome)