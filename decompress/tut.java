import java.security.GeneralSecurityException;
import java.lang.reflect.UndeclaredThrowableException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import android.graphics.PorterDuff$Mode;
import java.util.Objects;
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

public final class tut extends kcv
{
    public String Z0;
    public final TextView a1;
    public final ProgressBar b1;
    public tut$a c1;
    public Handler d1;
    
    public tut(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final kcm kcm, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        this.Z0 = "";
        this.a1 = (TextView)this.C4(2131432206);
        final ProgressBar b1 = (ProgressBar)this.C4(2131432207);
        this.b1 = b1;
        final TextView textView = (TextView)this.C4(2131429449);
        b1.setMax(30);
        final UserIdentifier fromId = UserIdentifier.fromId(intent.getLongExtra("TotpGeneratorActivity_account_id", userIdentifier.getId()));
        this.Z0 = fcu.e(fromId, "login_verification").j("lv_totp_secret", "");
        final laj a = cbs.a((Class)uut.class);
        f.j(a.a(), (fa3)new rp3((Object)this, 1), (gba)kcm);
        a.d((pnm)new uut(fromId));
        final gf4 v = d4j.v((Context)dob, b1b.B((Context)dob, 2130969074), b1b.B((Context)dob, 2130968591), fn.a().a((Context)dob, (cn)new mnx(Uri.parse(this.H4(2131954857)))));
        c1r.c(textView);
        textView.setText((CharSequence)eg8.a0(new Object[] { v }, textView.getText().toString(), "{{}}"));
    }
    
    @Override
    public final void P4() {
        super.P4();
        this.d1.removeCallbacks((Runnable)this.c1);
    }
    
    @Override
    public final void Q4() {
        super.Q4();
        final ProgressBar b1 = this.b1;
        final g5s a = nq1.a;
        b1.setProgress(30 - (int)(System.currentTimeMillis() / 1000L % 30L));
        this.W4();
        (this.d1 = new Handler()).postDelayed((Runnable)(this.c1 = new Runnable(this) {
            public final tut F0;
            
            @Override
            public final void run() {
                final g5s a = nq1.a;
                final int progress = 30 - (int)(System.currentTimeMillis() / 1000L % 30L);
                this.F0.b1.setProgress(progress);
                if (30 - progress < 2) {
                    this.F0.W4();
                }
                final tut f0 = this.F0;
                Objects.requireNonNull(f0);
                final long currentTimeMillis = System.currentTimeMillis();
                int n;
                int b;
                if (progress <= 5) {
                    if (currentTimeMillis % 1000L >= 500L) {
                        n = f0.O0.getColor(2131100721);
                    }
                    else {
                        n = f0.O0.getColor(2131100722);
                    }
                    b = n;
                }
                else {
                    n = f0.O0.getColor(2131100865);
                    b = b1b.B((Context)f0.G0, 2130969091);
                }
                f0.b1.getProgressDrawable().setColorFilter(n, PorterDuff$Mode.SRC_IN);
                f0.a1.setTextColor(b);
                this.F0.d1.postDelayed((Runnable)this, 500L);
            }
        }), 500L);
    }
    
    public final void W4() {
        final String z0 = this.Z0;
        if (z0 != null && z0.length() == 16) {
            final String z2 = this.Z0;
            pk1.a(z2);
            final g5s a = nq1.a;
            String s;
            for (s = Long.toHexString(System.currentTimeMillis() / 1000L / 30L); s.length() < 16; s = mqb.l("0", s)) {}
            final byte[] a2 = pk1.a;
            final int n = s.length() / 2;
            final byte[] array = new byte[n];
            for (int i = 0; i < n; ++i) {
                final int n2 = i * 2;
                array[i] = (byte)(Character.digit(s.charAt(n2 + 1), 16) + (Character.digit(s.charAt(n2), 16) << 4));
            }
            final byte[] a3 = pk1.a(z2);
            try {
                final Mac instance = Mac.getInstance("HmacSHA1");
                instance.init(new SecretKeySpec(a3, "RAW"));
                final byte[] doFinal = instance.doFinal(array);
                final int n3 = doFinal[doFinal.length - 1] & 0xF;
                String s2;
                for (s2 = Integer.toString(((doFinal[n3 + 3] & 0xFF) | ((doFinal[n3] & 0x7F) << 24 | (doFinal[n3 + 1] & 0xFF) << 16 | (doFinal[n3 + 2] & 0xFF) << 8)) % vmw.Q0[6]); s2.length() < 6; s2 = mqb.l("0", s2)) {}
                this.a1.setText((CharSequence)new StringBuilder(s2).insert(3, " ").toString());
                return;
            }
            catch (final GeneralSecurityException ex) {
                throw new UndeclaredThrowableException(ex);
            }
        }
        this.a1.setText(2131959001);
    }
}
