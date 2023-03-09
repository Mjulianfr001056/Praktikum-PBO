package meet5.tugas;

import java.util.Random;

public class UniversityTest {
    public static void main(String[] args) {
        //Making list of employees
        //Administrative employees
        Administrative_Employee ae_1 = new Administrative_Employee(
                "374-61-XXXX", "Muhammad Julian Firdaus", "julian@univ.id");
        Administrative_Employee ae_2 = new Administrative_Employee(
                "248-06-XXXX", "Farhan Maulana", "farhan@univ.id");
        Administrative_Employee ae_3 = new Administrative_Employee(
                "338-68-XXXX", "Sabilla Hamda Syahputri", "sabilla@univ.id");
        Administrative_Employee ae_4 = new Administrative_Employee(
                "406-32-XXXX", "Erika Azizah Khoirunnisa", "erika@univ.id");
        Administrative_Employee ae_5 = new Administrative_Employee(
                "309-94-XXXX", "Syakira Rizky Andini", "syakira@univ.id");

        System.out.println(ae_1);
        //Research Associate
        Research_Associate ra_1 = new Research_Associate(
                "680-83-XXXX", "Adinda Ayu Pramesthi", "adin@univ.id", "Komputer");
        Research_Associate ra_2 = new Research_Associate(
                "309-94-XXXX", "Seizra Aulia Salsabila", "seizra@univ.id", "Komputer");
        Research_Associate ra_3 = new Research_Associate(
                "439-68-XXXX", "Falana Rofako Hakam", "falana@univ.id", "Komputer");
        Research_Associate ra_4 = new Research_Associate(
                "498-33-XXXX", "I Kadek Purna Widyarta", "kadek@univ.id", "Komputer");
        Research_Associate ra_5 = new Research_Associate(
                "495-41-XXXX", "Ibnu Gata", "ibnu@univ.id", "Komputer");
        Research_Associate ra_6 = new Research_Associate(
                "181-98-XXXX", "Rifky Maulana Putra", "rifky@univ.id", "Komputer");

        Research_Associate ra_7 = new Research_Associate(
                "680-83-XXXX", "Angga Prayoga", "angga@univ.id", "Teknik");
        Research_Associate ra_8 = new Research_Associate(
                "309-94-XXXX", "Calivi Kezia Laksamana Putri", "calivi@univ.id", "Teknik");
        Research_Associate ra_9 = new Research_Associate(
                "439-68-XXXX", "Dyah Widyastuti", "dyah@univ.id", "Teknik");
        Research_Associate ra_10 = new Research_Associate(
                "498-33-XXXX", "Pembayun Otsu Indiana", "pembayun@univ.id", "Teknik");
        Research_Associate ra_11 = new Research_Associate(
                "495-41-XXXX", "Ahmad Nadifa Al Agung", "nadifa@univ.id", "Teknik");
        Research_Associate ra_12 = new Research_Associate(
                "181-98-XXXX", "Muhammad Alfa Risxi", "alfa@univ.id", "Teknik");

        Research_Associate ra_13 = new Research_Associate(
                "680-83-XXXX", "Ainul Baharuddin", "ainul@univ.id", "Ekonomi");
        Research_Associate ra_14 = new Research_Associate(
                "309-94-XXXX", "Fajar Malik Noor Ahmad", "fajar@univ.id", "Ekonomi");
        Research_Associate ra_15 = new Research_Associate(
                "439-68-XXXX", "Faiz Fathur Rahman", "faiz@univ.id", "Ekonomi");
        Research_Associate ra_16 = new Research_Associate(
                "498-33-XXXX", "Salma Afna Humaira Hikmatullah", "salma@univ.id", "Ekonomi");
        Research_Associate ra_17 = new Research_Associate(
                "495-41-XXXX", "Syarifah Annisa Assegaf", "annisa@univ.id", "Ekonomi");
        Research_Associate ra_18 = new Research_Associate(
                "181-98-XXXX", "Radyah Hemalya", "radyah@univ.id", "Ekonomi");

        //Making List of Faculty
        Faculty f1 = new Faculty("Fakultas Informatika dan Komputer"); f1.setDean(ae_1);
        Faculty f2 = new Faculty("Fakultas Teknik"); f2.setDean(ae_2);
        Faculty f3 = new Faculty("Fakultas Ekonomi dan Bisnis"); f3.setDean(ae_3);

        //Adding List of Institute
        f1.addInstitute("Informatika Terapan", "Jl. Otista I");
        f1.addInstitute("Informasi Manajemen", "Jl. Otista II");
        f1.addInstitute("Teknologi Kuantum", "Jl. Otista III");
        f1.addInstitute("Ilmu Komputer", "Jl. Otista IV");

        f2.addInstitute("Teknik Elektro", "Jl. Sensus I");
        f2.addInstitute("Teknik Informasi", "Jl. Sensus II");
        f2.addInstitute("Teknik Robotika", "Jl. Sensus III");

        f3.addInstitute("Kebendaharaan Negara", "Jl. Mangga I");
        f3.addInstitute("Ekonomi Murni", "Jl. Mangga II");

        //Assigning each research associate
        //Fakultas Informatika dan Komputer
        f1.findInstitute("Informatika Terapan").assign_associate(ra_1);
        f1.findInstitute("Informatika Terapan").assign_associate(ra_3);
        f1.findInstitute("Informatika Terapan").assign_associate(ra_5);

        f1.findInstitute("Informasi Manajemen").assign_associate(ra_1);
        f1.findInstitute("Informasi Manajemen").assign_associate(ra_2);
        f1.findInstitute("Informasi Manajemen").assign_associate(ra_4);

        f1.findInstitute("Teknologi Kuantum").assign_associate(ra_2);
        f1.findInstitute("Teknologi Kuantum").assign_associate(ra_3);
        f1.findInstitute("Teknologi Kuantum").assign_associate(ra_4);
        f1.findInstitute("Teknologi Kuantum").assign_associate(ra_6);

        f1.findInstitute("Ilmu Komputer").assign_associate(ra_1);
        f1.findInstitute("Ilmu Komputer").assign_associate(ra_5);
        f1.findInstitute("Ilmu Komputer").assign_associate(ra_6);

        //Fakultas Teknik
        f2.findInstitute("Teknik Elektro").assign_associate(ra_7);
        f2.findInstitute("Teknik Elektro").assign_associate(ra_8);
        f2.findInstitute("Teknik Elektro").assign_associate(ra_9);
        f2.findInstitute("Teknik Elektro").assign_associate(ra_10);

        f2.findInstitute("Teknik Informasi").assign_associate(ra_9);
        f2.findInstitute("Teknik Informasi").assign_associate(ra_12);

        f2.findInstitute("Teknik Robotika").assign_associate(ra_7);
        f2.findInstitute("Teknik Robotika").assign_associate(ra_8);
        f2.findInstitute("Teknik Robotika").assign_associate(ra_11);

        //Fakultas Ekonomi dan Bisnis
        f3.findInstitute("Kebendaharaan Negara").assign_associate(ra_13);
        f3.findInstitute("Kebendaharaan Negara").assign_associate(ra_14);
        f3.findInstitute("Kebendaharaan Negara").assign_associate(ra_15);

        f3.findInstitute("Ekonomi Murni").assign_associate(ra_16);
        f3.findInstitute("Ekonomi Murni").assign_associate(ra_17);
        f3.findInstitute("Ekonomi Murni").assign_associate(ra_18);

        //Making list of lecturers
        Lecturer l1 = new Lecturer(
                "xxx", "Muhammad Afnan Alfian", "afnan@univ.id", "Komputer");
        Lecturer l2 = new Lecturer(
                "xxx", "Sisilia Agustina Manalu", "sisil@univ.id", "Komputer");
        Lecturer l3 = new Lecturer(
                "xxx", "Syawalgi Wahyu Imani", "syawal@univ.id", "Teknik");
        Lecturer l4 = new Lecturer(
                "xxx", "Nasywa Nur Amalia", "nasywa@univ.id", "Teknik");
        Lecturer l5 = new Lecturer(
                "xxx", "Afif Tegar Ardika", "tegar@univ.id", "Ekonomi");
        Lecturer l6 = new Lecturer(
                "xxx", "Aida Muthia Suhaib", "Aida@univ.id", "Ekonomi");

        //Making list of courses
        Course ck_1 = new Course("Teori Komputasi", "K001", 2.0f);
        Course ck_2 = new Course("Interaksi Manusia dan Komputer", "K002", 2.0f);
        Course ck_3 = new Course("Manajemen Proyek", "K003", 4.0f);
        Course ck_4 = new Course("Pemograman Berorientasi Objek", "K004", 4.0f);
        Course ck_5 = new Course("Soft Computing", "K005", 1.0f);
        Course ck_6 = new Course("Aljabar Linear", "K006", 2.5f);

        Course ct_1 = new Course("Pengantar Lingkungan Lahan Basah",  "T001", 2.0f);
    }
}

