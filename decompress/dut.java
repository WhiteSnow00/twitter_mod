import java.security.GeneralSecurityException;
import java.lang.reflect.UndeclaredThrowableException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import android.net.Uri;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dut extends vbv
{
    public String X0;
    public final TextView Y0;
    public final ProgressBar Z0;
    public dut$a a1;
    public Handler b1;
    
    public dut(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final xbm xbm, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        this.X0 = "";
        this.Y0 = (TextView)((u9)this).C4(2131432205);
        final ProgressBar z0 = (ProgressBar)((u9)this).C4(2131432206);
        this.Z0 = z0;
        final TextView textView = (TextView)((u9)this).C4(2131429448);
        z0.setMax(30);
        final UserIdentifier fromId = UserIdentifier.fromId(intent.getLongExtra("TotpGeneratorActivity_account_id", userIdentifier.getId()));
        this.X0 = pbu.e(fromId, "login_verification").j("lv_totp_secret", "");
        final z9j<eut> a = kas.a(eut.class);
        f.j((h5j)a.a(), (n93)new so3((Object)this, 1), (z9a)xbm);
        a.d(new eut(fromId));
        final ce4 o = jee.o((Context)cnb, d4j.i((Context)cnb, 2130969074), d4j.i((Context)cnb, 2130968591), an.a().a((Context)cnb, new vmx(Uri.parse(((u9)this).H4(2131954857)))));
        f0r.c(textView);
        textView.setText((CharSequence)uoz.D(new Object[] { o }, textView.getText().toString(), "{{}}"));
    }
    
    public final void P4() {
        super.P4();
        this.b1.removeCallbacks((Runnable)this.a1);
    }
    
    public final void Q4() {
        super.Q4();
        final ProgressBar z0 = this.Z0;
        final m4s a = hq1.a;
        z0.setProgress(30 - (int)(System.currentTimeMillis() / 1000L % 30L));
        this.W4();
        (this.b1 = new Handler()).postDelayed((Runnable)(this.a1 = new dut$a(this)), 500L);
    }
    
    public final void W4() {
        final String x0 = this.X0;
        if (x0 != null && x0.length() == 16) {
            final String x2 = this.X0;
            lk1.a(x2);
            final m4s a = hq1.a;
            String s;
            for (s = Long.toHexString(System.currentTimeMillis() / 1000L / 30L); s.length() < 16; s = hmg.h("0", s)) {}
            final byte[] a2 = lk1.a;
            final int n = s.length() / 2;
            final byte[] array = new byte[n];
            for (int i = 0; i < n; ++i) {
                final int n2 = i * 2;
                array[i] = (byte)(Character.digit(s.charAt(n2 + 1), 16) + (Character.digit(s.charAt(n2), 16) << 4));
            }
            final byte[] a3 = lk1.a(x2);
            try {
                final Mac instance = Mac.getInstance("HmacSHA1");
                instance.init(new SecretKeySpec(a3, "RAW"));
                final byte[] doFinal = instance.doFinal(array);
                final int n3 = doFinal[doFinal.length - 1] & 0xF;
                String s2;
                for (s2 = Integer.toString(((doFinal[n3 + 3] & 0xFF) | ((doFinal[n3] & 0x7F) << 24 | (doFinal[n3 + 1] & 0xFF) << 16 | (doFinal[n3 + 2] & 0xFF) << 8)) % wa2.F0[6]); s2.length() < 6; s2 = hmg.h("0", s2)) {}
                this.Y0.setText((CharSequence)new StringBuilder(s2).insert(3, " ").toString());
                return;
            }
            catch (final GeneralSecurityException ex) {
                throw new UndeclaredThrowableException(ex);
            }
        }
        this.Y0.setText(2131959001);
    }
}
