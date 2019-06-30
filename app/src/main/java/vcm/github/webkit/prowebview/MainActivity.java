package vcm.github.webkit.prowebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import vcm.github.webkit.proview.ProWebView;
import vcm.github.webkit.proview.ProWebViewControls;

public class MainActivity extends AppCompatActivity {

    private ProWebView webView;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.main1:
                webView.loadUrl("https://protonmine.com");
                break;
            case R.id.stats:
                webView.loadUrl("https://egem.protonmine.com/stats.php");
                break;
            case R.id.egem:
                webView.loadUrl("https://egem.protonmine.com");
                break;
        }
        return true;
    }
}
