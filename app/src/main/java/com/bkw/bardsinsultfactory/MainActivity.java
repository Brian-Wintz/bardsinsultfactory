package com.bkw.bardsinsultfactory;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    static String[] str1= {"artless","bawdy","beslubbering","bootless","churlish","cockered","clouted",
            "craven","currish","dankish","dissembling","droning","errant","fawning",
            "fobbing","froward","frothy","gleeking","goatish","gorbellied","fool-born",
            "enfectious","jarring","loggerheaded","lumpish","mammering","mangled",
            "mewling","paunchy","ill-nurtured","puking","puny","qualling","onion-eyed",
            "plume-plucked","pottle-deep","pox-marked","reeling-ripe","rough-hewn"};
    static String[] str2= {"base-court","bat-fowling","beef-witted","beetle-headed","boil-brained",
            "clapper-clawed","clay-brained","common-kissing","crook-pated",
            "dismal-dreaming","dizzy-eyed","doghearted","dread-bolted","earth-vexing",
            "elf-skinned","fat-kidneyed","fen-sucked","flap-mouthed","fly-bitten",
            "folly-fallen","gudgeon","full-gorged","guts-griping","half-faced",
            "hasty-witted","hedge-born","hell-hated","idle-headed","ill-breeding",
            "maggot-pie","knotty-pated","milk-livered","motley-minded","minnow reeky",
            "miscreant roguish","mumble-news saucy","moldwarp ruttish","nut-hook spleeny",
            "pigeon-egg spongy"};
    static String[] str3={"apple-john","baggage","barnacle","bladder","boar-pig","bugbear","bum-bailey",
                "canker-blossom","clack-disk","clotpole","coxcomb","codpiece","death-token",
                "dewberry","flap-dragon","flax-wench","flirt-gill","foot-licker","fustilarian",
                "giglet","haggard","harpy","hedge-pig","horn-beast","hugger-mugger","joithead",
                "lewdster","lout","malt-worm","mammet","measle rank"};

    public void generateInsult(View view) {
        this.generateInsult();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateInsult();

    }

    protected void generateInsult() {
        TextView txtView = (TextView) findViewById(R.id.textView5);

        txtView.setText("Thou " +
                str1[this.generateRandom(str1.length-1)] + " " +
                str2[this.generateRandom(str2.length-1)] + " " +
                str3[this.generateRandom(str3.length-1)]);
    }

    protected int generateRandom(int max) {
        return (int)Math.floor(Math.random() * (max  + 1) );
    }
}