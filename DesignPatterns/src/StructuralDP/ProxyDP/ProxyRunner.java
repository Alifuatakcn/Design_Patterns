package StructuralDP.ProxyDP;

public class ProxyRunner {
    public static void main(String[] args) {

        RealImageClass realObject=new RealImageClass("C:\\resim1.jpeg");//resim yüklendi.
        //realObject.changeFormat();

        System.out.println("--------------- Proxy  ----------------------------");

        ProxyImageClass proxyObject=new ProxyImageClass("C:\\resim1.jpeg");//resim yüklenmedi,orjinal değil
        //başka işlemler........
        //otherMethod(proxyObject);


        proxyObject.showImage();//metodu çağrılınca real object oluştu.
        //proxyObject. //diğer metodlara erişim yok, yani orjinal objenin yönetimini sağlamış oluyoruz.

    }
}
