package com.example.narutocharacters;

import java.util.ArrayList;

public class CharactersData {
    public static String[][] data = new String[][]{
            {"Naruto Uzumaki",
                    "Naruto Uzumaki (うずまき ナルト Uzumaki Naruto) adalah tokoh fiktif dari serial anime dan manga Naruto. Ia merupakan tokoh utama dalam serial ini. Ia digambarkan sebagai bocah berambut pirang dan bermata biru. Di pipinya ada semacam guratan yang mirip seperti kumis milik karakter Doraemon dalam manga Doraemon. Ia sering terlihat memakai jaket dan celana panjang berwarna jingga. Di dahinya ada ikat kepala berwarna biru dengan lambang desa kelahirannya.",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/3/36/Naruto_Uzumaki.png/280px-Naruto_Uzumaki.png"},
            {"Sakura Haruno",
                    "Sakura Haruno (春野サクラ Haruno Sakura) adalah salah satu tokoh fiksi dari seri manga & anime Naruto. Dia adalah seorang ninja wanita yang tergabung dalam Tim 7 bersama Naruto Uzumaki dan Sasuke Uchiha di bawah bimbingan Kakashi Hatake. Dia juga adalah seorang ninja medis di bawah bimbingan Tsunade.",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/2/2a/Sakura_Haruno.png/280px-Sakura_Haruno.png"},
            {"Minato Namikaze",
                    "Minato Namikaze (波風ミナト Namikaze Minato) yang juga dikenal sebagai Hokage Keempat (四代目火影 Yondaime Hokage) adalah tokoh fiktif dalam serial manga dan anime Naruto. Seorang ninja yang telah menyegel siluman rubah berekor sembilan ke dalam tubuh anaknya, Naruto Uzumaki. Setelah melakukan penyegelan dan meyakinkan penduduk agar tidak menganggap Naruto sebagai monster melainkan sebagai pahlawan, Minato meninggal akibat efek samping dari jurus tersebut.",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/7/71/Minato_Namikaze.png/280px-Minato_Namikaze.png"},
            {"Hinata Hyuuga",
                    "Hinata Hyuuga adalah tokoh fiksi dari anime dan manga yang berjudul Naruto karya Masashi Kishimoto. Hinata adalah salah keturunan dari klan Hyuga. Ia memiliki seorang adik bernama Hanabi Hyuuga, dan ayah bernama Hiashi Hyuuga. Saudara sepupunya bernama Neji Hyuuga. Neji Hyuuga pernah melawannya saat ujian Chunnin berlangsung.",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/c/c8/Hinata_Hyuga.png/240px-Hinata_Hyuga.png"},
            {"Kakashi Hatake",
                    "Kakashi Hatake (はたけカカシ Hatake Kakashi) adalah tokoh fiktif dalam serial manga dan anime Naruto. Ia merupakan Hokage ke-6 dan juga guru dari Naruto, Sasuke, dan Sakura. Dia juga dikenal sebagai \"Kakashi si ninja peniru\", dan konon jumlah jurus yang sudah ia tiru mencapai seribu jurus. Nama Kakashi berarti orang-orangan sawah.",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/2/27/Kakashi_Hatake.png/240px-Kakashi_Hatake.png"},
            {"Jiraiya",
                    "Jiraiya (自来也 Jiraiya) adalah seorang karakter fiksi dari anime dan manga Naruto. Nama kanjinya (自来也) memiliki arti \"datang karena keinginan sendiri\", yang banyak digambarkan oleh kelakuannya; datang dan menghilang dari desa Konoha secara tiba-tiba kapan saja ia mau.",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/6/66/Jiraiya.png/280px-Jiraiya.png"},
            {"Tsunade Senju",
                    "Tsunade Senju (千手綱手 Senju Tsunade) yang bergelar Godaime Hokage (五代目火影 Hokage Kelima) adalah tokoh fiktif dalam serial manga dan anime Naruto. Ia adalah cucu dari Hashirama Senju, dan kunoichi dari tiga sennin legendaris dan sekarang dikenal sebagai Hokage kelima. Tsunade adalah seorang ninja medis dan juga \"penjinak siput\". Perlu diketahui bahwa Tsunade adalah Hokage wanita pertama di dunia Naruto.",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/9/9c/Tsunade.png/280px-Tsunade.png"},
            {"Shikamaru Nara",
                    "Shikamaru Nara (奈良シカマル) adalah salah satu tokoh protagonis dalam serial manga dan anime Naruto. \"Shika\" berarti rusa dan \"maru\" bisa berarti \"lingkaran\" atau \"berkembang dengan baik\" tetapi biasa digunakan sebagai nama anak lelaki. Nara juga adalah salah satu nama prefektur dan kota di Jepang yang memiliki taman dengan banyak rusa.",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/9/9a/Shikamaru_Nara.png/240px-Shikamaru_Nara.png"},
            {"Neji Hyuuga",
                    "Neji Hyuuga adalah nama seorang tokoh fiktif dalam anime dan manga Naruto. Neji adalah seorang genin yang genius. Ia berasal dari klan Hyuga, dan masih sekerabat dengan Hinata Hyuuga.",
                    "https://upload.wikimedia.org/wikipedia/id/1/18/Neji_Hyuga.png"},
            {"Kiba Inuzuka",
                    "Kiba Inuzuka (犬塚キバ Inusuka Kiba) adalah salah satu karakter dalam cerita fiksi dan manga Naruto. Inuzuka bisa diartikan \"klan/perkumpulan anjing\" yang dipakai sebagai salah satu nama klan yang cukup kuat pada zaman Edo. Mereka dikenal sebagai \"pejuang anjing\" dan menyembah \"Inu\" atau anjing dalam perlambangan zodiak. \"inuzuka\" juga sebuah nama dalam cerita Hakkenden, novel seekor samurai anjing. \"Kiba\" berarti \"taring\".",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/2/22/Kiba_Inuzuka.png/240px-Kiba_Inuzuka.png"},
    };

    public static ArrayList<Characters> getListData() {
        Characters characters = null;
        ArrayList<Characters> list = new ArrayList<>();
        for (String[] aData : data) {
            characters = new Characters();
            characters.setName(aData[0]);
            characters.setDescription(aData[1]);
            characters.setPhoto(aData[2]);

            list.add(characters);
        }

        return list;
    }

}
