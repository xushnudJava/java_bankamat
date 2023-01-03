import javax.print.DocFlavor;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Scanner;


public class Menu {
    Date date = new Date();
    String User[][] = new String[100][100];
    Integer UserNumber[][] = new Integer[100][100];
    BigDecimal Cardbalance[][] = new BigDecimal[100][100];
    String Card[][] = new String[100][100];
    Integer CardNumber[][] = new Integer[100][100];
    Integer n = 1, p=0;
    Integer k=0, c = 0,y=1, t = 0, x;
    String istoriya[][] = new String[100][100];



    public void enterMenu() {
        System.out.println("1.Kirish");
        System.out.println("2.Ro'yhatdan o'tish");
        System.out.println("3.Yaratuvchiga taaluqli");
        System.out.println("4.Dasturni yopish");
        Scanner scanner = new Scanner(System.in);
        Scanner son = new Scanner(System.in);
        int u = scanner.nextInt();
        switch (u){
            case 1:
                signIn();
                break;
            case 2:
                signUpmenu();
                break;
            case 3:
                System.out.println("Secret parolni kiriting");
                String password = son.nextLine();
                if (password.equals("Xushnud071099")){
                    System.out.print("Ism         ");
                    System.out.print("familya     ");
                    System.out.print("username     ");
                    System.out.print("password     ");
                    System.out.print("Karta raqami     ");
                    System.out.print("Amal qilish muddati     ");
                    System.out.print("Karta balance     ");
                    System.out.println("ID raqami      ");
                    System.out.println();
                    int i=1;
                    while (i < n) {
                        System.out.print(User[i][0] + "     ");
                        System.out.print(User[i][1] + "     ");
                        System.out.print(User[i][2] + "         ");
                        for(int g=0; g<User[i][3].length(); g++){
                            System.out.print("*");
                        }
                        System.out.print("            ");
                        System.out.print(Card[i][0] + "          ");
                        System.out.print(Card[i][1] + "                 ");
                        System.out.print(Cardbalance[i][0] + "              ");
                        System.out.println(UserNumber[i][0] + "        ");
                        i++;
                        System.out.println();
                    }
                    System.out.println("1.Bosh Menu     2.Dasturdan Chiqish");
                    if (scanner.nextInt() == 1) {
                        enterMenu();
                    } else {
                        System.out.println("The End");
                    }
                    return;

                }else {
                    enterMenu();

                }
                break;
            case 4:
                return;
            default:
                System.out.println("Mavjud bo'lmagan raqamni kiritdingiz");
                enterMenu();
                break;
        }
        return;

    }

    public void signIn() {
        Scanner signIn = new Scanner(System.in);
        System.out.println("Username ni kiriting: ");
        String username = signIn.nextLine();
        System.out.println("Parol ni kiriting: ");
        String password = signIn.nextLine();
        for (int i = 1; i < User.length; i++) {
            if (username.equals(User[i][2]) && password.equals(User[i][3])) {
                k = i;
                date = new Date();
                istoriya[UserNumber[k][1]][y] = date.toString() + " shu vaqtda SAYTGA KIRDINGIZ";
                y++;
                System.out.println("Saytga Kirdingiz: ");
                System.out.println("☺ ☻ ☺");
                AsosiyMenu();
                return;
            }
        }
        System.out.println("No'togri malumot kiritdingiz!!!");
        System.out.println("");
        enterMenu();
        return;
    }

    public void signUpmenu() {


        User user = new User();
        Card card = new Card();
        History history = new History();
        Bankamat bankamat = new Bankamat();
        Pul pul = new Pul();
        Scanner sign = new Scanner(System.in);
        System.out.println("Ismingiz: ");
        user.setFirstName(sign.nextLine());
        User[n][0] = user.getFirstName();
        System.out.println("Familyangiz: ");
        user.setLastName(sign.nextLine());
        User[n][1] = user.getLastName();
        System.out.println("Username: ");
        user.setUserName(sign.nextLine());
        User[n][2] = user.getUserName();
        System.out.println("Password: ");
        user.setPassword(sign.nextLine());
        User[n][3] = user.getPassword();
        System.out.println("Karta raqami: ");
        card.setNumber(sign.nextLine());
        Card[n][0] = card.getNumber();
        System.out.println("Amal qilish muddati (01/22):");
        card.setAxpireDate(sign.nextLine());
        Card[n][1] = card.getAxpireDate();
        System.out.println("Karta balansi: ");
        sign = new Scanner(System.in);
        card.setBalance(sign.nextBigDecimal());
        Cardbalance[n][0] = card.getBalance();
        System.out.println("Sizning ID raqamingiz : ");
        Integer id = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
        UserNumber[n][0] = id;
        Id();
        UserNumber[n][1] = p;
        p++;
        System.out.println(UserNumber[n][0]);
        date = new Date();
        istoriya[UserNumber[n][1]][0] = date.toString() + " shu vaqtda KARTA OCHILDI";
        System.out.println("Siz ro'yhatdan o'tdingiz");
        n++;
        System.out.println("1.Bosh Menu     2.Dasturdan Chiqish");
        if (sign.nextInt() == 1) {
            enterMenu();
        } else {
            System.out.println("The End");
            return;
        }


    }

    public void Id() {
        User user = new User();
        Card card = new Card();
        History history = new History();
        Bankamat bankamat = new Bankamat();
        Pul pul = new Pul();
        user.setId(UserNumber[n][0]);
        card.setId(UserNumber[n][0]);
        history.setId(UserNumber[n][0]);
        bankamat.setId(UserNumber[n][0]);
        pul.setId(UserNumber[n][0]);
    }



    public void AsosiyMenu() {
        Scanner asmenu = new Scanner(System.in);
        System.out.println("Tariflardan birini tanlang : ");
        System.out.println("1.Balance");
        System.out.println("2.Naqd pul");
        System.out.println("3.Change password");
        System.out.println("4.History");
        System.out.println("5.Hisobni to`ldirish");
        System.out.println("6.Change name");
        System.out.println("7.Paynet");
        System.out.println("8.Kartadan kartaga o'tkazmalar");
        System.out.println("9.Ortga");
        System.out.println("10.Dasturni yopish");
        int bank = asmenu.nextInt();
        switch (bank) {
            case 1:
                t += 1;
                Balance();
                break;
            case 2:
                t += 2;
                Balance();
                break;
            case 3:
                t += 3;
                Balance();
                break;
            case 4:
                t += 4;
                Balance();
                break;
            case 5:
                t += 5;
                Balance();
                break;
            case 6:
                t += 6;
                Balance();
                break;
            case 7:
                t += 7;
                Balance();
                break;
            case 8:
                t += 8;
                Balance();
                break;
            case 9:

                enterMenu();
                break;
            case 10:
                return;


        }
        return;
    }


    public void Balance() {
        System.out.println("Bu bo'limga kirish uchun o'zingizga qulay yo'lni tanlang :");
        System.out.println("1. Username va Password malumotlari bilan kirish ");
        System.out.println("2. ID raqam bilan kirish ");
        System.out.println("3. Asosiy menu: ");
        Scanner balance = new Scanner(System.in);
        Scanner harf = new Scanner(System.in);
        int pul = balance.nextInt();
        int id;
        String password, name;
        switch (pul) {
            case 1:
                System.out.println("username: ");
                name = harf.nextLine();
                System.out.println("password: ");
                password = harf.nextLine();

                if (name.equals(User[k][2]) && password.equals(User[k][3])) {

                    ufff();
                    return;

                }else{
                    AsosiyMenu();
                }
                System.out.println("Noto'g'ri malumot berdingiz!!!");
                System.out.println();
                AsosiyMenu();
                break;
            case 2:
                System.out.println("ID ni kiriting:");
                balance = new Scanner(System.in);
                id = balance.nextInt();
                for (int i = 1; i < UserNumber.length; i++) {
                    if (id == UserNumber[i][0]) {
                        k = i;
                        ufff();
                        return;
                    }else{
                        AsosiyMenu();
                    }
                }
                System.out.println("Noto'g'ri malumot berdingiz!!!");
                System.out.println();
                Balance();
                break;
            case 3:
                AsosiyMenu();
                break;
            default:
                System.out.println("Mavjud bo'lmagan raqamni tanladingiz!!!");
                System.out.println();
                Balance();
        }
    }

    public void ufff(){
        switch (t){
            case 1:
                t = 0;
                HisobInfo();
                break;
            case 2:
                t=0;
                moneyNaqd();
                break;
            case 3:
                t = 0;
                changePassword();
                break;
            case 4:
                t = 0;
                Tarix();
                break;
            case 5:
                t = 0;
                Danat();
                break;
            case 6:
                t = 0;
                changeName();
                break;
            case 7:
                t = 0;
                Paynet();
                break;
            case 8:
                t = 0;
                KartaMoney();
                break;
        }
        return;
    }
    public void Tarix(){
        Scanner son = new Scanner(System.in);
        System.out.println("Tarixga xush kelibsiz");
        for (int i = 0; i < y; i++){
            if (istoriya[UserNumber[k][1]][i] != null) {
                System.out.println(istoriya[UserNumber[k][1]][i]);
            }
        }
        date = new Date();
        istoriya[UserNumber[k][1]][y] = date.toString() + " shu vaqtda TARIX BILAN TANISHIB CHIQDINGIZ";
        y++;
        System.out.println("Siz tarix bilan tanishib chiqdingiz");
        System.out.println("1.Asosiy Menu     2.Dasturdan Chiqish");
        if (son.nextInt() == 1) {
            AsosiyMenu();
        } else {
            System.out.println("The End");
            return;
        }
    }
    public void KartaMoney(){
        System.out.println("Hozirgi hisobingiz:");
        System.out.println(Cardbalance[k][0] + " so'm");
        System.out.println("O'tkazma qilish uchun yana bitta karta malumotlarini kiriting");
        Scanner son = new Scanner(System.in);
        Scanner harf = new Scanner(System.in);
        System.out.println("username:");
        String name = harf.next();
        System.out.println("password:");
        String password = son.nextLine();
        Scanner big = new Scanner(System.in);
        int w = 0;
        for (int i = 1; i < User[i][2].length(); i++){
            if (User[i][2].equals(name) && User[i][3].equals(password)){
                w = i;
                System.out.println("1.Berilgan kartadan pul o'tkazish");
                System.out.println("2.Berilgan kartaga pul o'tkazish");
                System.out.println("3.Asosiy menuga qaytish");
                int j = son.nextInt();
                switch (j){
                    case 1:
                        System.out.println("Qancha pul qabul qilmoqchisiz:");
                        BigDecimal money = big.nextBigDecimal();
                        if (Cardbalance[w][0].compareTo(money) >= 0) {
                            Cardbalance[w][0] = Cardbalance[w][0].subtract(money);
                            Cardbalance[k][0] = Cardbalance[k][0].add(money);
                            System.out.println("Qabul qilindi");
                            date = new Date();
                            istoriya[UserNumber[k][1]][y] = date.toString() + " shu vaqtda <<" + User[w][1] + " " + User[w][0] + " [" + User[w][2] + "]" + ">> nameli foydalanuvchidan \n" + User[k][1] + " " + User[k][0] + " [" + User[k][2] + "]" + " nameli foydalanuvchiga " + money + " so'm PUL QABUL QILDINGIZ";
                            y++;
                            System.out.println("Xozirgi hisobingiz:");
                            System.out.println(Cardbalance[k][0] + " so'm");
                            System.out.println("Xozirgi vaqt:");
                            System.out.println(date);
                            System.out.println("1.Asosiy Menu     2.Dasturdan Chiqish");
                            if (son.nextInt() == 1) {
                                AsosiyMenu();
                            } else {
                                System.out.println("The End");
                                return;
                            }
                        }else {
                            System.out.println("Xozrda " + User[w][2] + " nameli userda kiritilgan mablag' mavjud emas");
                            AsosiyMenu();
                        }
                        break;
                    case 2:
                        System.out.println("Qancha pul o'tkazmoqchisiz:");
                        BigDecimal maney = big.nextBigDecimal();
                        if (Cardbalance[k][0].compareTo(maney) >= 0) {
                            Cardbalance[w][0] = Cardbalance[w][0].add(maney);
                            Cardbalance[k][0] = Cardbalance[k][0].subtract(maney);
                            System.out.println("Xozirgi hisobingiz:");
                            System.out.println(Cardbalance[k][0] + " so'm");
                            System.out.println("Pul o'tkazildi");
                            date = new Date();
                            istoriya[UserNumber[k][1]][y] = date.toString() + " shu vaqtda <<" + User[w][1] + " " + User[w][0] + " [" + User[w][2] + "]" + ">> nameli foydalanuvchiga \n" + User[k][1] + " " + User[k][0] + " [" + User[k][2] + "]" + " nameli foydalanuvchidan " + maney + " so'm PUL O'TGAZDINGIZ";
                            y++;
                            System.out.println("Xozirgi vaqt:");
                            System.out.println(date);
                            System.out.println("1.Asosiy Menu     2.Dasturdan Chiqish");
                            if (son.nextInt() == 1) {
                                AsosiyMenu();
                            } else {
                                System.out.println("The End");
                                return;
                            }
                        }else {
                            System.out.println("Sizda yetarli mablag' mavjud emas");
                            AsosiyMenu();
                        }
                        break;
                    case 3:
                        AsosiyMenu();
                        break;
                    default:
                        System.out.println("Noto'g'ri malumot kiritdingiz");
                        System.out.println();
                        AsosiyMenu();
                }
            }
        }
        System.out.println("Noto'g'ri malumot kiritdingiz");
        System.out.println();
        AsosiyMenu();
    }
    public void Danat(){
        System.out.println("Sizning hisobingiz : ");
        System.out.println(Cardbalance[k][0] + " so'm");
        System.out.println("To'ldirmoqchi bo'lgan summangizni kiriting:");
        Scanner son = new Scanner(System.in);
        BigDecimal money = son.nextBigDecimal();
        Cardbalance[k][0] = Cardbalance[k][0].add(money);
        date = new Date();
        istoriya[UserNumber[k][1]][y] = date.toString() + " shu vaqtda HISOB TO'LDIRILDI";
        y++;
        System.out.println("Xozirgi balansingiz:");
        System.out.println(Cardbalance[k][0] + " so'm");
        System.out.println("Hozirgi vaqt: ");
        System.out.println(date);
        System.out.println("1.Asosiy Menu     2.Dasturdan Chiqish");
        if (son.nextInt() == 1) {
            AsosiyMenu();
        } else {
            System.out.println("The End");
            return;
        }
    }
    public void Paynet(){
        System.out.println("Quyidagilardan bittasini tanlang:");
        System.out.println("1.Ucell");
        System.out.println("2.Beeline");
        System.out.println("3.Uzmobile");
        System.out.println("4.Humans");
        System.out.println("5.Mobiuz");
        System.out.println("6.Asosiy menuga qaytish");
        Scanner son = new Scanner(System.in);
        int kk = son.nextInt();
        switch (kk){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Sizning hisobingiz : ");
                System.out.println(Cardbalance[k][0] + " so'm");
                System.out.println("Telefon raqaminingizni kiriting:");
                System.out.print("+998");
                int x = son.nextInt();
                System.out.println("Qancha pul tushurmoqchisiz:");
                son = new Scanner(System.in);
                BigDecimal money = son.nextBigDecimal();
                if (Cardbalance[k][0].compareTo(money) >= 0) {
                    Cardbalance[k][0] = Cardbalance[k][0].subtract(money);
                    System.out.println("Telefon raqamingizga " + money + " so'm pul tushdi");
                    date = new Date();
                    istoriya[UserNumber[k][1]][y] = date.toString() + " shu vaqtda +998" + x + " NO'MERGA PUL TUSHURILDI";
                    y++;
                    System.out.println("Xozirgi hisobingiz:");
                    System.out.println(Cardbalance[k][0]);
                    System.out.println("Xozirgi vaqt:");
                    System.out.println(date);
                    System.out.println("1.Asosiy Menu     2.Dasturdan Chiqish");
                    if (son.nextInt() == 1) {
                        AsosiyMenu();
                    } else {
                        System.out.println("The End");
                        return;
                    }
                }else {
                    System.out.println("Sizda buncha mablag' yo'q");
                    Paynet();
                }
                break;
            case 6:
                AsosiyMenu();
                break;
            default:
                System.out.println("Mavjud bo'lmagan raqam");
                Paynet();
                break;
        }
    }

    public void HisobInfo() {
        Card card = new Card();
        Scanner son = new Scanner(System.in);
        System.out.println("Karta " + User[k][0] + " " + User[k][1] + " nomiga rasmiylashtirilgan");
        System.out.println("Sizning hisobingiz : ");
        System.out.println(Cardbalance[k][0] + " so'm");
        date = new Date();
        istoriya[UserNumber[k][1]][y] = date.toString() + " shu vaqtda BALANCE KO'RIP CHIQILDI";
        y++;
        System.out.println("Hozirgi vaqt: ");
        System.out.println(date);
        System.out.println("Hisobni to'ldirish yoki Naqdlash uchun Asosiy menu ga o'tasiz!!!");
        System.out.println("1.Asosiy Menu     2.Dasturdan Chiqish");
        if (son.nextInt() == 1) {
            AsosiyMenu();
        } else {
            System.out.println("The End");
            return;
        }
    }
    public void changePassword(){
        Scanner son = new Scanner(System.in);
        Scanner harf = new Scanner(System.in);
        System.out.println("New pasword kiriting: ");
        String passsword = harf.nextLine();
        System.out.println("Yana bir marta takrorlang:");
        String newPassword = harf.nextLine();
        if (passsword.equals(newPassword)){
            User[k][3] = passsword;
            date = new Date();
            istoriya[UserNumber[k][1]][y] = date.toString() + " shu vaqtda NEW PASSWORD QO'YILDI";
            y++;
            System.out.println("Password o'zgartirildi!!!");
            System.out.println();
            System.out.println("1.Asosiy Menu     2.Dasturdan Chiqish");
            if (son.nextInt() == 1) {
                AsosiyMenu();
            } else {
                System.out.println("The End");
                return;
            }
        }
    }
    public void changeName(){
        Scanner son = new Scanner(System.in);
        Scanner harf = new Scanner(System.in);
        System.out.println("New name kiriting: ");
        String passsword = harf.nextLine();
        System.out.println("Yana bir marta takrorlang:");
        String newPassword = harf.nextLine();
        if (passsword.equals(newPassword)){
            User[k][2] = passsword;
            date = new Date();
            istoriya[UserNumber[k][1]][y] = date.toString() + " shu vaqtda NEW NAME QO'YILDI";
            y++;
            System.out.println("Name o'zgartirildi!!!");
            System.out.println();
            System.out.println("1.Asosiy Menu     2.Dasturdan Chiqish");
            if (son.nextInt() == 1) {
                AsosiyMenu();
            } else {
                System.out.println("The End");
                return;
            }
        }
    }
    public void clas(){
        Card card = new Card();
        User user = new User();
        History history = new History();
        Bankamat bankamat = new Bankamat();
        Pul pul = new Pul();
    }
    public void moneyNaqd(){
        System.out.println("Sizning hisobingiz : ");
        System.out.println(Cardbalance[k][0] + " so'm");
        System.out.println("Naqdlamoqchi bo'lgan summangizni kiriting:");
        Scanner son = new Scanner(System.in);
        BigDecimal money = son.nextBigDecimal();
        if(Cardbalance[k][0].compareTo(money) >= 0) {
            Cardbalance[k][0] = Cardbalance[k][0].subtract(money);
            date = new Date();
            istoriya[UserNumber[k][1]][y] = date.toString() + " shu vaqtda HISOBINGIZDAGI PUL NAQD QILINDI";
            y++;
        }else {
            System.out.println("Sizda buncha mablag' yo'q");
            moneyNaqd();
        }


        System.out.println("Xozirgi balansingiz:");
        System.out.println(Cardbalance[k][0] + " so'm");
        System.out.println("Hozirgi vaqt: ");
        System.out.println(date);
        System.out.println("1.Asosiy Menu     2.Dasturdan Chiqish");
        if (son.nextInt() == 1) {
            AsosiyMenu();
        } else {
            System.out.println("The End");
            return;
        }

    }

}
