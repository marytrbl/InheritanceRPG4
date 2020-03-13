package sanoy.mcm.edu.ph.example.inheritancerpg4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Herodisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herodisplay);

        // XML TO JAVA
        final EditText callLevel = findViewById(R.id.heroLevel);
        TextView callLevelCheck = findViewById(R.id.heroLevelCheck);
        TextView callName = findViewById(R.id.heroName);
        TextView callClass = findViewById(R.id.heroClass);
        TextView callID = findViewById(R.id.heroID);

        final TextView callHP1 = findViewById(R.id.health1);
        final TextView callHP2 = findViewById(R.id.health2);
        final TextView callMP1 = findViewById(R.id.mana1);
        final TextView callMP2 = findViewById(R.id.mana2);

        final TextView callStr = findViewById(R.id.strength);
        final TextView callAgi = findViewById(R.id.agility);
        final TextView callInt = findViewById(R.id.intelligence);

        final TextView callAttackDamageMin = findViewById(R.id.attackDamageMin);
        final TextView callAttackDamageMax = findViewById(R.id.attackDamageMax);
        final TextView callSpellDamage = findViewById(R.id.spellDamage);

        // CONSTRUCTOR
        String hero_class = "Tank";
        String hero_class2 = "Mage";
        String hero_class3 = "Marksman";
        String hero_class4 = "Rogue";
        String hero_class5 = "Support";


        String name = "Barbarian";
        String name2 = "Knight";
        String name3 = "Archer";
        String name4 = "Rifleman";
        String name5 = "Priest";
        String name6 = "Necromancer";
        String name7= "Assassin";
        String name8 = "Ninja";
        String name9 = "Enchanter";
        String name10 = "Healer";

        String barbsub = getIntent().getStringExtra("barbarian");
        String mrksmn=getIntent().getStringExtra("archer");
        String maje=getIntent().getStringExtra("priest");
        String roug=getIntent().getStringExtra("assassin");
        String suport=getIntent().getStringExtra("enchanter");
        String mnster=getIntent().getStringExtra("monster");


        int id = 2018102602;
        int level = 1;
        double strength = 10;
        double agility = 10;
        double intelligence = 10;

        final Hero h1 = new Hero(hero_class, name, id, level, strength, agility, intelligence);
        final Hero h2 = new Hero(hero_class, name, id, level, strength, agility, intelligence);
        final Hero h3 = new Hero(hero_class, name, id, level, strength, agility, intelligence);
        final Hero h4 = new Hero(hero_class, name, id, level, strength, agility, intelligence);
        final Hero h5 = new Hero(hero_class, name, id, level, strength, agility, intelligence);
        final Hero h6 = new Hero(hero_class, name, id, level, strength, agility, intelligence);
        final Hero h7 = new Hero(hero_class, name, id, level, strength, agility, intelligence);
        final Hero h8 = new Hero(hero_class, name, id, level, strength, agility, intelligence);
        final Hero h9 = new Hero(hero_class, name, id, level, strength, agility, intelligence);
        final Hero h10 = new Hero(hero_class, name, id, level, strength, agility, intelligence);





        if(barbsub.equals("barbarian")) {
            // GETTERS & SETTERS
                                    h1.setHeroClass("Tank");
                                    callClass.setText(h1.getHeroClass());

                                    h1.setHeroName("Barbarian");
                                    callName.setText(h1.getHeroName());

                                    h1.setHeroID(1);
                                    callID.setText(String.valueOf(h4.getHeroID()));

                                    h1.setHeroLevel(1);
                                    callLevel.setText(String.valueOf(h4.getHeroLevel()));

                                    h1.heroStat(20, 10, 10);
                                    callStr.setText(String.valueOf((Math.round(h1.computeStrength()))));
                                    callAgi.setText(String.valueOf(Math.round(h1.computeAgility())));
                                    callInt.setText(String.valueOf(Math.round(h1.computeIntelligence())));

                                    callHP1.setText(String.valueOf(Math.round(h1.computeHealth())));
                                    callHP2.setText(String.valueOf(Math.round(h1.computeHealth())));
                                    callMP1.setText(String.valueOf(Math.round(h1.computeMana())));
                                    callMP2.setText(String.valueOf(Math.round(h1.computeMana())));

                                    callAttackDamageMin.setText(String.valueOf(Math.round(h1.computePhysicalDamageMin())));
                                    callAttackDamageMax.setText(String.valueOf(Math.round(h1.computePhysicalDamageMax())));
                                    callSpellDamage.setText(String.valueOf(Math.round(h1.computeMagicDamage())));

                                    callLevelCheck.setOnClickListener(
                                            new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    int i = Integer.parseInt(String.valueOf(callLevel.getText()));
                                                    h1.setHeroLevel(i);
                                                    callLevel.setText(String.valueOf(h1.getHeroLevel()));

                                                    if ((h1.getHeroLevel() >= 1) && (h1.getHeroLevel() <= 30)) {
                                                        h1.heroStat(20, 34, 14);
                                                        callStr.setText(String.valueOf((Math.round(h4.computeStrength()))));
                                                        callAgi.setText(String.valueOf(Math.round(h4.computeAgility())));
                                                        callInt.setText(String.valueOf(Math.round(h4.computeIntelligence())));

                                                        callHP1.setText(String.valueOf(Math.round(h1.computeHealth())));
                                                        callHP2.setText(String.valueOf(Math.round(h1.computeHealth())));
                                                        callMP1.setText(String.valueOf(Math.round(h1.computeMana())));
                                                        callMP2.setText(String.valueOf(Math.round(h1.computeMana())));

                                                        callAttackDamageMin.setText(String.valueOf(Math.round(h1.computePhysicalDamageMin())));
                                                        callAttackDamageMax.setText(String.valueOf(Math.round(h1.computePhysicalDamageMax())));
                                                        callSpellDamage.setText(String.valueOf(Math.round(h1.computeMagicDamage())));
                                                    } else {
                                                        Toast.makeText(Herodisplay.this,
                                                                "Invalid level value",
                                                                Toast.LENGTH_LONG).show();
                                                    }
                                                }
                                            }
                                    );
                        }

        else if (barbsub.equals("knight")){
                                // GETTERS & SETTERS
                                h2.setHeroClass("Tank");
                                callClass.setText(h2.getHeroClass());

                                h2.setHeroName("Knight");
                                callName.setText(h2.getHeroName());

                                h2.setHeroID(2);
                                callID.setText(String.valueOf(h2.getHeroID()));

                                h2.setHeroLevel(1);
                                callLevel.setText(String.valueOf(h4.getHeroLevel()));

                                h2.heroStat(10, 20, 10);
                                callStr.setText(String.valueOf((Math.round(h2.computeStrength()))));
                                callAgi.setText(String.valueOf(Math.round(h2.computeAgility())));
                                callInt.setText(String.valueOf(Math.round(h2.computeIntelligence())));

                                callHP1.setText(String.valueOf(Math.round(h2.computeHealth())));
                                callHP2.setText(String.valueOf(Math.round(h2.computeHealth())));
                                callMP1.setText(String.valueOf(Math.round(h2.computeMana())));
                                callMP2.setText(String.valueOf(Math.round(h2.computeMana())));

                                callAttackDamageMin.setText(String.valueOf(Math.round(h2.computePhysicalDamageMin())));
                                callAttackDamageMax.setText(String.valueOf(Math.round(h2.computePhysicalDamageMax())));
                                callSpellDamage.setText(String.valueOf(Math.round(h2.computeMagicDamage())));

                                callLevelCheck.setOnClickListener(
                                        new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                int i = Integer.parseInt(String.valueOf(callLevel.getText()));
                                                h2.setHeroLevel(i);
                                                callLevel.setText(String.valueOf(h2.getHeroLevel()));

                                                if ((h2.getHeroLevel() >= 1) && (h2.getHeroLevel() <= 30)) {
                                                    h2.heroStat(20, 34, 14);
                                                    callStr.setText(String.valueOf((Math.round(h2.computeStrength()))));
                                                    callAgi.setText(String.valueOf(Math.round(h2.computeAgility())));
                                                    callInt.setText(String.valueOf(Math.round(h2.computeIntelligence())));

                                                    callHP1.setText(String.valueOf(Math.round(h2.computeHealth())));
                                                    callHP2.setText(String.valueOf(Math.round(h2.computeHealth())));
                                                    callMP1.setText(String.valueOf(Math.round(h2.computeMana())));
                                                    callMP2.setText(String.valueOf(Math.round(h2.computeMana())));

                                                    callAttackDamageMin.setText(String.valueOf(Math.round(h2.computePhysicalDamageMin())));
                                                    callAttackDamageMax.setText(String.valueOf(Math.round(h2.computePhysicalDamageMax())));
                                                    callSpellDamage.setText(String.valueOf(Math.round(h2.computeMagicDamage())));
                                                } else {
                                                    Toast.makeText(Herodisplay.this,
                                                            "Invalid level value",
                                                            Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        }
                                );
                            }

   else if(mrksmn.equals("archer")){
                                        // GETTERS & SETTERS
                                        h3.setHeroClass("Marksman");
                                        callClass.setText(h3.getHeroClass());

                                        h3.setHeroName("Archer");
                                        callName.setText(h3.getHeroName());

                                        h3.setHeroID(3);
                                        callID.setText(String.valueOf(h3.getHeroID()));

                                        h3.setHeroLevel(1);
                                        callLevel.setText(String.valueOf(h3.getHeroLevel()));

                                        h3.heroStat(10, 30, 10);
                                        callStr.setText(String.valueOf((Math.round(h3.computeStrength()))));
                                        callAgi.setText(String.valueOf(Math.round(h3.computeAgility())));
                                        callInt.setText(String.valueOf(Math.round(h3.computeIntelligence())));

                                        callHP1.setText(String.valueOf(Math.round(h3.computeHealth())));
                                        callHP2.setText(String.valueOf(Math.round(h3.computeHealth())));
                                        callMP1.setText(String.valueOf(Math.round(h3.computeMana())));
                                        callMP2.setText(String.valueOf(Math.round(h3.computeMana())));

                                        callAttackDamageMin.setText(String.valueOf(Math.round(h3.computePhysicalDamageMin())));
                                        callAttackDamageMax.setText(String.valueOf(Math.round(h3.computePhysicalDamageMax())));
                                        callSpellDamage.setText(String.valueOf(Math.round(h3.computeMagicDamage())));

                                        callLevelCheck.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        int i = Integer.parseInt(String.valueOf(callLevel.getText()));
                                                        h3.setHeroLevel(i);
                                                        callLevel.setText(String.valueOf(h3.getHeroLevel()));

                                                        if ((h3.getHeroLevel() >= 1) && (h3.getHeroLevel() <= 30)) {
                                                            h3.heroStat(20, 34, 14);
                                                            callStr.setText(String.valueOf((Math.round(h3.computeStrength()))));
                                                            callAgi.setText(String.valueOf(Math.round(h3.computeAgility())));
                                                            callInt.setText(String.valueOf(Math.round(h3.computeIntelligence())));

                                                            callHP1.setText(String.valueOf(Math.round(h3.computeHealth())));
                                                            callHP2.setText(String.valueOf(Math.round(h3.computeHealth())));
                                                            callMP1.setText(String.valueOf(Math.round(h3.computeMana())));
                                                            callMP2.setText(String.valueOf(Math.round(h3.computeMana())));

                                                            callAttackDamageMin.setText(String.valueOf(Math.round(h3.computePhysicalDamageMin())));
                                                            callAttackDamageMax.setText(String.valueOf(Math.round(h3.computePhysicalDamageMax())));
                                                            callSpellDamage.setText(String.valueOf(Math.round(h3.computeMagicDamage())));
                                                        } else {
                                                            Toast.makeText(Herodisplay.this,
                                                                    "Invalid level value",
                                                                    Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                }
                                        );
                                    }

     else  if(mrksmn.equals("rifleman")){
                                // GETTERS & SETTERS
                                h4.setHeroClass("Marksman");
                                callClass.setText(h4.getHeroClass());

                                h4.setHeroName("Rifleman");
                                callName.setText(h4.getHeroName());

                                h4.setHeroID(4);
                                callID.setText(String.valueOf(h4.getHeroID()));

                                h4.setHeroLevel(1);
                                callLevel.setText(String.valueOf(h4.getHeroLevel()));

                                h4.heroStat(10, 20, 20);
                                callStr.setText(String.valueOf((Math.round(h4.computeStrength()))));
                                callAgi.setText(String.valueOf(Math.round(h4.computeAgility())));
                                callInt.setText(String.valueOf(Math.round(h4.computeIntelligence())));

                                callHP1.setText(String.valueOf(Math.round(h4.computeHealth())));
                                callHP2.setText(String.valueOf(Math.round(h4.computeHealth())));
                                callMP1.setText(String.valueOf(Math.round(h4.computeMana())));
                                callMP2.setText(String.valueOf(Math.round(h4.computeMana())));

                                callAttackDamageMin.setText(String.valueOf(Math.round(h4.computePhysicalDamageMin())));
                                callAttackDamageMax.setText(String.valueOf(Math.round(h4.computePhysicalDamageMax())));
                                callSpellDamage.setText(String.valueOf(Math.round(h4.computeMagicDamage())));

                                callLevelCheck.setOnClickListener(
                                        new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                int i = Integer.parseInt(String.valueOf(callLevel.getText()));
                                                h4.setHeroLevel(i);
                                                callLevel.setText(String.valueOf(h4.getHeroLevel()));

                                                if ((h4.getHeroLevel() >= 1) && (h4.getHeroLevel() <= 30)) {
                                                    h4.heroStat(20, 34, 14);
                                                    callStr.setText(String.valueOf((Math.round(h4.computeStrength()))));
                                                    callAgi.setText(String.valueOf(Math.round(h4.computeAgility())));
                                                    callInt.setText(String.valueOf(Math.round(h4.computeIntelligence())));

                                                    callHP1.setText(String.valueOf(Math.round(h4.computeHealth())));
                                                    callHP2.setText(String.valueOf(Math.round(h4.computeHealth())));
                                                    callMP1.setText(String.valueOf(Math.round(h4.computeMana())));
                                                    callMP2.setText(String.valueOf(Math.round(h4.computeMana())));

                                                    callAttackDamageMin.setText(String.valueOf(Math.round(h4.computePhysicalDamageMin())));
                                                    callAttackDamageMax.setText(String.valueOf(Math.round(h4.computePhysicalDamageMax())));
                                                    callSpellDamage.setText(String.valueOf(Math.round(h4.computeMagicDamage())));
                                                } else {
                                                    Toast.makeText(Herodisplay.this,
                                                            "Invalid level value",
                                                            Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        }
                                );
                            }


        else  if(maje.equals("priest")){
                                    // GETTERS & SETTERS
                                    h5.setHeroClass("Mage");
                                    callClass.setText(h5.getHeroClass());

                                    h5.setHeroName("Priest");
                                    callName.setText(h5.getHeroName());

                                    h5.setHeroID(5);
                                    callID.setText(String.valueOf(h4.getHeroID()));

                                    h5.setHeroLevel(1);
                                    callLevel.setText(String.valueOf(h4.getHeroLevel()));

                                    h5.heroStat(10, 10, 40);
                                    callStr.setText(String.valueOf((Math.round(h5.computeStrength()))));
                                    callAgi.setText(String.valueOf(Math.round(h5.computeAgility())));
                                    callInt.setText(String.valueOf(Math.round(h5.computeIntelligence())));

                                    callHP1.setText(String.valueOf(Math.round(h5.computeHealth())));
                                    callHP2.setText(String.valueOf(Math.round(h5.computeHealth())));
                                    callMP1.setText(String.valueOf(Math.round(h5.computeMana())));
                                    callMP2.setText(String.valueOf(Math.round(h5.computeMana())));

                                    callAttackDamageMin.setText(String.valueOf(Math.round(h5.computePhysicalDamageMin())));
                                    callAttackDamageMax.setText(String.valueOf(Math.round(h5.computePhysicalDamageMax())));
                                    callSpellDamage.setText(String.valueOf(Math.round(h5.computeMagicDamage())));

                                    callLevelCheck.setOnClickListener(
                                            new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    int i = Integer.parseInt(String.valueOf(callLevel.getText()));
                                                    h5.setHeroLevel(i);
                                                    callLevel.setText(String.valueOf(h5.getHeroLevel()));

                                                    if ((h5.getHeroLevel() >= 1) && (h5.getHeroLevel() <= 30)) {
                                                        h5.heroStat(20, 34, 14);
                                                        callStr.setText(String.valueOf((Math.round(h5.computeStrength()))));
                                                        callAgi.setText(String.valueOf(Math.round(h5.computeAgility())));
                                                        callInt.setText(String.valueOf(Math.round(h5.computeIntelligence())));

                                                        callHP1.setText(String.valueOf(Math.round(h5.computeHealth())));
                                                        callHP2.setText(String.valueOf(Math.round(h5.computeHealth())));
                                                        callMP1.setText(String.valueOf(Math.round(h5.computeMana())));
                                                        callMP2.setText(String.valueOf(Math.round(h5.computeMana())));

                                                        callAttackDamageMin.setText(String.valueOf(Math.round(h5.computePhysicalDamageMin())));
                                                        callAttackDamageMax.setText(String.valueOf(Math.round(h5.computePhysicalDamageMax())));
                                                        callSpellDamage.setText(String.valueOf(Math.round(h5.computeMagicDamage())));
                                                    } else {
                                                        Toast.makeText(Herodisplay.this,
                                                                "Invalid level value",
                                                                Toast.LENGTH_LONG).show();
                                                    }
                                                }
                                            }
                                    );
                                }


        else  if(maje.equals("necromancer")){
                                    // GETTERS & SETTERS
                                    h6.setHeroClass("Mage");
                                    callClass.setText(h6.getHeroClass());

                                    h6.setHeroName("Necromancer");
                                    callName.setText(h6.getHeroName());

                                    h6.setHeroID(6);
                                    callID.setText(String.valueOf(h6.getHeroID()));

                                    h6.setHeroLevel(1);
                                    callLevel.setText(String.valueOf(h6.getHeroLevel()));

                                    h6.heroStat(10, 25, 25);
                                    callStr.setText(String.valueOf((Math.round(h6.computeStrength()))));
                                    callAgi.setText(String.valueOf(Math.round(h6.computeAgility())));
                                    callInt.setText(String.valueOf(Math.round(h6.computeIntelligence())));

                                    callHP1.setText(String.valueOf(Math.round(h6.computeHealth())));
                                    callHP2.setText(String.valueOf(Math.round(h6.computeHealth())));
                                    callMP1.setText(String.valueOf(Math.round(h6.computeMana())));
                                    callMP2.setText(String.valueOf(Math.round(h6.computeMana())));

                                    callAttackDamageMin.setText(String.valueOf(Math.round(h6.computePhysicalDamageMin())));
                                    callAttackDamageMax.setText(String.valueOf(Math.round(h6.computePhysicalDamageMax())));
                                    callSpellDamage.setText(String.valueOf(Math.round(h6.computeMagicDamage())));

                                    callLevelCheck.setOnClickListener(
                                            new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    int i = Integer.parseInt(String.valueOf(callLevel.getText()));
                                                    h6.setHeroLevel(i);
                                                    callLevel.setText(String.valueOf(h6.getHeroLevel()));

                                                    if ((h6.getHeroLevel() >= 1) && (h6.getHeroLevel() <= 30)) {
                                                        h6.heroStat(20, 34, 14);
                                                        callStr.setText(String.valueOf((Math.round(h6.computeStrength()))));
                                                        callAgi.setText(String.valueOf(Math.round(h6.computeAgility())));
                                                        callInt.setText(String.valueOf(Math.round(h6.computeIntelligence())));

                                                        callHP1.setText(String.valueOf(Math.round(h6.computeHealth())));
                                                        callHP2.setText(String.valueOf(Math.round(h6.computeHealth())));
                                                        callMP1.setText(String.valueOf(Math.round(h6.computeMana())));
                                                        callMP2.setText(String.valueOf(Math.round(h6.computeMana())));

                                                        callAttackDamageMin.setText(String.valueOf(Math.round(h6.computePhysicalDamageMin())));
                                                        callAttackDamageMax.setText(String.valueOf(Math.round(h6.computePhysicalDamageMax())));
                                                        callSpellDamage.setText(String.valueOf(Math.round(h6.computeMagicDamage())));
                                                    } else {
                                                        Toast.makeText(Herodisplay.this,
                                                                "Invalid level value",
                                                                Toast.LENGTH_LONG).show();
                                                    }
                                                }
                                            }
                                    );
                                }


        else  if(roug.equals("assassin")){
                                        // GETTERS & SETTERS
                                        h7.setHeroClass("Rogue");
                                        callClass.setText(h7.getHeroClass());

                                        h7.setHeroName("Assassin");
                                        callName.setText(h7.getHeroName());

                                        h7.setHeroID(7);
                                        callID.setText(String.valueOf(h7.getHeroID()));

                                        h7.setHeroLevel(1);
                                        callLevel.setText(String.valueOf(h7.getHeroLevel()));

                                        h7.heroStat(10, 40, 20);
                                        callStr.setText(String.valueOf((Math.round(h7.computeStrength()))));
                                        callAgi.setText(String.valueOf(Math.round(h7.computeAgility())));
                                        callInt.setText(String.valueOf(Math.round(h7.computeIntelligence())));

                                        callHP1.setText(String.valueOf(Math.round(h7.computeHealth())));
                                        callHP2.setText(String.valueOf(Math.round(h7.computeHealth())));
                                        callMP1.setText(String.valueOf(Math.round(h7.computeMana())));
                                        callMP2.setText(String.valueOf(Math.round(h7.computeMana())));

                                        callAttackDamageMin.setText(String.valueOf(Math.round(h7.computePhysicalDamageMin())));
                                        callAttackDamageMax.setText(String.valueOf(Math.round(h7.computePhysicalDamageMax())));
                                        callSpellDamage.setText(String.valueOf(Math.round(h7.computeMagicDamage())));

                                        callLevelCheck.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        int i = Integer.parseInt(String.valueOf(callLevel.getText()));
                                                        h7.setHeroLevel(i);
                                                        callLevel.setText(String.valueOf(h7.getHeroLevel()));

                                                        if ((h7.getHeroLevel() >= 1) && (h7.getHeroLevel() <= 30)) {
                                                            h7.heroStat(20, 34, 14);
                                                            callStr.setText(String.valueOf((Math.round(h7.computeStrength()))));
                                                            callAgi.setText(String.valueOf(Math.round(h7.computeAgility())));
                                                            callInt.setText(String.valueOf(Math.round(h7.computeIntelligence())));

                                                            callHP1.setText(String.valueOf(Math.round(h7.computeHealth())));
                                                            callHP2.setText(String.valueOf(Math.round(h7.computeHealth())));
                                                            callMP1.setText(String.valueOf(Math.round(h7.computeMana())));
                                                            callMP2.setText(String.valueOf(Math.round(h7.computeMana())));

                                                            callAttackDamageMin.setText(String.valueOf(Math.round(h7.computePhysicalDamageMin())));
                                                            callAttackDamageMax.setText(String.valueOf(Math.round(h7.computePhysicalDamageMax())));
                                                            callSpellDamage.setText(String.valueOf(Math.round(h7.computeMagicDamage())));
                                                        } else {
                                                            Toast.makeText(Herodisplay.this,
                                                                    "Invalid level value",
                                                                    Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                }
                                        );
                                    }


                      else  if(roug.equals("ninja")){
                                                // GETTERS & SETTERS
                                                h8.setHeroClass("Marksman");
                                                callClass.setText(h4.getHeroClass());

                                                h8.setHeroName("Rifleman");
                                                callName.setText(h4.getHeroName());

                                                h8.setHeroID(8);
                                                callID.setText(String.valueOf(h9.getHeroID()));

                                                h8.setHeroLevel(1);
                                                callLevel.setText(String.valueOf(h9.getHeroLevel()));

                                                h8.heroStat(10, 20, 20);
                                                callStr.setText(String.valueOf((Math.round(h8.computeStrength()))));
                                                callAgi.setText(String.valueOf(Math.round(h8.computeAgility())));
                                                callInt.setText(String.valueOf(Math.round(h8.computeIntelligence())));

                                                callHP1.setText(String.valueOf(Math.round(h8.computeHealth())));
                                                callHP2.setText(String.valueOf(Math.round(h8.computeHealth())));
                                                callMP1.setText(String.valueOf(Math.round(h8.computeMana())));
                                                callMP2.setText(String.valueOf(Math.round(h8.computeMana())));

                                                callAttackDamageMin.setText(String.valueOf(Math.round(h8.computePhysicalDamageMin())));
                                                callAttackDamageMax.setText(String.valueOf(Math.round(h8.computePhysicalDamageMax())));
                                                callSpellDamage.setText(String.valueOf(Math.round(h8.computeMagicDamage())));

                                                callLevelCheck.setOnClickListener(
                                                        new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                int i = Integer.parseInt(String.valueOf(callLevel.getText()));
                                                                h8.setHeroLevel(i);
                                                                callLevel.setText(String.valueOf(h8.getHeroLevel()));

                                                                if ((h8.getHeroLevel() >= 1) && (h8.getHeroLevel() <= 30)) {
                                                                    h8.heroStat(20, 34, 14);
                                                                    callStr.setText(String.valueOf((Math.round(h8.computeStrength()))));
                                                                    callAgi.setText(String.valueOf(Math.round(h8.computeAgility())));
                                                                    callInt.setText(String.valueOf(Math.round(h8.computeIntelligence())));

                                                                    callHP1.setText(String.valueOf(Math.round(h8.computeHealth())));
                                                                    callHP2.setText(String.valueOf(Math.round(h8.computeHealth())));
                                                                    callMP1.setText(String.valueOf(Math.round(h8.computeMana())));
                                                                    callMP2.setText(String.valueOf(Math.round(h8.computeMana())));

                                                                    callAttackDamageMin.setText(String.valueOf(Math.round(h8.computePhysicalDamageMin())));
                                                                    callAttackDamageMax.setText(String.valueOf(Math.round(h8.computePhysicalDamageMax())));
                                                                    callSpellDamage.setText(String.valueOf(Math.round(h8.computeMagicDamage())));
                                                                } else {
                                                                    Toast.makeText(Herodisplay.this,
                                                                            "Invalid level value",
                                                                            Toast.LENGTH_LONG).show();
                                                                }
                                                            }
                                                        }
                                                );
                                            }

                          else  if(suport.equals("enchanter")){
                                                    // GETTERS & SETTERS
                                                    h9.setHeroClass("Support");
                                                    callClass.setText(h4.getHeroClass());

                                                    h9.setHeroName("Enchanter");
                                                    callName.setText(h4.getHeroName());

                                                    h9.setHeroID(9);
                                                    callID.setText(String.valueOf(h9.getHeroID()));

                                                    h9.setHeroLevel(1);
                                                    callLevel.setText(String.valueOf(h9.getHeroLevel()));

                                                    h9.heroStat(20, 20, 50);
                                                    callStr.setText(String.valueOf((Math.round(h9.computeStrength()))));
                                                    callAgi.setText(String.valueOf(Math.round(h9.computeAgility())));
                                                    callInt.setText(String.valueOf(Math.round(h9.computeIntelligence())));

                                                    callHP1.setText(String.valueOf(Math.round(h9.computeHealth())));
                                                    callHP2.setText(String.valueOf(Math.round(h9.computeHealth())));
                                                    callMP1.setText(String.valueOf(Math.round(h9.computeMana())));
                                                    callMP2.setText(String.valueOf(Math.round(h9.computeMana())));

                                                    callAttackDamageMin.setText(String.valueOf(Math.round(h9.computePhysicalDamageMin())));
                                                    callAttackDamageMax.setText(String.valueOf(Math.round(h9.computePhysicalDamageMax())));
                                                    callSpellDamage.setText(String.valueOf(Math.round(h9.computeMagicDamage())));

                                                    callLevelCheck.setOnClickListener(
                                                            new View.OnClickListener() {
                                                                @Override
                                                                public void onClick(View v) {
                                                                    int i = Integer.parseInt(String.valueOf(callLevel.getText()));
                                                                    h9.setHeroLevel(i);
                                                                    callLevel.setText(String.valueOf(h9.getHeroLevel()));

                                                                    if ((h9.getHeroLevel() >= 1) && (h9.getHeroLevel() <= 30)) {
                                                                        h9.heroStat(20, 34, 14);
                                                                        callStr.setText(String.valueOf((Math.round(h9.computeStrength()))));
                                                                        callAgi.setText(String.valueOf(Math.round(h9.computeAgility())));
                                                                        callInt.setText(String.valueOf(Math.round(h9.computeIntelligence())));

                                                                        callHP1.setText(String.valueOf(Math.round(h9.computeHealth())));
                                                                        callHP2.setText(String.valueOf(Math.round(h9.computeHealth())));
                                                                        callMP1.setText(String.valueOf(Math.round(h9.computeMana())));
                                                                        callMP2.setText(String.valueOf(Math.round(h9.computeMana())));

                                                                        callAttackDamageMin.setText(String.valueOf(Math.round(h9.computePhysicalDamageMin())));
                                                                        callAttackDamageMax.setText(String.valueOf(Math.round(h9.computePhysicalDamageMax())));
                                                                        callSpellDamage.setText(String.valueOf(Math.round(h9.computeMagicDamage())));
                                                                    } else {
                                                                        Toast.makeText(Herodisplay.this,
                                                                                "Invalid level value",
                                                                                Toast.LENGTH_LONG).show();
                                                                    }
                                                                }
                                                            }
                                                    );
                                                }

          if(suport.equals("healer")){
                                        // GETTERS & SETTERS
                                        h10.setHeroClass("Support");
                                        callClass.setText(h10.getHeroClass());

                                        h10.setHeroName("Healer");
                                        callName.setText(h10.getHeroName());

                                        h10.setHeroID(10);
                                        callID.setText(String.valueOf(h10.getHeroID()));

                                        h10.setHeroLevel(1);
                                        callLevel.setText(String.valueOf(h10.getHeroLevel()));

                                        h9.heroStat(10, 20, 20);
                                        callStr.setText(String.valueOf((Math.round(h10.computeStrength()))));
                                        callAgi.setText(String.valueOf(Math.round(h10.computeAgility())));
                                        callInt.setText(String.valueOf(Math.round(h10.computeIntelligence())));

                                        callHP1.setText(String.valueOf(Math.round(h10.computeHealth())));
                                        callHP2.setText(String.valueOf(Math.round(h10.computeHealth())));
                                        callMP1.setText(String.valueOf(Math.round(h10.computeMana())));
                                        callMP2.setText(String.valueOf(Math.round(h10.computeMana())));

                                        callAttackDamageMin.setText(String.valueOf(Math.round(h10.computePhysicalDamageMin())));
                                        callAttackDamageMax.setText(String.valueOf(Math.round(h10.computePhysicalDamageMax())));
                                        callSpellDamage.setText(String.valueOf(Math.round(h10.computeMagicDamage())));

                                        callLevelCheck.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        int i = Integer.parseInt(String.valueOf(callLevel.getText()));
                                                        h10.setHeroLevel(i);
                                                        callLevel.setText(String.valueOf(h10.getHeroLevel()));

                                                        if ((h10.getHeroLevel() >= 1) && (h10.getHeroLevel() <= 30)) {
                                                            h10.heroStat(20, 34, 14);
                                                            callStr.setText(String.valueOf((Math.round(h10.computeStrength()))));
                                                            callAgi.setText(String.valueOf(Math.round(h10.computeAgility())));
                                                            callInt.setText(String.valueOf(Math.round(h10.computeIntelligence())));

                                                            callHP1.setText(String.valueOf(Math.round(h10.computeHealth())));
                                                            callHP2.setText(String.valueOf(Math.round(h10.computeHealth())));
                                                            callMP1.setText(String.valueOf(Math.round(h10.computeMana())));
                                                            callMP2.setText(String.valueOf(Math.round(h10.computeMana())));

                                                            callAttackDamageMin.setText(String.valueOf(Math.round(h10.computePhysicalDamageMin())));
                                                            callAttackDamageMax.setText(String.valueOf(Math.round(h10.computePhysicalDamageMax())));
                                                            callSpellDamage.setText(String.valueOf(Math.round(h10.computeMagicDamage())));
                                                        } else {
                                                            Toast.makeText(Herodisplay.this,
                                                                    "Invalid level value",
                                                                    Toast.LENGTH_LONG).show();
                                                        }
                                                    }
                                                }
                                        );
                                    }
    }
}
