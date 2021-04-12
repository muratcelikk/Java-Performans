import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Murat Çelik Pegamis 03:31:52 12 Nis 2021
 */
public class Performance {

    public static void main(String[] args) {

//		ArrayList<Integer> li = new ArrayList<Integer>();   //10000-11000  "listele" //ekle 3400-4000 //sil 25000 //güncelle 15000-16000
//		List<Integer> li = new ArrayList<Integer>();        //11000-12000  "listele" //ekle 3800-4200 //sil 25000 //güncelle 17000-18000
        LinkedList<Integer> li = new LinkedList<Integer>(); //26000-27000  "listele" //ekle 4300-4700 //sil 31400 //güncelle 28000
        for (int i = 0; i < 100; i++) {
            li.add(i);
        }

        long start1 = System.nanoTime();
//		li.get(99);
//		li.add(111);
        li.remove(44);
//		li.set(45, 111);

        long end1 = System.nanoTime();
        long diff = end1 - start1;

        System.out.println("Time taken by List = " + diff);
    }
}
