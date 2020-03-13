package sanoy.mcm.edu.ph.example.inheritancerpg4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner tankspnr,magespnr,marksmanspnr,roguespnr,supportspnr,monsterspnr;
    Spinner HeroClass;
    String tankstrng,magestrng,marksstring,roguestrng,supportstrng;
    String hroclassstrng;

    ImageView archerimage,barbarianimage,knightimage,riflemanimage;

    EditText lvl;
    TextView cls;
    TextView mainclass;
    TextView gerome;
    TextView Manapoints;
    TextView pAtk;
    TextView mAtk;
    TextView pDef;
    TextView mDef;
    TextView baseSTR;
    TextView baseAGI;
    TextView baseINT;
    TextView strGrowth;
    TextView basedex;
    TextView Healthpoints;
    Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        button=findViewById(R.id.button);

      //  btnknght=findViewById(R.id.buttonknght);



        magespnr=findViewById(R.id.magesubclass);
        marksmanspnr=findViewById(R.id.marksmansubclass);
        roguespnr=findViewById(R.id.roguesubclass);
        supportspnr=findViewById(R.id.supportsubclass);
        tankspnr=findViewById(R.id.tanksubclass);
        HeroClass=findViewById(R.id.Heroclass);

        archerimage=findViewById(R.id.archerimage);
        barbarianimage=findViewById(R.id.barbarianimage);
        knightimage=findViewById(R.id.knightimage);
        riflemanimage=findViewById(R.id.riflemanimage);


        archerimage.setVisibility(View.GONE);
        riflemanimage.setVisibility(View.GONE);
        barbarianimage.setVisibility(View.GONE);
        knightimage.setVisibility(View.GONE);



        HeroClass.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                       hroclassstrng=HeroClass.getSelectedItem().toString();

                        if (hroclassstrng.equals("tank")) {
                            marksmanspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.GONE);
                            tankspnr.setVisibility(View.VISIBLE);
                            roguespnr.setVisibility(View.GONE);
                            magespnr.setVisibility(View.GONE);


                        }
                        else if (hroclassstrng.equals("marksman")) {
                            marksmanspnr.setVisibility(View.VISIBLE);
                            supportspnr.setVisibility(View.GONE);
                            tankspnr.setVisibility(View.GONE);
                            roguespnr.setVisibility(View.GONE);
                            magespnr.setVisibility(View.GONE);


                        }
                        else if (hroclassstrng.equals("mage")) {
                            marksmanspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.GONE);
                            tankspnr.setVisibility(View.GONE);
                            roguespnr.setVisibility(View.GONE);
                            magespnr.setVisibility(View.VISIBLE);

                        }
                        else if (hroclassstrng.equals("rogue")) {
                            marksmanspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.GONE);
                            tankspnr.setVisibility(View.GONE);
                            roguespnr.setVisibility(View.VISIBLE);
                            magespnr.setVisibility(View.GONE);
                        }
                        else if (hroclassstrng.equals("support")) {
                            marksmanspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.VISIBLE);
                            tankspnr.setVisibility(View.GONE);
                            roguespnr.setVisibility(View.GONE);
                            magespnr.setVisibility(View.GONE);
                        }

                        else if (hroclassstrng.equals("monster")) {
                            marksmanspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.GONE);
                            tankspnr.setVisibility(View.GONE);
                            roguespnr.setVisibility(View.GONE);
                            magespnr.setVisibility(View.GONE);
                        }


                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );


        tankspnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        tankstrng=tankspnr.getSelectedItem().toString();

                        if (tankstrng.equals("barbarian")) {


                        }
                        else if (tankstrng.equals("knight")) {

                        }

                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );

        marksmanspnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        marksstring=marksmanspnr.getSelectedItem().toString();


                        if (marksstring.equals("archer")) {

                        }
                        else if (marksstring.equals("rifleman")) {

                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );
        magespnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        magestrng=magespnr.getSelectedItem().toString();

                        if (magestrng.equals("priest")) {

                        }
                        else if (magestrng.equals("necromancer")) {

                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        roguespnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        roguestrng=roguespnr.getSelectedItem().toString();
                        if (roguestrng.equals("assassin")) {

                        }
                        else if (roguestrng.equals("ninja")) {

                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        supportspnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        supportstrng=supportspnr.getSelectedItem().toString();

                        if (supportstrng.equals("assassin")) {

                        }
                        else if (roguestrng.equals("ninja")) {

                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );



        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent (MainActivity.this,Herodisplay.class);



                        i.putExtra("barbarian", tankstrng);
                        i.putExtra("archer", marksstring);
                        i.putExtra("priest",magestrng);
                        i.putExtra("assassin",roguestrng);
                        i.putExtra("enchanter",supportstrng);
                        i.putExtra("monster",hroclassstrng);

                        startActivity(i);


                    }
                }
        );

    }
}
