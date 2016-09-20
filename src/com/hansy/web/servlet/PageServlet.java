package com.hansy.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hansy.entity.Pager;
import com.hansy.service.PageService;

public class PageServlet extends HttpServlet{

	private PageService pageService=new PageService();
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Pager pager=new Pager(); 
		int pageSize=Integer.parseInt(req.getParameter("pageSize"));
		int pageCount=Integer.parseInt(req.getParameter("pageCount"));
		pager.setPs(pageSize);
		pager.setPc(pageCount);
		Pager rs=pageService.selectAll(pager);
		resp.getWriter().print(JSONObject.toJSON(rs));
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	
}
