package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class searchCarBrand extends AppCompatActivity {

    Button submit, stop;
    EditText editText;
    Handler handler;
    ViewFlipper viewFlipper;

    //Initialise drawables to int using images.java
    //Audi images
    images img1 = new images(R.drawable.car1); images img2 = new images(R.drawable.car2);
    images img3 = new images(R.drawable.car3); images img4 = new images(R.drawable.car4);
    images img5 = new images(R.drawable.car5); images img6 = new images(R.drawable.car6);
    images img7 = new images(R.drawable.car7); images img8 = new images(R.drawable.car8);
    images img9 = new images(R.drawable.car9); images img10 = new images(R.drawable.car10);
    //Bentley Images
    images img11 = new images(R.drawable.car11); images img12 = new images(R.drawable.car12);
    images img13 = new images(R.drawable.car13); images img14 = new images(R.drawable.car14);
    images img15 = new images(R.drawable.car15); images img16 = new images(R.drawable.car16);
    images img17 = new images(R.drawable.car17); images img18 = new images(R.drawable.car18);
    images img19 = new images(R.drawable.car19); images img20 = new images(R.drawable.car20);
    //BMW images
    images img21 = new images(R.drawable.car21); images img22 = new images(R.drawable.car22);
    images img23 = new images(R.drawable.car23); images img24 = new images(R.drawable.car24);
    images img25 = new images(R.drawable.car25); images img26 = new images(R.drawable.car26);
    images img27 = new images(R.drawable.car27); images img28 = new images(R.drawable.car28);
    images img29 = new images(R.drawable.car29); images img30 = new images(R.drawable.car30);
    //Fiat images
    images img31 = new images(R.drawable.car31); images img32 = new images(R.drawable.car32);
    images img33 = new images(R.drawable.car33); images img34 = new images(R.drawable.car34);
    images img35 = new images(R.drawable.car35); images img36 = new images(R.drawable.car36);
    images img37 = new images(R.drawable.car37); images img38 = new images(R.drawable.car38);
    images img39 = new images(R.drawable.car39); images img40 = new images(R.drawable.car40);
    //Ford images
    images img41 = new images(R.drawable.car41); images img42 = new images(R.drawable.car42);
    images img43 = new images(R.drawable.car43); images img44 = new images(R.drawable.car44);
    images img45 = new images(R.drawable.car45); images img46 = new images(R.drawable.car46);
    images img47 = new images(R.drawable.car47); images img48 = new images(R.drawable.car48);
    images img49 = new images(R.drawable.car49); images img50 = new images(R.drawable.car50);
    //Honda images
    images img51 = new images(R.drawable.car51); images img52 = new images(R.drawable.car52);
    images img53 = new images(R.drawable.car53); images img54 = new images(R.drawable.car54);
    images img55 = new images(R.drawable.car55); images img56 = new images(R.drawable.car56);
    images img57 = new images(R.drawable.car57); images img58 = new images(R.drawable.car58);
    images img59 = new images(R.drawable.car59); images img60 = new images(R.drawable.car60);
    //Hyundai images
    images img61 = new images(R.drawable.car61); images img62 = new images(R.drawable.car62);
    images img63 = new images(R.drawable.car63); images img64 = new images(R.drawable.car64);
    images img65 = new images(R.drawable.car65); images img66 = new images(R.drawable.car66);
    images img67 = new images(R.drawable.car67); images img68 = new images(R.drawable.car68);
    images img69 = new images(R.drawable.car69); images img70 = new images(R.drawable.car70);
    //Jaguar images
    images img71 = new images(R.drawable.car71); images img72 = new images(R.drawable.car72);
    images img73 = new images(R.drawable.car73); images img74 = new images(R.drawable.car74);
    images img75 = new images(R.drawable.car75); images img76 = new images(R.drawable.car76);
    images img77 = new images(R.drawable.car77); images img78 = new images(R.drawable.car78);
    images img79 = new images(R.drawable.car79); images img80 = new images(R.drawable.car80);
    //Mercedes Benz images
    images img81 = new images(R.drawable.car81); images img82 = new images(R.drawable.car82);
    images img83 = new images(R.drawable.car83); images img84 = new images(R.drawable.car84);
    images img85 = new images(R.drawable.car85); images img86 = new images(R.drawable.car86);
    images img87 = new images(R.drawable.car87); images img88 = new images(R.drawable.car88);
    images img89 = new images(R.drawable.car89); images img90 = new images(R.drawable.car90);
    //Toyota images
    images img91 = new images(R.drawable.car91); images img92 = new images(R.drawable.car92);
    images img93 = new images(R.drawable.car93); images img94 = new images(R.drawable.car94);
    images img95 = new images(R.drawable.car95); images img96 = new images(R.drawable.car96);
    images img97 = new images(R.drawable.car97); images img98 = new images(R.drawable.car98);
    images img99 = new images(R.drawable.car99); images img100 = new images(R.drawable.car100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_car_brand);

        submit = findViewById(R.id.submitSearch);
        stop = findViewById(R.id.stopSearch);
        editText = findViewById(R.id.userSearch);
        viewFlipper = findViewById(R.id.Vflipper);

        shuffleAllBrands();

        handler = new Handler(); //used as a helper object to runnable object

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getText = editText.getText().toString().toLowerCase(); //convert EditText input to lowercase string.

                //I used an if else to see if the EditText value is equal to one of the car brands.
                if (getText.equals("audi")) {
                    audiBrand.run(); //set car brand images to the slider view.
                    setEnabledFalse(); //disables the EditText and submit Button
                } else if (getText.equals("bentley")){
                    bentleyBrand.run();
                    setEnabledFalse();
                } else if (getText.equals("bmw")){
                    bmwBrand.run();
                    setEnabledFalse();
                } else if (getText.equals("fiat")){
                    fiatBrand.run();
                    setEnabledFalse();
                } else if (getText.equals("ford")){
                    fordBrand.run();
                    setEnabledFalse();
                } else if (getText.equals("honda")){
                    hondaBrand.run();
                    setEnabledFalse();
                } else if (getText.equals("hyundai")){
                    hyundaiBrand.run();
                    setEnabledFalse();
                } else if (getText.equals("jaguar")){
                    jaguarBrand.run();
                    setEnabledFalse();
                } else if (getText.equals("mercedes benz")){
                    mercedesBrand.run();
                    setEnabledFalse();
                } else if (getText.equals("toyota")){
                    toyotaBrand.run();
                    setEnabledFalse();
                }
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whenStopClicked(); //EditText and Submit button is now enabled while runnable & sliderView stops
            }
        });
    }

    //This method returns int array 'a' to set the image background of the flipperView to one of the car brand images.
    public int[] flipperImage(int[] a){
        shuffleAllBrands(); //randomizes images for each car brand

        // I used a for loop to add images in an imageview depending on the array length of 'a' ('a' is one of the car brands)
        for (int i = 0; i < a.length; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setBackgroundResource(a[i]); //initialises the first imageView with the first value of the brand array.

            viewFlipper.addView(imageView);
            viewFlipper.setFlipInterval(3000); //3 sec
            viewFlipper.setAutoStart(true);
            viewFlipper.startFlipping(); //starts to cycle through the 'imageviews'
        }
        return a;
    }

    //using runnable object as a command to be sent to the message queue for execution - using handler as a helper object to send that command
    //What this method does is that every 30 seconds (which then all the images have been shown for that brand), the method slider runs again - shuffling the images in a random order.
    public Runnable audiBrand = new Runnable() {
        @Override
        public void run() {
            int[] audi = { //Initialises the Audi images to this int array.
                    Audi[0].getCarImage(), Audi[1].getCarImage(),
                    Audi[2].getCarImage(), Audi[3].getCarImage(),
                    Audi[4].getCarImage(), Audi[5].getCarImage(),
                    Audi[6].getCarImage(), Audi[7].getCarImage(),
                    Audi[8].getCarImage(), Audi[9].getCarImage(),
            };
            flipperImage(audi);
            handler.postDelayed(audiBrand, 30000); // 30 sec
        }
    };

    public Runnable bentleyBrand = new Runnable() {
        @Override
        public void run() {
            int[] bentley = {
                    Bentley[0].getCarImage(), Bentley[1].getCarImage(),
                    Bentley[2].getCarImage(), Bentley[3].getCarImage(),
                    Bentley[4].getCarImage(), Bentley[5].getCarImage(),
                    Bentley[6].getCarImage(), Bentley[7].getCarImage(),
                    Bentley[8].getCarImage(), Bentley[9].getCarImage(),
            };
            flipperImage(bentley);
            handler.postDelayed(bentleyBrand, 30000); // 30 sec
        }
    };

    public Runnable bmwBrand = new Runnable() {
        @Override
        public void run() {
            int[] bmw = {
                    BMW[0].getCarImage(), BMW[1].getCarImage(),
                    BMW[2].getCarImage(), BMW[3].getCarImage(),
                    BMW[4].getCarImage(), BMW[5].getCarImage(),
                    BMW[6].getCarImage(), BMW[7].getCarImage(),
                    BMW[8].getCarImage(), BMW[9].getCarImage(),
            };
            flipperImage(bmw);
            handler.postDelayed(bmwBrand, 30000); // 30 sec
        }
    };

    public Runnable fiatBrand = new Runnable() {
        @Override
        public void run() {
            int[] fiat = {
                    Fiat[0].getCarImage(), Fiat[1].getCarImage(),
                    Fiat[2].getCarImage(), Fiat[3].getCarImage(),
                    Fiat[4].getCarImage(), Fiat[5].getCarImage(),
                    Fiat[6].getCarImage(), Fiat[7].getCarImage(),
                    Fiat[8].getCarImage(), Fiat[9].getCarImage(),
            };
            flipperImage(fiat);
            handler.postDelayed(fiatBrand, 30000); // 30 sec
        }
    };

    public Runnable fordBrand = new Runnable() {
        @Override
        public void run() {
            int[] ford = {
                    Ford[0].getCarImage(), Ford[1].getCarImage(),
                    Ford[2].getCarImage(), Ford[3].getCarImage(),
                    Ford[4].getCarImage(), Ford[5].getCarImage(),
                    Ford[6].getCarImage(), Ford[7].getCarImage(),
                    Ford[8].getCarImage(), Ford[9].getCarImage(),
            };
            flipperImage(ford);
            handler.postDelayed(fordBrand, 30000); // 30 sec
        }
    };

    public Runnable hondaBrand = new Runnable() {
        @Override
        public void run() {
            int[] honda = {
                    Honda[0].getCarImage(), Honda[1].getCarImage(),
                    Honda[2].getCarImage(), Honda[3].getCarImage(),
                    Honda[4].getCarImage(), Honda[5].getCarImage(),
                    Honda[6].getCarImage(), Honda[7].getCarImage(),
                    Honda[8].getCarImage(), Honda[9].getCarImage(),
            };
            flipperImage(honda);
            handler.postDelayed(hondaBrand, 30000); // 30 sec
        }
    };

    public Runnable hyundaiBrand = new Runnable() {
        @Override
        public void run() {
            int[] hyundai = {
                    Hyundai[0].getCarImage(), Hyundai[1].getCarImage(),
                    Hyundai[2].getCarImage(), Hyundai[3].getCarImage(),
                    Hyundai[4].getCarImage(), Hyundai[5].getCarImage(),
                    Hyundai[6].getCarImage(), Hyundai[7].getCarImage(),
                    Hyundai[8].getCarImage(), Hyundai[9].getCarImage(),
            };
            flipperImage(hyundai);
            handler.postDelayed(hyundaiBrand, 30000); // 30 sec
        }
    };

    public Runnable jaguarBrand = new Runnable() {
        @Override
        public void run() {
            int[] jaguar = {
                    Jaguar[0].getCarImage(), Jaguar[1].getCarImage(),
                    Jaguar[2].getCarImage(), Jaguar[3].getCarImage(),
                    Jaguar[4].getCarImage(), Jaguar[5].getCarImage(),
                    Jaguar[6].getCarImage(), Jaguar[7].getCarImage(),
                    Jaguar[8].getCarImage(), Jaguar[9].getCarImage(),
            };
            flipperImage(jaguar);
            handler.postDelayed(jaguarBrand, 30000); // 30 sec
        }
    };

    public Runnable mercedesBrand = new Runnable() {
        @Override
        public void run() {
            int[] mercedes = {
                    Mercedes_Benz[0].getCarImage(), Mercedes_Benz[1].getCarImage(),
                    Mercedes_Benz[2].getCarImage(), Mercedes_Benz[3].getCarImage(),
                    Mercedes_Benz[4].getCarImage(), Mercedes_Benz[5].getCarImage(),
                    Mercedes_Benz[6].getCarImage(), Mercedes_Benz[7].getCarImage(),
                    Mercedes_Benz[8].getCarImage(), Mercedes_Benz[9].getCarImage(),
            };
            flipperImage(mercedes);
            handler.postDelayed(mercedesBrand, 30000); // 30 sec
        }
    };

    public Runnable toyotaBrand = new Runnable() {
        @Override
        public void run() {
            int[] toyota = {
                    Toyota[0].getCarImage(), Toyota[1].getCarImage(),
                    Toyota[2].getCarImage(), Toyota[3].getCarImage(),
                    Toyota[4].getCarImage(), Toyota[5].getCarImage(),
                    Toyota[6].getCarImage(), Toyota[7].getCarImage(),
                    Toyota[8].getCarImage(), Toyota[9].getCarImage(),
            };
            flipperImage(toyota);
            handler.postDelayed(toyotaBrand, 30000); // 30 sec
        }
    };

    public void shuffleAllBrands(){
        Collections.shuffle(Arrays.asList(Audi));
        Collections.shuffle(Arrays.asList(Bentley));
        Collections.shuffle(Arrays.asList(BMW));
        Collections.shuffle(Arrays.asList(Fiat));
        Collections.shuffle(Arrays.asList(Ford));
        Collections.shuffle(Arrays.asList(Honda));
        Collections.shuffle(Arrays.asList(Hyundai));
        Collections.shuffle(Arrays.asList(Jaguar));
        Collections.shuffle(Arrays.asList(Mercedes_Benz));
        Collections.shuffle(Arrays.asList(Toyota));
    }

    public void setEnabledFalse(){
        editText.setFocusable(false);
        submit.setEnabled(false);
    }

    public void whenStopClicked(){
        submit.setEnabled(true);
        editText.setFocusableInTouchMode(true);
        handler.removeCallbacksAndMessages(null);
        viewFlipper.stopFlipping();
        viewFlipper.removeAllViews(); //removes current views affiliated with the previous car brand
    }

    //I created an image array to store the drawables based on the car brand
    images [] Audi = new images[]{
            img1,img2,img3,img4,img5,img6,img7,img8,img9,img10
    };

    images [] Bentley = new images[]{
            img11,img12,img13,img14,img15,img16,img17,img18,img19,img20
    };

    images [] BMW = new images[]{
            img21,img22,img23,img24,img25,img26,img27,img28,img29,img30,
    };

    images [] Fiat = new images[]{
            img31,img32,img33,img34,img35,img36,img37,img38,img39,img40,
    };

    images [] Ford = new images[]{
            img41,img42,img43,img44,img45,img46,img47,img48,img49,img50,
    };

    images [] Honda = new images[]{
            img51,img52,img53,img54,img55,img56,img57,img58,img59,img60,
    };

    images [] Hyundai = new images[]{
            img61,img62,img63,img64,img65,img66,img67,img68,img69,img70,
    };

    images [] Jaguar = new images[]{
            img71,img72,img73,img74,img75,img76,img77,img78,img79,img80,
    };

    images [] Mercedes_Benz = new images[]{
            img81,img82,img83,img84,img85,img86,img87,img88,img89,img90,
    };

    images [] Toyota = new images[]{
            img91,img92,img93,img94,img95,img96,img97,img98,img99,img100,
    };
}