package selection_sort;

public class Selection_Sort {

    int [] liste;
    int elemansayisi,sinir;
    public Selection_Sort(int kapasite){
        liste=new int[kapasite];
        elemansayisi=0;
        sinir=kapasite;
    }
    public void Ekle(int EklenecekEleman){
        if (elemansayisi<sinir) {
            liste[elemansayisi]=EklenecekEleman;
            elemansayisi++;
        }
        else{
            System.out.println("Kapasite doldu...");
        }
    }
    public void yaz(){
        for (int i = 0; i < elemansayisi; i++) {
            System.out.print(liste[i]+" ");
        }
    }
    public void sil(int index){
        if (index>=0 && index<=elemansayisi-1 && elemansayisi>0) {
            for (int i = index; i < elemansayisi-1; i++) {
                liste[i]=liste[i+1];
            }
            elemansayisi--;
        }
        else{
            System.out.println("HATA...");
        }
    }
    
    public void ekleme(int eklenecekeleman,int index){
        if (index<=elemansayisi && index>=0 && elemansayisi<sinir) {
            for (int i = elemansayisi-1; i >=index; i--) {
                liste[i+1]=liste[i];
            }
            liste[index]=eklenecekeleman;
            elemansayisi++;
        }
        else{
            System.out.println("Yanlis index");
        }
    }
        public int max(){
            int enbuyuk=liste[0];
            for (int i = 0; i <elemansayisi; i++) {
                if (liste[i]>enbuyuk) {
                    enbuyuk=liste[i];
                }
            }
            return enbuyuk;
        }
    
            public int min(){
            int enkucuk=liste[0];
            for (int i = 0; i <elemansayisi; i++) {
                if (liste[i]<enkucuk) {
                    enkucuk=liste[i];
                }
            }
            return enkucuk;
        }
        
            public void swap(int i1,int i2){
               int tmp=liste[i1];
               liste[i1]=liste[i2];
               liste[i2]=tmp;
            }
            public void SelectionSort(){
                 //gidilecek nokta array'in eleman sayisini asmamali.
                int enKucukIndex;
                for (int i =0; i <elemansayisi; i++) {
                    enKucukIndex=i;
                    
                    for (int j = i; j <elemansayisi; j++) {
                if (liste[j]<liste[enKucukIndex]) {
                    enKucukIndex=j;
                }
            }
                    swap(enKucukIndex, i);
                }
            }
            
             public void bubblesort(){
        boolean swapped=true;
        while (swapped) {
            swapped=false;
            for (int i = 1; i <elemansayisi; i++) {
                if (liste[i-1]>liste[i]) {
                    swap(i-1,i);
                    swapped=true;
                }
            }
            System.out.println();
            yaz();
        }
    }            
               public void SelectionSortReverse(){
                 //gidilecek nokta array'in eleman sayisini asmamali.
                int enBuyukIndex;
                for (int i =0; i <elemansayisi; i++) {
                    enBuyukIndex=i;
                    
                    for (int j = i; j <elemansayisi; j++) {
                if (liste[j]>liste[enBuyukIndex]) {
                    enBuyukIndex=j;
                }
            }
                    swap(enBuyukIndex, i);
                }
            }
            
    public static void main(String[] args) {
       Selection_Sort sort=new Selection_Sort(100);
       sort.ekleme(124, 0);
       sort.ekleme(255, 0);
       sort.ekleme(877, 0);
       sort.ekleme(189, 0);
       sort.ekleme(355, 0);
       sort.ekleme(571, 0);
       sort.ekleme(115, 0);
       sort.yaz();
       sort.SelectionSort();
       System.out.println();
       sort.yaz();
       sort.SelectionSortReverse();
      System.out.println("-------------------");
      sort.yaz();
      
        System.out.println("Bubble sort:");
        sort.bubblesort();
    }
    
}
