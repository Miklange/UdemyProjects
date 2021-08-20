<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div>
    <ul>
        <c:forEach items="${ listOfWorks }" var="work">
            <li>${ work.title }(${ work.release })</li>
        </c:forEach>
    </ul>
</div>
