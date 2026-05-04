package DSA.OOPS;

//entire concept known as encapsulation.
    class Students{
        String name;
        private int rno;//private data member
        double cgpa;
        void print(){//getter
            System.out.println(name+" "+rno+" "+cgpa);
        }
         int getrno(){//getter
            return rno;
        }
        void setrno(int x){//setter
            rno=x;
        }
    }
        class PrivateKeyword {
        public static void main(String[] args) {
            Students s1=new Students();
            s1.name="Zayn";
            //s1.rno=76; cant print because rno is private access.
            s1.cgpa=6.4;
            s1.setrno(76);
           // System.out.println(s1.rno);
           s1.print();
        }
    }

