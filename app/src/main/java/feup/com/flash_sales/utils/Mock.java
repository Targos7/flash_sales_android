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
        return Arrays.asList(new Promotion("NewYorker","Cachecol Xedrez Vermelho","https://drive.google.com/open?id=1sD477LI1ECpnnsA4IXYKvgJ2oksY7jzk", "","1"),
                new Promotion("Levi's","Calças Jeans Casual","https://drive.google.com/open?id=1EOuO7Ml9i0Dps17LI6ii0IbO-lZbdxyZ", "","2"),
                new Promotion("H&M","Casaco Inverno Xedrez","https://drive.google.com/open?id=1I_GG7aXqI78CwLHtOXC4iljzBIlInie1", "","3"),
                new Promotion("PANDORA","Pulseira Prata e Rosa","https://drive.google.com/open?id=1qEfyGOpwA6-zF0yBo1_BLv5dIZAAS5zk", "","4"),
                new Promotion("SPRINGFIELD","Camisola de lã Beige","https://drive.google.com/open?id=1utSWGuDI68s15AKiJqfaQJnyMFSl2mFZ", "","5"),
                new Promotion("KIKO Milano", "Lipstick Rosa","https://drive.google.com/open?id=1dNhb2I0SvDIMusu9hldYII6fYAVgtma7","","6"));
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
