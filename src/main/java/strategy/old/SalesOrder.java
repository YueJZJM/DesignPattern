package strategy.old;

public class SalesOrder {

    public void CalculateTax(TaxBase tax) {
        if (tax == TaxBase.CN_Tax){
            //CN***********
            System.out.println("用中国的税率计算");
        }
        else if (tax == TaxBase.US_Tax){
            //US***********
            System.out.println("用美国的税率计算");
        }
        else if (tax == TaxBase.DE_Tax){
            //DE***********
            System.out.println("用德国的税率计算");
        }
        else if (tax == TaxBase.FR_Tax){  //更改
            //...
            System.out.println("用法国的税率计算");
        }
    }
}


enum TaxBase{
    CN_Tax,
    US_Tax,
    DE_Tax,
    FR_Tax       //更改
}