package projectprogramming;
import java.util.*;

public class ProjectProgramming {

    static int level1indoeng() {
        Scanner baca = new Scanner(System.in);
        String jawaban;
        int poin = 0;
        ArrayList<String> indocolors = new ArrayList<>();
        ArrayList<Integer> svInd = new ArrayList<>();
        indocolors.add("Merah");
        indocolors.add("Biru");
        indocolors.add("Kuning");
        indocolors.add("Hijau");
        indocolors.add("Ungu");
        indocolors.add("Jingga");
        indocolors.add("Hitam");
        indocolors.add("Putih");
        indocolors.add("Abu-abu");
        indocolors.add("Cokelat");

        ArrayList<String> engcolors = new ArrayList<>();
        engcolors.add("Red");
        engcolors.add("Blue");
        engcolors.add("Yellow");
        engcolors.add("Green");
        engcolors.add("Purple");
        engcolors.add("Orange");
        engcolors.add("Black");
        engcolors.add("White");
        engcolors.add("Gray");
        engcolors.add("Brown");
        System.out.println();
        System.out.println("Selamat datang di level 1!");
        Random random = new Random();
        System.out.println("Sebutkan jawabannya");
        System.out.println();
        for (int i = 7; i < indocolors.size(); i++) {
            int rNumb = random.nextInt(indocolors.size());
            int rNumb2 = rNumb;
            if (!svInd.contains(rNumb2)) {
                svInd.add(rNumb2);
            } else if (svInd.contains(rNumb2)) {
                while (svInd.contains(rNumb2)) {
                    rNumb2 = random.nextInt(indocolors.size());

                }
                svInd.add(rNumb2);
            }
            System.out.print("Bahasa Inggris dari warna " + indocolors.get(rNumb2) + " adalah: ");
            int temp = rNumb2;
            jawaban = baca.nextLine();
            if (jawaban.equalsIgnoreCase(engcolors.get(temp))) {
                poin++;
                System.out.println("Kamu pintar! Poinmu sekarang: " + poin);
                System.out.println();
            } else {

                System.out.println("Jawaban anda salah! Poinmu: " + poin);
                System.out.println();
            }

        }

        return poin;

    }

    static int level2indoeng() {
        Scanner baca = new Scanner(System.in);
        String jawaban;
        int poin = 0;
        ArrayList<String> indobuah = new ArrayList<>();
        ArrayList<Integer> svInd = new ArrayList<>();
        indobuah.add("Apel");
        indobuah.add("Pisang");
        indobuah.add("Jeruk");
        indobuah.add("Mangga");
        indobuah.add("Anggur");
        indobuah.add("Semangka");
        indobuah.add("Nanas");
        indobuah.add("Manggis");
        indobuah.add("Jambu");
        indobuah.add("Buah naga");

        ArrayList<String> engfruit = new ArrayList<>();
        engfruit.add("Apple");
        engfruit.add("Banana");
        engfruit.add("Orange");
        engfruit.add("Mango");
        engfruit.add("Grape");
        engfruit.add("Watermelon");
        engfruit.add("Pineapple");
        engfruit.add("Mangosteen");
        engfruit.add("Guava");
        engfruit.add("Dragon fruit");
        System.out.println();
        System.out.println("Selamat datang di level 2!");
        Random random = new Random();
        System.out.println("Sebutkan jawabannya");
        System.out.println();
        for (int i = 7; i < indobuah.size(); i++) {
            int rNumb = random.nextInt(indobuah.size());
            int rNumb2 = rNumb;
            if (!svInd.contains(rNumb2)) {
                svInd.add(rNumb2);
            } else if (svInd.contains(rNumb2)) {
                while (svInd.contains(rNumb2)) {
                    rNumb2 = random.nextInt(indobuah.size());

                }
                svInd.add(rNumb2);
            }
            System.out.print("Bahasa Inggris dari buah " + indobuah.get(rNumb2) + " adalah: ");
            int temp = rNumb2;
            jawaban = baca.nextLine();
            if (jawaban.equalsIgnoreCase(engfruit.get(temp))) {
                poin++;
                System.out.println("Kamu pintar! poinmu sekarang: " + poin);
                System.out.println();
            } else {

                System.out.println("Jawaban anda salah! poinmu: " + poin);
                System.out.println();
            }

        }

        return poin;

    }

    static int level3indoeng() {
        Scanner baca = new Scanner(System.in);
        String jawaban;
        int poin = 0;
        ArrayList<String> indobentuk = new ArrayList<>();
        ArrayList<Integer> svInd = new ArrayList<>();
        indobentuk.add("Persegi Panjang");
        indobentuk.add("Lingkaran");
        indobentuk.add("Bintang");
        indobentuk.add("Segitiga");
        indobentuk.add("Trapesium");
        indobentuk.add("Segilima");
        indobentuk.add("Kubus");
        indobentuk.add("Hati");
        indobentuk.add("Oval");
        indobentuk.add("Kerucut");

        ArrayList<String> engshape = new ArrayList<>();
        engshape.add("Rectangle");
        engshape.add("Circle");
        engshape.add("Star");
        engshape.add("Triangle");
        engshape.add("Trapezoid");
        engshape.add("Pentagon");
        engshape.add("Cube");
        engshape.add("Heart");
        engshape.add("Oval");
        engshape.add("Cone");
        System.out.println();
        System.out.println("Selamat datang di level 3!");
        Random random = new Random();
        System.out.println("Sebutkan jawabannya");
        System.out.println();
        for (int i = 7; i < indobentuk.size(); i++) {
            int rNumb = random.nextInt(indobentuk.size());
            int rNumb2 = rNumb;
            if (!svInd.contains(rNumb2)) {
                svInd.add(rNumb2);
            } else if (svInd.contains(rNumb2)) {
                while (svInd.contains(rNumb2)) {
                    rNumb2 = random.nextInt(indobentuk.size());

                }
                svInd.add(rNumb2);
            }
            System.out.print("Bahasa Inggris dari bentuk " + indobentuk.get(rNumb2) + " adalah: ");
            int temp = rNumb2;
            jawaban = baca.nextLine();
            if (jawaban.equalsIgnoreCase(engshape.get(temp))) {
                poin++;
                System.out.println("Kamu pintar! poinmu sekarang: " + poin);
                System.out.println();
            } else {

                System.out.println("Jawaban anda salah! poinmu: " + poin);
                System.out.println();
            }

        }

        return poin;

    }

    static int level4indoeng() {
        Scanner baca = new Scanner(System.in);
        String jawaban;
        int poin = 0;
        ArrayList<String> indobenda = new ArrayList<>();
        ArrayList<Integer> svInd = new ArrayList<>();
        indobenda.add("Bantal");
        indobenda.add("Meja");
        indobenda.add("Selimut");
        indobenda.add("Lampu");
        indobenda.add("Dompet");
        indobenda.add("Garpu");
        indobenda.add("Boneka");
        indobenda.add("Gunting");
        indobenda.add("Piala");
        indobenda.add("Sisir");

        ArrayList<String> engobject = new ArrayList<>();
        engobject.add("Pillow");
        engobject.add("Table");
        engobject.add("Blanket");
        engobject.add("Lamp");
        engobject.add("Wallet");
        engobject.add("Fork");
        engobject.add("Doll");
        engobject.add("Scissors");
        engobject.add("Trophy");
        engobject.add("Comb");
        System.out.println();
        System.out.println("Selamat datang di level 4!");
        Random random = new Random();
        System.out.println("Sebutkan jawabannya");
        System.out.println();
        for (int i = 7; i < indobenda.size(); i++) {
            int rNumb = random.nextInt(indobenda.size());
            int rNumb2 = rNumb;
            if (!svInd.contains(rNumb2)) {
                svInd.add(rNumb2);
            } else if (svInd.contains(rNumb2)) {
                while (svInd.contains(rNumb2)) {
                    rNumb2 = random.nextInt(indobenda.size());

                }
                svInd.add(rNumb2);
            }
            System.out.print("Bahasa Inggris dari benda " + indobenda.get(rNumb2) + " adalah: ");
            int temp = rNumb2;
            jawaban = baca.nextLine();
            if (jawaban.equalsIgnoreCase(engobject.get(temp))) {
                poin++;
                System.out.println("Kamu pintar! poinmu sekarang: " + poin);
                System.out.println();
            } else {

                System.out.println("Jawaban anda salah! poinmu: " + poin);
                System.out.println();
            }

        }

        return poin;

    }

    static int level1EngIndo() {
        Scanner baca = new Scanner(System.in);
        String jawaban;
        int poin = 0;
        ArrayList<String> indocolors = new ArrayList<>();
        ArrayList<Integer> svInd = new ArrayList<>();
        indocolors.add("Merah");
        indocolors.add("Biru");
        indocolors.add("Kuning");
        indocolors.add("Hijau");
        indocolors.add("Ungu");
        indocolors.add("Jingga");
        indocolors.add("Hitam");
        indocolors.add("Putih");
        indocolors.add("Abu-abu");
        indocolors.add("Cokelat");

        ArrayList<String> engcolors = new ArrayList<>();
        engcolors.add("Red");
        engcolors.add("Blue");
        engcolors.add("Yellow");
        engcolors.add("Green");
        engcolors.add("Purple");
        engcolors.add("Orange");
        engcolors.add("Black");
        engcolors.add("White");
        engcolors.add("Gray");
        engcolors.add("Brown");
        System.out.println();
        System.out.println("Welcome to level 1!");
        Random random = new Random();
        System.out.println("Tell us your answer");
        System.out.println();
        for (int i = 7; i < indocolors.size(); i++) {
            int rNumb = random.nextInt(engcolors.size());
            int rNumb2 = rNumb;
            if (!svInd.contains(rNumb2)) {
                svInd.add(rNumb2);
            } else if (svInd.contains(rNumb2)) {
                while (svInd.contains(rNumb2)) {
                    rNumb2 = random.nextInt(engcolors.size());

                }
                svInd.add(rNumb2);
            }
            System.out.print("The Indonesian of colors " + engcolors.get(rNumb2) + " is: ");
            int temp = rNumb2;
            jawaban = baca.nextLine();
            if (jawaban.equalsIgnoreCase(indocolors.get(temp))) {
                poin++;
                System.out.println("Fantastic! Your point now: " + poin);
                System.out.println();
            } else {

                System.out.println("Opps, still wrong! Your point now: " + poin);
                System.out.println();
            }

        }

        return poin;

    }

    static int level2EngIndo() {
        Scanner baca = new Scanner(System.in);
        String jawaban;
        int poin = 0;
        ArrayList<String> indobuah = new ArrayList<>();
        ArrayList<Integer> svInd = new ArrayList<>();
        indobuah.add("Apel");
        indobuah.add("Pisang");
        indobuah.add("Jeruk");
        indobuah.add("Mangga");
        indobuah.add("Anggur");
        indobuah.add("Semangka");
        indobuah.add("Nanas");
        indobuah.add("Manggis");
        indobuah.add("Jambu");
        indobuah.add("Buah naga");

        ArrayList<String> engfruit = new ArrayList<>();
        engfruit.add("Apple");
        engfruit.add("Banana");
        engfruit.add("Orange");
        engfruit.add("Mango");
        engfruit.add("Grape");
        engfruit.add("Watermelon");
        engfruit.add("Pineapple");
        engfruit.add("Mangosteen");
        engfruit.add("Guava");
        engfruit.add("Dragon fruit");
        System.out.println();
        System.out.println("Welcome to level 2!");
        Random random = new Random();
        System.out.println("Tell us your answer");
        System.out.println();
        for (int i = 7; i < engfruit.size(); i++) {
            int rNumb = random.nextInt(engfruit.size());
            int rNumb2 = rNumb;
            if (!svInd.contains(rNumb2)) {
                svInd.add(rNumb2);
            } else if (svInd.contains(rNumb2)) {
                while (svInd.contains(rNumb2)) {
                    rNumb2 = random.nextInt(engfruit.size());

                }
                svInd.add(rNumb2);
            }
            System.out.print("The Indonesian of fruit " + engfruit.get(rNumb2) + " is: ");
            int temp = rNumb2;
            jawaban = baca.nextLine();
            if (jawaban.equalsIgnoreCase(indobuah.get(temp))) {
                poin++;
                System.out.println("Fantastic! Your point now: " + poin);
                System.out.println();
            } else {

                System.out.println("Oops, still wrong! Your point now: " + poin);
                System.out.println();
            }

        }

        return poin;

    }

    static int level3EngIndo() {
        Scanner baca = new Scanner(System.in);
        String jawaban;
        int poin = 0;
        ArrayList<String> indobentuk = new ArrayList<>();
        ArrayList<Integer> svInd = new ArrayList<>();
        indobentuk.add("Persegi Panjang");
        indobentuk.add("Lingkaran");
        indobentuk.add("Bintang");
        indobentuk.add("Segitiga");
        indobentuk.add("Trapesium");
        indobentuk.add("Segilima");
        indobentuk.add("Kubus");
        indobentuk.add("Hati");
        indobentuk.add("Oval");
        indobentuk.add("Kerucut");

        ArrayList<String> engshape = new ArrayList<>();
        engshape.add("Rectangle");
        engshape.add("Circle");
        engshape.add("Star");
        engshape.add("Triangle");
        engshape.add("Trapezoid");
        engshape.add("Pentagon");
        engshape.add("Cube");
        engshape.add("Heart");
        engshape.add("Oval");
        engshape.add("Cone");
        System.out.println();
        System.out.println("Welcome to level 3!");
        Random random = new Random();
        System.out.println("Tell us your answer");
        System.out.println();
        for (int i = 7; i < engshape.size(); i++) {
            int rNumb = random.nextInt(engshape.size());
            int rNumb2 = rNumb;
            if (!svInd.contains(rNumb2)) {
                svInd.add(rNumb2);
            } else if (svInd.contains(rNumb2)) {
                while (svInd.contains(rNumb2)) {
                    rNumb2 = random.nextInt(indobentuk.size());

                }
                svInd.add(rNumb2);
            }
            System.out.print("The Indonesian of shape " + engshape.get(rNumb2) + " is: ");
            int temp = rNumb2;
            jawaban = baca.nextLine();
            if (jawaban.equalsIgnoreCase(indobentuk.get(temp))) {
                poin++;
                System.out.println("Fantastic! Your point now: " + poin);
                System.out.println();
            } else {

                System.out.println("Oops, still wrong! Your point now: " + poin);
                System.out.println();
            }

        }

        return poin;

    }

    static int level4EngIndo() {
        Scanner baca = new Scanner(System.in);
        String jawaban;
        int poin = 0;
        ArrayList<String> indobenda = new ArrayList<>();
        ArrayList<Integer> svInd = new ArrayList<>();
        indobenda.add("Bantal");
        indobenda.add("Meja");
        indobenda.add("Selimut");
        indobenda.add("Lampu");
        indobenda.add("Dompet");
        indobenda.add("Garpu");
        indobenda.add("Boneka");
        indobenda.add("Gunting");
        indobenda.add("Piala");
        indobenda.add("Sisir");

        ArrayList<String> engobject = new ArrayList<>();
        engobject.add("Pillow");
        engobject.add("Table");
        engobject.add("Blanket");
        engobject.add("Lamp");
        engobject.add("Wallet");
        engobject.add("Fork");
        engobject.add("Doll");
        engobject.add("Scissors");
        engobject.add("Trophy");
        engobject.add("Comb");
        System.out.println();
        System.out.println("Welcome to level 4!");
        Random random = new Random();
        System.out.println("Tell us your answer");
        System.out.println();
        for (int i = 7; i < engobject.size(); i++) {
            int rNumb = random.nextInt(engobject.size());
            int rNumb2 = rNumb;
            if (!svInd.contains(rNumb2)) {
                svInd.add(rNumb2);
            } else if (svInd.contains(rNumb2)) {
                while (svInd.contains(rNumb2)) {
                    rNumb2 = random.nextInt(indobenda.size());

                }
                svInd.add(rNumb2);
            }
            System.out.print("The Indonesian of object " + engobject.get(rNumb2) + " is: ");
            int temp = rNumb2;
            jawaban = baca.nextLine();

            if (jawaban.equalsIgnoreCase(indobenda.get(temp))) {
                poin++;
                System.out.println("Fantastic! Your point now: " + poin);
                System.out.println();
            } else {

                System.out.println("Oops, still wrong! Your point now: " + poin);
                System.out.println();
            }

        }

        return poin;

    }

    static void leaderboard(int[] data, ArrayList<String> name, int index, int[] level) {
        int i, j, k, temp, temp3;
        String temp2;
        for (i = 1; i < index; i++) {
            temp = data[i];
            temp2 = name.get(i);
            temp3 = level[i];
            j = i - 1;
            k = j + 1;
            while (j >= 0 && data[j] < temp) {
                data[j + 1] = data[j];
                name.set(k, name.get(j));
                level[j + 1] = level[j];
                j--;
            }
            data[j + 1] = temp;
            name.set(j + 1, temp2);
            level[j + 1] = temp3;
        }
        for (i = 0; i < index; i++) {
            int kol = i + 1;
            System.out.printf("|%-4s |%-20s |%-4s |", kol, name.get(i), data[i]);
            System.out.println("");
        }
    }

    static int [] ContinueEngIndo(int index, int level, int xPoin) {
         Scanner baca= new Scanner(System.in);
        int plh = question();
        int pilih;
        int poin = 0;
        int mainPoin = 0;
        mainPoin = xPoin;
        int[] result = new int[2];

        while (plh == 1) {
            if (level == 0) {
                level++;
                poin = level1EngIndo();
                mainPoin = poin + mainPoin;
                System.out.println("Congrats you passed level 1! Your point now: " + mainPoin);
                plh =question();
                continue;
            } else if (level == 1) {
                level++;
                poin = level2EngIndo();
                mainPoin = poin + mainPoin;
                System.out.println("Congrats you passed level 2! Your total point now: " + mainPoin);
                plh =question();
                continue;
            } else if (level == 2) {
                level++;
                poin = level3EngIndo();
                mainPoin = poin + mainPoin;
                System.out.println("Congrats you passed level 3! Your total point now:" + mainPoin);
                plh = tanya();
                continue;
            } else if (level == 3) {
                level++;
                poin = level4EngIndo();
                mainPoin = poin + mainPoin;
                System.out.println("Congrats you passed level 4! Your total point now: "+ mainPoin);
                System.out.println("Game Over? Do You want to play again?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.print("Choose: ");
                pilih=baca.nextInt();
                if(pilih==1)
                {
                    poin=0;
                    xPoin=0;
                    mainPoin=0;
                    System.out.println("Data have been deleted");
                }
                plh=2;

        }
               
            
            }
    result[0] = mainPoin;
        result[1] = level;
        
        return result;

    }

    static int tanya() {
        Scanner baca = new Scanner(System.in);
        System.out.println("Lanjutkan permainan?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Pilih: ");
        int plh = 0;
        plh = baca.nextInt();
        return plh;
    }
    static int question() {
        Scanner baca = new Scanner(System.in);
        System.out.println("Continue the game?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Choose ");
        int plh = 0;
        plh = baca.nextInt();
        return plh;
    }

    static int[] ContinueIndoEng(int index, int level, int xPoin) {

        Scanner baca= new Scanner(System.in);
        int plh = tanya();
        int pilih;
        int poin = 0;
        int mainPoin = 0;
        mainPoin = xPoin;
        int[] result = new int[2];

        while (plh == 1) {
            if (level == 0) {
                level++;
                poin = level1indoeng();
                mainPoin = poin + mainPoin;
                System.out.println("Selamat kamu berhasil melewati level 1 dengan poin: " + mainPoin);
                plh=tanya();
                continue;
            } else if (level == 1) {
                level++;
                poin = level2indoeng();
                mainPoin = poin + mainPoin;
                System.out.println("Selamat kamu berhasil melewati level 2! Total Poinmu:  " + mainPoin);
                plh = tanya();
                continue;
            } else if (level == 2) {
                level++;
                poin = level3indoeng();
                mainPoin = poin + mainPoin;
                System.out.println("Selamat kamu berhasil melewati level 3! Total Poinmu: " + mainPoin);
                plh = tanya();
                continue;
            } else if (level == 3) {
                level++;
                poin = level4indoeng();
                mainPoin = poin + mainPoin; 
                System.out.println("Selamat kamu berhasil melewati level 4 dengan poin: " + mainPoin);
                System.out.println("Game Berakhir! Apakah anda ingin mengulang dari awal?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.print("Pilih: ");
                pilih=baca.nextInt();
                if(pilih==1)
                {
                    poin=0;
                    xPoin=0;
                    mainPoin=0;
                    System.out.println("Data dihapus! Login untuk bermain");
                }
                plh=2;
                
                
            }
                   
    }
        result[0] = mainPoin;
        result[1] = level;
        return result;
    }
    

    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        int[] poinn = new int[10];
        int[] level = new int[10];
        int index = 0, index2 = 0;
        String name2;
        int[] xPoin = new int[10];
        int pilih = 0;

        do {
            System.out.println("\nWelcome to Learn and Play Games!");
            System.out.println("1. Log in");
            System.out.println("2. Sign in");
            System.out.println("3. View LeaderBoard");
            System.out.println("4. EXIT");
            System.out.print("Choose: ");
            pilih = baca.nextInt();
            baca.nextLine();

            switch (pilih) {
                case 1: {

                    if (name.isEmpty()) {
                        System.out.println("No data in here! Please Sign In");
                        System.out.println();
                    } else {
                        System.out.println("Please input your name first!");

                        System.out.println();
                        System.out.print("Your name[3-20 character]: ");
                        name2 = baca.nextLine();
                        if (name2.length() < 3 || name2.length() > 20) {
                            System.out.println();
                            System.out.println("Please input your name correctly!");
                            System.out.println();
                            break;
                        } else if (name.contains(name2)) {
                            index2 = name.indexOf(name2);
                            System.out.println("Welcome again " + name.get(index2) + "!");
                            System.out.println();
                        } else if (!name.contains(name2)) {
                            System.out.println("Nothing seem like your name... Sign in or Input your name correctly!");
                            break;
                        }

                        System.out.println("\nChoose the languange you wanna play!");
                        System.out.println("1. Indonesia-Inggris");
                        System.out.println("2. Inggris-Indonesia");
                        System.out.print("Choose: ");
                        pilih = baca.nextInt();
                        baca.nextLine();
                        switch (pilih) {
                            case 1: {
                                int[] result = ContinueIndoEng(index2, level[index2], xPoin[index2]);
                                xPoin[index2] = result[0];
                                level[index2] = result[1];
                                break;
                            }
                            case 2: {

                                int[] result = ContinueEngIndo(index2, level[index2], xPoin[index2]);
                                 xPoin[index2] = result[0];
                                level[index2] = result[1];

                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Hello new user!");

                    do {
                        System.out.println();
                        System.out.print("Your name[3-20 character]: ");
                        name2 = baca.nextLine();

                        if (name2.length() < 3 || name2.length() > 20 || name2 == null) {
                            System.out.println("Please input your name correctly!");
                        } else {
                            name.add(name2);
                            System.out.println("Hello new friend :D!");
                            System.out.println();

                            break;
                        }
                    } while (name2.length() > 3 || name2.length() < 20);

                    System.out.println("\nChoose the languange you wanna play!");
                    System.out.println("1. Indonesia-Inggris");
                    System.out.println("2. Inggris-Indonesia");
                    System.out.print("Choose: ");
                    pilih = baca.nextInt();
                    baca.nextLine();
                    switch (pilih) {
                        case 1: {

                            xPoin[index] = level1indoeng();
                            level[index]++;
                            System.out.println("Selamat kamu berhasil melewati level 1 dengan poin: " + xPoin[index]);
                            int[] result = ContinueIndoEng(index, level[index], xPoin[index]); // xPoin untuk menyimpan
                            xPoin[index] = result[0];
                            level[index] = result[1];
                            index++;
                            break;
                        }
                        case 2: {
                            xPoin[index] = level1EngIndo();
                            level[index]++;
                            System.out.println("Congrats you passed level 1! Your point now: " + xPoin[index]);
                            int[] result = ContinueEngIndo(index, level[index], xPoin[index]);
                            xPoin[index] = result[0];
                            level[index] = result[1];
                            index++;
                            break;
                        }

                    }

                    break;
                }
                case 3:
                    if (index > 0) {
                        System.out.println();
                        System.out.printf("|%-4s |%-20s |%-4s |", "No", "Nama", "Poin");
                        System.out.println();
                        System.out.println("===================================");
                        leaderboard(xPoin, name, index, level);
                        break;

                    } else {
                        System.out.println("Not enough player in the leaderboard!");
                        System.out.println("Ask your friend to compete with you!");
                    }
                    break;

            }

        } while (pilih != 4);

    }

}