<%@page import="serveur.CreditStub"%>
<%@page import="serveur.CreditStub.Annuite"%>
<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body>
<%  

 
double  taux= Float.valueOf(  request.getParameter("taux") ) ;
double capital = Double.valueOf( request.getParameter("capital")); 
long duree= Long.valueOf(   request.getParameter("duree"));
 CreditStub credit=new CreditStub();
 Annuite a=new Annuite();
 a.setCapital(capital);
 a.setDuree(duree);
 a.setTaux(taux);
 double result= credit.annuite(a).get_return();  
%>
<h2>l'annuité est:
<% out.print( result );
 
%>

</h2>
</body>
</html>