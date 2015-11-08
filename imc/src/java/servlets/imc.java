
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "imc", urlPatterns = {"/imc"})
public class imc extends HttpServlet {

    protected void doPost(HttpServletRequest request , HttpServletResponse response) 
            throws ServletException, IOException {
        
        float altura = Float.parseFloat(request.getParameter("altura"));
        float peso = Float.parseFloat(request.getParameter("peso"));
        
        float imc = peso / (altura*altura);
        String condicao = null;
        
        if(imc < 17)  
        {  
            condicao = "Infelizmente! Você está muito abaixo do peso ideal.";  
        }  
        else  
            if(imc >= 17 || imc <= 18.5)  
            {  
                condicao = "Infelizmente! Você está abaixo do peso ideal.";  
            }  
            else  
                if(imc >= 18.5 || imc < 25)  
                {  
                    condicao = "Parabéns! Você  está no seu peso ideal.";  
                }  
                else  
                    if(imc >= 25 || imc < 30)  
                    {  
                        condicao = "Infelizmente! Você está acima do peso ideal.";  
                    }
                    else
                       if(imc >= 30 || imc < 35)
                       {
                           condicao = "Infelizmente! Você está muito acima do peso ideal.";
                       }
                        else
                           if(imc >= 35 || imc < 40)
                           {
                               condicao = "Infelizmente! Você está com obesidade severa.";
                           }
                            else
                               condicao = "Infelizmente! Você está com obesidade mórbida.";
        
        request.setAttribute("imc", imc);
        request.setAttribute("condicao", condicao);
        
        request.getRequestDispatcher("calcularIMC.jsp").forward(request, response);
    
    }
    
}