package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class identifyTheCar extends AppCompatActivity {

    ImageView imageView1, imageView2, imageView3;
    Button button, next;
    TextView textView, answer, timer;
    int allBrand[] = new int[10];
    public int counter = 10;

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
        setContentView(R.layout.activity_identify_the_car);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        timer = findViewById(R.id.timer);
        button = findViewById(R.id.buttonBrandName);
        next = findViewById(R.id.nextButton);
        textView = findViewById(R.id.brandName);
        answer = findViewById(R.id.rightWrong);

        //What I did in this code is that I separated each car brand images into their own array using images.java.
        //I then shuffled each of those car brand arrays and used .getCarImage to get the first image in those individual array and initialized it to an int array.
        //I then shuffled the int array and set the first 3 values from the int array to the three imageViews. This ensures that each imageView will have a unique car brand image.
        //I set a tag on each imageView after they have been set an image each time.
        //I used the tags to create an int array method called displayCarBrand. I shuffled all the tags and got the value of the first tag.
        //If the first tag from shuffled tag is equal to the tag of the first imageView, then I used an if else statement to see if the int array is equal to the first value of the car brand array.
        //If true then I set the textView to the corresponding brand of the car image.

        next.setVisibility(View.INVISIBLE);
        random(); //This method sets random images to the imageView and displays a random brand based on the three images.
        countDown();

        //This is the next button - Once clicked the textView is reset, the next button disappears while calling the random method.
        //setClickable is there to allow the car images to be clickable.
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setVisibility(View.INVISIBLE);
                answer.setText("");

                next.setVisibility(View.INVISIBLE);
                button.setVisibility(View.VISIBLE);

                random();

                imageView1.setClickable(true);
                imageView2.setClickable(true);
                imageView3.setClickable(true);
            }
        });

        //I used setOnClickListener on the 3 imageViews to call the 'correct' or 'wrong' method if
        //the tag on the text view is equal to whichever imageView.
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getTag().equals(imageView1.getTag().toString())){
                    correct();
                } else {
                    wrong();
                }
                imageView2.setClickable(false);
                imageView3.setClickable(false);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getTag().equals(imageView2.getTag().toString())){
                    correct();
                } else {
                    wrong();
                }
                imageView1.setClickable(false);
                imageView3.setClickable(false);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getTag().equals(imageView3.getTag().toString())){
                    correct();
                } else {
                    wrong();
                }
                imageView1.setClickable(false);
                imageView2.setClickable(false);
            }
        });
    }

    //Method called where the textView changes whether the user gets the answer right or wrong.
    public void correct(){
        answer.setVisibility(View.VISIBLE);
        answer.setText("Correct!");
        answer.setTextColor(Color.GREEN);
        buttonVisibility();
    }

    public void wrong(){
        answer.setVisibility(View.VISIBLE);
        answer.setText("Wrong!");
        answer.setTextColor(Color.RED);
        buttonVisibility();
    }

    //random method is where I shuffled the individual brand images first
    //I initialized each of the first value of the brand image array to an int then I put them into an int array (allBrand) and shuffled it using shuffleArray
    public void random(){
        shuffleAllBrands();

        int audi = Audi[0].getCarImage();
        int bentley = Bentley[0].getCarImage();
        int bmw = BMW[0].getCarImage();
        int fiat = Fiat[0].getCarImage();
        int ford = Ford[0].getCarImage();
        int honda = Honda[0].getCarImage();
        int hyundai = Hyundai[0].getCarImage();
        int jaguar = Jaguar[0].getCarImage();
        int mercedes_benz = Mercedes_Benz[0].getCarImage();
        int toyota = Toyota[0].getCarImage();

        allBrand[0] = audi;
        allBrand[1] = bentley;
        allBrand[2] = bmw;
        allBrand[3] = fiat;
        allBrand[4] = ford;
        allBrand[5] = honda;
        allBrand[6] = hyundai;
        allBrand[7] = jaguar;
        allBrand[8] = mercedes_benz;
        allBrand[9] = toyota;

        shuffleArray(allBrand);

        //I then set the first 3 values from the int array to the imageView while setting a tag on each of them.
        imageView1.setImageResource(allBrand[0]);
        imageView2.setImageResource(allBrand[1]);
        imageView3.setImageResource(allBrand[2]);

        imageView1.setTag(allBrand[0]);
        imageView2.setTag(allBrand[1]);
        imageView3.setTag(allBrand[2]);

        //Calls the int array method.
        displayCarBrand(allBrand);
    }

    //This method is where I used getTag to retrieve the tag from the imageView then initialized them into a String array to be shuffled.
    public int[] displayCarBrand(int[] a) {

        String getTag1 = imageView1.getTag().toString();
        String getTag2 = imageView2.getTag().toString();
        String getTag3 = imageView3.getTag().toString();

        String[] tags = new String[]{getTag1, getTag2, getTag3};
        Collections.shuffle(Arrays.asList(tags));

        int audi = Audi[0].getCarImage();
        int bentley = Bentley[0].getCarImage();
        int bmw = BMW[0].getCarImage();
        int fiat = Fiat[0].getCarImage();
        int ford = Ford[0].getCarImage();
        int honda = Honda[0].getCarImage();
        int hyundai = Hyundai[0].getCarImage();
        int jaguar = Jaguar[0].getCarImage();
        int mercedes_benz = Mercedes_Benz[0].getCarImage();
        int toyota = Toyota[0].getCarImage();

        //I then used an if statement to see if the first value of the shuffled tag (either tag1, tag2 or tag3) is equal to the the first imageView tag.
        //If true then see if the first value of the allBrand array (in this case it's a[0]) is equal to any of the car brand.
        //If true I set the textView text to the corresponding brand then set the imageView tag to the first imageView tag.
        if (tags[0].equals(getTag1)) {
            if (a[0] == audi) {
                textView.setText("Audi");
                textView.setTag(getTag1);
            } else if (a[0] == bentley) {
                textView.setText("Bentley");
                textView.setTag(getTag1);
            } else if (a[0] == bmw) {
                textView.setText("BMW");
                textView.setTag(getTag1);
            } else if (a[0] == fiat) {
                textView.setText("Fiat");
                textView.setTag(getTag1);
            } else if (a[0] == ford) {
                textView.setText("Ford");
                textView.setTag(getTag1);
            } else if (a[0] == honda) {
                textView.setText("Honda");
                textView.setTag(getTag1);
            } else if (a[0] == hyundai) {
                textView.setText("Hyundai");
                textView.setTag(getTag1);
            } else if (a[0] == jaguar) {
                textView.setText("Jaguar");
                textView.setTag(getTag1);
            } else if (a[0] == mercedes_benz) {
                textView.setText("Mercedes Benz");
                textView.setTag(getTag1);
            } else if (a[0] == toyota) {
                textView.setText("Toyota");
                textView.setTag(getTag1);
            }
        }

        //The same if statement except a[1] instead of a[0] and I set the textView tag to be the tag of the second imageView
        if (tags[0].equals(getTag2)){
            if (a[1] == audi) {
                textView.setText("Audi");
                textView.setTag(getTag2);
            } else if (a[1] == bentley) {
                textView.setText("Bentley");
                textView.setTag(getTag2);
            } else if (a[1] == bmw) {
                textView.setText("BMW");
                textView.setTag(getTag2);
            } else if (a[1] == fiat) {
                textView.setText("Fiat");
                textView.setTag(getTag2);
            } else if (a[1] == ford) {
                textView.setText("Ford");
                textView.setTag(getTag2);
            } else if (a[1] == honda) {
                textView.setText("Honda");
                textView.setTag(getTag2);
            } else if (a[1] == hyundai) {
                textView.setText("Hyundai");
                textView.setTag(getTag2);
            } else if (a[1] == jaguar) {
                textView.setText("Jaguar");
                textView.setTag(getTag2);
            } else if (a[1] == mercedes_benz) {
                textView.setText("Mercedes Benz");
                textView.setTag(getTag2);
            } else if (a[1] == toyota) {
                textView.setText("Toyota");
                textView.setTag(getTag2);
            }
        }

        //Final if statement but a[2] and set the textView tag to be the third imageView tag.
        if (tags[0].equals(getTag3)){
            if (a[2] == audi) {
                textView.setText("Audi");
                textView.setTag(getTag3);
            } else if (a[2] == bentley) {
                textView.setText("Bentley");
                textView.setTag(getTag3);
            } else if (a[2] == bmw) {
                textView.setText("BMW");
                textView.setTag(getTag3);
            } else if (a[2] == fiat) {
                textView.setText("Fiat");
                textView.setTag(getTag3);
            } else if (a[2] == ford) {
                textView.setText("Ford");
                textView.setTag(getTag3);
            } else if (a[2] == honda) {
                textView.setText("Honda");
                textView.setTag(getTag3);
            } else if (a[2] == hyundai) {
                textView.setText("Hyundai");
                textView.setTag(getTag3);
            } else if (a[2] == jaguar) {
                textView.setText("Jaguar");
                textView.setTag(getTag3);
            } else if (a[2] == mercedes_benz) {
                textView.setText("Mercedes Benz");
                textView.setTag(getTag3);
            } else if (a[2] == toyota) {
                textView.setText("Toyota");
                textView.setTag(getTag3);
            }
        }
        return a;
    }

    //Created to shuffle an int array.
    private static void shuffleArray(int[] array){ //shuffle array
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--){
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    //Called in the method 'random'. I shuffled each car brand array.
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

    // Boolean to see if the switch is checked then return true to run count down timer.
    public boolean countDown(){
        String getSwitchValue = getIntent().getStringExtra("switch"); //gets switch value from main activity

        if (getSwitchValue.equals("yes")){
            countDownTimer();
            return true;
        }
        return false;
    }

    // Method creating the count down timer using a textView.
    public void countDownTimer(){
        timer = findViewById(R.id.timer);

        new CountDownTimer(10000, 1000){ // 10 sec countdown with 1 second interval

            @Override
            public void onTick(long millisUntilFinished) { //Callback fired on regular interval
                timer.setText(String.valueOf(counter)); // Sets the current value of the timer/counter to the textView
                counter--;
            }

            @Override
            public void onFinish() { //Callback fired when the time is up.
                timer.setText("Finish");
                if (answer.getText().equals("")) {
                    wrong();
                }
            }
        }.start();
    }

    public void buttonVisibility(){
        button.setVisibility(View.INVISIBLE);
        next.setVisibility(View.VISIBLE);
    }
}