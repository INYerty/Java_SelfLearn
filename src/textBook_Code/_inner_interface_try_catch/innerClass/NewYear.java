package textBook_Code._inner_interface_try_catch.innerClass;

class MobileShop{

    InnerPurchaseMoney purchaseMoney1;
    InnerPurchaseMoney purchaseMoney2;
    private int mobileAmount;
    MobileShop(){
        purchaseMoney1 = new InnerPurchaseMoney(20000);
        purchaseMoney2 = new InnerPurchaseMoney(10000);
    }

    void setMobileAmount(int m){
        mobileAmount = m;
    }
    int getMobileAmount(){
        return mobileAmount;
    }

    class InnerPurchaseMoney{       //内部类
        int moneyValue;     //内部的手机价格
        InnerPurchaseMoney(int m){
            moneyValue = m;
        }

        void buyMobile(){
            if(mobileAmount >20000){        //代表库存很多，卖不出去，同样的moneyValue买的手机也多
                mobileAmount = mobileAmount - 6;
                System.out.println("用价值"+moneyValue+"的内部购买券购买了6部手机");
            } else if (moneyValue<20000 && moneyValue>=10000) {     //代表库存一般,同样的moneyValue买的手机也相对少
                mobileAmount = mobileAmount - 3;
                System.out.println("用价值"+moneyValue+"的内部购买券购买了3部手机");
            }
        }
    }
}

public class NewYear {
    public static void main(String[] args) {
        MobileShop shop = new MobileShop();
        shop.setMobileAmount(30);
        System.out.println("商店现有手机"+shop.getMobileAmount()+"部");
        shop.purchaseMoney1.buyMobile();
        shop.purchaseMoney2.buyMobile();
        System.out.println("商店现有手机"+shop.getMobileAmount()+"部");
    }
}
