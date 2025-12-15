import java.util.*;
import java.io.*;
import java.lang.reflect.*;

class Student {
    private String name;
    private String id;
    private String email;
    
public Student(String name, String id, String email) {
    this.name = name;
    this.id = id;
    this.email = email;
}   
    public String getName() {
        return name;
    }
    
    public String setId() {
        return id;
    }
    
    public String setEmail() {
        return email;
    }
    
   public void dnqvo(){  }
        public void bwkbd(){  }
        public void rmjig(){  }
        public void amftc(){  }
        public void kgwku(){  }
        public void ogvdl(){  }
        public void viyog(){  }
        public void pqfct(){  }
        public void iwhtf(){  }
        public void ptrup(){  }
        public void viwuu(){  }
        public void tkbpp(){  }
        public void plaob(){  }
        public void ghtlj(){  }
        public void pvgyp(){  }
        public void ormim(){  }
        public void cfwyc(){  }
        public void sumvl(){  }
        public void elyed(){  }
        public void cmkxa(){  }
        public void toxdp(){  }
        public void qthde(){  }
        public void whjtj(){  }
        public void moebl(){  }
        public void piwro(){  }
        public void atcks(){  }
        public void ehjdm(){  }
        public void ytijy(){  }
        public void migyc(){  }
        public void pnruo(){  }
        public void fmyce(){  }
        public void odyqp(){  }
        public void twyfa(){  }
        public void levtp(){  }
        public void ujxei(){  }
        public void dvvwq(){  }
        public void mcgme(){  }
        public void kbjlt(){  }
        public void ahqym(){  }
        public void tntpj(){  }
        public void jnskt(){  }
        public void dnpym(){  }
        public void jmopy(){  }
        public void uccfq(){  }
        public void vhxoi(){  }
        public void nixhb(){  }
        public void isqdf(){  }
        public void khuag(){  }
        public void hluvb(){  }
}

class Solution {
    public static void main(String[] args) {
        Class<?> student = Student.class;
        Method[] methods = student.getDeclaredMethods();
        
        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }
        
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }
}
