<%@page import="serveur.CreditStub.Capital"%>
<%@page import="serveur.CreditStub"%>
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
double annuite = Double.valueOf( request.getParameter("annuite")); 
long duree= Long.valueOf(   request.getParameter("duree"));
 CreditStub credit=new CreditStub();
 Capital c = new Capital() ;
 c.setAnnuite(annuite);
 c.setDuree(duree);
 c.setTaux(taux);
 double result= credit.capital(c).get_return();  
%>
<h2>le capital est :
<% out.print( result );
 
%>

</h2>
</body>
</html>