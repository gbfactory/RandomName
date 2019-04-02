package randomname.gbfactory.net.randomname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RandomName extends AppCompatActivity {

    private ImageView mImageView;
    private TextView mTextView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_name);

        mImageView = (ImageView)findViewById(R.id.imageView);
        mTextView = (TextView)findViewById(R.id.textView);
        mButton = (Button)findViewById(R.id.button2);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomeRandom();
            }
        });

    }

    public void nomeRandom() {
        shuffleName();
        mImageView.setImageResource(nomiArray[0].getmImage());
        mTextView.setText(nomiArray[0].getmName());
    }

    Nomi n01 = new Nomi(R.drawable.claudio, "Claudio");
    Nomi n02 = new Nomi(R.drawable.agrippina, "Agrippina");
    Nomi n03 = new Nomi(R.drawable.liutprando, "Liutprando");
    Nomi n04 = new Nomi(R.drawable.tiberio, "Tibero");
    Nomi n05 = new Nomi(R.drawable.agilulfo, "Agilulfo");
    Nomi n06 = new Nomi(R.drawable.astolfo, "Astolfo");
    Nomi n07 = new Nomi(R.drawable.commodo, "Commodo");
    Nomi n08 = new Nomi(R.drawable.gallaplacidia, "Galla Placidia");
    Nomi n09 = new Nomi(R.drawable.drusilla, "Drusilla");
    Nomi n10 = new Nomi(R.drawable.messalina, "Messalina");
    Nomi n11 = new Nomi(R.drawable.seneca, "Seneca");
    Nomi n12 = new Nomi(R.drawable.nerone, "Nerone");
    Nomi n13 = new Nomi(R.drawable.caligola, "Caligola");
    Nomi n14 = new Nomi(R.drawable.mecenate, "Mecenate");
    Nomi n15 = new Nomi(R.drawable.massenzio, "Massenzio");
    Nomi n16 = new Nomi(R.drawable.teodosio, "Teodosio");
    Nomi n17 = new Nomi(R.drawable.caracalla, "Caracalla");
    Nomi n18 = new Nomi(R.drawable.augusto, "Augusto");
    Nomi n19 = new Nomi(R.drawable.pisone, "Pisone");
    Nomi n20 = new Nomi(R.drawable.traiano, "Traiano");
    Nomi n21 = new Nomi(R.drawable.vespasiano, "Vespasiano");
    Nomi n22 = new Nomi(R.drawable.adriano, "Adriano");
    Nomi n23 = new Nomi(R.drawable.nerva, "Nerva");
    Nomi n24 = new Nomi(R.drawable.diocleziano, "Diocleziano");
    Nomi n25 = new Nomi(R.drawable.giustiniano, "Giustiniano");
    Nomi n26 = new Nomi(R.drawable.teodorico, "Teodorico");

    Nomi [] nomiArray = new Nomi[] {
            n01, n02, n03, n04, n05, n06, n07, n08, n09, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, n22, n23, n24, n25, n26
    };

    public void shuffleName() {
        Collections.shuffle(Arrays.asList(nomiArray));
    }

}
