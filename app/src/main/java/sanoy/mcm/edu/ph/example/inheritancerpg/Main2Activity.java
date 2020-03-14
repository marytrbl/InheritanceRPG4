package sanoy.mcm.edu.ph.example.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herodisplay);

        String hroclassstrng = getIntent().getStringExtra("Class");
        String tankstrng = getIntent().getStringExtra("Barbarian");
        String magestrng=getIntent().getStringExtra("Priest");
        String marksstring=getIntent().getStringExtra("Archer");
        String roguestrng=getIntent().getStringExtra("Ninja");
        String supportstrng=getIntent().getStringExtra("Enchanter");
        String heroLvl = getIntent().getStringExtra("level");

        TextView callName = findViewById(R.id.heroName);
        TextView callClass = findViewById(R.id.heroClass);
        TextView callID = findViewById(R.id.heroID);
        TextView callLevel = findViewById(R.id.heroLvlnum);
        callLevel.setText(heroLvl);

        final TextView callHP1 = findViewById(R.id.currhp);
        final TextView callHP2 = findViewById(R.id.totalhp);
        final TextView callMP1 = findViewById(R.id.currmp);
        final TextView callMP2 = findViewById(R.id.totalmp);

        final TextView callStr = findViewById(R.id.strength);
        final TextView callAgi = findViewById(R.id.agility);
        final TextView callInt = findViewById(R.id.intelligence);

        final TextView callPhysicalAtk = findViewById(R.id.physAtk);
        final TextView callMagicAtk = findViewById(R.id.mgAtk);
        final TextView callPhysicalDef = findViewById(R.id.physDef);
        final TextView callMagicDef = findViewById(R.id.mgAtk);

        final Hero knight = new Hero("Tank (Knight)","Ragnar",20200000,1);
        final Hero barb = new Hero("Tank (Barbarian)","Ragnar",20200000,1);
        final Hero priest = new Hero("Mage (Priest)","Sibyl",20200000,1);
        final Hero necro = new Hero("Mage (Necromancer)","Sibyl",20200000,1);
        final Hero ranger = new Hero("Marksman (Ranger)","Myrcelle",20200000,1);
        final Hero archer = new Hero("Marksman (Archer)","Myrcelle",20200000,1);
        final Hero assassin = new Hero("Rogue (Assassin)","Darion",20200000,1);
        final Hero ninja = new Hero("Rogue (Ninja)","Darion",20200000,1);
        final Hero healer = new Hero("Support (Healer)","Ezra",20200000,1);
        final Hero enchanter = new Hero("Support (Enchanter)","Ezra",20200000,1);

        if (tankstrng.equals("Barbarian")) {
            callClass.setText(barb.getHeroClass());
            callName.setText(barb.getHeroName());
            callID.setText(String.valueOf(barb.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            barb.setHeroLevel(i);
            callLevel.setText(String.valueOf(barb.getHeroLevel()));

                barb.heroStat(20, 34, 14);
                callStr.setText(String.valueOf((Math.round(barb.computeStrength()))));
                callAgi.setText(String.valueOf(Math.round(barb.computeAgility())));
                callInt.setText(String.valueOf(Math.round(barb.computeIntelligence())));

                callHP1.setText(String.valueOf(Math.round(barb.computeHP())));
                callHP2.setText(String.valueOf(Math.round(barb.computeHP())));
                callMP1.setText(String.valueOf(Math.round(barb.computeMP())));
                callMP2.setText(String.valueOf(Math.round(barb.computeMP())));

                callPhysicalAtk.setText(String.valueOf(Math.round(barb.computePhysicalDmg())));
                callMagicAtk.setText(String.valueOf(Math.round(barb.computeMagicDmg())));
        }

        else if (tankstrng.equals("Knight")) {
            callClass.setText(knight.getHeroClass());
            callName.setText(knight.getHeroName());
            callID.setText(String.valueOf(knight.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            knight.setHeroLevel(i);
            callLevel.setText(String.valueOf(knight.getHeroLevel()));

            knight.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(knight.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(knight.computeAgility())));
            callInt.setText(String.valueOf(Math.round(knight.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(knight.computeHP())));
            callHP2.setText(String.valueOf(Math.round(knight.computeHP())));
            callMP1.setText(String.valueOf(Math.round(knight.computeMP())));
            callMP2.setText(String.valueOf(Math.round(knight.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(knight.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(knight.computeMagicDmg())));
        }

        else if(magestrng.equals("Priest")) {
            callClass.setText(priest.getHeroClass());
            callName.setText(priest.getHeroName());
            callID.setText(String.valueOf(priest.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            priest.setHeroLevel(i);
            callLevel.setText(String.valueOf(priest.getHeroLevel()));

            priest.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(priest.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(priest.computeAgility())));
            callInt.setText(String.valueOf(Math.round(priest.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(priest.computeHP())));
            callHP2.setText(String.valueOf(Math.round(priest.computeHP())));
            callMP1.setText(String.valueOf(Math.round(priest.computeMP())));
            callMP2.setText(String.valueOf(Math.round(priest.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(priest.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(priest.computeMagicDmg())));
        }

        else if(magestrng.equals("Necromancer")) {
            callClass.setText(necro.getHeroClass());
            callName.setText(necro.getHeroName());
            callID.setText(String.valueOf(necro.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            necro.setHeroLevel(i);
            callLevel.setText(String.valueOf(necro.getHeroLevel()));

            necro.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(necro.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(necro.computeAgility())));
            callInt.setText(String.valueOf(Math.round(necro.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(necro.computeHP())));
            callHP2.setText(String.valueOf(Math.round(necro.computeHP())));
            callMP1.setText(String.valueOf(Math.round(necro.computeMP())));
            callMP2.setText(String.valueOf(Math.round(necro.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(necro.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(necro.computeMagicDmg())));
        }
        
        else if(marksstring.equals("Archer")) {
            callClass.setText(archer.getHeroClass());
            callName.setText(archer.getHeroName());
            callID.setText(String.valueOf(archer.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            archer.setHeroLevel(i);
            callLevel.setText(String.valueOf(archer.getHeroLevel()));

            archer.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(archer.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(archer.computeAgility())));
            callInt.setText(String.valueOf(Math.round(archer.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(archer.computeHP())));
            callHP2.setText(String.valueOf(Math.round(archer.computeHP())));
            callMP1.setText(String.valueOf(Math.round(archer.computeMP())));
            callMP2.setText(String.valueOf(Math.round(archer.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(archer.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(archer.computeMagicDmg())));
        }

        else if(marksstring.equals("Ranger")) {
            callClass.setText(ranger.getHeroClass());
            callName.setText(ranger.getHeroName());
            callID.setText(String.valueOf(ranger.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            ranger.setHeroLevel(i);
            callLevel.setText(String.valueOf(ranger.getHeroLevel()));

            ranger.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(ranger.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(ranger.computeAgility())));
            callInt.setText(String.valueOf(Math.round(ranger.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(ranger.computeHP())));
            callHP2.setText(String.valueOf(Math.round(ranger.computeHP())));
            callMP1.setText(String.valueOf(Math.round(ranger.computeMP())));
            callMP2.setText(String.valueOf(Math.round(ranger.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(ranger.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(ranger.computeMagicDmg())));
        }

        else if(roguestrng.equals("Assassin")) {
            callClass.setText(assassin.getHeroClass());
            callName.setText(assassin.getHeroName());
            callID.setText(String.valueOf(assassin.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            assassin.setHeroLevel(i);
            callLevel.setText(String.valueOf(assassin.getHeroLevel()));

            assassin.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(assassin.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(assassin.computeAgility())));
            callInt.setText(String.valueOf(Math.round(assassin.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(assassin.computeHP())));
            callHP2.setText(String.valueOf(Math.round(assassin.computeHP())));
            callMP1.setText(String.valueOf(Math.round(assassin.computeMP())));
            callMP2.setText(String.valueOf(Math.round(assassin.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(assassin.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(assassin.computeMagicDmg())));
        }

        else if(roguestrng.equals("Ninja")) {
            callClass.setText(ninja.getHeroClass());
            callName.setText(ninja.getHeroName());
            callID.setText(String.valueOf(ninja.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            ninja.setHeroLevel(i);
            callLevel.setText(String.valueOf(ninja.getHeroLevel()));

            ninja.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(ninja.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(ninja.computeAgility())));
            callInt.setText(String.valueOf(Math.round(ninja.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(ninja.computeHP())));
            callHP2.setText(String.valueOf(Math.round(ninja.computeHP())));
            callMP1.setText(String.valueOf(Math.round(ninja.computeMP())));
            callMP2.setText(String.valueOf(Math.round(ninja.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(ninja.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(ninja.computeMagicDmg())));
        }
        
        else if(supportstrng.equals("Enchanter")) {
            callClass.setText(enchanter.getHeroClass());
            callName.setText(enchanter.getHeroName());
            callID.setText(String.valueOf(enchanter.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            enchanter.setHeroLevel(i);
            callLevel.setText(String.valueOf(enchanter.getHeroLevel()));

            enchanter.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(enchanter.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(enchanter.computeAgility())));
            callInt.setText(String.valueOf(Math.round(enchanter.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(enchanter.computeHP())));
            callHP2.setText(String.valueOf(Math.round(enchanter.computeHP())));
            callMP1.setText(String.valueOf(Math.round(enchanter.computeMP())));
            callMP2.setText(String.valueOf(Math.round(enchanter.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(enchanter.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(enchanter.computeMagicDmg())));
        }

        else if(supportstrng.equals("Healer")) {
            callClass.setText(healer.getHeroClass());
            callName.setText(healer.getHeroName());
            callID.setText(String.valueOf(healer.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            healer.setHeroLevel(i);
            callLevel.setText(String.valueOf(healer.getHeroLevel()));

            healer.heroStat(20, 34, 14);
            callStr.setText(String.valueOf((Math.round(healer.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(healer.computeAgility())));
            callInt.setText(String.valueOf(Math.round(healer.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(healer.computeHP())));
            callHP2.setText(String.valueOf(Math.round(healer.computeHP())));
            callMP1.setText(String.valueOf(Math.round(healer.computeMP())));
            callMP2.setText(String.valueOf(Math.round(healer.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(healer.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(healer.computeMagicDmg())));
        }
    }
}
   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String herolvl = getIntent().getStringExtra("level");
        String tankstrng = getIntent().getStringExtra("Knight");
        String marksstring=getIntent().getStringExtra("Ranger");
        String magestrng=getIntent().getStringExtra("Necromancer");
        String roguestrng=getIntent().getStringExtra("Assassin");
        String supportstrng=getIntent().getStringExtra("Healer");

        /*TextView callLevelCheck = findViewById(R.id.lvlcheck);
        TextView callName = findViewById(R.id.heroName);
        TextView callClass = findViewById(R.id.heroClass);
        TextView callID = findViewById(R.id.heroID);
        TextView callLevel = findViewById(R.id.heroLvlnum);

        final TextView callHP1 = findViewById(R.id.currhp);
        final TextView callHP2 = findViewById(R.id.totalhp);
        final TextView callMP1 = findViewById(R.id.currmp);
        final TextView callMP2 = findViewById(R.id.totalmp);

        final TextView callStr = findViewById(R.id.strength);
        final TextView callAgi = findViewById(R.id.agility);
        final TextView callInt = findViewById(R.id.intelligence);

        final TextView callPhysicalAtk = findViewById(R.id.attackDamageMin);
        final TextView callMagicAtk = findViewById(R.id.spellDamage);
        final TextView callPhysicalDef = findViewById(R.id.attackDamageMin);
        final TextView callMagicDef = findViewById(R.id.spellDamage);

        final Hero knight = new Hero("Tank (Knight)","Ragnar",20200000,1);
        final Hero barb = new Hero("Tank (Barbarian)","Ragnar",20200000,1);
        final Hero priest = new Hero("Mage (Priest)","Sibyl",20200000,1);
        final Hero necro = new Hero("Mage (Necromancer)","Sibyl",20200000,1);
        final Hero ranger = new Hero("Marksman (Ranger)","Myrcelle",20200000,1);
        final Hero archer = new Hero("Marksman (Archer)","Myrcelle",20200000,1);
        final Hero assassin = new Hero("Rogue (Assassin)","Darion",20200000,1);
        final Hero ninja = new Hero("Rogue (Ninja)","Darion",20200000,1);
        final Hero healer = new Hero("Support (Healer)","Ezra",20200000,1);
        final Hero enchanter = new Hero("Support (Enchanter)","Ezra",20200000,1);

        if(tankstrng.equals("Barbarian")) {
            barb.heroStat(20, 10, 10);
            callClass.setText(barb.getHeroClass());
            callName.setText(barb.getHeroName());
            callID.setText(String.valueOf(barb.getHeroID()));
            callLevel.setText(String.valueOf(barb.getHeroLevel()));
            callStr.setText(String.valueOf((Math.round(barb.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(barb.computeAgility())));
            callInt.setText(String.valueOf(Math.round(barb.computeIntelligence())));
            callHP1.setText(String.valueOf(Math.round(barb.computeHP())));
            callHP2.setText(String.valueOf(Math.round(barb.computeHP())));
            callMP1.setText(String.valueOf(Math.round(barb.computeMP())));
            callMP2.setText(String.valueOf(Math.round(barb.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(barb.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(barb.computeMagicDmg())));
        }

        else if(tankstrng.equals("Knight")) {
            knight.heroStat(10, 20, 10);
            callID.setText(String.valueOf(knight.getHeroID()));
            callStr.setText(String.valueOf((Math.round(knight.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(knight.computeAgility())));
            callInt.setText(String.valueOf(Math.round(knight.computeIntelligence())));
            callHP1.setText(String.valueOf(Math.round(knight.computeHP())));
            callHP2.setText(String.valueOf(Math.round(knight.computeHP())));
            callMP1.setText(String.valueOf(Math.round(knight.computeMP())));
            callMP2.setText(String.valueOf(Math.round(knight.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(knight.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(knight.computeMagicDmg())));
        }
    }
} */
