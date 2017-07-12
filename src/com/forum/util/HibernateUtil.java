package com.forum.util;
import org.hibernate.Session;//hibernate3的  
import org.hibernate.SessionFactory;  
import org.hibernate.cfg.Configuration;  
  
@SuppressWarnings("deprecation")
public class HibernateUtil {  
   private static SessionFactory factory;  
      
   static{   
       //读取hibernate.cfg.xml文件  
       Configuration cfg=new Configuration().configure();  
       //建立SessionFactory  
       factory=cfg.buildSessionFactory();  
      
   }    
     
      //获得开启着的Session  
   public static Session getSession(){  
       return factory.openSession();  
   }  
     
      //关闭Session  
   public static void closeSession(Session session){  
       if(session!=null){  
           if(session.isOpen()){  
               session.close();  
           }  
       }  
   }  
     
   public static SessionFactory getSessionFactory(){  
       return factory;  
   }  
}  