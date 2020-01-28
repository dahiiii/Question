package abc.com.salamyaalam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;



public class MainActivity extends AppCompatActivity {

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*/   int ar[]= new int[5];
        for (int i=0; i<6; i++)
            ar[i]=i;/*/
        AudienceNetworkAds.initialize(this);

        BannerAdLoad();
    }


    public void BannerAdLoad(){
        adView = new AdView(this, "505319196765196_505339120096537", AdSize.BANNER_HEIGHT_50);

        adView = new AdView(this, "IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
    }

   public void btnget(View view) {
        EditText etAge=(EditText)findViewById(R.id.etAge);
                int YearOfBirth= Integer.parseInt(etAge.getText().toString());
                int age=2020-YearOfBirth;

        Toast.makeText(this,"age: "+String.valueOf(age),Toast.LENGTH_LONG).show();


    }



}
