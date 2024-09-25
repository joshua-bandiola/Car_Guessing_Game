package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class identifyTheBrand extends AppCompatActivity {
    ImageView imageView;
    Button btnNext, submit;
    TextView wrongGuess, rightGuess, correctAnswer, countDownTimer;
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
        setContentView(R.layout.activity_identify_the_brand);

        //Initialising the following to the xml ID.
        imageView = (ImageView) findViewById(R.id.imageViewCars);
        btnNext = (Button) findViewById(R.id.next);
        submit = (Button) findViewById(R.id.submit);
        Spinner dropDown = (Spinner) findViewById(R.id.dropDown);
        wrongGuess = (TextView) findViewById(R.id.wrongGuess);
        correctAnswer = (TextView) findViewById(R.id.correctAnswer);
        rightGuess = (TextView) findViewById(R.id.rightGuess);

        //Make array adapter - this is a container that will hold values and integrate them within the spinner/dropdown
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(identifyTheBrand.this,
                R.layout.color_spinner_layout, getResources().getStringArray(R.array.brand));
        myAdapter.setDropDownViewResource(R.layout.spinner_dropdown_layout); //Specify that this adapter will have a drop down list
        dropDown.setAdapter(myAdapter); //Shows the data from the array list into the drop down list/spinner

        countDown(); // if switch is true then count down timer will appear
        showRandomImage(); //Gets first random image when activity opens

        //Button which shows the next random image
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomImage();

                //After user clicks on "Next" button it shows the user the submit button
                btnNext.setVisibility(View.INVISIBLE);
                submit.setVisibility(View.VISIBLE);

                //This removes the textView when user clicks on the "next" button
                removeText();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainFunction();
            }
        });
    }

    // Main function of the game so the user can submit their guess corresponding to the current image.
    public void mainFunction(){
        if (Audi()){
            rightGuess();
            buttonVisibility();
        } else if (Bentley()){
            rightGuess();
            buttonVisibility();
        } else if (BMW()){
            rightGuess();
            buttonVisibility();
        } else if (Fiat()){
            rightGuess();
            buttonVisibility();
        } else if (Ford()){
            rightGuess();
            buttonVisibility();
        } else if (Honda()){
            rightGuess();
            buttonVisibility();
        } else if (Hyundai()){
            rightGuess();
            buttonVisibility();
        } else if (Jaguar()){
            rightGuess();
            buttonVisibility();
        } else if (Mercedes_Benz()){
            rightGuess();
            buttonVisibility();
        } else if (Toyota()){
            rightGuess();
            buttonVisibility();
        } else {
            buttonVisibility();
        }
    }

    //method to set a random image from all the drawables to current imageView
    //images array will be shuffled every time this method is called.
    public void showRandomImage(){
        shuffleImage();
        imageView.setImageResource(allImages[0].getCarImage());
    }

    //Using images.java class to make int array containing all images which is initialised at line 28
    images [] allImages = new images[] {
            img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,
            img11,img12,img13,img14,img15,img16,img17,img18,img19,img20,
            img21,img22,img23,img24,img25,img26,img27,img28,img29,img30,
            img31,img32,img33,img34,img35,img36,img37,img38,img39,img40,
            img41,img42,img43,img44,img45,img46,img47,img48,img49,img50,
            img51,img52,img53,img54,img55,img56,img57,img58,img59,img60,
            img61,img62,img63,img64,img65,img66,img67,img68,img69,img70,
            img71,img72,img73,img74,img75,img76,img77,img78,img79,img80,
            img81,img82,img83,img84,img85,img86,img87,img88,img89,img90,
            img91,img92,img93,img94,img95,img96,img97,img98,img99,img100,
    };

    //shuffle int array using collections.shuffle
    public void shuffleImage(){
        Collections.shuffle(Arrays.asList(allImages));
    }

    //Method when called: Set the submit button invisible and the next button visible
    public void buttonVisibility(){
        btnNext.setVisibility(View.VISIBLE);
        submit.setVisibility(View.INVISIBLE);
    }

    //Method called when the "NEXT" button is clicked.
    //This is to see if any of the textView has any text set on them..
    //If there is text then clear the text and set the visibility to invisible
    private void removeText(){
        if (!wrongGuess.equals("")){
            wrongGuess.setText("");
            wrongGuess.setVisibility(View.INVISIBLE);
        }

        if (!correctAnswer.equals("")){
            correctAnswer.setText("");
            correctAnswer.setVisibility(View.INVISIBLE);
        }

        if (!rightGuess.equals("")){
            rightGuess.setText("");
            rightGuess.setVisibility(View.INVISIBLE);
        }
    }

    //This method is first called on line 136
    //This is a method to set the correct answer textView to visible and set a text
    private void rightGuess(){
        rightGuess.setVisibility(View.VISIBLE);
        rightGuess.setText("Correct");
    }

    //This method is first called on line 269
    //This is a method where I used "inputCar" to return what the correct car brand when guessed wrong
    public String wrongGuess (String inputCar){
        wrongGuess = (TextView) findViewById(R.id.wrongGuess);
        correctAnswer = (TextView) findViewById(R.id.correctAnswer);

        wrongGuess.setVisibility(View.VISIBLE);
        correctAnswer.setVisibility(View.VISIBLE);

        wrongGuess.setText("Wrong");
        correctAnswer.setText("Correct answer is: "+ inputCar);

        return inputCar;
    }

    //Create public method to compare image bitmap to drawable bitmap. If so then see if user selected correct spinner value.
    //Repeat for each car brand.
    public boolean Audi(){
        Spinner dropDown = (Spinner) findViewById(R.id.dropDown);
        String spinnerValue = dropDown.getSelectedItem().toString();

        //Get current imageView to bitmap
        Bitmap bmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();

        //Get individual car image drawable then convert it to bitmap
        Drawable car1 = getResources().getDrawable(R.drawable.car1); Drawable car2 = getResources().getDrawable(R.drawable.car2);
        Drawable car3 = getResources().getDrawable(R.drawable.car3); Drawable car4 = getResources().getDrawable(R.drawable.car4);
        Drawable car5 = getResources().getDrawable(R.drawable.car5); Drawable car6 = getResources().getDrawable(R.drawable.car6);
        Drawable car7 = getResources().getDrawable(R.drawable.car7); Drawable car8 = getResources().getDrawable(R.drawable.car8);
        Drawable car9 = getResources().getDrawable(R.drawable.car9); Drawable car10 = getResources().getDrawable(R.drawable.car10);

        Bitmap img1 = ((BitmapDrawable)car1).getBitmap(); Bitmap img2 = ((BitmapDrawable)car2).getBitmap();
        Bitmap img3 = ((BitmapDrawable)car3).getBitmap(); Bitmap img4 = ((BitmapDrawable)car4).getBitmap();
        Bitmap img5 = ((BitmapDrawable)car5).getBitmap(); Bitmap img6 = ((BitmapDrawable)car6).getBitmap();
        Bitmap img7 = ((BitmapDrawable)car7).getBitmap(); Bitmap img8 = ((BitmapDrawable)car8).getBitmap();
        Bitmap img9 = ((BitmapDrawable)car9).getBitmap(); Bitmap img10 = ((BitmapDrawable)car10).getBitmap();

        //Conditional statement to see if current imageView bitmap has equal value to any of the corresponding brand drawable bitmap
        //If true then user selected dropdown list must equal to "Audi" which returns true. If not the method won't return anything.
        if (bmap.sameAs(img1) || bmap.sameAs(img2) || bmap.sameAs(img3) || bmap.sameAs(img4) || bmap.sameAs(img5)
                || bmap.sameAs(img6) || bmap.sameAs(img7) || bmap.sameAs(img8) || bmap.sameAs(img9) || bmap.sameAs(img10)){
            if (!spinnerValue.equals("Audi")) { //If statement to see if the user did not select "Audi" when the image is shown an Audi car.
                wrongGuess("Audi");
            }
            if (spinnerValue.equals("Audi")){ //If user did guess the correct image then return true.
                return true;
            }
        }
        return false;
    }

    public boolean Bentley(){
        Spinner dropDown = (Spinner) findViewById(R.id.dropDown);
        String spinnerValue = dropDown.getSelectedItem().toString();

        Bitmap bmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();

        Drawable car11 = getResources().getDrawable(R.drawable.car11); Drawable car12 = getResources().getDrawable(R.drawable.car12);
        Drawable car13 = getResources().getDrawable(R.drawable.car13); Drawable car14 = getResources().getDrawable(R.drawable.car14);
        Drawable car15 = getResources().getDrawable(R.drawable.car15); Drawable car16 = getResources().getDrawable(R.drawable.car16);
        Drawable car17 = getResources().getDrawable(R.drawable.car17); Drawable car18 = getResources().getDrawable(R.drawable.car18);
        Drawable car19 = getResources().getDrawable(R.drawable.car19); Drawable car20 = getResources().getDrawable(R.drawable.car20);

        Bitmap img1 = ((BitmapDrawable)car11).getBitmap(); Bitmap img2 = ((BitmapDrawable)car12).getBitmap();
        Bitmap img3 = ((BitmapDrawable)car13).getBitmap(); Bitmap img4 = ((BitmapDrawable)car14).getBitmap();
        Bitmap img5 = ((BitmapDrawable)car15).getBitmap(); Bitmap img6 = ((BitmapDrawable)car16).getBitmap();
        Bitmap img7 = ((BitmapDrawable)car17).getBitmap(); Bitmap img8 = ((BitmapDrawable)car18).getBitmap();
        Bitmap img9 = ((BitmapDrawable)car19).getBitmap(); Bitmap img10 = ((BitmapDrawable)car20).getBitmap();

        if (bmap.sameAs(img1) || bmap.sameAs(img2) || bmap.sameAs(img3) || bmap.sameAs(img4) || bmap.sameAs(img5)
                || bmap.sameAs(img6) || bmap.sameAs(img7) || bmap.sameAs(img8) || bmap.sameAs(img9) || bmap.sameAs(img10)){
            if (!spinnerValue.equals("Bentley")) {
                wrongGuess("Bentley");
            }
            if (spinnerValue.equals("Bentley")){
                return true;
            }
        }
        return false;
    }

    public boolean BMW(){
        Spinner dropDown = (Spinner) findViewById(R.id.dropDown);
        String spinnerValue = dropDown.getSelectedItem().toString();

        Bitmap bmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();

        Drawable car1 = getResources().getDrawable(R.drawable.car21); Drawable car2 = getResources().getDrawable(R.drawable.car22);
        Drawable car3 = getResources().getDrawable(R.drawable.car23); Drawable car4 = getResources().getDrawable(R.drawable.car24);
        Drawable car5 = getResources().getDrawable(R.drawable.car25); Drawable car6 = getResources().getDrawable(R.drawable.car26);
        Drawable car7 = getResources().getDrawable(R.drawable.car27); Drawable car8 = getResources().getDrawable(R.drawable.car28);
        Drawable car9 = getResources().getDrawable(R.drawable.car29); Drawable car10 = getResources().getDrawable(R.drawable.car30);

        Bitmap img1 = ((BitmapDrawable)car1).getBitmap(); Bitmap img2 = ((BitmapDrawable)car2).getBitmap();
        Bitmap img3 = ((BitmapDrawable)car3).getBitmap(); Bitmap img4 = ((BitmapDrawable)car4).getBitmap();
        Bitmap img5 = ((BitmapDrawable)car5).getBitmap(); Bitmap img6 = ((BitmapDrawable)car6).getBitmap();
        Bitmap img7 = ((BitmapDrawable)car7).getBitmap(); Bitmap img8 = ((BitmapDrawable)car8).getBitmap();
        Bitmap img9 = ((BitmapDrawable)car9).getBitmap(); Bitmap img10 = ((BitmapDrawable)car10).getBitmap();

        if (bmap.sameAs(img1) || bmap.sameAs(img2) || bmap.sameAs(img3) || bmap.sameAs(img4) || bmap.sameAs(img5)
                || bmap.sameAs(img6) || bmap.sameAs(img7) || bmap.sameAs(img8) || bmap.sameAs(img9) || bmap.sameAs(img10)){
            if (!spinnerValue.equals("BMW")) {
                wrongGuess("BMW");
            }
            if (spinnerValue.equals("BMW")){
                return true;
            }
        }
        return false;
    }

    public boolean Fiat(){
        Spinner dropDown = (Spinner) findViewById(R.id.dropDown);
        String spinnerValue = dropDown.getSelectedItem().toString();

        Bitmap bmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();

        Drawable car1 = getResources().getDrawable(R.drawable.car31); Drawable car2 = getResources().getDrawable(R.drawable.car32);
        Drawable car3 = getResources().getDrawable(R.drawable.car33); Drawable car4 = getResources().getDrawable(R.drawable.car34);
        Drawable car5 = getResources().getDrawable(R.drawable.car35); Drawable car6 = getResources().getDrawable(R.drawable.car36);
        Drawable car7 = getResources().getDrawable(R.drawable.car37); Drawable car8 = getResources().getDrawable(R.drawable.car38);
        Drawable car9 = getResources().getDrawable(R.drawable.car39); Drawable car10 = getResources().getDrawable(R.drawable.car40);

        Bitmap img1 = ((BitmapDrawable)car1).getBitmap(); Bitmap img2 = ((BitmapDrawable)car2).getBitmap();
        Bitmap img3 = ((BitmapDrawable)car3).getBitmap(); Bitmap img4 = ((BitmapDrawable)car4).getBitmap();
        Bitmap img5 = ((BitmapDrawable)car5).getBitmap(); Bitmap img6 = ((BitmapDrawable)car6).getBitmap();
        Bitmap img7 = ((BitmapDrawable)car7).getBitmap(); Bitmap img8 = ((BitmapDrawable)car8).getBitmap();
        Bitmap img9 = ((BitmapDrawable)car9).getBitmap(); Bitmap img10 = ((BitmapDrawable)car10).getBitmap();

        if (bmap.sameAs(img1) || bmap.sameAs(img2) || bmap.sameAs(img3) || bmap.sameAs(img4) || bmap.sameAs(img5)
                || bmap.sameAs(img6) || bmap.sameAs(img7) || bmap.sameAs(img8) || bmap.sameAs(img9) || bmap.sameAs(img10)){
            if (!spinnerValue.equals("Fiat")) {
                wrongGuess("Fiat");
            }
            if (spinnerValue.equals("Fiat")){
                return true;
            }
        }
        return false;
    }

    public boolean Ford(){
        Spinner dropDown = (Spinner) findViewById(R.id.dropDown);
        String spinnerValue = dropDown.getSelectedItem().toString();

        Bitmap bmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();

        Drawable car1 = getResources().getDrawable(R.drawable.car41); Drawable car2 = getResources().getDrawable(R.drawable.car42);
        Drawable car3 = getResources().getDrawable(R.drawable.car43); Drawable car4 = getResources().getDrawable(R.drawable.car44);
        Drawable car5 = getResources().getDrawable(R.drawable.car45); Drawable car6 = getResources().getDrawable(R.drawable.car46);
        Drawable car7 = getResources().getDrawable(R.drawable.car47); Drawable car8 = getResources().getDrawable(R.drawable.car48);
        Drawable car9 = getResources().getDrawable(R.drawable.car49); Drawable car10 = getResources().getDrawable(R.drawable.car50);

        Bitmap img1 = ((BitmapDrawable)car1).getBitmap(); Bitmap img2 = ((BitmapDrawable)car2).getBitmap();
        Bitmap img3 = ((BitmapDrawable)car3).getBitmap(); Bitmap img4 = ((BitmapDrawable)car4).getBitmap();
        Bitmap img5 = ((BitmapDrawable)car5).getBitmap(); Bitmap img6 = ((BitmapDrawable)car6).getBitmap();
        Bitmap img7 = ((BitmapDrawable)car7).getBitmap(); Bitmap img8 = ((BitmapDrawable)car8).getBitmap();
        Bitmap img9 = ((BitmapDrawable)car9).getBitmap(); Bitmap img10 = ((BitmapDrawable)car10).getBitmap();

        if (bmap.sameAs(img1) || bmap.sameAs(img2) || bmap.sameAs(img3) || bmap.sameAs(img4) || bmap.sameAs(img5)
                || bmap.sameAs(img6) || bmap.sameAs(img7) || bmap.sameAs(img8) || bmap.sameAs(img9) || bmap.sameAs(img10)){
            if (!spinnerValue.equals("Ford")) {
                wrongGuess("Ford");
            }
            if (spinnerValue.equals("Ford")){
                return true;
            }
        }
        return false;
    }

    public boolean Honda(){
        Spinner dropDown = (Spinner) findViewById(R.id.dropDown);
        String spinnerValue = dropDown.getSelectedItem().toString();

        Bitmap bmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();

        Drawable car1 = getResources().getDrawable(R.drawable.car51); Drawable car2 = getResources().getDrawable(R.drawable.car52);
        Drawable car3 = getResources().getDrawable(R.drawable.car53); Drawable car4 = getResources().getDrawable(R.drawable.car54);
        Drawable car5 = getResources().getDrawable(R.drawable.car55); Drawable car6 = getResources().getDrawable(R.drawable.car56);
        Drawable car7 = getResources().getDrawable(R.drawable.car57); Drawable car8 = getResources().getDrawable(R.drawable.car58);
        Drawable car9 = getResources().getDrawable(R.drawable.car59); Drawable car10 = getResources().getDrawable(R.drawable.car60);

        Bitmap img1 = ((BitmapDrawable)car1).getBitmap(); Bitmap img2 = ((BitmapDrawable)car2).getBitmap();
        Bitmap img3 = ((BitmapDrawable)car3).getBitmap(); Bitmap img4 = ((BitmapDrawable)car4).getBitmap();
        Bitmap img5 = ((BitmapDrawable)car5).getBitmap(); Bitmap img6 = ((BitmapDrawable)car6).getBitmap();
        Bitmap img7 = ((BitmapDrawable)car7).getBitmap(); Bitmap img8 = ((BitmapDrawable)car8).getBitmap();
        Bitmap img9 = ((BitmapDrawable)car9).getBitmap(); Bitmap img10 = ((BitmapDrawable)car10).getBitmap();

        if (bmap.sameAs(img1) || bmap.sameAs(img2) || bmap.sameAs(img3) || bmap.sameAs(img4) || bmap.sameAs(img5)
                || bmap.sameAs(img6) || bmap.sameAs(img7) || bmap.sameAs(img8) || bmap.sameAs(img9) || bmap.sameAs(img10)){
            if (!spinnerValue.equals("Honda")) {
                wrongGuess("Honda");
            }
            if (spinnerValue.equals("Honda")){
                return true;
            }
        }
        return false;
    }

    public boolean Hyundai(){
        Spinner dropDown = (Spinner) findViewById(R.id.dropDown);
        String spinnerValue = dropDown.getSelectedItem().toString();

        Bitmap bmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();

        Drawable car1 = getResources().getDrawable(R.drawable.car61); Drawable car2 = getResources().getDrawable(R.drawable.car62);
        Drawable car3 = getResources().getDrawable(R.drawable.car63); Drawable car4 = getResources().getDrawable(R.drawable.car64);
        Drawable car5 = getResources().getDrawable(R.drawable.car65); Drawable car6 = getResources().getDrawable(R.drawable.car66);
        Drawable car7 = getResources().getDrawable(R.drawable.car67); Drawable car8 = getResources().getDrawable(R.drawable.car68);
        Drawable car9 = getResources().getDrawable(R.drawable.car69); Drawable car10 = getResources().getDrawable(R.drawable.car70);

        Bitmap img1 = ((BitmapDrawable)car1).getBitmap(); Bitmap img2 = ((BitmapDrawable)car2).getBitmap();
        Bitmap img3 = ((BitmapDrawable)car3).getBitmap(); Bitmap img4 = ((BitmapDrawable)car4).getBitmap();
        Bitmap img5 = ((BitmapDrawable)car5).getBitmap(); Bitmap img6 = ((BitmapDrawable)car6).getBitmap();
        Bitmap img7 = ((BitmapDrawable)car7).getBitmap(); Bitmap img8 = ((BitmapDrawable)car8).getBitmap();
        Bitmap img9 = ((BitmapDrawable)car9).getBitmap(); Bitmap img10 = ((BitmapDrawable)car10).getBitmap();

        if (bmap.sameAs(img1) || bmap.sameAs(img2) || bmap.sameAs(img3) || bmap.sameAs(img4) || bmap.sameAs(img5)
                || bmap.sameAs(img6) || bmap.sameAs(img7) || bmap.sameAs(img8) || bmap.sameAs(img9) || bmap.sameAs(img10)){
            if (!spinnerValue.equals("Hyundai")) {
                wrongGuess("Hyundai");
            }
            if (spinnerValue.equals("Hyundai")){
                return true;
            }
        }
        return false;
    }

    public boolean Jaguar(){
        Spinner dropDown = (Spinner) findViewById(R.id.dropDown);
        String spinnerValue = dropDown.getSelectedItem().toString();

        Bitmap bmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();

        Drawable car1 = getResources().getDrawable(R.drawable.car71); Drawable car2 = getResources().getDrawable(R.drawable.car72);
        Drawable car3 = getResources().getDrawable(R.drawable.car73); Drawable car4 = getResources().getDrawable(R.drawable.car74);
        Drawable car5 = getResources().getDrawable(R.drawable.car75); Drawable car6 = getResources().getDrawable(R.drawable.car76);
        Drawable car7 = getResources().getDrawable(R.drawable.car77); Drawable car8 = getResources().getDrawable(R.drawable.car78);
        Drawable car9 = getResources().getDrawable(R.drawable.car79); Drawable car10 = getResources().getDrawable(R.drawable.car80);

        Bitmap img1 = ((BitmapDrawable)car1).getBitmap(); Bitmap img2 = ((BitmapDrawable)car2).getBitmap();
        Bitmap img3 = ((BitmapDrawable)car3).getBitmap(); Bitmap img4 = ((BitmapDrawable)car4).getBitmap();
        Bitmap img5 = ((BitmapDrawable)car5).getBitmap(); Bitmap img6 = ((BitmapDrawable)car6).getBitmap();
        Bitmap img7 = ((BitmapDrawable)car7).getBitmap(); Bitmap img8 = ((BitmapDrawable)car8).getBitmap();
        Bitmap img9 = ((BitmapDrawable)car9).getBitmap(); Bitmap img10 = ((BitmapDrawable)car10).getBitmap();

        if (bmap.sameAs(img1) || bmap.sameAs(img2) || bmap.sameAs(img3) || bmap.sameAs(img4) || bmap.sameAs(img5)
                || bmap.sameAs(img6) || bmap.sameAs(img7) || bmap.sameAs(img8) || bmap.sameAs(img9) || bmap.sameAs(img10)){
            if (!spinnerValue.equals("Jaguar")) {
                wrongGuess("Jaguar");
            }
            if (spinnerValue.equals("Jaguar")){
                return true;
            }
        }
        return false;
    }

    public boolean Mercedes_Benz(){
        Spinner dropDown = (Spinner) findViewById(R.id.dropDown);
        String spinnerValue = dropDown.getSelectedItem().toString();

        Bitmap bmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();

        Drawable car1 = getResources().getDrawable(R.drawable.car81); Drawable car2 = getResources().getDrawable(R.drawable.car82);
        Drawable car3 = getResources().getDrawable(R.drawable.car83); Drawable car4 = getResources().getDrawable(R.drawable.car84);
        Drawable car5 = getResources().getDrawable(R.drawable.car85); Drawable car6 = getResources().getDrawable(R.drawable.car86);
        Drawable car7 = getResources().getDrawable(R.drawable.car87); Drawable car8 = getResources().getDrawable(R.drawable.car88);
        Drawable car9 = getResources().getDrawable(R.drawable.car89); Drawable car10 = getResources().getDrawable(R.drawable.car90);

        Bitmap img1 = ((BitmapDrawable)car1).getBitmap(); Bitmap img2 = ((BitmapDrawable)car2).getBitmap();
        Bitmap img3 = ((BitmapDrawable)car3).getBitmap(); Bitmap img4 = ((BitmapDrawable)car4).getBitmap();
        Bitmap img5 = ((BitmapDrawable)car5).getBitmap(); Bitmap img6 = ((BitmapDrawable)car6).getBitmap();
        Bitmap img7 = ((BitmapDrawable)car7).getBitmap(); Bitmap img8 = ((BitmapDrawable)car8).getBitmap();
        Bitmap img9 = ((BitmapDrawable)car9).getBitmap(); Bitmap img10 = ((BitmapDrawable)car10).getBitmap();

        if (bmap.sameAs(img1) || bmap.sameAs(img2) || bmap.sameAs(img3) || bmap.sameAs(img4) || bmap.sameAs(img5)
                || bmap.sameAs(img6) || bmap.sameAs(img7) || bmap.sameAs(img8) || bmap.sameAs(img9) || bmap.sameAs(img10)){
            if (!spinnerValue.equals("Mercedes Benz")) {
                wrongGuess("Mercedes Benz");
            }
            if (spinnerValue.equals("Mercedes Benz")){
                return true;
            }
        }
        return false;
    }

    public boolean Toyota(){
        Spinner dropDown = (Spinner) findViewById(R.id.dropDown);
        String spinnerValue = dropDown.getSelectedItem().toString();

        Bitmap bmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();

        Drawable car1 = getResources().getDrawable(R.drawable.car91); Drawable car2 = getResources().getDrawable(R.drawable.car92);
        Drawable car3 = getResources().getDrawable(R.drawable.car93); Drawable car4 = getResources().getDrawable(R.drawable.car94);
        Drawable car5 = getResources().getDrawable(R.drawable.car95); Drawable car6 = getResources().getDrawable(R.drawable.car96);
        Drawable car7 = getResources().getDrawable(R.drawable.car97); Drawable car8 = getResources().getDrawable(R.drawable.car98);
        Drawable car9 = getResources().getDrawable(R.drawable.car99); Drawable car10 = getResources().getDrawable(R.drawable.car100);

        Bitmap img1 = ((BitmapDrawable)car1).getBitmap(); Bitmap img2 = ((BitmapDrawable)car2).getBitmap();
        Bitmap img3 = ((BitmapDrawable)car3).getBitmap(); Bitmap img4 = ((BitmapDrawable)car4).getBitmap();
        Bitmap img5 = ((BitmapDrawable)car5).getBitmap(); Bitmap img6 = ((BitmapDrawable)car6).getBitmap();
        Bitmap img7 = ((BitmapDrawable)car7).getBitmap(); Bitmap img8 = ((BitmapDrawable)car8).getBitmap();
        Bitmap img9 = ((BitmapDrawable)car9).getBitmap(); Bitmap img10 = ((BitmapDrawable)car10).getBitmap();

        if (bmap.sameAs(img1) || bmap.sameAs(img2) || bmap.sameAs(img3) || bmap.sameAs(img4) || bmap.sameAs(img5)
                || bmap.sameAs(img6) || bmap.sameAs(img7) || bmap.sameAs(img8) || bmap.sameAs(img9) || bmap.sameAs(img10)){
            if (!spinnerValue.equals("Toyota")) {
                wrongGuess("Toyota");
            }
            if (spinnerValue.equals("Toyota")){
                return true;
            }
        }
        return false;
    }

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
        countDownTimer = findViewById(R.id.countDownTimer);

        new CountDownTimer(10000, 1000){ // 10 sec countdown with 1 second interval

            @Override
            public void onTick(long millisUntilFinished) { //Callback fired on regular interval
                countDownTimer.setText(String.valueOf(counter)); // Sets the current value of the timer/counter to the textView
                counter--;
            }

            @Override
            public void onFinish() { //Callback fired when the time is up.
                countDownTimer.setText("Finish");
                mainFunction(); //Calls to see if the current value of the spinner matches the current image.
            }
        }.start();
    }
}