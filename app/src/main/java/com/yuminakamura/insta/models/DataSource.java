package com.yuminakamura.insta.models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by yuminakamura on 2018-01-26.
 */

public class DataSource {

    static ArrayList<TimeLine> timeLineLists = new ArrayList<>();

    private static final String[] usernames = {
            "Yuumi",
            "Jaewon",
            "Kento",
            "Sayaka"
    };

    private static final String[] userImages = {
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9Y2yaCkiWPyr8-m895g4PILnWBuFo0-d2rw_b_829ntQFAGTBMw",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3txWR1VnvBnZ1GU9FHKU4H_r6owCHs83CZ_rjqmLmpCnj4jb4_w",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEvsXv5qJyIWVqlT6ow4xAigMBvA-VrYd5hCeRU7wPDlF911xe",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiuafUmGudjFGoPou5Pg70xmwMy4U_MxVNuMKuXo-RDCPourE5"};

    private static final String[] timelinePictures = {
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9Y2yaCkiWPyr8-m895g4PILnWBuFo0-d2rw_b_829ntQFAGTBMw",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQ-Ys4vXTh3sCJ11DY28UBKg4q2LiKh-afEb-Mb-mlnr8pes4R",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZJLKVge0H2nK9zyG5HfzTWb8DKdVrHsPCWYrO73ZxH33OA3of",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9Y2yaCkiWPyr8-m895g4PILnWBuFo0-d2rw_b_829ntQFAGTBMw",
    };

    private static final String[] photoMessages = {
            "so happy",
            "yummy yummy ",
            "sunny days :)",
            "what a bad day..."
    };

    public static ArrayList<TimeLine> createDatas(MyAdapter myAdapter) {

        for (int i = 0; i < 4; i++) {
            Random rdm = new Random();
            String rmdNumLikes = Integer.toString((rdm.nextInt(50)));
            String rmdNumComments = Integer.toString((rdm.nextInt(50)));
            FeedBack feedback = new FeedBack(rmdNumLikes, rmdNumComments);
            TimeLine timeLine= new TimeLine(usernames[i],userImages[i], timelinePictures[i],feedback,photoMessages[i]);
            timeLineLists.add(timeLine);
        }

        myAdapter.setTimeLinelists(timeLineLists);
        return timeLineLists;
    }



}

