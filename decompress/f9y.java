import java.util.Iterator;
import android.net.Uri$Builder;
import java.io.IOException;
import android.util.Log;
import java.net.HttpURLConnection;
import java.net.URL;
import android.net.Uri;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f9y extends Thread
{
    public final /* synthetic */ Map C0;
    
    public f9y(final Map c0) {
        this.C0 = c0;
    }
    
    @Override
    public final void run() {
        Object c0 = this.C0;
        final Uri$Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (final String s : ((Map)c0).keySet()) {
            buildUpon.appendQueryParameter(s, (String)((Map)c0).get(s));
        }
        final String string = buildUpon.build().toString();
        Label_0200: {
            try {
                c0 = new URL(string);
                c0 = ((URL)c0).openConnection();
                try {
                    final int responseCode = ((HttpURLConnection)c0).getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 65);
                        sb.append("Received non-success response code ");
                        sb.append(responseCode);
                        sb.append(" from pinging URL: ");
                        sb.append(string);
                        Log.w("HttpUrlPinger", sb.toString());
                    }
                }
                finally {
                    ((HttpURLConnection)c0).disconnect();
                }
            }
            catch (final RuntimeException ex) {
                break Label_0200;
            }
            catch (final IOException ex2) {
                final String message = ((Throwable)c0).getMessage();
                final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 27 + String.valueOf(message).length());
                sb2.append("Error while pinging URL: ");
                sb2.append(string);
                sb2.append(". ");
                sb2.append(message);
                Log.w("HttpUrlPinger", sb2.toString(), (Throwable)c0);
            }
            catch (final IndexOutOfBoundsException ex3) {
                final String message2 = ex3.getMessage();
                final StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 32 + String.valueOf(message2).length());
                sb3.append("Error while parsing ping URL: ");
                sb3.append(string);
                sb3.append(". ");
                sb3.append(message2);
                Log.w("HttpUrlPinger", sb3.toString(), (Throwable)ex3);
            }
        }
    }
}
