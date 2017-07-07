package com.example.aamir.hangman;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aamir on 3/7/17.
 */

public class ActivityTwo extends AppCompatActivity {

    String[] animals={"alligator","ant","anteater","antelope","armadillo","baboon","badger","bat","beagle","bear","beaver","bee","beetle","bird","bison","bobcat","bongo","buffalo","bull","butterfly","camel","cat","centipede","cheetah","chicken","chimpanzee","cockroach","cow","crab","crane","crocodile","crow","deer","dingo","dodo","dog","dolphin","donkey","duck","eagle","earthworm","elephant","emu","falcon","fish","flamingo","fly","fox","frog","gecko","gharial","gibbon","giraffe","goat","goose","gopher","gorilla","grasshopper","hamster","hare","hedgehog","heron","hippopotamus","horse","human","hyena","iguana","impala","jackal","jaguar","jellyfish","kangaroo","kiwi","kite","koala","ladybird","lemur","leopard","lion","lizard","llama","lobster","lynx","macaw","magpie","meerkat","millipede","mole","mongoose","mongrel","monkey","moose","moth","mouse","mule","newt","nightingale","numbat","octopus","orang-utan","ostrich","otter","owl","oyster","panda","panther","parrot","parakeet","peacock","pelican","penguin","pig","pigeon","piranha","platypus","prawn","puma","quail","rabbit","raccoon","rat","reindeer","rhinoceros","robin","salamander","scorpion","sea-horse","seal","sheep","shrimp","skunk","sloth","snail","snake","sparrow","squid","squirrel","starfish","string-ray","swan","tapir","tiger","tortoise","toucan","turkey","turtle","vulture","wallaby","walrus","wasp","weasel","whale","wolf","worm","yak","zebra"};
    String[] games={"archery","baseball","basketball","battleship","billiards","blackjack","bowling","boxing","bull fighting","canoeing","checkers","chess","carrom","cluedo","connect four","cricket","cycling","darts","dodgeball","draughts","fencing","football","futsal","gliding","go-carting","golf","guess who","gymnastics","handball","hangman","high jump","hockey","ice hockey","ice skating","javelin","judo","kabaddi","karate","kho kho","kick boxing","laser tag","long jump","ludo","marathon","mastermind","mini-golf","monopoly","mountaineering","paintball","parachuting","paragliding","pictionary","pole vault","poker","polo","pool","rafting","rodeo","rope climbing","rugby","rummy","running","sailing","scrabble","shot put","skateboarding","skating","skiing","sky diving","snakes and ladders","snooker","solitaire","squash","steeplechase","surfing","swimming","table tennis","taboo","tennis","throwball","tree climbing","tug of war","uno","volleyball","wind surfing","wrestling"};
    String[] countries={"afghanistan","albania","algeria","andorra","angola","argentina","armenia","australia","austria","azerbaijan","bahamas","bahrain","bangladesh","barbados","belarus","belgium","belize","benin","bhutan","bolivia","bostwana","brazil","brunei","bulgaria","burundi","cambodia","cameroon","canada","chad","chile","china","colombia","comoros","congo","costa rica","croatia","cuba","cyprus","czech republic","denmark","djibouti","dominica","ecuador","egypt","el salvador","eritrea","estonia","ethiopia","fiji","finland","france","gabon","gambia","georgia","germany","ghana","greece","grenada","guatemala","guinea","guyana","haiti","honduras","hungary","iceland","india","indonesia","iran","iraq","ireland","israel","italy","jamaica","japan","jordan","kazakhstan","kenya","kiribati","kosovo","kuwait","kyrgyzstan","laos","latvia","lebanon","lesotho","liberia","libya","liechtenstein","lithuania","luxembourg","macedonia","madagascar","malawi","malaysia","maldives","mali","malta","mauritius","mexico","micronesia","moldova","monaco","mongolia","montenegro","morocco","mozambique","myanmar","namibia","nauru","nepal","netherlands","new zealand","nicaragua","niger","nigeria","north korea","norway","oman","pakistan","palau","palestine","panama","paraguay","peru","philippines","poland","portugal","qatar","romania","russia","rwanda","saint lucia","samoa","san marino","saudi arabia","senegal","serbia","seychelles","sierra leone","singapore","slovakia","slovenia","somalia","south africa","south korea","south sudan","spain","sri lanka","sudan","suriname","swaziland","sweden","switzerland","syria","taiwan","tajikistan","tanzania","thailand","togo","tonga","trinidad and tabago","tunisia","turkey","turkmenistan","tuvalu","uganda","ukraine","united arab emirates","united kingdom","united states of america","uruguay","uzbekistan","vanuatu","vatican city","venezuela","vietnam","yemen","zambia","zimbabwe"};
    String[] fruits={"apple","apricot","avocado","banana","blackcurrent","blackberry","blueberry","cherry","chikoo","coconut","cucumber","custard apple","date","dragon fruit","fig","grape","grapefruit","guava","jackfruit","kiwi","lemon","lime","litchi","mango","melon","muskmelon","nectarine","olive","orange","papaya","passion fruit","peach","pear","plum","pineapple","pomegranate","pumpkin","raspberry","strawberry","watermelon"};
    Button b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,v,w,x,y,z;
    TextView ans,name;
    String word,gword;
    int hangman=7, cat;
    boolean singlePlayer=true;
    View h1,h2,h3,h4,h6;
    ImageView h5,h7,h8,h9,h10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        b=(Button)findViewById(R.id.b);
        c=(Button)findViewById(R.id.c);
        d=(Button)findViewById(R.id.d);
        f=(Button)findViewById(R.id.f);
        g=(Button)findViewById(R.id.g);
        h=(Button)findViewById(R.id.h);
        j=(Button)findViewById(R.id.j);
        k=(Button)findViewById(R.id.k);
        l=(Button)findViewById(R.id.l);
        m=(Button)findViewById(R.id.m);
        n=(Button)findViewById(R.id.n);
        p=(Button)findViewById(R.id.p);
        q=(Button)findViewById(R.id.q);
        r=(Button)findViewById(R.id.r);
        s=(Button)findViewById(R.id.s);
        t=(Button)findViewById(R.id.t);
        v=(Button)findViewById(R.id.v);
        w=(Button)findViewById(R.id.w);
        x=(Button)findViewById(R.id.x);
        y=(Button)findViewById(R.id.y);
        z=(Button)findViewById(R.id.z);
        ans=(TextView)findViewById(R.id.ans);
        name=(TextView)findViewById(R.id.name);

        h1=findViewById(R.id.h1);
        h2=findViewById(R.id.h2);
        h3=findViewById(R.id.h3);
        h4=findViewById(R.id.h4);
        h5=(ImageView)findViewById(R.id.h5);
        h6=findViewById(R.id.h6);
        h7=(ImageView)findViewById(R.id.h7);
        h8=(ImageView)findViewById(R.id.h8);
        h9=(ImageView)findViewById(R.id.h9);
        h10=(ImageView)findViewById(R.id.h10);


        cat=getIntent().getIntExtra("Category",1);

        switch(cat)
        {
            case 0: word=getIntent().getStringExtra("word").trim();
                singlePlayer=false;
                name.setText(R.string.two_player);
                name.setTextColor(getResources().getColor(R.color.used_button));
                break;
            case 1: word=random_word(animals);
                name.setText(R.string.animals);
                name.setTextColor(getResources().getColor(R.color.animals));
                break;
            case 2: word=random_word(games);
                name.setText(R.string.games);
                name.setTextColor(getResources().getColor(R.color.games));
                break;
            case 3: word=random_word(fruits);
                name.setText(R.string.fruits);
                name.setTextColor(getResources().getColor(R.color.fruits));
                break;
            case 4: word=random_word(countries);
                name.setText(R.string.countries);
                name.setTextColor(getResources().getColor(R.color.countries));
                break;
        }

        gword=getGword(word);
        ans.setText(gword);
    }

    public String random_word(String[] xyz)
    {
        int rnd = (int)(Math.random()*xyz.length);
        return xyz[rnd];
    }

    public String getGword(String oword)
    {
        String nword="";
        for(int i=0;i<oword.length();i++)
        {
            char ch=oword.charAt(i);
            if(isConsonent(ch))
                nword=nword+"_";
            else
                nword=nword+ch;
        }
        return nword;

    }

    public boolean isConsonent(char ch)
    {
        if(ch>'a' && ch<='z')
        {
            switch (ch)
            {
                case 'e':
                case 'i':
                case 'o':
                case 'u': return false;
                default: return true;
            }
        }
        else
            return false;
    }

    public void guessed(Button bt)
    {
        char ch=bt.getText().toString().charAt(0);
        String nword="";
        for(int i=0;i<word.length();i++)
        {
            if(ch==word.charAt(i))
                nword=nword+ch;
            else
                nword=nword+gword.charAt(i);
        }
        if(nword.equals(gword))
        {
            hangman--;
            switch (hangman)
            {
                case 6: h1.setVisibility(View.VISIBLE);
                    h2.setVisibility(View.VISIBLE);
                    h3.setVisibility(View.VISIBLE);
                    break;
                case 5: h4.setVisibility(View.VISIBLE);
                    h5.setVisibility(View.VISIBLE);
                    break;
                case 4: h6.setVisibility(View.VISIBLE);
                    break;
                case 3: h7.setVisibility(View.VISIBLE);
                    break;
                case 2: h8.setVisibility(View.VISIBLE);
                    break;
                case 1: h9.setVisibility(View.VISIBLE);
                    break;
                case 0: h10.setVisibility(View.VISIBLE);
                    break;
            }
        }
        else
        {
            gword=nword;
            ans.setText(gword);
        }
        bt.setBackgroundColor(getResources().getColor(R.color.used_button));
        bt.setTextColor(getResources().getColor(R.color.grey));
        bt.setEnabled(false);
        check();
    }

    public void check()
    {
        if(gword.equals(word) || hangman==0)
        {
            AlertDialog.Builder builder;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                builder = new AlertDialog.Builder(ActivityTwo.this, android.R.style.Theme_Material_Light_Dialog_Alert);
            } else {
                builder = new AlertDialog.Builder(ActivityTwo.this);
            }
            LayoutInflater factory = LayoutInflater.from(ActivityTwo.this);
            View view;
            if(gword.equals(word))
                view = factory.inflate(R.layout.alert_image, null);
            else
                view = factory.inflate(R.layout.alert_image_lost, null);
            builder.setView(view);
            builder.setTitle(word.toUpperCase());
            if(gword.equals(word))
            {
                builder.setMessage("Congratulations");
            }
            else if(hangman==0)
            {
                ans.setText(word);
                builder.setMessage("Game Over");
            }
            builder.setNeutralButton("Main Menu", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i)
                {
                    back();
                }
            });
            if(singlePlayer)
            {
                builder.setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        next();
                    }
                });
            }
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            if(gword.equals(word))
                alertDialog.getWindow().setBackgroundDrawableResource(R.color.yellow);
            else if(hangman==0)
                alertDialog.getWindow().setBackgroundDrawableResource(R.color.red);


        }

    }

    public void back()
    {
        Intent i=new Intent(ActivityTwo.this,MainActivity.class);
        startActivity(i);
    }

    public void next()
    {
        Intent i=new Intent(ActivityTwo.this,ActivityTwo.class);
        i.putExtra("Category",cat);
        startActivity(i);
    }

    public void b(View view)
    {
        guessed(b);
    }

    public void c(View view)
    {
        guessed(c);
    }

    public void d(View view)
    {
        guessed(d);
    }

    public void f(View view)
    {
        guessed(f);
    }

    public void g(View view)
    {
        guessed(g);
    }

    public void h(View view)
    {
        guessed(h);
    }

    public void j(View view)
    {
        guessed(j);
    }

    public void k(View view)
    {
        guessed(k);
    }

    public void l(View view)
    {
        guessed(l);
    }

    public void m(View view)
    {
        guessed(m);
    }

    public void n(View view)
    {
        guessed(n);
    }

    public void p(View view)
    {
        guessed(p);
    }

    public void q(View view)
    {
        guessed(q);
    }

    public void r(View view)
    {
        guessed(r);
    }

    public void s(View view)
    {
        guessed(s);
    }

    public void t(View view)
    {
        guessed(t);
    }

    public void v(View view)
    {
        guessed(v);
    }

    public void w(View view)
    {
        guessed(w);
    }

    public void x(View view)
    {
        guessed(x);
    }

    public void y(View view)
    {
        guessed(y);
    }

    public void z(View view)
    {
        guessed(z);
    }
}
