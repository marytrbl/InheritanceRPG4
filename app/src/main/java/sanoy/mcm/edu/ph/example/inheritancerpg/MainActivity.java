package sanoy.mcm.edu.ph.example.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner tankspnr,magespnr,marksmanspnr,roguespnr,supportspnr,monsterspnr;
    Spinner HeroClass;
    String tankstrng,magestrng,marksstring,roguestrng,supportstrng;
    String hroclassstrng;

    ImageView archerimage,barbarianimage,knightimage,riflemanimage, assassinimage, ninjaimage, necroimage, enchanterimage, healerimage, priestimage;
    Button button, herobtn, monsterbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText heroLvl = findViewById(R.id.inputlvl);
        button=findViewById(R.id.button);
        herobtn=findViewById(R.id.herobtn);
        monsterbtn=findViewById(R.id.monsterbtn);

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
        assassinimage=findViewById(R.id.assassinimage);
        ninjaimage=findViewById(R.id.ninjaimage);
        necroimage=findViewById(R.id.necroimage);
        priestimage=findViewById(R.id.priestimage);
        healerimage=findViewById(R.id.healerimage);
        enchanterimage=findViewById(R.id.enchanterimage);

        archerimage.setVisibility(View.GONE);
        riflemanimage.setVisibility(View.GONE);
        barbarianimage.setVisibility(View.GONE);
        knightimage.setVisibility(View.GONE);
        assassinimage.setVisibility(View.GONE);
        ninjaimage.setVisibility(View.GONE);
        necroimage.setVisibility(View.GONE);
        priestimage.setVisibility(View.GONE);
        healerimage.setVisibility(View.GONE);
        enchanterimage.setVisibility(View.GONE);

        HeroClass.setVisibility(View.GONE);
        marksmanspnr.setVisibility(View.GONE);
        supportspnr.setVisibility(View.GONE);
        tankspnr.setVisibility(View.GONE);
        roguespnr.setVisibility(View.GONE);
        magespnr.setVisibility(View.GONE);
        button.setVisibility(View.GONE);
        heroLvl.setVisibility(View.GONE);

        herobtn.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    herobtn.setVisibility(View.GONE);
                    monsterbtn.setVisibility(View.GONE);
                    HeroClass.setVisibility(View.VISIBLE);
                    marksmanspnr.setVisibility(View.VISIBLE);
                    supportspnr.setVisibility(View.VISIBLE);
                    tankspnr.setVisibility(View.VISIBLE);
                    roguespnr.setVisibility(View.VISIBLE);
                    magespnr.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    heroLvl.setVisibility(View.VISIBLE);
                }
            }
        );


        HeroClass.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                       hroclassstrng=HeroClass.getSelectedItem().toString();

                        if (hroclassstrng.equals("Tank")) {
                            marksmanspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.GONE);
                            tankspnr.setVisibility(View.VISIBLE);
                            roguespnr.setVisibility(View.GONE);
                            magespnr.setVisibility(View.GONE);
                            knightimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (hroclassstrng.equals("Marksman")) {
                            marksmanspnr.setVisibility(View.VISIBLE);
                            supportspnr.setVisibility(View.GONE);
                            tankspnr.setVisibility(View.GONE);
                            roguespnr.setVisibility(View.GONE);
                            magespnr.setVisibility(View.GONE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.VISIBLE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (hroclassstrng.equals("Mage")) {
                            marksmanspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.GONE);
                            tankspnr.setVisibility(View.GONE);
                            roguespnr.setVisibility(View.GONE);
                            magespnr.setVisibility(View.VISIBLE);
                            priestimage.setVisibility(View.GONE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.VISIBLE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (hroclassstrng.equals("Rogue")) {
                            marksmanspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.GONE);
                            tankspnr.setVisibility(View.GONE);
                            roguespnr.setVisibility(View.VISIBLE);
                            magespnr.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (hroclassstrng.equals("Support")) {
                            marksmanspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.VISIBLE);
                            tankspnr.setVisibility(View.GONE);
                            roguespnr.setVisibility(View.GONE);
                            magespnr.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.VISIBLE);
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
                        if (tankstrng.equals("Barbarian")) {
                            barbarianimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);

                        }
                        else if (tankstrng.equals("Knight")) {
                            knightimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
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
                        if (marksstring.equals("Archer")) {
                            archerimage.setVisibility(View.VISIBLE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (marksstring.equals("Ranger")) {
                            riflemanimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
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
                        if (magestrng.equals("Priest")) {
                            priestimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (magestrng.equals("Necromancer")) {
                            necroimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
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
                        if (roguestrng.equals("Assassin")) {
                            assassinimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
                        }
                        else if (roguestrng.equals("Ninja")) {
                            ninjaimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
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
                        if (supportstrng.equals("Enchanter")) {
                            enchanterimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            healerimage.setVisibility(View.GONE);
                        }
                        else if (supportstrng.equals("Healer")) {
                            healerimage.setVisibility(View.VISIBLE);
                            archerimage.setVisibility(View.GONE);
                            riflemanimage.setVisibility(View.GONE);
                            barbarianimage.setVisibility(View.GONE);
                            knightimage.setVisibility(View.GONE);
                            assassinimage.setVisibility(View.GONE);
                            ninjaimage.setVisibility(View.GONE);
                            necroimage.setVisibility(View.GONE);
                            priestimage.setVisibility(View.GONE);
                            enchanterimage.setVisibility(View.GONE);
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
                        if((heroLvl.getText().toString()==null || heroLvl.getText().toString().trim().equals(""))) {
                            Toast.makeText(MainActivity.this,
                                    "Invalid level value",
                                    Toast.LENGTH_LONG).show();
                        }
                        else {
                            Intent i = new Intent(MainActivity.this, Main2Activity.class);
                            i.putExtra("Tank", hroclassstrng);
                            i.putExtra("Mage", hroclassstrng);
                            i.putExtra("Rogue", hroclassstrng);
                            i.putExtra("Marksman", hroclassstrng);
                            i.putExtra("Support", hroclassstrng);
                            i.putExtra("Barbarian", tankstrng);
                            i.putExtra("Knight", tankstrng);
                            i.putExtra("Necromancer", magestrng);
                            i.putExtra("Priest", magestrng);
                            i.putExtra("Archer",marksstring);
                            i.putExtra("Ranger",marksstring);
                            i.putExtra("Assassin", roguestrng);
                            i.putExtra("Ninja", roguestrng);
                            i.putExtra("Healer", supportstrng);
                            i.putExtra("Enchanter", supportstrng);
                            i.putExtra("level", heroLvl.getText().toString());
                            startActivity(i);
                        }
                    }
                }
        );

    }
}
