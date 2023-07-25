package StructuralDP.ProxyDP;

public class RealImageClass implements ImageGenerator{

    public String fullpath;



    //param const
    public RealImageClass(String fullpath) {
        this.fullpath = fullpath;

        loadImage();//obje oluşturulduğunda resim databaseden yüklensin
    }

    @Override
    public void showImage() {
        System.out.println("resim gösteriliyor... path: "+this.fullpath);
    }

    public void loadImage(){
        System.out.println("resim yükleniyor.");
    }

    //eksta diğer metodlar
    public void changeFormat(){
        //burada bağımlı başka objeler
    }


}
