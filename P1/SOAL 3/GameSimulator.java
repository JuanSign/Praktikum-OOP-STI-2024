import java.util.Scanner;

// nilai praktikum cuma angka
// praktikum ada 8 kali
// kalau prak 1 nya 0 tapi prak 2-8 100
// rata rata masih 87.5 #IndeksA

public class GameSimulator
{
    public static void main(String[] args)
    {
        int jumlahPemain;
        String namaSeeker;
        Scanner scanner = new Scanner(System.in);

        jumlahPemain = Integer.parseInt(scanner.nextLine());
        namaSeeker = scanner.nextLine();

        HideNSeek game = new HideNSeek(namaSeeker, jumlahPemain-1);
        System.out.printf("Game dimulai dengan %d pemain, seeker adalah %s\n", jumlahPemain, namaSeeker);
        int tebakan;

        do
        {
            tebakan = Integer.parseInt(scanner.nextLine());
            if(tebakan == (game.getPlayerFound()+1))
            {
                game.foundPlayer();
                System.out.printf("%d Pemain ditemukan\n", game.getPlayerFound());
            }
        }while(game.getPlayerFound() != game.getPlayer());
        System.out.printf("Semua pemain telah ditemukan, permainan selesai.\n");
        scanner.close();
    }
}
