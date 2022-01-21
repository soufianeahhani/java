<%@page import="serveur.CreditStub.Duree"%>
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

 
double  taux= Double.valueOf(  request.getParameter("taux") ) ;
double capital = Double.valueOf( request.getParameter("capital")); 
double annuite= Double.valueOf(   request.getParameter("annuite"));
 CreditStub credit=new CreditStub();
Duree d=new Duree();
 d.setCapital(capital);
 d.setAnnuite(annuite);
 
 d.setTaux(taux);
long result= credit.duree(d).get_return();  
%>
<h2>la durée est:
<% out.print( result );
 
%>

</h2>
</body>
</html>