package feup.com.flash_sales.utils;

import java.util.Arrays;
import java.util.List;

import feup.com.flash_sales.model.Address;
import feup.com.flash_sales.model.Promotion;
import feup.com.flash_sales.model.Store;

/**
 * Created by jhonny on 05-01-2018.
 */

public class Mock {
    public static List<Promotion> getPromotions() {
        return Arrays.asList(new Promotion("MWN","Cachecol Xedrez Vermelho","https://goo.gl/AkUxm3", "","1"),
                new Promotion("Pepe Jeans","Calças Jeans Casual","https://goo.gl/NvpcUW", "","2"),
                new Promotion("Dielmar","Casaco Inverno Masculino","https://goo.gl/5StQhV", "","3"),
                new Promotion("New Balance","T-Shirt F.C. Porto","https://goo.gl/mSPxnV", "","4"),
                new Promotion("Saccor","Casaco Inverno Safira","https://goo.gl/u12FGK", "","5"),
                new Promotion("M\'Choices", "Vestido Comprido Boho Preto",
                             "https://goo.gl/iMeueM","","6"));
    }


    public static Address getAddress(int id){
        Address address;
        if(id% 2 == 0){
             address = new Address("1","Alameda Shop","Rua dos Campeões Europeus","29-198",
                     "","Bela Vista", "Porto", "Porto");
             address.setZipcode("4350-414");
             address.setLatitude(41.155225);
             address.setLongitude(-8.5865261);
        }
        address = new Address("2", "ViaCatarina Shopping", "Rua de Santa Catarina", "312",
                "", "Aliados", "Porto", "Porto");
        address.setZipcode("4000-008");
        address.setLatitude(41.148971);
        address.setLongitude(-8.606059);
        return address;
    }

    public static Store getStore(String id){
        return new Store(getAddress(2),"Nome da loja", "Breve Descriçao da loja","https://www.logogarden.com/wp-content/uploads/lg-logo-samples/Education-Counseling-Logo-5.png");
        /*switch (Integer.parseInt(id)){
            case 1:
            case 2:
                return new Store(getAddress(98),"Loja", "Descricao");
            case 3:
                return new Store(getAddress(56),"Loja", "Descricao");
            case 4:
                return new Store(getAddress(257),"Loja", "Descricao");
            case 5:
                return new Store(getAddress(237),"Loja", "Descricao");
           default:
               return new Store(getAddress(213),"Loja", "Descricao");
        }*/
    }
}
