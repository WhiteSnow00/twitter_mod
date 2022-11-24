import android.view.View;
import android.widget.AdapterView;
import java.util.regex.Pattern;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.SpinnerAdapter;
import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.List;
import android.widget.AdapterView$OnItemSelectedListener;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import java.util.Collection;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ScrollView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n9g extends kcv
{
    public final ScrollView Z0;
    public final TextView a1;
    public final Spinner b1;
    public final Collection<String> c1;
    
    public n9g(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final m9p m9p) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        this.c1 = (Collection)fj1.i((wpo)m9g.G0);
        final Spinner b1 = (Spinner)this.C4(2131429138);
        vmw.g((Object)b1);
        ((AdapterView)b1).setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new n9g$a(this));
        final ojf h = ojf.H();
        h.p((Object)new n9g.n9g$b("Logcat All", "."));
        h.p((Object)new n9g.n9g$b("Logcat Error", " E/"));
        h.p((Object)new n9g.n9g$b("Logcat Warning", " W/"));
        h.p((Object)new n9g.n9g$b("Logcat Info", " I/"));
        h.p((Object)new n9g.n9g$b("Logcat Debug", " D/"));
        h.p((Object)new n9g.n9g$b("Recent DB Gets", (String)null));
        h.p((Object)new n9g.n9g$b("Active Threads", (String)null));
        final ArrayAdapter adapter = new ArrayAdapter((Context)dob, 17367048, (List)((z4j)h).e());
        adapter.setDropDownViewResource(17367049);
        b1.setAdapter((SpinnerAdapter)adapter);
        ((AdapterView)b1).setSelection(1);
        this.b1 = b1;
        final ScrollView z0 = (ScrollView)this.C4(2131431247);
        vmw.g((Object)z0);
        this.Z0 = z0;
        final TextView a1 = (TextView)((View)z0).findViewById(2131429884);
        vmw.g((Object)a1);
        this.a1 = a1;
        final Button button = (Button)this.C4(2131428480);
        vmw.g((Object)button);
        ((View)button).setOnClickListener((View$OnClickListener)new g2p((Object)this, 1));
        this.W4();
    }
    
    public final void W4() {
        final n9g.n9g$b n9g$b = (n9g.n9g$b)((AdapterView)this.b1).getSelectedItem();
        final Pattern b = n9g$b.b;
        if (b != null) {
            this.a1.setText((CharSequence)flr.h((CharSequence)"\n", (Iterable)kr4.e((Iterable)this.c1, (nuk)new l9g((Object)b, 0))));
        }
        else if ("Recent DB Gets".equalsIgnoreCase(n9g$b.a)) {
            final TextView a1 = this.a1;
            final StringBuilder sb = new StringBuilder();
            w98.a();
            sb.append("No successful access entries found");
            a1.setText((CharSequence)sb.toString());
        }
        else if ("Active Threads".equalsIgnoreCase(n9g$b.a)) {
            this.a1.setText((CharSequence)nns.a());
        }
        xw0.d(iqs.j(), (sj)new bq1((Object)this, 1));
    }
}
