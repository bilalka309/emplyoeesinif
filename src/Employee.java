public class Employee {
    String name;
    int hireYear;
    int workHours;
    double salary;

    Employee(String name,int hireYear,int workHours,double salary){
        this.name=name;
        this.hireYear=hireYear;
        this.workHours=workHours;
        this.salary=salary;
    }
   public double tax()
    {
        if(this.salary>1000){
            return this.salary*0.03;
                    }else {
            return 0;

        }
    }
  public double bonus()
    {

        if (this.workHours>40){
            return (this.workHours-40)*30;
                }else {
            return 0;
        }

    }
  public double raiseSalary() {
      int x = 2021;
      if ((x - this.hireYear) < 10) {
          return this.salary * 0.05;
      } else if ((x - this.hireYear) < 20 && (x - this.hireYear) > 9) {
          return this.salary * 0.1;
      } else if ((x - this.hireYear) > 19) {
          return this.salary * 0.15;
      }
      return 0;
  }
  public String toString(){


            double total = this.salary  + raiseSalary();
            double tot = this.salary +bonus() - tax();
            System.out.println("Adı : "+this.name);
            System.out.println("Maaşı : "+ this.salary);
            System.out.println("Çalışma Saati : "+ this.workHours);
            System.out.println("Başlangıç Yılı : "+this.hireYear);
            System.out.println("Vergi : "+tax());
            System.out.println("Bonus : "+bonus());
            System.out.println("Maaş artışı : "+raiseSalary());
            System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+tot);
            System.out.println("Toplam Maaş : "+total);


            return null;

    }


}
